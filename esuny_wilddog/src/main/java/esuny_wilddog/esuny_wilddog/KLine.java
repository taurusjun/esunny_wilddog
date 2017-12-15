package esuny_wilddog.esuny_wilddog;

public class KLine {
	static final int KLINECAPACITY = 60 * 24;
	
	public long index;			// 
	public double preClosePx;	// 昨收
	public double OpenPx;		// 开 
	public double HighPx;		// 高
	public double LowPx;		// 低
	public double LastPx;		// 收
	public long Volume;			// 成交量
	public double Value;

	KLine() {
		this.index = 0;
		this.preClosePx = 0;
		this.OpenPx = 0;
		this.HighPx = 0;
		this.LowPx = 0;
		this.LastPx = 0;
		this.Volume = 0;
		this.Value = 0;
	}
	KLine(long index) {
		this.index = index;
		this.preClosePx = 0;
		this.OpenPx = 0;
		this.HighPx = 0;
		this.LowPx = 0;
		this.LastPx = 0;
		this.Volume = 0;
		this.Value = 0;
	}
}
