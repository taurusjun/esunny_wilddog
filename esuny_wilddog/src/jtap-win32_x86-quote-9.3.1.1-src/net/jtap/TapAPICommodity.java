package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;

public final class TapAPICommodity {
	public String ExchangeNo;
	public char CommodityType;
	public String CommodityNo;

	public TapAPICommodity() {
	}

	public TapAPICommodity(String arg0, char arg1, String arg2) {
		this.ExchangeNo = arg0;
		this.CommodityType = arg1;
		this.CommodityNo = arg2;
	}

	static TapAPICommodity fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 23;

			TapAPICommodity arg0 = new TapAPICommodity();
			arg0.ExchangeNo = BufferUtil.bytes2str(arg, 0, 11);
			arg0.CommodityType = (char) arg[11];
			arg0.CommodityNo = BufferUtil.bytes2str(arg, 12, 11);
			return arg0;
		}
	}

	static TapAPICommodity fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(23).order(ByteOrder.nativeOrder());
		BufferUtil.str2bytes(arg0, this.ExchangeNo, 0, 11);
		arg0.put(11, (byte) this.CommodityType);
		BufferUtil.str2bytes(arg0, this.CommodityNo, 12, 11);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPICommodity[").append("ExchangeNo=").append(this.ExchangeNo).append(",CommodityType=")
				.append(this.CommodityType == 0 ? ' ' : this.CommodityType).append(",CommodityNo=")
				.append(this.CommodityNo).append("]");
		return arg0.toString();
	}
}