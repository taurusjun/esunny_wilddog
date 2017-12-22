package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jtap.TapAPICommodity;

public final class TapAPIQuoteCommodityInfo {
	public TapAPICommodity Commodity;
	public String CommodityName;
	public String CommodityEngName;
	public double ContractSize;
	public double CommodityTickSize;
	public int CommodityDenominator;
	public char CmbDirect;
	public int CommodityContractLen;
	public char IsDST = 78;
	public TapAPICommodity RelateCommodity1;
	public TapAPICommodity RelateCommodity2;

	public TapAPIQuoteCommodityInfo() {
	}

	public TapAPIQuoteCommodityInfo(TapAPICommodity arg0, String arg1, String arg2, double arg3, double arg5, int arg7,
			char arg8, int arg9, char arg10, TapAPICommodity arg11, TapAPICommodity arg12) {
		this.Commodity = arg0;
		this.CommodityName = arg1;
		this.CommodityEngName = arg2;
		this.ContractSize = arg3;
		this.CommodityTickSize = arg5;
		this.CommodityDenominator = arg7;
		this.CmbDirect = arg8;
		this.CommodityContractLen = arg9;
		this.IsDST = arg10;
		this.RelateCommodity1 = arg11;
		this.RelateCommodity2 = arg12;
	}

	static TapAPIQuoteCommodityInfo fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 147;

			ByteBuffer arg0 = ByteBuffer.wrap(arg).order(ByteOrder.nativeOrder());
			TapAPIQuoteCommodityInfo arg1 = new TapAPIQuoteCommodityInfo();
			arg1.Commodity = TapAPICommodity.fromBytes(arg, 0, 23);
			arg1.CommodityName = BufferUtil.bytes2str(arg, 23, 21);
			arg1.CommodityEngName = BufferUtil.bytes2str(arg, 44, 31);
			arg1.ContractSize = arg0.getDouble(75);
			arg1.CommodityTickSize = arg0.getDouble(83);
			arg1.CommodityDenominator = arg0.getInt(91);
			arg1.CmbDirect = (char) arg[95];
			arg1.CommodityContractLen = arg0.getInt(96);
			arg1.IsDST = (char) arg[100];
			arg1.RelateCommodity1 = TapAPICommodity.fromBytes(arg, 101, 23);
			arg1.RelateCommodity2 = TapAPICommodity.fromBytes(arg, 124, 23);
			return arg1;
		}
	}

	static TapAPIQuoteCommodityInfo fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(147).order(ByteOrder.nativeOrder());
		arg0.position(0);
		arg0.put(this.Commodity.toBytes());
		BufferUtil.str2bytes(arg0, this.CommodityName, 23, 21);
		BufferUtil.str2bytes(arg0, this.CommodityEngName, 44, 31);
		arg0.putDouble(75, this.ContractSize);
		arg0.putDouble(83, this.CommodityTickSize);
		arg0.putInt(91, this.CommodityDenominator);
		arg0.put(95, (byte) this.CmbDirect);
		arg0.putInt(96, this.CommodityContractLen);
		arg0.put(100, (byte) this.IsDST);
		arg0.position(0);
		arg0.put(this.RelateCommodity1.toBytes());
		arg0.position(0);
		arg0.put(this.RelateCommodity2.toBytes());
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIQuoteCommodityInfo[").append("Commodity=").append(this.Commodity).append(",CommodityName=")
				.append(this.CommodityName).append(",CommodityEngName=").append(this.CommodityEngName)
				.append(",ContractSize=").append(this.ContractSize).append(",CommodityTickSize=")
				.append(this.CommodityTickSize).append(",CommodityDenominator=").append(this.CommodityDenominator)
				.append(",CmbDirect=").append(this.CmbDirect == 0 ? ' ' : this.CmbDirect)
				.append(",CommodityContractLen=").append(this.CommodityContractLen).append(",IsDST=")
				.append(this.IsDST == 0 ? ' ' : this.IsDST).append(",RelateCommodity1=").append(this.RelateCommodity1)
				.append(",RelateCommodity2=").append(this.RelateCommodity2).append("]");
		return arg0.toString();
	}
}