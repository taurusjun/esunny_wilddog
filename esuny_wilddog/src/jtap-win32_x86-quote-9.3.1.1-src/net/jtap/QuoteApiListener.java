package net.jtap;

import net.jtap.TapAPIContract;
import net.jtap.TapAPIQuotLoginRspInfo;
import net.jtap.TapAPIQuoteCommodityInfo;
import net.jtap.TapAPIQuoteContractInfo;
import net.jtap.TapAPIQuoteWhole;

public interface QuoteApiListener {
	void OnRspLogin(int arg0, TapAPIQuotLoginRspInfo arg1);

	void OnAPIReady();

	void OnDisconnect(int arg0);

	void OnRspChangePassword(int arg0, int arg1);

	void OnRspQryCommodity(int arg0, int arg1, byte arg2, TapAPIQuoteCommodityInfo arg3);

	void OnRspQryContract(int arg0, int arg1, byte arg2, TapAPIQuoteContractInfo arg3);

	void OnRtnContract(TapAPIQuoteContractInfo arg0);

	void OnRspSubscribeQuote(int arg0, int arg1, byte arg2, TapAPIQuoteWhole arg3);

	void OnRspUnSubscribeQuote(int arg0, int arg1, byte arg2, TapAPIContract arg3);

	void OnRtnQuote(TapAPIQuoteWhole arg0);
}