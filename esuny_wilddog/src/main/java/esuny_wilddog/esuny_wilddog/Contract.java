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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.jtap.TapAPIQuoteWhole;

public class Contract {
	static Logger logger = LoggerFactory.getLogger(Contract.class.getName());
	static final int MAX_CONTRACT_NUM = 50;
	
	// 合约名称 例如:NYMEX.CL.1801
	String contractUID;

	// 分钟K
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
			fos = new FileOutputStream(file, false);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.minklinesList);
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
			this.minklinesList = (LinkedList<KLine>) ois.readObject();
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
	public static long getMinKLineIndex(String strDateTimestamp) {
		return getMinKLineIndex(strDateTimestamp, 0);
	}

	/**
	 * 取分钟K下标,偏移n分钟,负数向前,零当前分钟,正数向后
	 */
	public static long getMinKLineIndex(String strDateTimestamp, Integer offset_mins) {
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		long l = 0;
		Date d = new Date();
		Date dd = new Date();
		try {
			d = df.parse(strDateTimestamp);
			dd = new Date(d.getTime() + offset_mins * 60 * 1000);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		l = DateUtils.toLong(dd) / 100 * 100;
		return l;
	}
	
	public void UpdateQuote(TapAPIQuoteWhole quote) {
		// 时间戳转分钟K下标
		long minklineindex = getMinKLineIndex(quote.DateTimeStamp);

		// 访问并删除最后一个元素
		KLine lastminkline = minklinesList.pollLast();
		if (lastminkline == null) {		
			lastminkline = new KLine(quote);
		}
		
		// quote lastminkline 落在相同时间区间
		if (lastminkline.getIndex() == minklineindex) {
			lastminkline.update(quote);
			minklinesList.offer(lastminkline); // 将元素添加到尾部
		} else if (lastminkline.getIndex() < minklineindex) {
			// quote lastminkline 落在不同时间区间 
			KLine kline = new KLine(lastminkline, quote);
			kline.update(quote);
			minklinesList.offer(lastminkline); // 将元素添加到尾部
			minklinesList.offer(kline);
		}

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
		logger.debug("deserializeMinKLines:" + c.minklinesList.size());
		Iterator<KLine> it = c.minklinesList.iterator();
		while (it.hasNext()) {
			KLine k = (KLine)it.next();
			logger.debug(k.toString());
		}

	}

}
