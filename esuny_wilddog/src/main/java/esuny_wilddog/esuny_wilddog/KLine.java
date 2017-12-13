package esuny_wilddog.esuny_wilddog;

public class KLine {
	public long index;
	public double preClosePx;
	public double OpenPx;
	public double HighPx;
	public double LowPx;
	public double LastPx;
	public double Volume;
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
