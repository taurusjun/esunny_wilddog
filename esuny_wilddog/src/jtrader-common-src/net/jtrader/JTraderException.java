package net.jtrader;

public class JTraderException extends Exception {
	public static final int ERROR_NOT_CONNECTED = -100;
	public static final int ERROR_UNKNOWN_METHOD_ID = -101;
	public static final int ERROR_SYNC_REQUEST_TIMEOUT = -102;
	public static final int ERROR_SESSION_DISCONNECTED = -103;
	public static final int ERROR_INVALID_FLOWPATH = -104;
	public static final int ERROR_INVALID_URL_FORMAT = -105;
	public static final int ERROR_CONNECT_AGAIN = -106;
	public static final int ERROR_CLOSED = -107;
	private static final long serialVersionUID = 4583524183095137804L;
	private int errorCode;

	public JTraderException(int arg0) {
		super(messageFromCode(arg0));
		this.errorCode = arg0;
	}

	public JTraderException(int arg0, String arg1) {
		super(arg1);
		this.errorCode = arg0;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	private static String messageFromCode(int arg) {
		switch (arg) {
			case -107 :
				return "This connection is closed";
			case -106 :
				return "Can not connect again";
			case -105 :
				return "Invalid url, expected format: \"tcp://<host>:<port>\".";
			case -102 :
				return "Sync request method timeout.";
			case -100 :
				return "Not connected.";
			case -3 :
				return "Submitted request exceeds limitation.";
			case -2 :
				return "Pending requests exceeds limitation.";
			case -1 :
				return "Network connection failed.";
			default :
				return "Unknown error code: " + arg;
		}
	}
}