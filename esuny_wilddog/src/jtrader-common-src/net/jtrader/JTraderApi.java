package net.jtrader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.common.util.BufferUtil;
import net.common.util.PlatformUtil;
import net.common.util.PlatformUtil.Platform;
import net.jtrader.JTraderException;
import net.jtrader.JTraderNativeLibrary;
import net.jtrader.JTraderApi.SyncRequest;

public abstract class JTraderApi {
	protected volatile long nativeApiPtr;
	private volatile boolean connected;
	private boolean connectedBefore;
	protected volatile boolean login;
	protected AtomicInteger nextRequestId = new AtomicInteger(0);
	protected int syncReqTimeout = 30;
	protected volatile SyncRequest connectRequest;
	protected ConcurrentHashMap<Integer, SyncRequest> syncRequestMap = new ConcurrentHashMap();
	protected ConcurrentHashMap<String, SyncRequest> syncRequestMapByType = new ConcurrentHashMap();
	private boolean autoFlowControl = false;
	private int reqQryMinInterval = 1000;
	private volatile long lastReqQryTime;
	private Lock flowControlLock = new ReentrantLock();
	private Condition pendingReqQryCond;
	private volatile long pendingReqQryThreadId;
	static final int OPTION_DUMP_NATIVE_EXCEPTION = 1;

	public JTraderApi() {
		this.pendingReqQryCond = this.flowControlLock.newCondition();
		this.pendingReqQryThreadId = 0L;
	}

	public abstract void Close();

	public static boolean isTurboModeEnabled() {
		return BufferUtil.isTurboModeEnabled();
	}

	public boolean isFlowControlEnabled() {
		return this.autoFlowControl;
	}

	public void setFlowControl(boolean arg0) {
		this.autoFlowControl = arg0;
	}

	public void setReqQryMinInterval(int arg0) {
		this.reqQryMinInterval = arg0;
	}

	protected void checkReqQryInterval() {
		if (this.isFlowControlEnabled()) {
			this.flowControlLock.lock();

			try {
				long arg0 = System.currentTimeMillis();
				long arg2 = arg0 - this.lastReqQryTime;
				if (arg2 < (long) this.reqQryMinInterval) {
					try {
						Thread.sleep((long) this.reqQryMinInterval - arg2);
					} catch (InterruptedException arg8) {
						;
					}
				}

				this.lastReqQryTime = System.currentTimeMillis();
			} finally {
				this.flowControlLock.unlock();
			}

		}
	}

	protected void checkReqQryPendingState() {
		if (this.isFlowControlEnabled()) {
			long arg0 = Thread.currentThread().getId();
			this.flowControlLock.lock();

			try {
				while (this.pendingReqQryThreadId != 0L) {
					try {
						this.pendingReqQryCond.await(1L, TimeUnit.SECONDS);
					} catch (InterruptedException arg6) {
						;
					}
				}

				this.pendingReqQryThreadId = arg0;
			} finally {
				this.flowControlLock.unlock();
			}

		}
	}

	protected void releaseReqQryPendingState() {
		if (this.isFlowControlEnabled()) {
			long arg0 = Thread.currentThread().getId();
			this.flowControlLock.lock();

			try {
				if (arg0 != this.pendingReqQryThreadId) {
					throw new RuntimeException(
							"Current thread " + arg0 + " is not the pending thread " + this.pendingReqQryThreadId);
				}

				this.pendingReqQryThreadId = 0L;
				this.pendingReqQryCond.signal();
			} finally {
				this.flowControlLock.unlock();
			}

		}
	}

	public void setSyncReqTimeout(int arg0) {
		this.syncReqTimeout = arg0;
	}

	protected SyncRequest createSyncRequest(boolean arg0) {
		return this.createSyncRequest(this.getNextRequestId(), arg0);
	}

	protected SyncRequest createSyncRequest(int arg0, boolean arg1) {
		SyncRequest arg2 = new SyncRequest(arg0, arg1);
		this.syncRequestMap.put(Integer.valueOf(arg2.requestId), arg2);
		return arg2;
	}

	protected void removeSyncRequest(SyncRequest arg0) {
		if (arg0 != null) {
			this.syncRequestMap.remove(Integer.valueOf(arg0.requestId));
			if (arg0.requestType != null) {
				this.syncRequestMapByType.remove(arg0.requestType);
			}

		}
	}

