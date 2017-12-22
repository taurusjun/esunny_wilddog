package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jtap.TapAPICommodity;

public final class TapAPIContract {
	public TapAPICommodity Commodity;
	public String ContractNo1;
	public String StrikePrice1;
	public char CallOrPutFlag1;
	public String ContractNo2;
	public String StrikePrice2;
	public char CallOrPutFlag2;

	public TapAPIContract() {
	}

	public TapAPIContract(TapAPICommodity arg0, String arg1, String arg2, char arg3, String arg4, String arg5,
			char arg6) {
		this.Commodity = arg0;
		this.ContractNo1 = arg1;
		this.StrikePrice1 = arg2;
		this.CallOrPutFlag1 = arg3;
		this.ContractNo2 = arg4;
		this.StrikePrice2 = arg5;
		this.CallOrPutFlag2 = arg6;
	}

	static TapAPIContract fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 69;

			TapAPIContract arg0 = new TapAPIContract();
			arg0.Commodity = TapAPICommodity.fromBytes(arg, 0, 23);
			arg0.ContractNo1 = BufferUtil.bytes2str(arg, 23, 11);
			arg0.StrikePrice1 = BufferUtil.bytes2str(arg, 34, 11);
			arg0.CallOrPutFlag1 = (char) arg[45];
			arg0.ContractNo2 = BufferUtil.bytes2str(arg, 46, 11);
			arg0.StrikePrice2 = BufferUtil.bytes2str(arg, 57, 11);
			arg0.CallOrPutFlag2 = (char) arg[68];
			return arg0;
		}
	}

	static TapAPIContract fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(69).order(ByteOrder.nativeOrder());
		arg0.position(0);
		arg0.put(this.Commodity.toBytes());
		BufferUtil.str2bytes(arg0, this.ContractNo1, 23, 11);
		BufferUtil.str2bytes(arg0, this.StrikePrice1, 34, 11);
		arg0.put(45, (byte) this.CallOrPutFlag1);
		BufferUtil.str2bytes(arg0, this.ContractNo2, 46, 11);
		BufferUtil.str2bytes(arg0, this.StrikePrice2, 57, 11);
		arg0.put(68, (byte) this.CallOrPutFlag2);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIContract[").append("Commodity=").append(this.Commodity).append(",ContractNo1=")
				.append(this.ContractNo1).append(",StrikePrice1=").append(this.StrikePrice1).append(",CallOrPutFlag1=")
				.append(this.CallOrPutFlag1 == 0 ? ' ' : this.CallOrPutFlag1).append(",ContractNo2=")
				.append(this.ContractNo2).append(",StrikePrice2=").append(this.StrikePrice2).append(",CallOrPutFlag2=")
				.append(this.CallOrPutFlag2 == 0 ? ' ' : this.CallOrPutFlag2).append("]");
		return arg0.toString();
	}
}