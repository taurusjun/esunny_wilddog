package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPIChangePasswordReq {
	public String OldPassword;
	public String NewPassword;

	public TapAPIChangePasswordReq() {
	}

	public TapAPIChangePasswordReq(String arg0, String arg1) {
		this.OldPassword = arg0;
		this.NewPassword = arg1;
	}

	static TapAPIChangePasswordReq fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 42;

			TapAPIChangePasswordReq arg0 = new TapAPIChangePasswordReq();
			arg0.OldPassword = BufferUtil.bytes2str(arg, 0, 21);
			arg0.NewPassword = BufferUtil.bytes2str(arg, 21, 21);
			return arg0;
		}
	}

	static TapAPIChangePasswordReq fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(42).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.OldPassword, 0, 21);
		BufferUtil.str2bytes(arg0, this.NewPassword, 21, 21);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIChangePasswordReq[").append("OldPassword=").append(this.OldPassword).append(",NewPassword=")
				.append(this.NewPassword).append("]");
		return arg0.toString();
	}
}