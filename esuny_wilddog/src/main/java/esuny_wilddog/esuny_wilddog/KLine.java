package esuny_wilddog.esuny_wilddog;

public class KLine implements Serializable {
	static final int KLINECAPACITY = 60 * 24;

	public String contractUID;
	private long index; // 时间索引
	private double OpenPx; // 开
	private double HighPx; // 高
	private double LowPx; // 低
	private double LastPx; // 收
	private long Volume; // 成交量
	private long TotalQty; // 总成交量

	KLine() {
		this.index = 0;
		this.OpenPx = 0;
		this.HighPx = 0;
		this.LowPx = 0;
		this.LastPx = 0;
		this.Volume = 0;
		this.TotalQty = 0;
	}

	KLine(long index) {
		this.index = index;
		this.OpenPx = 0;
		this.HighPx = 0;
		this.LowPx = 0;
		this.LastPx = 0;
		this.Volume = 0;
		this.TotalQty = 0;
	}

	public KLine(String contractUID, long index, double openPx, double highPx, double lowPx, double lastPx, long volume,
			long totalQty) {
		super();
		this.contractUID = contractUID;
		this.index = index;
		OpenPx = openPx;
		HighPx = highPx;
		LowPx = lowPx;
		LastPx = lastPx;
		Volume = volume;
		TotalQty = totalQty;
	}

	@Override
	public String toString() {
		return "KLine [contractUID=" + contractUID + ", index=" + index + ", OpenPx=" + OpenPx + ", HighPx=" + HighPx
				+ ", LowPx=" + LowPx + ", LastPx=" + LastPx + ", Volume=" + Volume + ", TotalQty=" + TotalQty + "]";
	}

	public String getContractUID() {
		return contractUID;
	}

	public void setContractUID(String contractUID) {
		this.contractUID = contractUID;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public double getOpenPx() {
		return OpenPx;
	}

	public void setOpenPx(double openPx) {
		OpenPx = openPx;
	}

	public double getHighPx() {
		return HighPx;
	}

	public void setHighPx(double highPx) {
		HighPx = highPx;
	}

	public double getLowPx() {
		return LowPx;
	}

	public void setLowPx(double lowPx) {
		LowPx = lowPx;
	}

	public double getLastPx() {
		return LastPx;
	}

	public void setLastPx(double lastPx) {
		LastPx = lastPx;
	}

	public long getVolume() {
		return Volume;
	}

	public void setVolume(long volume) {
		Volume = volume;
	}

	public long getTotalQty() {
		return TotalQty;
	}

	public void setTotalQty(long totalQty) {
		TotalQty = totalQty;
	}
}
