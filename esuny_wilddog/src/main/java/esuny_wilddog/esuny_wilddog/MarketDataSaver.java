package esuny_wilddog.esuny_wilddog;

import java.text.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.jtap.*;

import com.wilddog.client.SyncReference;
import com.wilddog.client.WilddogSync;
import com.wilddog.wilddogcore.WilddogApp;
import com.wilddog.wilddogcore.WilddogOptions;

public class MarketDataSaver {
	static Logger logger = LoggerFactory.getLogger(MarketDataSaver.class.getName());
	
	static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static final SimpleDateFormat marketDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	static AtomicInteger dataCount = new AtomicInteger();
	static volatile boolean requestStop;

	static String dataFileSuffix;
	static File dataDir = new File("data");
	// 行情写文件 数据缓冲区
	static final Map<String, BufferedWriter> dataWriterMap = new HashMap<String, BufferedWriter>();
	static final BlockingQueue<TapAPIQuoteWhole> marketDataQueue = new LinkedBlockingDeque<TapAPIQuoteWhole>();
	
	// 行情计算 数据缓冲区
	static final BlockingQueue<TapAPIQuoteWhole> marketDataQueueCalc = new LinkedBlockingDeque<TapAPIQuoteWhole>();

	// 写野狗 数据缓冲区
	static final Map<String, TapAPIQuoteWhole> marketDataMap = new HashMap<String, TapAPIQuoteWhole>();

	// 合约集合
	static final Map<String, Contract> contractsMap = new HashMap<String, Contract>(Contract.MAX_CONTRACT_NUM);

	private static class ThreadFuncSaveQuoteFile implements Runnable {

		// @Override
		public void run() {
			StringBuilder line = new StringBuilder(512);
			while (!requestStop) {
				int queueLength = 0;
				TapAPIQuoteWhole quote = null;
				try {
					quote = marketDataQueue.poll(5L, TimeUnit.SECONDS);
				} catch (InterruptedException e1) {					
					e1.printStackTrace();
				}
				queueLength = marketDataQueue.size();
				if (quote == null) {
					continue;
				}
				try {
					String contractUID = quote.Contract.Commodity.ExchangeNo + "."
							+ quote.Contract.Commodity.CommodityNo + "." + quote.Contract.ContractNo1;

					BufferedWriter writer = dataWriterMap.get(contractUID);
					if (writer == null) {
						writer = new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream(
												new File(dataDir, "quote." + contractUID + "." + dataFileSuffix), true),
										"UTF-8"));
						writer.write("\n");
						dataWriterMap.put(contractUID, writer);
					}
					line.setLength(0);

					line.append(quote.DateTimeStamp).append(",")
							.append(quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo
									+ "." + quote.Contract.ContractNo1)
							.append(",").append(quote.QTotalQty).append(",").append(quote.QLastQty).append(",")
							.append(price2str(quote.QLastPrice)).append("\n");

					// TODO writer
				    // writer.write(line.toString());
					if (queueLength < 100)
						writer.flush();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			for (BufferedWriter writer : dataWriterMap.values()) {
				try {
					writer.flush();
					writer.close();
				} catch (Exception e) {
					logger.error(e.toString());
				}
			}
			dataWriterMap.clear();
			
			logger.info(this.getClass().getName() + " exiting...");			
		}
	}

	private static class ThreadFuncWriteWilddog implements Runnable {
		static String urlWilddogSync = "https://wd0980993345vffczg.wilddogio.com";

