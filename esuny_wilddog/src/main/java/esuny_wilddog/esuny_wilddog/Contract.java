package esuny_wilddog.esuny_wilddog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.jtap.TapAPIQuoteWhole;

public class Contract {
	// 合约名称 NYMEX.CL.1801
	String contractUID;
	
	// 全部品种交易时间信息
	static final HashMap<String, ArrayList<LocalTime>> commodityTradeTime= new HashMap<String, ArrayList<LocalTime>>();
	static void Init() {
		 ArrayList<LocalTime> array = new ArrayList<LocalTime>();
		Boolean isDST = true;
		// 美原油 天然气 黄金 白银
		// 夏令电子盘 06:00-05:00
		// 冬令电子盘 07:00-06:00
		if (isDST) {
			array.add(LocalTime.of(06, 00, 00));
			array.add(LocalTime.MAX);
			array.add(LocalTime.MIDNIGHT);
			array.add(LocalTime.of(05, 00, 00));
		} else {
			array.add(LocalTime.of(07, 00, 00));
			array.add(LocalTime.MAX);
			array.add(LocalTime.MIDNIGHT);
			array.add(LocalTime.of(06, 00, 00));
		}
		commodityTradeTime.put("NYMEX.CL", array);
		commodityTradeTime.put("NYMEX.NG", array);
		commodityTradeTime.put("NYMEX.GC", array);
		commodityTradeTime.put("NYMEX.SI", array);
		
		// 德指
		// 夏令电子盘 13:50-04:00*
		// 冬令电子盘 14:50-05:00
		array.clear();
		if (isDST) {
			array.add(LocalTime.of(13, 50, 00));
			array.add(LocalTime.MAX);
			array.add(LocalTime.MIDNIGHT);
			array.add(LocalTime.of(04, 00, 00));
		} else {
			array.add(LocalTime.of(14, 50, 00));
			array.add(LocalTime.MAX);
			array.add(LocalTime.MIDNIGHT);
			array.add(LocalTime.of(05, 00, 00));
		}
		commodityTradeTime.put("EUREX.DAX", array);
		
		// 大恒指 小恒指
		// 09:15-12:00; 13:00-16:30
		// (T+1)17:15-01:00
		array.clear();
		array.add(LocalTime.of(17, 15, 00));
		array.add(LocalTime.MAX);
		array.add(LocalTime.MIDNIGHT);
		array.add(LocalTime.of(01, 00, 00));
		array.add(LocalTime.of(9, 15, 00));
		array.add(LocalTime.of(16, 30, 00));
		commodityTradeTime.put("HKEX.HSI", array);
		commodityTradeTime.put("HKEX.MHI", array);
			
		// A50
		// 09:00-16:35;
		// (T+1)17:00-04:45
		array.clear();
		array.add(LocalTime.of(17, 00, 00));
		array.add(LocalTime.MAX);
		array.add(LocalTime.MIDNIGHT);
		array.add(LocalTime.of(04, 45, 00));
		array.add(LocalTime.of(9, 00, 00));
		array.add(LocalTime.of(16, 35, 00));
		commodityTradeTime.put("SGX.CN", array);
	}
	// 交易时间段
	private ArrayList<LocalTime> tradeTimeArray = new ArrayList<LocalTime>();
	
	static final int MAX_CONTRACT_NUM = 50;
	
	static Logger logger = LoggerFactory.getLogger(Contract.class.getName());
	
	// 保存上一笔行情,计算逐笔成交
	TapAPIQuoteWhole last_quote = new TapAPIQuoteWhole();
	
	
	// 全天分钟K线 分时线 
	private LinkedHashMap<Long, KLine> minklines = new LinkedHashMap<Long, KLine>(KLine.KLINECAPACITY);


	
	Contract(String contractUID){
		this.contractUID = contractUID;
	}
	
	/**
	 * @param strDateTimestamp
	 */
	public static long getMinKLineIndex(String contractUID, String strDateTimestamp) {
		return getMinKLineIndex(contractUID, strDateTimestamp, 0);
	}

