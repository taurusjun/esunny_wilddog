package esuny_wilddog.esuny_wilddog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.jtap.TapAPIQuoteWhole;

public class Contract {
	static Logger logger = LoggerFactory.getLogger(Contract.class.getName());
	static final int MAX_CONTRACT_NUM = 50;
	
	// 合约名称 NYMEX.CL.1801
	String contractUID;
	
	// 全天分钟K线 分时线 下标为整数,用时间表示,不含日期 格式"hhMM"
	private LinkedHashMap<Long, KLine> minklines = new LinkedHashMap<Long, KLine>(KLine.KLINECAPACITY);

	// 
	private LinkedList<KLine> minklinesList = new LinkedList<KLine>();
	
	// 全部品种交易时间信息
	static final HashMap<String, ArrayList<LocalTime>> commodityTradeTime = new HashMap<String, ArrayList<LocalTime>>();
	static void InitTradeTime() {
		ArrayList<LocalTime> array = new ArrayList<LocalTime>();
		Boolean isDST = false;
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

	// TODO 待改进 存在问题 写冗余
	// 序列化分钟K线
	void serializeMinKLines(File dataDir, String filename) {
		try {
			File file = new File(dataDir, filename);
			FileOutputStream fos;
			fos = new FileOutputStream(file, true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.minklines);
			oos.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}

//	@SuppressWarnings("unchecked")
	// 反序列化分钟K线
	void deserializeMinKLines(File dataDir, String filename) {
		try {
			File file = new File(dataDir, filename);
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			LinkedHashMap<Long, KLine> readObject = (LinkedHashMap<Long, KLine>) ois.readObject();
			this.minklines = readObject;
			ois.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		}
	}

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
		try {
			d = df.parse(strDateTimestamp);
			// TODO 需完善交易时间段判断
			dd = new Date(d.getTime() + n * 60 * 1000);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		l = DateUtils.toLong(dd) / 100 * 100;
		return l;
	}
	
	/**
	 * 根据时间戳判断品种所属交易日 
	 * 
	 */
	public static Long getTradeDay(String commodityUID, String strDateTimestamp) {
		// TODO
		LocalDate ld = LocalDate.now();

		return new Long(ld.getYear() * 10000 + ld.getMonthValue() * 100 + ld.getDayOfMonth());
	}
	
	/**
	 * 根据时间戳判断品种交易日第一根分钟K线下标
	 * 
	 */
	public static Long getFirstMinKLineIndex(String commodityUID,  String strDateTimestamp) {
		//TODO 
		Long nTradeDay = getTradeDay(commodityUID, strDateTimestamp);
		LocalTime lt = LocalTime.now();
		return new Long(0);
	}

	public void UpdateQuote(TapAPIQuoteWhole quote) {
		// 品种ID
		String commodityUID = quote.Contract.Commodity.ExchangeNo 
				+ "." + quote.Contract.Commodity.CommodityNo;

		// 第一根K线下标
		long firstminklineIndex = getFirstMinKLineIndex(commodityUID, quote.DateTimeStamp);
		
		// 当前分钟K下标
		long minklineindex = getMinKLineIndex(commodityUID, quote.DateTimeStamp, 0);
		
		KLine minkline = minklines.get(new Long(minklineindex));
		if (minkline == null) {
			String contractUID = quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo + "."
					+ quote.Contract.ContractNo1;		
			
			minkline = new KLine(contractUID, new Long(minklineindex));
		}
		
		// 分钟K线开盘价 优先取前一分钟K线的最新价 其次当天开盘价 最次昨收价		
		// TODO 序列化分钟K线 避免行情中断
		long preminklineindex = getMinKLineIndex(commodityUID, quote.DateTimeStamp, -1);
		KLine preminkline = minklines.get(preminklineindex);
		if (preminkline == null) {
			preminkline = new KLine();
		}
		
		if (minkline.getOpenPx() == 0) {
			minkline.setOpenPx(preminkline.getLastPx() > 0 ? preminkline.getLastPx()
					: (quote.QOpeningPrice > 0 ? quote.QOpeningPrice : quote.QPreClosingPrice));
		}

		if (minkline.getHighPx() < quote.QLastPrice)
			minkline.setHighPx(quote.QLastPrice);

		if (minkline.getLowPx() == 0 || minkline.getLowPx() > quote.QLastPrice)
			minkline.setLowPx (quote.QLastPrice);

		minkline.setLastPx(quote.QLastPrice);

		// 模拟逐笔成交
		long deltal_qty = quote.QTotalQty - minkline.getTotalQty();
		
		// 分钟成交量
		minkline.setVolume(quote.QTotalQty - preminkline.getTotalQty());
		
		// 总成交量
		minkline.setTotalQty(quote.QTotalQty);
				
		minklines.put(new Long(minklineindex), minkline);
		
		// TODO 调试K线
		logger.debug(minkline.toString() + ((deltal_qty > 0) ? (" delta:" + deltal_qty) : ""));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		logger.debug("Today's Local date : " + today);

		// 判断是否夏令时
		logger.debug("inDaylightTime:" + TimeZone.getDefault().inDaylightTime(new Date()));

		// JVM -Duser.timezone=GMT+08
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-05"));
		TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
		boolean inDs = tz.inDaylightTime(new Date());
		logger.debug("inDaylightTime:" + inDs);
		
		
		String filename = "new.minkline.HKEX.HSI.1801";
		File dataDir = new File("data");		
		Contract c = new Contract("HKEX.HSI.1801");
		c.deserializeMinKLines(dataDir, filename);
		logger.debug("deserializeMinKLines:"+c.minklines.size());
		for(KLine k:c.minklines.values())
		{
			logger.debug(k.toString());
		}
	
	}

}