		// @Override
		public void run() {
			// 初始化野狗
			WilddogOptions options = new WilddogOptions.Builder().setSyncUrl(urlWilddogSync).build();
			WilddogApp.initializeApp(options);
			SyncReference ref = WilddogSync.getInstance().getReference();

			Map<String, Object> rootMap = new HashMap<String, Object>();
			while (!requestStop) {
				// sleep 200ms
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					logger.error(e.toString());
				}

				Collection<TapAPIQuoteWhole> c = marketDataMap.values();
				Iterator<TapAPIQuoteWhole> i = c.iterator();
				while (i.hasNext()) {
					TapAPIQuoteWhole info = (TapAPIQuoteWhole) i.next();
					// logger.debug(i.next());

					// 合约子树
					Map<String, Object> childrenMap = new HashMap<String, Object>();
					// childrenMap.put("Contract",info.Contract); ///< 合约
					// childrenMap.put("CurrencyNo",info.CurrencyNo); ///< 币种编号
					// childrenMap.put("TradingState",info.TradingState); ///< 交易状态。1,集合竞价;2,集合
					childrenMap.put("DateTimeStamp", info.DateTimeStamp); /// < 时间戳
					childrenMap.put("QPreClosingPrice", price2str(info.QPreClosingPrice)); /// < 昨收盘价
					childrenMap.put("QPreSettlePrice", price2str(info.QPreSettlePrice)); /// < 昨结算价
					childrenMap.put("QPrePositionQty", qty2str(info.QPrePositionQty)); /// < 昨持仓量
					childrenMap.put("QOpeningPrice", price2str(info.QOpeningPrice)); /// < 开盘价
					childrenMap.put("QLastPrice", price2str(info.QLastPrice)); /// < 最新价
					childrenMap.put("QHighPrice", price2str(info.QHighPrice)); /// < 最高价
					childrenMap.put("QLowPrice", price2str(info.QLowPrice)); /// < 最低价
					childrenMap.put("QHisHighPrice", price2str(info.QHisHighPrice)); /// < 历史最高价
					childrenMap.put("QHisLowPrice", price2str(info.QHisLowPrice)); /// < 历史最低价
					childrenMap.put("QLimitUpPrice", price2str(info.QLimitUpPrice)); /// < 涨停价
					childrenMap.put("QLimitDownPrice", price2str(info.QLimitDownPrice)); /// < 跌停价
					childrenMap.put("QTotalQty", qty2str(info.QTotalQty)); /// < 当日总成交量
					childrenMap.put("QTotalTurnover", price2str(info.QTotalTurnover)); /// < 当日成交金额
					childrenMap.put("QPositionQty", qty2str(info.QPositionQty)); /// < 持仓量
					childrenMap.put("QAveragePrice", price2str(info.QAveragePrice)); /// < 均价
					childrenMap.put("QClosingPrice", price2str(info.QClosingPrice)); /// < 收盘价
					childrenMap.put("QSettlePrice", price2str(info.QSettlePrice)); /// < 结算价
					childrenMap.put("QLastQty", qty2str(info.QLastQty)); /// < 最新成交量
					
					childrenMap.put("QBidPrice", info.QBidPrice[0]); /// < 买价1-20档
					childrenMap.put("QBidQty", info.QBidQty[0]); /// < 买量1-20档
					childrenMap.put("QAskPrice", info.QAskPrice[0]); /// < 卖价1-20档
					childrenMap.put("QAskQty", info.QAskQty[0]); /// < 卖量1-20档
					// childrenMap.put("QBidPrice",info.QBidPrice); ///< 买价1-20档
					// childrenMap.put("QBidQty",info.QBidQty); ///< 买量1-20档
					// childrenMap.put("QAskPrice",info.QAskPrice); ///< 卖价1-20档
					// childrenMap.put("QAskQty",info.QAskQty); ///< 卖量1-20档
					
					childrenMap.put("QImpliedBidPrice", price2str(info.QImpliedBidPrice)); /// < 隐含买价
					childrenMap.put("QImpliedBidQty", qty2str(info.QImpliedBidQty)); /// < 隐含买量
					childrenMap.put("QImpliedAskPrice", price2str(info.QImpliedAskPrice)); /// < 隐含卖价
					childrenMap.put("QImpliedAskQty", qty2str(info.QImpliedAskQty)); /// < 隐含卖量
					childrenMap.put("QPreDelta", price2str(info.QPreDelta)); /// < 昨虚实度
					childrenMap.put("QCurrDelta", price2str(info.QCurrDelta)); /// < 今虚实度
					childrenMap.put("QInsideQty", qty2str(info.QInsideQty)); /// < 内盘量
					childrenMap.put("QOutsideQty", qty2str(info.QOutsideQty)); /// < 外盘量
					childrenMap.put("QTurnoverRate", price2str(info.QTurnoverRate)); /// < 换手率
					childrenMap.put("Q5DAvgQty", qty2str(info.Q5DAvgQty)); /// < 五日均量
					childrenMap.put("QPERatio", price2str(info.QPERatio)); /// < 市盈率
					childrenMap.put("QTotalValue", price2str(info.QTotalValue)); /// < 总市值
					childrenMap.put("QNegotiableValue", price2str(info.QNegotiableValue)); /// < 流通市值
					childrenMap.put("QPositionTrend", price2str(info.QPositionTrend)); /// < 持仓走势
					childrenMap.put("QChangeSpeed", price2str(info.QChangeSpeed)); /// < 涨速
					childrenMap.put("QChangeRate", price2str(info.QChangeRate)); /// < 涨幅
					childrenMap.put("QChangeValue", price2str(info.QChangeValue)); /// < 涨跌值
					childrenMap.put("QSwing", price2str(info.QSwing)); /// < 振幅
					childrenMap.put("QTotalBidQty", qty2str(info.QTotalBidQty)); /// < 委买总量
					childrenMap.put("QTotalAskQty", qty2str(info.QTotalAskQty)); /// < 委卖总量

					// 合约子树
					String pathString = info.Contract.Commodity.CommodityNo + "/" + info.Contract.ContractNo1;
					rootMap.put(pathString, childrenMap);
				}
				try {
					ref.updateChildren(rootMap);
				} catch (Exception e) {
					logger.error(e.toString());
				}
			}

