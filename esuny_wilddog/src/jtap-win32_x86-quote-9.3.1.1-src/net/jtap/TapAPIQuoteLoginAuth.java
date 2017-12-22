package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPIQuoteLoginAuth {
	public String UserNo;
	public char ISModifyPassword = 78;
	public String Password;
	public String NewPassword;
	public String QuoteTempPassword;
	public char ISDDA = 78;
	public String DDASerialNo;

	public TapAPIQuoteLoginAuth() {
	}

	public TapAPIQuoteLoginAuth(String arg0, char arg1, String arg2, String arg3, String arg4, char arg5, String arg6) {
		this.UserNo = arg0;
		this.ISModifyPassword = arg1;
		this.Password = arg2;
		this.NewPassword = arg3;
		this.QuoteTempPassword = arg4;
		this.ISDDA = arg5;
		this.DDASerialNo = arg6;
	}

	static TapAPIQuoteLoginAuth fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 117;

			TapAPIQuoteLoginAuth arg0 = new TapAPIQuoteLoginAuth();
			arg0.UserNo = BufferUtil.bytes2str(arg, 0, 21);
			arg0.ISModifyPassword = (char) arg[21];
			arg0.Password = BufferUtil.bytes2str(arg, 22, 21);
			arg0.NewPassword = BufferUtil.bytes2str(arg, 43, 21);
			arg0.QuoteTempPassword = BufferUtil.bytes2str(arg, 64, 21);
			arg0.ISDDA = (char) arg[85];
			arg0.DDASerialNo = BufferUtil.bytes2str(arg, 86, 31);
			return arg0;
		}
	}

	static TapAPIQuoteLoginAuth fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(117).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.UserNo, 0, 21);
		arg0.put(21, (byte) this.ISModifyPassword);
		BufferUtil.str2bytes(arg0, this.Password, 22, 21);
		BufferUtil.str2bytes(arg0, this.NewPassword, 43, 21);
		BufferUtil.str2bytes(arg0, this.QuoteTempPassword, 64, 21);
		arg0.put(85, (byte) this.ISDDA);
		BufferUtil.str2bytes(arg0, this.DDASerialNo, 86, 31);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIQuoteLoginAuth[").append("UserNo=").append(this.UserNo).append(",ISModifyPassword=")
				.append(this.ISModifyPassword == 0 ? ' ' : this.ISModifyPassword).append(",Password=")
				.append(this.Password).append(",NewPassword=").append(this.NewPassword).append(",QuoteTempPassword=")
				.append(this.QuoteTempPassword).append(",ISDDA=").append(this.ISDDA == 0 ? ' ' : this.ISDDA)
				.append(",DDASerialNo=").append(this.DDASerialNo).append("]");
		return arg0.toString();
	}
}