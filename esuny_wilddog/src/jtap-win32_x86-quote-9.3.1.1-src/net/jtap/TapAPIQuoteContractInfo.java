package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jtap.TapAPIContract;

public final class TapAPIQuoteContractInfo {
	public TapAPIContract Contract;
	public char ContractType;
	public String QuoteUnderlyingContract;
	public String ContractName;
	public String ContractExpDate;
	public String LastTradeDate;
	public String FirstNoticeDate;

	public TapAPIQuoteContractInfo() {
	}

	public TapAPIQuoteContractInfo(TapAPIContract arg0, char arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6) {
		this.Contract = arg0;
		this.ContractType = arg1;
		this.QuoteUnderlyingContract = arg2;
		this.ContractName = arg3;
		this.ContractExpDate = arg4;
		this.LastTradeDate = arg5;
		this.FirstNoticeDate = arg6;
	}

	static TapAPIQuoteContractInfo fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 185;

			TapAPIQuoteContractInfo arg0 = new TapAPIQuoteContractInfo();
			arg0.Contract = TapAPIContract.fromBytes(arg, 0, 69);
			arg0.ContractType = (char) arg[69];
			arg0.QuoteUnderlyingContract = BufferUtil.bytes2str(arg, 70, 11);
			arg0.ContractName = BufferUtil.bytes2str(arg, 81, 71);
			arg0.ContractExpDate = BufferUtil.bytes2ascii(arg, 152, 11);
			arg0.LastTradeDate = BufferUtil.bytes2ascii(arg, 163, 11);
			arg0.FirstNoticeDate = BufferUtil.bytes2ascii(arg, 174, 11);
			return arg0;
		}
	}

	static TapAPIQuoteContractInfo fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(185).order(ByteOrder.nativeOrder());
		arg0.position(0);
		arg0.put(this.Contract.toBytes());
		arg0.put(69, (byte) this.ContractType);
		BufferUtil.str2bytes(arg0, this.QuoteUnderlyingContract, 70, 11);
		BufferUtil.str2bytes(arg0, this.ContractName, 81, 71);
		BufferUtil.ascii2bytes(arg0, this.ContractExpDate, 152, 11);
		BufferUtil.ascii2bytes(arg0, this.LastTradeDate, 163, 11);
		BufferUtil.ascii2bytes(arg0, this.FirstNoticeDate, 174, 11);
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIQuoteContractInfo[").append("Contract=").append(this.Contract).append(",ContractType=")
				.append(this.ContractType == 0 ? ' ' : this.ContractType).append(",QuoteUnderlyingContract=")
				.append(this.QuoteUnderlyingContract).append(",ContractName=").append(this.ContractName)
				.append(",ContractExpDate=").append(this.ContractExpDate).append(",LastTradeDate=")
				.append(this.LastTradeDate).append(",FirstNoticeDate=").append(this.FirstNoticeDate).append("]");
		return arg0.toString();
	}
}