			SyncReference.goOffline();
			marketDataMap.clear();

			logger.info(this.getClass().getName() + " exiting...");
		}
	}

	private static class ThreadFuncCalculateQuote implements Runnable {
		// @Override
		public void run() {

			while (!requestStop) {
				
				TapAPIQuoteWhole quote = null;
				try {
					quote = marketDataQueueCalc.poll(1L, TimeUnit.SECONDS);
				} catch (InterruptedException e) {					// TODO Auto-generated catch block
					logger.error(e.toString());
				}
				
				if (quote == null)
					continue;
				
				String contractUID = quote.Contract.Commodity.ExchangeNo + "." + quote.Contract.Commodity.CommodityNo
						+ "." + quote.Contract.ContractNo1;

				Contract c = contractsMap.get(contractUID);
				if (c == null) {
					c = new Contract(contractUID);
					contractsMap.put(contractUID, c);
				}
				c.UpdateQuote(quote);
			}
			marketDataQueueCalc.clear();
			
			logger.info(this.getClass().getName() + " exiting...");
		}
	}

	// 格式化
	static final DecimalFormat millisecFormat = new DecimalFormat("000");

	@SuppressWarnings("unused")
	private static String millisec2str(int millisec) {
		return millisecFormat.format(millisec);
	}

	static final DecimalFormat priceFormat = new DecimalFormat("###########0.0#");

	private static String price2str(double price) {
		if (price == Double.MAX_VALUE || price == Double.NaN)
			return "";
		return priceFormat.format(price);
	}

	static final DecimalFormat quantityFormat = new DecimalFormat("############0");

	private static String qty2str(long qty) {
		if (qty == Long.MAX_VALUE)
			return "";
		return quantityFormat.format(qty);
	}
	// 格式化 
	//
	public static void main(String[] args) throws Throwable {

		// logger.debug("Turbo Mode: " + BufferUtil.isTurboModeEnabled());
		/**/
		{
			// 数据文件后缀年月日
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			dataFileSuffix = dateFormat.format(new Date());
		}
		logger.info("QuoteAPI version info: " + QuoteApi.GetVersion());

		// 加载配置文件
		Properties configProps = loadConfig();
		String authCode = configProps.getProperty("tap.authCode");
		String quoteHost = configProps.getProperty("tap.quoteHost");
		int quotePort = Integer.parseInt(configProps.getProperty("tap.quotePort"));
		String userId = configProps.getProperty("tap.userId");
		String password = configProps.getProperty("tap.password");
		String ids[] = configProps.getProperty("marketDataSaver.instrumentIds").split(",");
		String wilddogURL = configProps.getProperty("urlWilddogSync");
		
		// 初始化合约集合
		for (int i = 0; i < ids.length; i++) {
			Contract c = new Contract(ids[i]);
			c.deserializeMinKLines(dataDir, "minkline." + ids[i]);
			contractsMap.put(ids[i], c);
		}

		// 初始化 QuoteApi
		final QuoteApi mdApi = new QuoteApi(new TapAPIApplicationInfo(authCode, null));
		mdApi.setListener(new QuoteApiListener() {

			// @Override
			public void OnRspLogin(int errorCode, TapAPIQuotLoginRspInfo info) {
				logger.info("QuoteAPI login: " + errorCode);
				if (errorCode != 0)
					requestStop = true;
			}

			// @Override
			public void OnAPIReady() {
				logger.info("QuoteAPI ready.");
			}

			// @Override
			public void OnDisconnect(int reasonCode) {
				logger.info("QuoteAPI disconnected. reasonCode:"+reasonCode);
				requestStop = true;
			}

			// @Override
			public void OnRspChangePassword(int sessionID, int errorCode) {
				logger.info("OnRspChangePassword session " + sessionID + " errorCode" + errorCode);
			}

			// @Override
			public void OnRspQryCommodity(int sessionID, int errorCode, byte isLast, TapAPIQuoteCommodityInfo info) {
				logger.info("OnRspQryCommodity session:" + sessionID + " errorCode:" + errorCode + " " + info);
			}

			// @Override
			public void OnRspQryContract(int sessionID, int errorCode, byte isLast, TapAPIQuoteContractInfo info) {
				logger.info("OnRspQryContract session " + sessionID + " errorCode" + errorCode + " " + info);
			}

			// @Override
			public void OnRtnContract(TapAPIQuoteContractInfo info) {
				logger.info("OnRtnContract session " + info);
			}

			// @Override
			public void OnRspSubscribeQuote(int sessionID, int errorCode, byte isLast, TapAPIQuoteWhole info) {
				dataCount.incrementAndGet();
				// 用于写文件
				marketDataQueue.add(info);
				// 用于计算
				marketDataQueueCalc.add(info);

				// 用于写野狗 行情分拣
				String contractUID = info.Contract.Commodity.ExchangeNo + "." + info.Contract.Commodity.CommodityNo
						+ "." + info.Contract.ContractNo1;
				marketDataMap.put(contractUID, info);

				logger.info("订阅成功" + contractUID + " " + info.DateTimeStamp + " " + info.QLastPrice + " "
						+ info.QLastQty);
			}

			// @Override
			public void OnRspUnSubscribeQuote(int sessionID, int errorCode, byte isLast, TapAPIContract info) {
				logger.info("OnRspUnSubscribeQuote session " + sessionID + " error " + errorCode + " : " + info);
			}

			// @Override
			public void OnRtnQuote(TapAPIQuoteWhole info) {
				dataCount.incrementAndGet();
				try {
					// 用于写文件
					marketDataQueue.put(info);
					// 用于计算
					marketDataQueueCalc.put(info);

					// 用于写野狗 行情分拣
					String contractUID = info.Contract.Commodity.ExchangeNo + "." + info.Contract.Commodity.CommodityNo
							+ "." + info.Contract.ContractNo1;
					marketDataMap.put(contractUID, info);

					// logger.debug("行情更新" + contractUID + " " + info.DateTimeStamp
					// + " " + info.QLastPrice
					// + " " + info.QLastQty);
				} catch (InterruptedException e) {
				}
			}

		});
		
		// QuoteApi登陆行情服务器
		TapAPIQuoteLoginAuth loginAuth = new TapAPIQuoteLoginAuth();
		loginAuth.UserNo = userId;
		loginAuth.Password = password;
		loginAuth.ISModifyPassword = JtapConstants.APIYNFLAG_NO;
		loginAuth.ISDDA = JtapConstants.APIYNFLAG_NO;
		try {
			mdApi.SyncLogin(quoteHost, quotePort, loginAuth);
		} catch (Exception e) {
			logger.error(" 行情登陆失败:"+e.getMessage());	
			requestStop = true;
		}
		logger.info("行情地址:" + quoteHost + ":" + quotePort + " ... ");
		
		// ShutdownHook
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				logger.info("调用钩子 ShutdownHook");
				requestStop = true;
				for (BufferedWriter writer : dataWriterMap.values()) {
					try {
						writer.flush();
						writer.close();
					} catch (Exception e) {
					}
				}
				if (mdApi.isConnected()) {
					mdApi.Close();
					try {
						Thread.sleep(200);
					} catch (Exception e) {
					}
				}
				logger.info("钩子执行完毕");
			}
		});

		// 行情写野狗
		if (!wilddogURL.isEmpty())
			ThreadFuncWriteWilddog.urlWilddogSync = wilddogURL;
		logger.info("启动线程行情写入云端..." + ThreadFuncWriteWilddog.urlWilddogSync);
		ThreadFuncWriteWilddog threadFuncWilddogWrite = new ThreadFuncWriteWilddog();
		Thread wilddogWriteThread = new Thread(threadFuncWilddogWrite);
		wilddogWriteThread.setName("wilddogWriteThread");
