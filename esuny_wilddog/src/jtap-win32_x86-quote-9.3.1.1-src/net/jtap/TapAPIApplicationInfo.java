package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPIApplicationInfo {
	public String AuthCode;
	public String KeyOperationLogPath;

	public TapAPIApplicationInfo() {
	}

	public TapAPIApplicationInfo(String arg0, String arg1) {
		this.AuthCode = arg0;
		this.KeyOperationLogPath = arg1;
	}

	static TapAPIApplicationInfo fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 814;

			TapAPIApplicationInfo arg0 = new TapAPIApplicationInfo();
			arg0.AuthCode = BufferUtil.bytes2str(arg, 0, 513);
			arg0.KeyOperationLogPath = BufferUtil.bytes2str(arg, 513, 301);
			return arg0;
		}
	}

	static TapAPIApplicationInfo fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(814).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.AuthCode, 0, 513);
		BufferUtil.str2bytes(arg0, this.KeyOperationLogPath, 513, 301);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIApplicationInfo[").append("AuthCode=").append(this.AuthCode).append(",KeyOperationLogPath=")
				.append(this.KeyOperationLogPath).append("]");
		return arg0.toString();
	}
}