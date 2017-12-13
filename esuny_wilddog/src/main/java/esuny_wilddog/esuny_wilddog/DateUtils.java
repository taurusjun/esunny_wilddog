package esuny_wilddog.esuny_wilddog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 日期工具
 */
public class DateUtils {
	private static final String LONG_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String STR_DATE_PATTERN = "yyyyMMdd";
	public static final String DATEFORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static final String DATEFORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获取指定时区的当前时间
	 * 
	 * @param date
	 * @param oldZone
	 * @param newZone
	 * @return
	 */
	public static Date getNowByTimeZone(TimeZone newZone) {
		return changeTimeZone(new Date(), TimeZone.getTimeZone("Asia/Shanghai"), newZone);
	}

	/**
	 * 将时间从一个时区转换到另一个时区
	 * 
	 * @param date
	 * @param oldZone
	 * @param newZone
	 * @return
	 */
	public static Date changeTimeZone(Date date, TimeZone oldZone, TimeZone newZone) {
		Date dateTmp = null;
		if (date != null) {
			int timeOffset = oldZone.getRawOffset() - newZone.getRawOffset();
			dateTmp = new Date(date.getTime() - timeOffset);
		}
		return dateTmp;
	}

	/**
	 * 格式化时间后从一个时区转换到另一个时区
	 * @param sourceDate
	 * @param formatter
	 * @param sourceTimeZone
	 * @param targetTimeZone
	 * @return
	 */
	public static String dateTransformBetweenTimeZone(Date sourceDate, DateFormat formatter, TimeZone sourceTimeZone,
			TimeZone targetTimeZone) {
		Long targetTime = sourceDate.getTime() - sourceTimeZone.getRawOffset() + targetTimeZone.getRawOffset();
		return formatter.format(new Date(targetTime));
	}

	/**
	 * 返回date用int表示的时间(HHmm)
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getUTCTime2Int(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.setTime(date);
		int day = 0;
		day += calendar.get(Calendar.HOUR_OF_DAY) * 100;
		day += calendar.get(Calendar.MINUTE);
		return day;
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static DateUtils getInstance() {
		return new DateUtils();
	}

	public static void main(String[] args) {
	}

	/**
	 * 返回当天的指定时间
	 * 
	 * @param time
	 * @param c
	 * @param mkt
	 * @return
	 */
	public static Date getDate(int time, Calendar c) {
		int second = (int) (time % 100);
		time /= 100;
		int minute = (int) (time % 100);
		time /= 100;
		int hour = (int) (time % 100);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		return c.getTime();
	}

	/**
	 * 格式化日期：yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String formatLongPattern(Date date) {
		return format(date, LONG_PATTERN);
	}

	/**
	 * 格式化日期：yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public String flp(Date date) {
		return formatLongPattern(date);
	}

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		if (date == null)
			return null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.format(date);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 返回用long表示的日期：yyyyMMddHHmmss
	 * 
	 * @param d
	 * @return
	 */
	public static long toLong(Date d) {
		if (d == null)
			return 0l;
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long v = 0;
		v = c.get(Calendar.YEAR);
		v = v * 100l + c.get(Calendar.MONTH) + 1;
		v = v * 100l + c.get(Calendar.DAY_OF_MONTH);
		v = v * 100l + c.get(Calendar.HOUR_OF_DAY);
		v = v * 100l + c.get(Calendar.MINUTE);
		v = v * 100l + c.get(Calendar.SECOND);
		return v;
	}

