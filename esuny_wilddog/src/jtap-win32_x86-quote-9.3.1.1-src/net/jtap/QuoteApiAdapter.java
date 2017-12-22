package net.jtap;

import net.jtap.QuoteApiListener;
import net.jtap.TapAPIContract;
import net.jtap.TapAPIQuotLoginRspInfo;
import net.jtap.TapAPIQuoteCommodityInfo;
import net.jtap.TapAPIQuoteContractInfo;
import net.jtap.TapAPIQuoteWhole;

public class QuoteApiAdapter implements QuoteApiListener {
	public void OnRspLogin(int arg0, TapAPIQuotLoginRspInfo arg1) {
	}

	public void OnAPIReady() {
	}

	public void OnDisconnect(int arg0) {
	}

	public void OnRspChangePassword(int arg0, int arg1) {
	}

	public void OnRspQryCommodity(int arg0, int arg1, byte arg2, TapAPIQuoteCommodityInfo arg3) {
	}

	public void OnRspQryContract(int arg0, int arg1, byte arg2, TapAPIQuoteContractInfo arg3) {
	}

	public void OnRtnContract(TapAPIQuoteContractInfo arg0) {
	}

	public void OnRspSubscribeQuote(int arg0, int arg1, byte arg2, TapAPIQuoteWhole arg3) {
	}

	public void OnRspUnSubscribeQuote(int arg0, int arg1, byte arg2, TapAPIContract arg3) {
	}

	public void OnRtnQuote(TapAPIQuoteWhole arg0) {
	}
}