package net.jtap;

import java.util.LinkedList;
import net.common.util.BufferUtil;
import net.jtap.JtapApi;
import net.jtap.JtapErrorConstants;
import net.jtap.QuoteApiAdapter;
import net.jtap.QuoteApiListener;
import net.jtap.TapAPIApplicationInfo;
import net.jtap.TapAPICommodity;
import net.jtap.TapAPIContract;
import net.jtap.TapAPIQuotLoginRspInfo;
import net.jtap.TapAPIQuoteCommodityInfo;
import net.jtap.TapAPIQuoteContractInfo;
import net.jtap.TapAPIQuoteLoginAuth;
import net.jtap.TapAPIQuoteWhole;
import net.jtrader.JTraderException;
import net.jtrader.JTraderApi.SyncRequest;

public class QuoteApi extends JtapApi {
	private static final int MethodId_QuoteSpi_OnRspQryCommodity = 2;
	private static final int MethodId_QuoteSpi_OnRspQryContract = 4;
	private static final int MethodId_QuoteSpi_OnRspSubscribeQuote = 5;
	private static final int MethodId_QuoteSpi_OnRspUnSubscribeQuote = 6;
	private static final int MethodId_QuoteSpi_OnRtnQuote = 7;
	private static final int MethodId_QuoteSpi_OnDisconnect = 8;
	private static final int MethodId_QuoteSpi_OnRspLogin = 9;
	private static final int MethodId_QuoteSpi_OnAPIReady = 10;
	private static final int MethodId_QuoteApi_QryCommodity = 101;
	private static final int MethodId_QuoteApi_QryContract = 102;
	private static final int MethodId_QuoteApi_SubscribeQuote = 103;
	private static final int MethodId_QuoteApi_UnSubscribeQuote = 104;
	private QuoteApiListener listener = new QuoteApiAdapter();

	public QuoteApi(TapAPIApplicationInfo arg0) throws JTraderException {
		this.nativeApiPtr = JtapApi.quoteCreateApi(this, arg0.toBytes());
		if ((this.nativeApiPtr & 9223372032559808512L) == 9223372032559808512L) {
			int arg1 = (int) (this.nativeApiPtr & 4294967295L);
			throw new JTraderException(arg1,
					JtapErrorConstants.code2Name(arg1) + JtapErrorConstants.code2Message(arg1));
		}
	}

	public void Login(String arg0, int arg1, TapAPIQuoteLoginAuth arg2) throws JTraderException {
		int arg3 = JtapApi.quoteLogin(this.nativeApiPtr, BufferUtil.str2c(arg0), arg1, arg2.toBytes());
		if (arg3 != 0) {
			throw new JTraderException(arg3,
					JtapErrorConstants.code2Name(arg3) + " : " + JtapErrorConstants.code2Message(arg3));
		}
	}

	public void SyncLogin(String arg0, int arg1, TapAPIQuoteLoginAuth arg2) throws JTraderException {
		this.connectRequest = new SyncRequest(0, false);

		try {
			this.Login(arg0, arg1, arg2);
			this.waitForRsp(this.connectRequest);
		} finally {
			this.connectRequest = null;
		}

	}

	public synchronized void Close() {
		if (this.nativeApiPtr != 0L) {
			JtapApi.quoteClose(this.nativeApiPtr, this.isConnected());
			this.nativeApiPtr = 0L;
		}
	}

	public void setListener(QuoteApiListener arg0) {
		this.listener = arg0;
	}

	public int QryCommodity() throws JTraderException {
		this.checkConnected();
		long arg0 = JtapApi.quoteReq(this.nativeApiPtr, 101, (byte[]) null);
		return sessionIdFromLong(arg0);
	}

	public TapAPIQuoteCommodityInfo[] SyncAllQryCommodity() throws JTraderException {
		SyncRequest arg0 = this.createSyncRequest("QryCommodity", true);

		TapAPIQuoteCommodityInfo[] arg3;
		try {
			int arg1 = this.QryCommodity();
			LinkedList arg2 = this.waitForAllRsps(arg0);
			arg3 = (TapAPIQuoteCommodityInfo[]) ((TapAPIQuoteCommodityInfo[]) arg2
					.toArray(new TapAPIQuoteCommodityInfo[arg2.size()]));
		} finally {
			this.removeSyncRequest(arg0);
		}

		return arg3;
	}

	public int QryContract(TapAPICommodity arg0) throws JTraderException {
		this.checkConnected();
		if (arg0 == null) {
			throw new IllegalArgumentException("qryReq can\'t be null.");
		} else {
			long arg1 = JtapApi.quoteReq(this.nativeApiPtr, 102, arg0.toBytes());
			return sessionIdFromLong(arg1);
		}
	}

