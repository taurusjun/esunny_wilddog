package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPIExchangeInfo {
	public String ExchangeNo;
	public String ExchangeName;

	public TapAPIExchangeInfo() {
	}

	public TapAPIExchangeInfo(String arg0, String arg1) {
		this.ExchangeNo = arg0;
		this.ExchangeName = arg1;
	}

	static TapAPIExchangeInfo fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 32;

			TapAPIExchangeInfo arg0 = new TapAPIExchangeInfo();
			arg0.ExchangeNo = BufferUtil.bytes2str(arg, 0, 11);
			arg0.ExchangeName = BufferUtil.bytes2str(arg, 11, 21);
			return arg0;
		}
	}

	static TapAPIExchangeInfo fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(32).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.ExchangeNo, 0, 11);
		BufferUtil.str2bytes(arg0, this.ExchangeName, 11, 21);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIExchangeInfo[").append("ExchangeNo=").append(this.ExchangeNo).append(",ExchangeName=")
				.append(this.ExchangeName).append("]");
		return arg0.toString();
	}
}