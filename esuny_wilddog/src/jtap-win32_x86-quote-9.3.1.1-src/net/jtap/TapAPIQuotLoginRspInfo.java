package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPIQuotLoginRspInfo {
	public String UserNo;
	public int UserType;
	public String UserName;
	public String QuoteTempPassword;
	public String ReservedInfo;
	public String LastLoginIP;
	public int LastLoginProt;
	public String LastLoginTime;
	public String LastLogoutTime;
	public String TradeDate;
	public String LastSettleTime;
	public String StartTime;
	public String InitTime;

	public TapAPIQuotLoginRspInfo() {
	}

	public TapAPIQuotLoginRspInfo(String arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6,
			String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) {
		this.UserNo = arg0;
		this.UserType = arg1;
		this.UserName = arg2;
		this.QuoteTempPassword = arg3;
		this.ReservedInfo = arg4;
		this.LastLoginIP = arg5;
		this.LastLoginProt = arg6;
		this.LastLoginTime = arg7;
		this.LastLogoutTime = arg8;
		this.TradeDate = arg9;
		this.LastSettleTime = arg10;
		this.StartTime = arg11;
		this.InitTime = arg12;
	}

	static TapAPIQuotLoginRspInfo fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 274;

			ByteBuffer arg0 = ByteBuffer.wrap(arg).order(ByteOrder.nativeOrder());
			TapAPIQuotLoginRspInfo arg1 = new TapAPIQuotLoginRspInfo();
			arg1.UserNo = BufferUtil.bytes2str(arg, 0, 21);
			arg1.UserType = arg0.getInt(21);
			arg1.UserName = BufferUtil.bytes2str(arg, 25, 21);
			arg1.QuoteTempPassword = BufferUtil.bytes2str(arg, 46, 21);
			arg1.ReservedInfo = BufferUtil.bytes2str(arg, 67, 51);
			arg1.LastLoginIP = BufferUtil.bytes2str(arg, 118, 41);
			arg1.LastLoginProt = arg0.getInt(159);
			arg1.LastLoginTime = BufferUtil.bytes2ascii(arg, 163, 20);
			arg1.LastLogoutTime = BufferUtil.bytes2ascii(arg, 183, 20);
			arg1.TradeDate = BufferUtil.bytes2ascii(arg, 203, 11);
			arg1.LastSettleTime = BufferUtil.bytes2ascii(arg, 214, 20);
			arg1.StartTime = BufferUtil.bytes2ascii(arg, 234, 20);
			arg1.InitTime = BufferUtil.bytes2ascii(arg, 254, 20);
			return arg1;
		}
	}

	static TapAPIQuotLoginRspInfo fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(274).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.UserNo, 0, 21);
		arg0.putInt(21, this.UserType);
		BufferUtil.str2bytes(arg0, this.UserName, 25, 21);
		BufferUtil.str2bytes(arg0, this.QuoteTempPassword, 46, 21);
		BufferUtil.str2bytes(arg0, this.ReservedInfo, 67, 51);
		BufferUtil.str2bytes(arg0, this.LastLoginIP, 118, 41);
		arg0.putInt(159, this.LastLoginProt);
		BufferUtil.ascii2bytes(arg0, this.LastLoginTime, 163, 20);
		BufferUtil.ascii2bytes(arg0, this.LastLogoutTime, 183, 20);
		BufferUtil.ascii2bytes(arg0, this.TradeDate, 203, 11);
		BufferUtil.ascii2bytes(arg0, this.LastSettleTime, 214, 20);
		BufferUtil.ascii2bytes(arg0, this.StartTime, 234, 20);
		BufferUtil.ascii2bytes(arg0, this.InitTime, 254, 20);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIQuotLoginRspInfo[").append("UserNo=").append(this.UserNo).append(",UserType=")
				.append(this.UserType).append(",UserName=").append(this.UserName).append(",QuoteTempPassword=")
				.append(this.QuoteTempPassword).append(",ReservedInfo=").append(this.ReservedInfo)
				.append(",LastLoginIP=").append(this.LastLoginIP).append(",LastLoginProt=").append(this.LastLoginProt)
				.append(",LastLoginTime=").append(this.LastLoginTime).append(",LastLogoutTime=")
				.append(this.LastLogoutTime).append(",TradeDate=").append(this.TradeDate).append(",LastSettleTime=")
				.append(this.LastSettleTime).append(",StartTime=").append(this.StartTime).append(",InitTime=")
				.append(this.InitTime).append("]");
		return arg0.toString();
	}
}