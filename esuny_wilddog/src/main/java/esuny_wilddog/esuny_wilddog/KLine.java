package esuny_wilddog.esuny_wilddog;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.jtap.TapAPIQuoteWhole;

public class KLine implements java.io.Serializable{
	
	static Logger logger = LoggerFactory.getLogger(KLine.class.getName());
	
	 /**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -1379471012870499231L;

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

	KLine(String contractUID, long index) {
		this.contractUID = contractUID;
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

	public KLine(TapAPIQuoteWhole quote) {
		// 合约ID
		String contractUID = quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo + "."
				+ quote.Contract.ContractNo1;
		
		// 时间戳转分钟下标
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		long index = 0;
		Date d = new Date();
		try {
			d = df.parse(quote.DateTimeStamp);		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		index = DateUtils.toLong(d) / 100 * 100;
		
		this.contractUID = contractUID;
		this.setIndex( index);
		update(quote);
	}
	
	public KLine(KLine preKLine, TapAPIQuoteWhole quote) {
		// 合约ID
		String contractUID = quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo + "."
				+ quote.Contract.ContractNo1;
		
		// 时间戳转分钟下标
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		long index = 0;
		Date d = new Date();
		try {
			d = df.parse(quote.DateTimeStamp);		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		index = DateUtils.toLong(d) / 100 * 100;
		
		this.contractUID = contractUID;
		this.setIndex( index);
		
			// 用上一根K初始化当前K
		if (this.getIndex() > preKLine.getIndex()) {
			this.setOpenPx(preKLine.getLastPx());
			this.setHighPx(preKLine.getLastPx());
			this.setLowPx(preKLine.getLastPx());
			this.setLastPx(preKLine.getLastPx());
			this.setTotalQty(preKLine.getTotalQty());
		}

	}
	
	public void update(TapAPIQuoteWhole quote) {
		if (this.getOpenPx() == 0) {
			this.setOpenPx(quote.QOpeningPrice > 0 ? quote.QOpeningPrice : quote.QPreClosingPrice);
		}

		if (this.getHighPx() < quote.QLastPrice)
			this.setHighPx(quote.QLastPrice);

		if (this.getLowPx() > quote.QLastPrice || this.getLowPx() == 0)
			this.setLowPx (quote.QLastPrice);

		this.setLastPx(quote.QLastPrice);

		// 模拟逐笔成交
		long delta_qty = quote.QTotalQty - this.getTotalQty();
		
		// 分钟成交量
		this.setVolume(this.getVolume() + delta_qty);
		
		// 总成交量
		this.setTotalQty(quote.QTotalQty);

//		logger.debug(this.toString() + (delta_qty > 0 ? (" delta:" + delta_qty) : ""));
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