//		wilddogWriteThread.setDaemon(true);
		wilddogWriteThread.start();

		// 行情写文件
		logger.info("启动线程行情写文件..." + dataDir.getAbsolutePath());
		logger.info("主力合约清单: " + ids.length + " " + Arrays.asList(ids));
		dataDir.mkdirs();
		ThreadFuncSaveQuoteFile saver = new ThreadFuncSaveQuoteFile();
		Thread quoteSaverThread = new Thread(saver);
		quoteSaverThread.setName("quoteSaverThread");
//		quoteSaverThread.setDaemon(true);
//		quoteSaverThread.start();

		// 行情计算 K线 分时
		logger.info("启动线程行情计算...");
		ThreadFuncCalculateQuote threadFuncCalculateQuote = new ThreadFuncCalculateQuote();
		Thread calculateThread = new Thread(threadFuncCalculateQuote);
		calculateThread.setName("calculateThread");
//		calculateThread.setDaemon(true);
		calculateThread.start();

		{
			// 查询服务器支持的品种
			logger.info("查询服务器支持的品种 Query commodity ...");
			TapAPIQuoteCommodityInfo[] infos = mdApi.SyncAllQryCommodity();
			for (int i = 0; i < infos.length; i++) {
				TapAPIQuoteCommodityInfo info = infos[i];
				StringBuilder builder = new StringBuilder();
				builder.append("Commodity " + info.Commodity.CommodityNo);
				if (info.CommodityName != null) {
					builder.append(" name ");
					builder.append(info.CommodityName);
					if (info.CommodityEngName != null) {
						builder.append(info.CommodityEngName).append('/');
					}
					builder.append(info.CommodityName);
				}
				builder.append(" exchange ").append(info.Commodity.ExchangeNo);
				logger.info(builder.toString());
			}
		}

		// 订阅行情 api数量限制50个合约
		for (int i = 0; i < ids.length; i++) {
			try {
				String[] parts = ids[i].split("\\.");
				String exchangeId = parts[0];
				String commodityNo = parts[1];
				String contractNo = parts[2];
				logger.info(
						"Subscribe exchange " + exchangeId + " commodity " + commodityNo + " contract " + contractNo);
				TapAPIContract contract = new TapAPIContract();

				contract.Commodity = new TapAPICommodity();
				contract.Commodity.ExchangeNo = exchangeId;
				contract.Commodity.CommodityNo = commodityNo;
				contract.Commodity.CommodityType = JtapConstants.TAPI_COMMODITY_TYPE_FUTURES;
				contract.ContractNo1 = contractNo;
				contract.CallOrPutFlag1 = JtapConstants.TAPI_CALLPUT_FLAG_NONE;
				contract.CallOrPutFlag2 = JtapConstants.TAPI_CALLPUT_FLAG_NONE;
				mdApi.SubscribeQuote(contract);
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
	
		while (!requestStop) {
			Thread.sleep(60 * 1000);
			
			// 行情接收数量统计 
			int count = dataCount.getAndSet(0);
			logger.info(" Market data receieved: " + count);
			
			// TODO 待改进 定时序列化分钟K线
			for (Contract c : contractsMap.values()) {
				c.serializeMinKLines(dataDir, "minkline." + c.contractUID);
			}
			
			// TODO 定时重启  待定05:30
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			 if (count == 0 && hour == 5 && minute >= 30) {
//			if (hour >= 17 && minute >= 00) {
				logger.info("日常定时重启" + date);
				requestStop = true;
			}
			
			if (requestStop)
				break;
		}

		int count = dataCount.getAndSet(0);
		if (count > 0)
			logger.info(dateFormat.format( new Date()) + " quote receieved: " + count);

		mdApi.Close();

		logger.info(" main() EXIT");
	}

	// 配置文件
	private static Properties loadConfig() throws IOException {
		Properties configProps = new Properties();
		InputStream is = ClassLoader.getSystemResourceAsStream("config.properties");
		if (is == null)
			is = ClassLoader.getSystemResourceAsStream("/config.properties");
		if (is == null) {
			File file = new File("config.properties");
			if (file.exists())
				is = new FileInputStream(file);
		}
		if (is == null) {
			File file = new File("examples/config.properties");
			if (file.exists())
				is = new FileInputStream(file);
		}
		if (is == null) {
			File file = new File("../examples/config.properties");
			if (file.exists())
				is = new FileInputStream(file);
		}
		if (is == null) {
			logger.error("Unable to load config.properties from classpath or current directory.");
			System.exit(1);
		}
		configProps.load(is);
		is.close();

		return configProps;
	}

}
