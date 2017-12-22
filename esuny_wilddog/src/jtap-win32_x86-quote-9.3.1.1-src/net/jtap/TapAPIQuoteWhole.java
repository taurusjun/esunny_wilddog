package net.jtap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.common.util.BufferUtil;
import net.jtap.TapAPIContract;

public final class TapAPIQuoteWhole {
	public TapAPIContract Contract;
	public String CurrencyNo;
	public char TradingState;
	public String DateTimeStamp;
	public double QPreClosingPrice;
	public double QPreSettlePrice;
	public long QPrePositionQty;
	public double QOpeningPrice;
	public double QLastPrice;
	public double QHighPrice;
	public double QLowPrice;
	public double QHisHighPrice;
	public double QHisLowPrice;
	public double QLimitUpPrice;
	public double QLimitDownPrice;
	public long QTotalQty;
	public double QTotalTurnover;
	public long QPositionQty;
	public double QAveragePrice;
	public double QClosingPrice;
	public double QSettlePrice;
	public long QLastQty;
	public double[] QBidPrice;
	public long[] QBidQty;
	public double[] QAskPrice;
	public long[] QAskQty;
	public double QImpliedBidPrice;
	public long QImpliedBidQty;
	public double QImpliedAskPrice;
	public long QImpliedAskQty;
	public double QPreDelta;
	public double QCurrDelta;
	public long QInsideQty;
	public long QOutsideQty;
	public double QTurnoverRate;
	public long Q5DAvgQty;
	public double QPERatio;
	public double QTotalValue;
	public double QNegotiableValue;
	public long QPositionTrend;
	public double QChangeSpeed;
	public double QChangeRate;
	public double QChangeValue;
	public double QSwing;
	public long QTotalBidQty;
	public long QTotalAskQty;
	public TapAPIContract UnderlyContract;

	public TapAPIQuoteWhole() {
	}

	public TapAPIQuoteWhole(TapAPIContract arg0, String arg1, char arg2, String arg3, double arg4, double arg6,
			long arg8, double arg10, double arg12, double arg14, double arg16, double arg18, double arg20, double arg22,
			double arg24, long arg26, double arg28, long arg30, double arg32, double arg34, double arg36, long arg38,
			double[] arg40, long[] arg41, double[] arg42, long[] arg43, double arg44, long arg46, double arg48,
			long arg50, double arg52, double arg54, long arg56, long arg58, double arg60, long arg62, double arg64,
			double arg66, double arg68, long arg70, double arg72, double arg74, double arg76, double arg78, long arg80,
			long arg82, TapAPIContract arg84) {
		this.Contract = arg0;
		this.CurrencyNo = arg1;
		this.TradingState = arg2;
		this.DateTimeStamp = arg3;
		this.QPreClosingPrice = arg4;
		this.QPreSettlePrice = arg6;
		this.QPrePositionQty = arg8;
		this.QOpeningPrice = arg10;
		this.QLastPrice = arg12;
		this.QHighPrice = arg14;
		this.QLowPrice = arg16;
		this.QHisHighPrice = arg18;
		this.QHisLowPrice = arg20;
		this.QLimitUpPrice = arg22;
		this.QLimitDownPrice = arg24;
		this.QTotalQty = arg26;
		this.QTotalTurnover = arg28;
		this.QPositionQty = arg30;
		this.QAveragePrice = arg32;
		this.QClosingPrice = arg34;
		this.QSettlePrice = arg36;
		this.QLastQty = arg38;
		this.QBidPrice[20] = arg40[20];
		this.QBidQty[20] = arg41[20];
		this.QAskPrice[20] = arg42[20];
		this.QAskQty[20] = arg43[20];
		this.QImpliedBidPrice = arg44;
		this.QImpliedBidQty = arg46;
		this.QImpliedAskPrice = arg48;
		this.QImpliedAskQty = arg50;
		this.QPreDelta = arg52;
		this.QCurrDelta = arg54;
		this.QInsideQty = arg56;
		this.QOutsideQty = arg58;
		this.QTurnoverRate = arg60;
		this.Q5DAvgQty = arg62;
		this.QPERatio = arg64;
		this.QTotalValue = arg66;
		this.QNegotiableValue = arg68;
		this.QPositionTrend = arg70;
		this.QChangeSpeed = arg72;
		this.QChangeRate = arg74;
		this.QChangeValue = arg76;
		this.QSwing = arg78;
		this.QTotalBidQty = arg80;
		this.QTotalAskQty = arg82;
		this.UnderlyContract = arg84;
	}