	protected void notifyRequest(SyncRequest arg0, Object arg1) {
		if (arg0 != null) {
			arg0.responseReady = true;
			arg0.rspInfoField = arg1;
			synchronized (arg0) {
				arg0.notify();
			}
		}
	}

	protected SyncRequest createSyncRequest(String arg0, boolean arg1) {
		SyncRequest arg2 = new SyncRequest(arg0, arg1);
		this.syncRequestMapByType.put(arg2.requestType, arg2);
		return arg2;
	}

	protected Object waitForRsp(SyncRequest arg0) throws JTraderException {
		LinkedList arg1 = this.waitForAllRsps(arg0);
		return arg1 != null ? arg1.poll() : null;
	}

	protected LinkedList waitForAllRsps(SyncRequest arg0) throws JTraderException {
		if (!arg0.responseReady) {
			synchronized (arg0) {
				if (!arg0.responseReady) {
					try {
						arg0.wait((long) (this.syncReqTimeout * 1000));
					} catch (InterruptedException arg4) {
						;
					}
				}
			}
		}

		Object arg1 = arg0.rspInfoField;
		if (!arg0.responseReady) {
			throw this.createException(-102, (String) null);
		} else {
			this.checkRspInfo(arg1);
			return arg0.rspFields.size() == 1 && arg0.rspFields.get(0) == null ? new LinkedList() : arg0.rspFields;
		}
	}

	protected void notifyRequest(Object arg0, Object arg1, int arg2, boolean arg3) {
		SyncRequest arg4 = (SyncRequest) this.syncRequestMap.get(Integer.valueOf(arg2));
		if (arg4 != null) {
			synchronized (arg4) {
				arg4.rspFields.add(arg0);
				arg4.rspInfoField = arg1;
				if (!arg4.waitUntilLast || arg4.waitUntilLast && arg3) {
					arg4.responseReady = true;
					arg4.notify();
				}
			}
		}

	}

	protected void notifyRequest(Object arg0, Object arg1, String arg2, boolean arg3) {
		SyncRequest arg4 = (SyncRequest) this.syncRequestMapByType.get(arg2);
		if (arg4 != null) {
			synchronized (arg4) {
				arg4.rspFields.add(arg0);
				arg4.rspInfoField = arg1;
				if (!arg4.waitUntilLast || arg4.waitUntilLast && arg3) {
					arg4.responseReady = true;
					arg4.notify();
				}
			}
		}

	}

	protected void notifyAllRequests(Object arg0) {
		LinkedList arg1 = new LinkedList(this.syncRequestMap.values());
		arg1.addAll(this.syncRequestMapByType.values());
		Iterator arg2 = arg1.iterator();

		while (arg2.hasNext()) {
			SyncRequest arg3 = (SyncRequest) arg2.next();
			this.notifyRequest(arg3, arg0);
		}

	}

	protected void checkConnected() throws JTraderException {
		if (this.nativeApiPtr == 0L || !this.connected) {
			throw this.createException(-100, (String) null);
		}
	}

	protected void checkClosed() throws JTraderException {
		if (this.nativeApiPtr == 0L) {
			throw this.createException(-107, (String) null);
		}
	}

	protected void setConnected(boolean arg0) {
		this.connected = arg0;
		if (arg0) {
			this.connectedBefore = true;
		}

	}

	public boolean isClosed() {
		return this.nativeApiPtr == 0L;
	}

	public boolean isConnected() {
		return this.connected;
	}

	public boolean isLogin() {
		return this.login;
	}

	protected int getNextRequestId() {
		return this.nextRequestId.incrementAndGet();
	}

	public int getLastRequstId() {
		return this.nextRequestId.get();
	}

	public void setNextRequestId(int arg0) {
		this.nextRequestId.set(arg0);
	}

	protected static String preprocessFlowPath(String arg) {
		File arg0;
		if (arg != null && arg.length() != 0) {
			arg0 = new File(arg);
			arg0.mkdirs();
			if (!arg.endsWith("/") && !arg.endsWith("\\")) {
				arg = arg + File.separator;
			}
		} else {
			try {
				arg0 = File.createTempFile("jtrader", (String) null);
				File arg1 = arg0.getParentFile();
				arg0.delete();

				File arg4;
				do {
					long arg2 = (long) (Math.random() * 1.0E11D);
					arg4 = new File(arg1, "jtrader" + Long.toString(arg2));
				} while (arg4.exists());

				arg4.mkdir();
				arg4.deleteOnExit();
				arg = arg4.getAbsolutePath() + File.separator;
			} catch (IOException arg5) {
				arg = "";
			}
		}

		return arg;
	}