	public TapAPIQuoteContractInfo[] SyncAllQryContract(TapAPICommodity arg0) throws JTraderException {
		SyncRequest arg1 = this.createSyncRequest("QryContract", true);

		TapAPIQuoteContractInfo[] arg3;
		try {
			this.QryContract(arg0);
			LinkedList arg2 = this.waitForAllRsps(arg1);
			arg3 = (TapAPIQuoteContractInfo[]) ((TapAPIQuoteContractInfo[]) arg2
					.toArray(new TapAPIQuoteContractInfo[arg2.size()]));
		} finally {
			this.removeSyncRequest(arg1);
		}

		return arg3;
	}

	public int SubscribeQuote(TapAPIContract arg0) throws JTraderException {
		this.checkConnected();
		if (arg0 == null) {
			throw new IllegalArgumentException("contract can\'t be null.");
		} else {
			long arg1 = JtapApi.quoteReq(this.nativeApiPtr, 103, arg0.toBytes());
			return sessionIdFromLong(arg1);
		}
	}

	public int UnSubscribeQuote(TapAPIContract arg0) throws JTraderException {
		this.checkConnected();
		if (arg0 == null) {
			throw new IllegalArgumentException("contract can\'t be null.");
		} else {
			long arg1 = JtapApi.quoteReq(this.nativeApiPtr, 104, arg0.toBytes());
			return sessionIdFromLong(arg1);
		}
	}

	public static String GetVersion() {
		byte[] arg = JtapApi.quoteGetVersion();
		return BufferUtil.c2str(arg);
	}

	public static void SetDataPath(String arg) throws JTraderException {
		byte[] arg0 = BufferUtil.str2c(arg);
		int arg1 = JtapApi.quoteSetDataPath(arg0);
		if (arg1 != 0) {
			throw new JTraderException(arg1,
					JtapErrorConstants.code2Name(arg1) + ":" + JtapErrorConstants.code2Message(arg1));
		}
	}

	public static void SetLogLevel(int arg) throws JTraderException {
		int arg0 = JtapApi.quoteSetLogLevel(arg);
		if (arg0 != 0) {
			throw new JTraderException(arg0,
					JtapErrorConstants.code2Name(arg0) + ":" + JtapErrorConstants.code2Message(arg0));
		}
	}

	private void OnRsp(int arg0, int arg1, int arg2, byte arg3, byte[] arg4) {
		TapAPIQuoteWhole arg11;
		switch (arg0) {
			case 2 :
				TapAPIQuoteCommodityInfo arg14 = TapAPIQuoteCommodityInfo.fromBytes(arg4);
				this.notifyRequest(arg14, Integer.valueOf(arg2), "QryCommodity", arg3 == 89);
				this.listener.OnRspQryCommodity(arg1, arg2, arg3, arg14);
				break;
			case 3 :
			default :
				System.out.println("Unknown methodId In QuoteApi.OnRsp: " + arg0);
				throw new RuntimeException("Unknown methodId " + arg0);
			case 4 :
				TapAPIQuoteContractInfo arg13 = TapAPIQuoteContractInfo.fromBytes(arg4);
				this.notifyRequest(arg13, Integer.valueOf(arg2), "QryContract", arg3 == 89);
				this.listener.OnRspQryContract(arg1, arg2, arg3, arg13);
				break;
			case 5 :
				arg11 = TapAPIQuoteWhole.fromBytes(arg4);
				this.listener.OnRspSubscribeQuote(arg1, arg2, arg3, arg11);
				break;
			case 6 :
				TapAPIContract arg12 = TapAPIContract.fromBytes(arg4);
				this.listener.OnRspUnSubscribeQuote(arg1, arg2, arg3, arg12);
				break;
			case 7 :
				arg11 = TapAPIQuoteWhole.fromBytes(arg4);
				this.listener.OnRtnQuote(arg11);
				break;
			case 8 :
				this.setConnected(false);
				this.login = false;
				this.listener.OnDisconnect(arg2);
				break;
			case 9 :
				this.setConnected(true);
				if (arg2 == 0) {
					this.login = true;
				}

				TapAPIQuotLoginRspInfo arg10 = TapAPIQuotLoginRspInfo.fromBytes(arg4);
				if (this.connectRequest != null && arg2 != 0) {
					SyncRequest arg6 = this.connectRequest;
					synchronized (this.connectRequest) {
						this.connectRequest.responseReady = true;
						this.connectRequest.rspInfoField = Integer.valueOf(arg2);
						this.connectRequest.notify();
					}
				}

				this.listener.OnRspLogin(arg2, arg10);
				break;
			case 10 :
				if (this.connectRequest != null) {
					SyncRequest arg5 = this.connectRequest;
					synchronized (this.connectRequest) {
						this.connectRequest.responseReady = true;
						this.connectRequest.rspInfoField = null;
						this.connectRequest.notify();
					}
				}

				this.listener.OnAPIReady();
		}

	}

	static int sessionIdFromLong(long arg) throws JTraderException {
		int arg1 = (int) (arg >> 32);
		int arg2 = (int) arg;
		if (arg1 != 0) {
			throw new JTraderException(arg1,
					JtapErrorConstants.code2Name(arg1) + ":" + JtapErrorConstants.code2Message(arg1));
		} else {
			return arg2;
		}
	}
}