	static TapAPIQuoteWhole fromBytes(byte[] arg) {
		if (arg == null) {
			return null;
		} else {
			assert arg.length == 1118;

			ByteBuffer arg0 = ByteBuffer.wrap(arg).order(ByteOrder.nativeOrder());
			TapAPIQuoteWhole arg1 = new TapAPIQuoteWhole();
			arg1.Contract = TapAPIContract.fromBytes(arg, 0, 69);
			arg1.CurrencyNo = BufferUtil.bytes2str(arg, 69, 11);
			arg1.TradingState = (char) arg[80];
			arg1.DateTimeStamp = BufferUtil.bytes2ascii(arg, 81, 24);
			arg1.QPreClosingPrice = arg0.getDouble(105);
			arg1.QPreSettlePrice = arg0.getDouble(113);
			arg1.QPrePositionQty = arg0.getLong(121);
			arg1.QOpeningPrice = arg0.getDouble(129);
			arg1.QLastPrice = arg0.getDouble(137);
			arg1.QHighPrice = arg0.getDouble(145);
			arg1.QLowPrice = arg0.getDouble(153);
			arg1.QHisHighPrice = arg0.getDouble(161);
			arg1.QHisLowPrice = arg0.getDouble(169);
			arg1.QLimitUpPrice = arg0.getDouble(177);
			arg1.QLimitDownPrice = arg0.getDouble(185);
			arg1.QTotalQty = arg0.getLong(193);
			arg1.QTotalTurnover = arg0.getDouble(201);
			arg1.QPositionQty = arg0.getLong(209);
			arg1.QAveragePrice = arg0.getDouble(217);
			arg1.QClosingPrice = arg0.getDouble(225);
			arg1.QSettlePrice = arg0.getDouble(233);
			arg1.QLastQty = arg0.getLong(241);
			arg1.QBidPrice = new double[20];
			arg1.QBidPrice[0] = arg0.getDouble(249);
			arg1.QBidPrice[1] = arg0.getDouble(257);
			arg1.QBidPrice[2] = arg0.getDouble(265);
			arg1.QBidPrice[3] = arg0.getDouble(273);
			arg1.QBidPrice[4] = arg0.getDouble(281);
			arg1.QBidPrice[5] = arg0.getDouble(289);
			arg1.QBidPrice[6] = arg0.getDouble(297);
			arg1.QBidPrice[7] = arg0.getDouble(305);
			arg1.QBidPrice[8] = arg0.getDouble(313);
			arg1.QBidPrice[9] = arg0.getDouble(321);
			arg1.QBidPrice[10] = arg0.getDouble(329);
			arg1.QBidPrice[11] = arg0.getDouble(337);
			arg1.QBidPrice[12] = arg0.getDouble(345);
			arg1.QBidPrice[13] = arg0.getDouble(353);
			arg1.QBidPrice[14] = arg0.getDouble(361);
			arg1.QBidPrice[15] = arg0.getDouble(369);
			arg1.QBidPrice[16] = arg0.getDouble(377);
			arg1.QBidPrice[17] = arg0.getDouble(385);
			arg1.QBidPrice[18] = arg0.getDouble(393);
			arg1.QBidPrice[19] = arg0.getDouble(401);
			arg1.QBidQty = new long[20];
			arg1.QBidQty[0] = arg0.getLong(409);
			arg1.QBidQty[1] = arg0.getLong(417);
			arg1.QBidQty[2] = arg0.getLong(425);
			arg1.QBidQty[3] = arg0.getLong(433);
			arg1.QBidQty[4] = arg0.getLong(441);
			arg1.QBidQty[5] = arg0.getLong(449);
			arg1.QBidQty[6] = arg0.getLong(457);
			arg1.QBidQty[7] = arg0.getLong(465);
			arg1.QBidQty[8] = arg0.getLong(473);
			arg1.QBidQty[9] = arg0.getLong(481);
			arg1.QBidQty[10] = arg0.getLong(489);
			arg1.QBidQty[11] = arg0.getLong(497);
			arg1.QBidQty[12] = arg0.getLong(505);
			arg1.QBidQty[13] = arg0.getLong(513);
			arg1.QBidQty[14] = arg0.getLong(521);
			arg1.QBidQty[15] = arg0.getLong(529);
			arg1.QBidQty[16] = arg0.getLong(537);
			arg1.QBidQty[17] = arg0.getLong(545);
			arg1.QBidQty[18] = arg0.getLong(553);
			arg1.QBidQty[19] = arg0.getLong(561);
			arg1.QAskPrice = new double[20];
			arg1.QAskPrice[0] = arg0.getDouble(569);
			arg1.QAskPrice[1] = arg0.getDouble(577);
			arg1.QAskPrice[2] = arg0.getDouble(585);
			arg1.QAskPrice[3] = arg0.getDouble(593);
			arg1.QAskPrice[4] = arg0.getDouble(601);
			arg1.QAskPrice[5] = arg0.getDouble(609);
			arg1.QAskPrice[6] = arg0.getDouble(617);
			arg1.QAskPrice[7] = arg0.getDouble(625);
			arg1.QAskPrice[8] = arg0.getDouble(633);
			arg1.QAskPrice[9] = arg0.getDouble(641);
			arg1.QAskPrice[10] = arg0.getDouble(649);
			arg1.QAskPrice[11] = arg0.getDouble(657);
			arg1.QAskPrice[12] = arg0.getDouble(665);
			arg1.QAskPrice[13] = arg0.getDouble(673);
			arg1.QAskPrice[14] = arg0.getDouble(681);
			arg1.QAskPrice[15] = arg0.getDouble(689);
			arg1.QAskPrice[16] = arg0.getDouble(697);
			arg1.QAskPrice[17] = arg0.getDouble(705);
			arg1.QAskPrice[18] = arg0.getDouble(713);
			arg1.QAskPrice[19] = arg0.getDouble(721);
			arg1.QAskQty = new long[20];
			arg1.QAskQty[0] = arg0.getLong(729);
			arg1.QAskQty[1] = arg0.getLong(737);
			arg1.QAskQty[2] = arg0.getLong(745);
			arg1.QAskQty[3] = arg0.getLong(753);
			arg1.QAskQty[4] = arg0.getLong(761);
			arg1.QAskQty[5] = arg0.getLong(769);
			arg1.QAskQty[6] = arg0.getLong(777);
			arg1.QAskQty[7] = arg0.getLong(785);
			arg1.QAskQty[8] = arg0.getLong(793);
			arg1.QAskQty[9] = arg0.getLong(801);
			arg1.QAskQty[10] = arg0.getLong(809);
			arg1.QAskQty[11] = arg0.getLong(817);
			arg1.QAskQty[12] = arg0.getLong(825);
			arg1.QAskQty[13] = arg0.getLong(833);
			arg1.QAskQty[14] = arg0.getLong(841);
			arg1.QAskQty[15] = arg0.getLong(849);
			arg1.QAskQty[16] = arg0.getLong(857);
			arg1.QAskQty[17] = arg0.getLong(865);
			arg1.QAskQty[18] = arg0.getLong(873);
			arg1.QAskQty[19] = arg0.getLong(881);
			arg1.QImpliedBidPrice = arg0.getDouble(889);
			arg1.QImpliedBidQty = arg0.getLong(897);
			arg1.QImpliedAskPrice = arg0.getDouble(905);
			arg1.QImpliedAskQty = arg0.getLong(913);
			arg1.QPreDelta = arg0.getDouble(921);
			arg1.QCurrDelta = arg0.getDouble(929);
			arg1.QInsideQty = arg0.getLong(937);
			arg1.QOutsideQty = arg0.getLong(945);
			arg1.QTurnoverRate = arg0.getDouble(953);
			arg1.Q5DAvgQty = arg0.getLong(961);
			arg1.QPERatio = arg0.getDouble(969);
			arg1.QTotalValue = arg0.getDouble(977);
			arg1.QNegotiableValue = arg0.getDouble(985);
			arg1.QPositionTrend = arg0.getLong(993);
			arg1.QChangeSpeed = arg0.getDouble(1001);
			arg1.QChangeRate = arg0.getDouble(1009);
			arg1.QChangeValue = arg0.getDouble(1017);
			arg1.QSwing = arg0.getDouble(1025);
			arg1.QTotalBidQty = arg0.getLong(1033);
			arg1.QTotalAskQty = arg0.getLong(1041);
			arg1.UnderlyContract = TapAPIContract.fromBytes(arg, 1049, 69);
			return arg1;
		}
	}