	/**
	 * 取分钟K下标,偏移n分钟,负数向前,零当前分钟,正数向后
	 */
	public static long getMinKLineIndex(String contractUID, String strDateTimestamp, Integer n) {
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		long l = 0;
		Date d = new Date();
		Date dd = new Date();
//		System.out.println(d.toString() + d.getTime());
		try {
			d = df.parse(strDateTimestamp);
			dd = new Date(d.getTime() + n * 60 * 1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l = DateUtils.toLong(dd) / 100 * 100;
		return l;
	}
	
	/**
	 * 根据时间戳判断品种所属交易日 
	 * 
	 */
	public static Long getTradeDay(String contractUID, String strDateTimestamp) {
		//TODO T
		return new Long(0);
	}
	
	/**
	 * 根据时间戳判断品种交易日第一根分钟K线下标
	 * 
	 */
	public static Long getFirstMinKLineIndex(String contractUID,  String strDateTimestamp) {
		//TODO T
		Long nTradeDay = getTradeDay(contractUID, strDateTimestamp);
		
		return new Long(0);
	}
	
	public void UpdateQuote(TapAPIQuoteWhole quote) {
		// 合约ID
		String contractUID = quote.Contract.Commodity.ExchangeNo 
				+ "." + quote.Contract.Commodity.CommodityNo
				+ "." + quote.Contract.ContractNo1;

		// 第一根K线下标
		long firstminklineIndex = getFirstMinKLineIndex(contractUID, quote.DateTimeStamp);
		// 当前分钟K下标
		long minklineindex = getMinKLineIndex(contractUID, quote.DateTimeStamp, 0);
		
		KLine minkline = minklines.get(new Long(minklineindex));
		if (minkline == null) {
			minkline = new KLine(new Long(minklineindex));
		}

		// 分钟K线首次更新 openpx需特别处理
		if (minklineindex == firstminklineIndex) {
			if (minkline.OpenPx == 0) {
				minkline.preClosePx = quote.QPreClosingPrice;
				minkline.OpenPx = quote.QOpeningPrice > 0 ? quote.QOpeningPrice : quote.QPreClosingPrice;			
			}		
		} else if (minklineindex > firstminklineIndex) {
			if (minkline.OpenPx == 0) {
				long preminklineindex = getMinKLineIndex(contractUID, quote.DateTimeStamp, -1);
				KLine preminkline = minklines.get(preminklineindex);
				// TODO 处理行情丢失问题 
				if (preminkline == null) {
					minkline.OpenPx = quote.QOpeningPrice;
					// 补全缺失K线
					// firstminklineIndex --> preminklineindex
					// minklines.put(new Long(minklineindex), minkline);
				}
				else
					minkline.OpenPx = preminkline.LastPx > 0 ? preminkline.LastPx : quote.QOpeningPrice;
			}
		} else if (minklineindex < firstminklineIndex) {
			System.out.println(
					"ERROR: minklineindex[" + minklineindex + "] < firstminklineIndex[" + firstminklineIndex + "]");
			return;
		}

		if (minkline.HighPx < quote.QLastPrice)
			minkline.HighPx = quote.QLastPrice;

		if (minkline.LowPx == 0 || minkline.LowPx > quote.QLastPrice)
			minkline.LowPx = quote.QLastPrice;

		minkline.LastPx = quote.QLastPrice;

		minkline.Volume += quote.QTotalQty - last_quote.QTotalQty;

		minklines.put(new Long(minklineindex), minkline);

		StringBuilder line = new StringBuilder(512);
		line.append("Kline ").append(this.contractUID).append(minkline.index).append(" o:").append(minkline.OpenPx).append(" h:")
				.append(minkline.HighPx).append(" l:").append(minkline.LowPx).append(" c:").append(minkline.LastPx)
				.append(" qty:").append(minkline.Volume).append(" deal:").append(quote.QTotalQty - last_quote.QTotalQty);

		System.out.println(line.toString());

		last_quote = quote;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		logger.debug("Today's Local date : " + today);
		
		// 判断是否夏令时
		logger.debug("inDaylightTime:"+TimeZone.getDefault().inDaylightTime( new Date() ));
		
		TimeZone tz = TimeZone.getTimeZone("EST");
		boolean inDs = tz.inDaylightTime(new Date());
		logger.debug("inDaylightTime:"+inDs);
	}

}
