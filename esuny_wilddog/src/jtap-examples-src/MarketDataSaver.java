import MarketDataSaver.1;
import MarketDataSaver.2;
import MarketDataSaver.SaveThread;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import net.common.util.BufferUtil;
import net.jtap.QuoteApi;
import net.jtap.TapAPIApplicationInfo;
import net.jtap.TapAPICommodity;
import net.jtap.TapAPIContract;
import net.jtap.TapAPIQuoteCommodityInfo;
import net.jtap.TapAPIQuoteLoginAuth;
import net.jtap.TapAPIQuoteWhole;

public class MarketDataSaver {
	static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static final SimpleDateFormat marketDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	static String dataFileSuffix;
	static AtomicInteger dataCount = new AtomicInteger();
	static volatile boolean requestStop;
	static File dataDir = new File("data");
	static final BlockingQueue<TapAPIQuoteWhole> marketDataQueue = new LinkedBlockingDeque();
	static final Map<String, BufferedWriter> dataWriterMap = new HashMap();
	static final DecimalFormat millisecFormat = new DecimalFormat("000");
	static final DecimalFormat priceFormat = new DecimalFormat("###########0.0#");

	private static String millisec2str(int millisec) {
		return millisecFormat.format((long) millisec);
	}

	private static String price2str(double price) {
		return price != Double.MAX_VALUE && price != Double.NaN ? priceFormat.format(price) : "";
	}

	public static void main(String[] args) throws Throwable {
      System.out.println("Turbo Mode: " + BufferUtil.isTurboModeEnabled());
      SimpleDateFormat configProps = new SimpleDateFormat("yyyyMMdd");
      dataFileSuffix = configProps.format(new Date());
      System.out.println("QuoteAPI version info: " + QuoteApi.GetVersion());
      Properties arg17 = loadConfig();
      String authCode = arg17.getProperty("tap.authCode");
      String quoteHost = arg17.getProperty("tap.quoteHost");
      int quotePort = Integer.parseInt(arg17.getProperty("tap.quotePort"));
      String userId = arg17.getProperty("tap.userId");
      String password = arg17.getProperty("tap.password");
      String[] ids = arg17.getProperty("marketDataSaver.instrumentIds").split(",");
      System.out.println(" " + quoteHost + ":" + quotePort + " ... ");
      QuoteApi mdApi = new QuoteApi(new TapAPIApplicationInfo(authCode, (String)null));
      Runtime.getRuntime().addShutdownHook(new 1(mdApi));
      mdApi.setListener(new 2());
      System.out.println("IDS to save: " + Arrays.asList(ids));
      dataDir.mkdirs();
      SaveThread saver = new SaveThread((1)null);
      Thread saverThread = new Thread(saver);
      saverThread.setName("Market data saver thread");
      saverThread.setDaemon(true);
      saverThread.start();
      TapAPIQuoteLoginAuth loginAuth = new TapAPIQuoteLoginAuth();
      loginAuth.UserNo = userId;
      loginAuth.Password = password;
      loginAuth.ISModifyPassword = 78;
      loginAuth.ISDDA = 78;
      mdApi.SyncLogin(quoteHost, quotePort, loginAuth);
      System.out.println("Query commodity ...");
      TapAPIQuoteCommodityInfo[] date = mdApi.SyncAllQryCommodity();

      int count;
      for(count = 0; count < date.length; ++count) {
         TapAPIQuoteCommodityInfo calendar = date[count];
         StringBuilder hour = new StringBuilder();
         hour.append("Commodity " + calendar.Commodity.CommodityNo);
         if(calendar.CommodityName != null) {
            hour.append(" name ");
            if(calendar.CommodityEngName != null) {
               hour.append(calendar.CommodityEngName).append('/');
            }

            hour.append(calendar.CommodityName);
         }

         hour.append(" exchange ").append(calendar.Commodity.ExchangeNo);
         System.out.println(hour.toString());
      }

      System.out.flush();

      for(int arg18 = 0; arg18 < ids.length; ++arg18) {
         String[] arg20 = ids[arg18].split("\\.");
         String arg21 = arg20[0];
         String arg23 = arg20[1];
         String minute = arg20[2];
         System.out.println("Subscribe exchange " + arg21 + " commodity " + arg23 + " contract " + minute);
         TapAPIContract contract = new TapAPIContract();
         contract.Commodity = new TapAPICommodity();
         contract.Commodity.ExchangeNo = arg21;
         contract.Commodity.CommodityNo = arg23;
         contract.Commodity.CommodityType = 70;
         contract.ContractNo1 = minute;
         contract.CallOrPutFlag1 = 78;
         contract.CallOrPutFlag2 = 78;
         mdApi.SubscribeQuote(contract);
      }

      Date arg19;
      while(!requestStop) {
         Thread.sleep(60000L);
         arg19 = new Date();
         count = dataCount.getAndSet(0);
         System.out.println(dateFormat.format(arg19) + " Market data receieved: " + count);
         Calendar arg22 = Calendar.getInstance();
         arg22.setTime(arg19);
         int arg24 = arg22.get(11);
         int arg25 = arg22.get(12);
         if(count == 0 && arg24 >= 15) {
            System.out.println("Market is closed, DataSaver exiting...");
            requestStop = true;
         }

         if(requestStop) {
            break;
         }
      }

      arg19 = new Date();
      count = dataCount.getAndSet(0);
      if(count > 0) {
         System.out.println(dateFormat.format(arg19) + " Market data receieved: " + count);
      }

      mdApi.Close();
   }

	private static Properties loadConfig() throws IOException {
		Properties configProps = new Properties();
		Object is = ClassLoader.getSystemResourceAsStream("config.properties");
		if (is == null) {
			is = ClassLoader.getSystemResourceAsStream("/config.properties");
		}

		File file;
		if (is == null) {
			file = new File("config.properties");
			if (file.exists()) {
				is = new FileInputStream(file);
			}
		}

		if (is == null) {
			file = new File("examples/config.properties");
			if (file.exists()) {
				is = new FileInputStream(file);
			}
		}

		if (is == null) {
			file = new File("../examples/config.properties");
			if (file.exists()) {
				is = new FileInputStream(file);
			}
		}

		if (is == null) {
			System.out.println("Unable to load config.properties from classpath or current directory.");
			System.exit(1);
		}

		configProps.load((InputStream) is);
		((InputStream) is).close();
		return configProps;
	}
}