	static TapAPIQuoteWhole fromBytes(byte[] arg, int arg0, int arg1) {
		if (arg == null) {
			return null;
		} else {
			byte[] arg2 = new byte[arg1];
			System.arraycopy(arg, arg0, arg2, 0, arg1);
			return fromBytes(arg2);
		}
	}

	byte[] toBytes() {
		ByteBuffer arg0 = ByteBuffer.allocate(1118).order(ByteOrder.nativeOrder());
		arg0.position(0);
		arg0.put(this.Contract.toBytes());
		BufferUtil.str2bytes(arg0, this.CurrencyNo, 69, 11);
		arg0.put(80, (byte) this.TradingState);
		BufferUtil.ascii2bytes(arg0, this.DateTimeStamp, 81, 24);
		arg0.putDouble(105, this.QPreClosingPrice);
		arg0.putDouble(113, this.QPreSettlePrice);
		arg0.putLong(121, this.QPrePositionQty);
		arg0.putDouble(129, this.QOpeningPrice);
		arg0.putDouble(137, this.QLastPrice);
		arg0.putDouble(145, this.QHighPrice);
		arg0.putDouble(153, this.QLowPrice);
		arg0.putDouble(161, this.QHisHighPrice);
		arg0.putDouble(169, this.QHisLowPrice);
		arg0.putDouble(177, this.QLimitUpPrice);
		arg0.putDouble(185, this.QLimitDownPrice);
		arg0.putLong(193, this.QTotalQty);
		arg0.putDouble(201, this.QTotalTurnover);
		arg0.putLong(209, this.QPositionQty);
		arg0.putDouble(217, this.QAveragePrice);
		arg0.putDouble(225, this.QClosingPrice);
		arg0.putDouble(233, this.QSettlePrice);
		arg0.putLong(241, this.QLastQty);
		if (this.QBidPrice != null) {
			arg0.putDouble(249, this.QBidPrice[0]);
			arg0.putDouble(257, this.QBidPrice[1]);
			arg0.putDouble(265, this.QBidPrice[2]);
			arg0.putDouble(273, this.QBidPrice[3]);
			arg0.putDouble(281, this.QBidPrice[4]);
			arg0.putDouble(289, this.QBidPrice[5]);
			arg0.putDouble(297, this.QBidPrice[6]);
			arg0.putDouble(305, this.QBidPrice[7]);
			arg0.putDouble(313, this.QBidPrice[8]);
			arg0.putDouble(321, this.QBidPrice[9]);
			arg0.putDouble(329, this.QBidPrice[10]);
			arg0.putDouble(337, this.QBidPrice[11]);
			arg0.putDouble(345, this.QBidPrice[12]);
			arg0.putDouble(353, this.QBidPrice[13]);
			arg0.putDouble(361, this.QBidPrice[14]);
			arg0.putDouble(369, this.QBidPrice[15]);
			arg0.putDouble(377, this.QBidPrice[16]);
			arg0.putDouble(385, this.QBidPrice[17]);
			arg0.putDouble(393, this.QBidPrice[18]);
			arg0.putDouble(401, this.QBidPrice[19]);
		} else {
			arg0.putDouble(249, 0.0D);
			arg0.putDouble(257, 0.0D);
			arg0.putDouble(265, 0.0D);
			arg0.putDouble(273, 0.0D);
			arg0.putDouble(281, 0.0D);
			arg0.putDouble(289, 0.0D);
			arg0.putDouble(297, 0.0D);
			arg0.putDouble(305, 0.0D);
			arg0.putDouble(313, 0.0D);
			arg0.putDouble(321, 0.0D);
			arg0.putDouble(329, 0.0D);
			arg0.putDouble(337, 0.0D);
			arg0.putDouble(345, 0.0D);
			arg0.putDouble(353, 0.0D);
			arg0.putDouble(361, 0.0D);
			arg0.putDouble(369, 0.0D);
			arg0.putDouble(377, 0.0D);
			arg0.putDouble(385, 0.0D);
			arg0.putDouble(393, 0.0D);
			arg0.putDouble(401, 0.0D);
		}

		if (this.QBidQty != null) {
			arg0.putLong(409, this.QBidQty[0]);
			arg0.putLong(417, this.QBidQty[1]);
			arg0.putLong(425, this.QBidQty[2]);
			arg0.putLong(433, this.QBidQty[3]);
			arg0.putLong(441, this.QBidQty[4]);
			arg0.putLong(449, this.QBidQty[5]);
			arg0.putLong(457, this.QBidQty[6]);
			arg0.putLong(465, this.QBidQty[7]);
			arg0.putLong(473, this.QBidQty[8]);
			arg0.putLong(481, this.QBidQty[9]);
			arg0.putLong(489, this.QBidQty[10]);
			arg0.putLong(497, this.QBidQty[11]);
			arg0.putLong(505, this.QBidQty[12]);
			arg0.putLong(513, this.QBidQty[13]);
			arg0.putLong(521, this.QBidQty[14]);
			arg0.putLong(529, this.QBidQty[15]);
			arg0.putLong(537, this.QBidQty[16]);
			arg0.putLong(545, this.QBidQty[17]);
			arg0.putLong(553, this.QBidQty[18]);
			arg0.putLong(561, this.QBidQty[19]);
		} else {
			arg0.putLong(409, 0L);
			arg0.putLong(417, 0L);
			arg0.putLong(425, 0L);
			arg0.putLong(433, 0L);
			arg0.putLong(441, 0L);
			arg0.putLong(449, 0L);
			arg0.putLong(457, 0L);
			arg0.putLong(465, 0L);
			arg0.putLong(473, 0L);
			arg0.putLong(481, 0L);
			arg0.putLong(489, 0L);
			arg0.putLong(497, 0L);
			arg0.putLong(505, 0L);
			arg0.putLong(513, 0L);
			arg0.putLong(521, 0L);
			arg0.putLong(529, 0L);
			arg0.putLong(537, 0L);
			arg0.putLong(545, 0L);
			arg0.putLong(553, 0L);
			arg0.putLong(561, 0L);
		}

		if (this.QAskPrice != null) {
			arg0.putDouble(569, this.QAskPrice[0]);
			arg0.putDouble(577, this.QAskPrice[1]);
			arg0.putDouble(585, this.QAskPrice[2]);
			arg0.putDouble(593, this.QAskPrice[3]);
			arg0.putDouble(601, this.QAskPrice[4]);
			arg0.putDouble(609, this.QAskPrice[5]);
			arg0.putDouble(617, this.QAskPrice[6]);
			arg0.putDouble(625, this.QAskPrice[7]);
			arg0.putDouble(633, this.QAskPrice[8]);
			arg0.putDouble(641, this.QAskPrice[9]);
			arg0.putDouble(649, this.QAskPrice[10]);
			arg0.putDouble(657, this.QAskPrice[11]);
			arg0.putDouble(665, this.QAskPrice[12]);
			arg0.putDouble(673, this.QAskPrice[13]);
			arg0.putDouble(681, this.QAskPrice[14]);
			arg0.putDouble(689, this.QAskPrice[15]);
			arg0.putDouble(697, this.QAskPrice[16]);
			arg0.putDouble(705, this.QAskPrice[17]);
			arg0.putDouble(713, this.QAskPrice[18]);
			arg0.putDouble(721, this.QAskPrice[19]);
		} else {
			arg0.putDouble(569, 0.0D);
			arg0.putDouble(577, 0.0D);
			arg0.putDouble(585, 0.0D);
			arg0.putDouble(593, 0.0D);
			arg0.putDouble(601, 0.0D);
			arg0.putDouble(609, 0.0D);
			arg0.putDouble(617, 0.0D);
			arg0.putDouble(625, 0.0D);
			arg0.putDouble(633, 0.0D);
			arg0.putDouble(641, 0.0D);
			arg0.putDouble(649, 0.0D);
			arg0.putDouble(657, 0.0D);
			arg0.putDouble(665, 0.0D);
			arg0.putDouble(673, 0.0D);
			arg0.putDouble(681, 0.0D);
			arg0.putDouble(689, 0.0D);
			arg0.putDouble(697, 0.0D);
			arg0.putDouble(705, 0.0D);
			arg0.putDouble(713, 0.0D);
			arg0.putDouble(721, 0.0D);
		}

		if (this.QAskQty != null) {
			arg0.putLong(729, this.QAskQty[0]);
			arg0.putLong(737, this.QAskQty[1]);
			arg0.putLong(745, this.QAskQty[2]);
			arg0.putLong(753, this.QAskQty[3]);
			arg0.putLong(761, this.QAskQty[4]);
			arg0.putLong(769, this.QAskQty[5]);
			arg0.putLong(777, this.QAskQty[6]);
			arg0.putLong(785, this.QAskQty[7]);
			arg0.putLong(793, this.QAskQty[8]);
			arg0.putLong(801, this.QAskQty[9]);
			arg0.putLong(809, this.QAskQty[10]);
			arg0.putLong(817, this.QAskQty[11]);
			arg0.putLong(825, this.QAskQty[12]);
			arg0.putLong(833, this.QAskQty[13]);
			arg0.putLong(841, this.QAskQty[14]);
			arg0.putLong(849, this.QAskQty[15]);
			arg0.putLong(857, this.QAskQty[16]);
			arg0.putLong(865, this.QAskQty[17]);
			arg0.putLong(873, this.QAskQty[18]);
			arg0.putLong(881, this.QAskQty[19]);
		} else {
			arg0.putLong(729, 0L);
			arg0.putLong(737, 0L);
			arg0.putLong(745, 0L);
			arg0.putLong(753, 0L);
			arg0.putLong(761, 0L);
			arg0.putLong(769, 0L);
			arg0.putLong(777, 0L);
			arg0.putLong(785, 0L);
			arg0.putLong(793, 0L);
			arg0.putLong(801, 0L);
			arg0.putLong(809, 0L);
			arg0.putLong(817, 0L);
			arg0.putLong(825, 0L);
			arg0.putLong(833, 0L);
			arg0.putLong(841, 0L);
			arg0.putLong(849, 0L);
			arg0.putLong(857, 0L);
			arg0.putLong(865, 0L);
			arg0.putLong(873, 0L);
			arg0.putLong(881, 0L);
		}

		arg0.putDouble(889, this.QImpliedBidPrice);
		arg0.putLong(897, this.QImpliedBidQty);
		arg0.putDouble(905, this.QImpliedAskPrice);
		arg0.putLong(913, this.QImpliedAskQty);
		arg0.putDouble(921, this.QPreDelta);
		arg0.putDouble(929, this.QCurrDelta);
		arg0.putLong(937, this.QInsideQty);
		arg0.putLong(945, this.QOutsideQty);
		arg0.putDouble(953, this.QTurnoverRate);
		arg0.putLong(961, this.Q5DAvgQty);
		arg0.putDouble(969, this.QPERatio);
		arg0.putDouble(977, this.QTotalValue);
		arg0.putDouble(985, this.QNegotiableValue);
		arg0.putLong(993, this.QPositionTrend);
		arg0.putDouble(1001, this.QChangeSpeed);
		arg0.putDouble(1009, this.QChangeRate);
		arg0.putDouble(1017, this.QChangeValue);
		arg0.putDouble(1025, this.QSwing);
		arg0.putLong(1033, this.QTotalBidQty);
		arg0.putLong(1041, this.QTotalAskQty);
		arg0.position(0);
		arg0.put(this.UnderlyContract.toBytes());
		return arg0.array();
	}