	public static void loadLibraries(Class arg, String arg0, String arg1, JTraderNativeLibrary[] arg2)
			throws IOException {
		boolean arg3 = false;
		Platform arg4 = PlatformUtil.getPlatform();
		JTraderNativeLibrary[] arg5 = arg2;
		int arg6 = arg2.length;

		for (int arg7 = 0; arg7 < arg6; ++arg7) {
			JTraderNativeLibrary arg8 = arg5[arg7];
			if (arg8.getPlatform() == arg4) {
				loadLibraries(arg, arg0, arg1, arg8.getLibraries());
				arg3 = true;
			}
		}

		if (!arg3) {
			throw new IOException(arg0 + " has not native libraries to load for " + arg4);
		}
	}

	public static void loadLibraries(Class arg, String arg0, String arg1, String[] arg2) throws IOException {
		String arg3 = System.getProperty("user.home");
		File arg4 = new File(arg3, ".jtrader/sharedLibrary/" + arg0 + "/" + arg1);
		arg4.mkdirs();
		LinkedList arg5 = new LinkedList();
		String[] arg6 = arg2;
		int arg7 = arg2.length;

		for (int arg8 = 0; arg8 < arg7; ++arg8) {
			String arg9 = arg6[arg8];
			URL arg10 = PlatformUtil.getLibraryResourceURL(arg, "resources/" + arg0 + "/" + arg1, arg9);
			if (arg10 == null) {
				throw new RuntimeException(
						"No shared library found for " + arg0 + " on this platform: " + PlatformUtil.getPlatform());
			}

			File arg11 = new File(arg4, (new File(arg10.getFile())).getName());
			ByteArrayOutputStream arg12 = new ByteArrayOutputStream(65536);
			InputStream arg13 = arg10.openStream();
			byte[] arg15 = new byte[4096];

			int arg14;
			while ((arg14 = arg13.read(arg15)) != -1) {
				arg12.write(arg15, 0, arg14);
			}

			arg13.close();
			arg12.close();
			byte[] arg16 = arg12.toByteArray();
			if (!arg11.exists() || arg11.length() != (long) arg16.length) {
				FileOutputStream arg17 = new FileOutputStream(arg11);
				arg17.write(arg16);
				arg17.close();
				arg11.setExecutable(true, false);
				arg11.setReadable(true, false);
			}

			arg5.add(arg11);
		}

		String arg21 = null;
		if (PlatformUtil.isLinux()) {
			arg21 = PlatformUtil.getcwd();
			PlatformUtil.chdir(arg4.getAbsolutePath());
		}

		try {
			Iterator arg22 = arg5.iterator();

			while (arg22.hasNext()) {
				File arg23 = (File) arg22.next();
				System.load(arg23.getAbsolutePath());
			}
		} finally {
			if (PlatformUtil.isLinux() && arg21 != null) {
				PlatformUtil.chdir(arg21);
			}

		}

	}

	protected JTraderException createException(int arg0, String arg1) {
		return arg1 == null ? new JTraderException(arg0) : new JTraderException(arg0, arg1);
	}

	protected abstract void checkRspInfo(Object arg0) throws JTraderException;

	protected void canConnect(String arg0) throws JTraderException {
		if (this.connectedBefore) {
			throw new JTraderException(-106);
		} else if (arg0 == null) {
			throw new JTraderException(-105);
		} else {
			String arg1 = "(tcp)://(.*):([0-9]+)";
			if (!Pattern.matches(arg1, arg0.toLowerCase())) {
				throw new JTraderException(-105);
			}
		}
	}

	protected static int[] getNativeOptions() {
		int[] arg = new int[2];
		String arg0 = null;
		arg[0] = 1;
		arg[1] = 1;
		arg0 = System.getProperty("jtrader.dumpNativeException", "true");
		if ("true".equalsIgnoreCase(arg0)) {
			arg[1] = 1;
		} else {
			arg[1] = 0;
		}

		return arg;
	}
}