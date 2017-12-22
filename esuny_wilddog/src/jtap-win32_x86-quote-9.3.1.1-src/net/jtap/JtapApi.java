package net.jtap;

import java.io.IOException;
import net.common.util.PlatformUtil;
import net.jtap.JtapErrorConstants;
import net.jtap.QuoteApi;
import net.jtrader.JTraderApi;
import net.jtrader.JTraderException;

public abstract class JtapApi extends JTraderApi {
	public static final String[] SHARED_LIBRARY_FILES = new String[]{"TapQuoteAPI", "jtap"};

	protected void checkRspInfo(Object arg0) throws JTraderException {
		if (arg0 != null) {
			int arg1 = ((Integer) arg0).intValue();
			if (arg1 != 0) {
				String arg2 = JtapErrorConstants.code2Message(arg1);
				throw new JTraderException(arg1, arg2);
			}
		}
	}

	private static native void registerNatives();

	static native long quoteCreateApi(QuoteApi arg, byte[] arg0);

	static native int quoteLogin(long arg, byte[] arg1, int arg2, byte[] arg3);

	static native void quoteClose(long arg, boolean arg1);

	static native long quoteReq(long arg, int arg1, byte[] arg2);

	static native byte[] quoteGetVersion();

	static native int quoteSetDataPath(byte[] arg);

	static native int quoteSetLogLevel(int arg);

	static {
		PlatformUtil.checkPlatform("jtap", "win32_x86");

		try {
			JTraderApi.loadLibraries(JtapApi.class, "jtap", "win32_x86/quote-9.3.1.1/20171205", SHARED_LIBRARY_FILES);
		} catch (IOException arg0) {
			throw new RuntimeException(arg0);
		}

		registerNatives();
	}
}