	/**
	 * 转化为日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 * @throws HqException
	 */
	public static Date parse(String date, String pattern) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.parse(date);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 获取今天：yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getTodayDate() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		return f.format(d);
	}

	/**
	 * 获取今天：HH:mm:ss
	 * 
	 * @return
	 */
	public static String getTodayTime() {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
		Date d = new Date();
		return f.format(d);
	}

	/**
	 * 格式化日期：yyyy-MM-dd
	 * 
	 * @param d
	 * @return
	 */
	public static String getDate2String(Date d) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		return f.format(d);
	}

	/**
	 * 获取今日日期
	 * 
	 * @return
	 */
	public static Date getTodayDay() {
		return new Date();
	}

	/**
	 * 返回date用int表示的日期(yyyyMMdd)
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getDay2Int(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 返回date用int表示的时间(HHmmss)
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getTime2Int(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = 0;
		day += calendar.get(Calendar.HOUR_OF_DAY) * 10000;
		day += calendar.get(Calendar.MINUTE) * 100;
		day += calendar.get(Calendar.SECOND);
		return day;
	}

	/**
	 * 根据int返回具体的日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getDateFromNumber(long date) {
		int _date = (int) date;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, _date / 10000);
		calendar.set(Calendar.MONTH, _date % 10000 / 100 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, _date % 100);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 根据int返回具体的日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getDateFromLong(long date) {
		Calendar calendar = Calendar.getInstance();
		int second = (int) (date % 100);
		date /= 100;
		int minute = (int) (date % 100);
		date /= 100;
		int hour = (int) (date % 100);
		date /= 100;
		int day = (int) (date % 100);
		date /= 100;
		int month = (int) (date % 100);
		date /= 100;
		int year = (int) date;

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		return calendar.getTime();
	}

	/**
	 * 设置某天的最开始时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirestTimeOfDay(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 设置某天的最晚时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndTimeOfDay(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	/**
	 * 比较date是否介于from和to之间(包含from和to)
	 * 
	 * @param date
	 * @param from
	 * @param to
	 * @return
	 */
	public static boolean isBetween(Date date, Date from, Date to) {
		if (date == null || (from == null && to == null))
			return false;

		if (from == null)
			return date.compareTo(to) <= 0;
		if (to == null)
			return date.compareTo(from) >= 0;

		return date.compareTo(from) >= 0 && date.compareTo(to) <= 0;
	}

	/**
	 * 获取每月第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getMonthBegin(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}

	/**
	 * 获取年第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYearBegin(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}

	/**
	 * 获取周第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getWeekBegin(Date date) {
		if (date == null)
			return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return calendar.getTime();
	}

	/** 得到一天是一年中的第几周的方法 */
	public static int getWeekOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		if (month == 12 && week == 1) {
			year++;
		}
		return year * 100 + week;
	}

	/** 得到一天是一年中的第几个月份的方法 */
	public static int getMonthOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		return year * 100 + month;
	}

	/**
	 * 得到当前周的第一天的日期返回int
	 */
	public static int getBeginDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	public static Object getWeekEnd(Date date) {
		if (date == null)
			return null;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	public static Object getMonthEnd(Date date) {
		if (date == null)
			return null;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.DATE);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 得到当前周的 最后一天的日期返回int
	 */
	public static int getEndDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 得到当前月的第一天的日期返回int
	 */
	public static int getBeginDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 得到当前月的 最后一天的日期返回int
	 */
	public static int getEndDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.DATE);
		int day = 0;
		day += calendar.get(Calendar.YEAR) * 10000;
		day += (calendar.get(Calendar.MONTH) + 1) * 100;
		day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

	/**
	 * 格式化日期为HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTime(Date date) {
		if (date == null)
			return null;
		try {
			return TIME_FORMAT.format(date);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 获得从开盘时间到指定时间的时间差，分钟；日期相同
	 * 
	 * @param nowDateTime
	 * @return
	 */
	public static long getOpenTimeToNow(Date nowDateTime) {
		// 早开盘时间
		Calendar c1 = Calendar.getInstance();
		c1.setTime(nowDateTime);
		c1.set(Calendar.HOUR_OF_DAY, 9);
		c1.set(Calendar.MINUTE, 30);
		c1.set(Calendar.SECOND, 0);

		// 早收盘时间
		Calendar c2 = Calendar.getInstance();
		c2.setTime(nowDateTime);
		c2.set(Calendar.HOUR_OF_DAY, 11);
		c2.set(Calendar.MINUTE, 30);
		c2.set(Calendar.SECOND, 0);

		// 午开盘时间
		Calendar c3 = Calendar.getInstance();
		c3.setTime(nowDateTime);
		c3.set(Calendar.HOUR_OF_DAY, 13);
		c3.set(Calendar.MINUTE, 0);
		c3.set(Calendar.SECOND, 0);

		// 午收盘时间
		Calendar c4 = Calendar.getInstance();
		c4.setTime(nowDateTime);
		c4.set(Calendar.HOUR_OF_DAY, 15);
		c4.set(Calendar.MINUTE, 0);
		c4.set(Calendar.SECOND, 0);

		// 开盘时间(分钟）

		long min = 0;
		// 收盘后
		if (nowDateTime.after(c4.getTime())) {
			min = 240;
		} else if (nowDateTime.after(c3.getTime())) {
			min = 120 + (nowDateTime.getTime() - c3.getTime().getTime()) / (1000 * 60);
		} else if (nowDateTime.after(c2.getTime())) {
			min = 120;
		} else if (nowDateTime.after(c1.getTime())) {
			min = (nowDateTime.getTime() - c1.getTime().getTime()) / (1000 * 60);
		}
		return min;
	}

	/**
	 * 传入int类型时间，返回Date类型
	 * 
	 * @param date
	 * @return
	 */
	public static Date getDateFromInt(int date) {
		String strDate = String.valueOf(date);
		SimpleDateFormat sdf = new SimpleDateFormat(STR_DATE_PATTERN);
		Date d = null;
		try {
			d = sdf.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}

	/**
	 * 加一秒
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateTimePlusOneSecond(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(LONG_PATTERN);
			Date time = sdf.parse(date);
			Calendar c = Calendar.getInstance();
			c.setTime(time);
			c.add(Calendar.SECOND, 1);
			return formatLongPattern(c.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
			return date;
		}
	}

	/**
	 * 获得前几天的日期
	 * 
	 * @param date
	 * @param dayNumber
	 * @return
	 */
	public static Integer getBeforeDate(Date date, int dayNumber) {
		return getDay2Int(getTargetDate(date, -dayNumber));
	}

	/**
	 * 获得前几天的日期
	 * 
	 * @param dayNumber
	 * @return
	 */
	public static Date getTargetDate(Date date, int dayNumber) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, dayNumber);
		return calendar.getTime();
	}
}