	public String toString() {
		StringBuilder arg0 = new StringBuilder(128);
		arg0.append("TapAPIQuoteWhole[").append("Contract=").append(this.Contract).append(",CurrencyNo=")
				.append(this.CurrencyNo).append(",TradingState=")
				.append(this.TradingState == 0 ? ' ' : this.TradingState).append(",DateTimeStamp=")
				.append(this.DateTimeStamp).append(",QPreClosingPrice=").append(this.QPreClosingPrice)
				.append(",QPreSettlePrice=").append(this.QPreSettlePrice).append(",QPrePositionQty=")
				.append(this.QPrePositionQty).append(",QOpeningPrice=").append(this.QOpeningPrice)
				.append(",QLastPrice=").append(this.QLastPrice).append(",QHighPrice=").append(this.QHighPrice)
				.append(",QLowPrice=").append(this.QLowPrice).append(",QHisHighPrice=").append(this.QHisHighPrice)
				.append(",QHisLowPrice=").append(this.QHisLowPrice).append(",QLimitUpPrice=").append(this.QLimitUpPrice)
				.append(",QLimitDownPrice=").append(this.QLimitDownPrice).append(",QTotalQty=").append(this.QTotalQty)
				.append(",QTotalTurnover=").append(this.QTotalTurnover).append(",QPositionQty=")
				.append(this.QPositionQty).append(",QAveragePrice=").append(this.QAveragePrice)
				.append(",QClosingPrice=").append(this.QClosingPrice).append(",QSettlePrice=").append(this.QSettlePrice)
				.append(",QLastQty=").append(this.QLastQty).append(",QBidPrice[20]=").append(this.QBidPrice[20])
				.append(",QBidQty[20]=").append(this.QBidQty[20]).append(",QAskPrice[20]=").append(this.QAskPrice[20])
				.append(",QAskQty[20]=").append(this.QAskQty[20]).append(",QImpliedBidPrice=")
				.append(this.QImpliedBidPrice).append(",QImpliedBidQty=").append(this.QImpliedBidQty)
				.append(",QImpliedAskPrice=").append(this.QImpliedAskPrice).append(",QImpliedAskQty=")
				.append(this.QImpliedAskQty).append(",QPreDelta=").append(this.QPreDelta).append(",QCurrDelta=")
				.append(this.QCurrDelta).append(",QInsideQty=").append(this.QInsideQty).append(",QOutsideQty=")
				.append(this.QOutsideQty).append(",QTurnoverRate=").append(this.QTurnoverRate).append(",Q5DAvgQty=")
				.append(this.Q5DAvgQty).append(",QPERatio=").append(this.QPERatio).append(",QTotalValue=")
				.append(this.QTotalValue).append(",QNegotiableValue=").append(this.QNegotiableValue)
				.append(",QPositionTrend=").append(this.QPositionTrend).append(",QChangeSpeed=")
				.append(this.QChangeSpeed).append(",QChangeRate=").append(this.QChangeRate).append(",QChangeValue=")
				.append(this.QChangeValue).append(",QSwing=").append(this.QSwing).append(",QTotalBidQty=")
				.append(this.QTotalBidQty).append(",QTotalAskQty=").append(this.QTotalAskQty)
				.append(",UnderlyContract=").append(this.UnderlyContract).append("]");
		return arg0.toString();
	}
}