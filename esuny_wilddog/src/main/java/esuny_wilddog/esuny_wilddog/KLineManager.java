/**
 * 
 */
package esuny_wilddog.esuny_wilddog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import net.jtap.TapAPIQuoteWhole;

/**
 * 合约的分钟K线集合
 * 
 * @author wuweitao
 * 
 */

public class KLineManager {
	static final int KLINESIZE = 60 * 24;

	static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private Map<String, HashMap<Long, KLine>> mapMinKLine = new HashMap<String, HashMap<Long, KLine>>();

	public void Init(String contractUID) {
		mapMinKLine.put(contractUID, new HashMap<Long, KLine>(KLINESIZE));
	}

	public void UpdateKLine(TapAPIQuoteWhole quote) {
		// 合约ID
		String contractUID = quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo
				+ quote.Contract.ContractNo1;

		HashMap<Long, KLine> minklines = mapMinKLine.get(contractUID);
		if (minklines == null) {
			minklines = new HashMap<Long, KLine>(KLINESIZE);
			mapMinKLine.put(contractUID, minklines);
		}

		// 分钟K下标
		long minklineindex = getMinKLineIndex(quote.DateTimeStamp);
		KLine minkline = minklines.get(minklineindex);
		if (minkline == null) {
			minkline = new KLine(minklineindex);
			minklines.put(minklineindex, minkline);
		}

		// 第一根K线
		KLine firstminkline = new KLine();
		firstminkline.index = minklineindex;
		if (firstminkline.OpenPx == 0)
			firstminkline.OpenPx = firstminkline.HighPx = firstminkline.LowPx = firstminkline.LastPx = quote.QPreClosingPrice;

		// 前一根K线
		KLine preminkline = new KLine();

		// 更新当前K线
		if (minkline.OpenPx == 0 && preminkline.LastPx > 0) {
			minkline.OpenPx = minkline.HighPx = minkline.LowPx = minkline.LastPx = preminkline.LastPx;
		}

		if (minkline.HighPx < quote.QHighPrice)
			minkline.HighPx = quote.QHighPrice;

		if (minkline.LowPx < quote.QLowPrice)
			minkline.LowPx = quote.QLowPrice;

		if (minkline.LastPx < quote.QLastPrice)
			minkline.LastPx = quote.QLastPrice;

		minkline.Volume += quote.QLastQty;

	}

	/**
	 * @param strDateTimestamp
	 */
	public static long getMinKLineIndex(String strDateTimestamp) {
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		long l = 0;
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString() + d.getTime());
		try {
			d = df.parse(strDateTimestamp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l = DateUtils.toLong(d) / 100 * 100;
		return l;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateStr = "2017-12-11 14:17:46.248";
		DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {

			Calendar calendar = Calendar.getInstance();

			java.util.Date date = new java.util.Date();
			date = sdf2.parse(dateStr);
			System.out.println(date.toString());

			long longdate = DateUtils.toLong(date);
			System.out.println(longdate / 100 * 100);

			System.out.println("timestatmp:" + dateStr + " KLineIndex:" + getMinKLineIndex(dateStr));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
