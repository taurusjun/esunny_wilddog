package net.jtap;

public class JtapErrorConstants {
	public static final int TAPIERROR_SUCCEED = 0;
	public static final int TAPIERROR_ConnectFail = -1;
	public static final int TAPIERROR_LinkAuthFail = -2;
	public static final int TAPIERROR_HostUnavailable = -3;
	public static final int TAPIERROR_SendDataError = -4;
	public static final int TAPIERROR_TestIDError = -5;
	public static final int TAPIERROR_NotReadyTestNetwork = -6;
	public static final int TAPIERROR_CurTestNotOver = -7;
	public static final int TAPIERROR_NOFrontAvailable = -8;
	public static final int TAPIERROR_DataPathAvaiable = -9;
	public static final int TAPIERROR_RepeatLogin = -10;
	public static final int TAPIERROR_InnerError = -11;
	public static final int TAPIERROR_LastReqNotFinish = -12;
	public static final int TAPIERROR_InputValueError = -13;
	public static final int TAPIERROR_AuthCode_Invalid = -14;
	public static final int TAPIERROR_AuthCode_Expired = -15;
	public static final int TAPIERROR_AuthCode_TypeNotMatch = -16;
	public static final int TAPIERROR_API_NotReady = -17;
	public static final int TAPIERROR_UDP_LISTEN_FAILED = -18;
	public static final int TAPIERROR_UDP_LISTENING = -19;
	public static final int TAPIERROR_NotImplemented = -20;
	public static final int TAPIERROR_CallOneTimeOnly = -21;
	public static final int TAPIERROR_INPUTERROR_NULL = -10000;
	public static final int TAPIERROR_INPUTERROR_TAPIYNFLAG = -10001;
	public static final int TAPIERROR_INPUTERROR_TAPILOGLEVEL = -10002;
	public static final int TAPIERROR_INPUTERROR_TAPICommodityType = -10003;
	public static final int TAPIERROR_INPUTERROR_TAPICallOrPutFlagType = -10004;
	public static final int TAPIERROR_INPUTERROR_TAPIBucketDateFlag = -11001;
	public static final int TAPIERROR_INPUTERROR_TAPIHisQuoteType = -11002;
	public static final int TAPIERROR_INPUTERROR_TAPIAccountType = -12001;
	public static final int TAPIERROR_INPUTERROR_TAPIUserTypeType = -12002;
	public static final int TAPIERROR_INPUTERROR_TAPIAccountState = -12003;
	public static final int TAPIERROR_INPUTERROR_TAPIAccountFamilyType = -12004;
	public static final int TAPIERROR_INPUTERROR_TAPIOrderTypeType = -12005;
	public static final int TAPIERROR_INPUTERROR_TAPIOrderSourceType = -12006;
	public static final int TAPIERROR_INPUTERROR_TAPITimeInForceType = -12007;
	public static final int TAPIERROR_INPUTERROR_TAPISideType = -12008;
	public static final int TAPIERROR_INPUTERROR_TAPIPositionEffectType = -12009;
	public static final int TAPIERROR_INPUTERROR_TAPIHedgeFlagType = -12010;
	public static final int TAPIERROR_INPUTERROR_TAPIOrderStateType = -12011;
	public static final int TAPIERROR_INPUTERROR_TAPICalculateModeType = -12012;
	public static final int TAPIERROR_INPUTERROR_TAPIMatchSourceType = -12013;
	public static final int TAPIERROR_INPUTERROR_TAPIOpenCloseModeType = -12014;
	public static final int TAPIERROR_INPUTERROR_TAPIFutureAlgType = -12015;
	public static final int TAPIERROR_INPUTERROR_TAPIOptionAlgType = -12016;
	public static final int TAPIERROR_INPUTERROR_TAPIBankAccountLWFlagType = -12017;
	public static final int TAPIERROR_INPUTERROR_TAPIBankAccountStateType = -12018;
	public static final int TAPIERROR_INPUTERROR_TAPIBankAccountSwapStateType = -12019;
	public static final int TAPIERROR_INPUTERROR_TAPIBankAccountTransferStateType = -12020;
	public static final int TAPIERROR_INPUTERROR_TAPIMarginCalculateModeType = -12021;
	public static final int TAPIERROR_INPUTERROR_TAPIOptionMarginCalculateModeType = -12022;
	public static final int TAPIERROR_INPUTERROR_TAPICmbDirectType = -12023;
	public static final int TAPIERROR_INPUTERROR_TAPIDeliveryModeType = -12024;
	public static final int TAPIERROR_INPUTERROR_TAPIContractTypeType = -12025;
	public static final int TAPIERROR_INPUTERROR_TAPIPartyTypeType = -12026;
	public static final int TAPIERROR_INPUTERROR_TAPIPartyCertificateTypeType = -12027;
	public static final int TAPIERROR_INPUTERROR_TAPIMsgReceiverType = -12028;
	public static final int TAPIERROR_INPUTERROR_TAPIMsgTypeType = -12029;
	public static final int TAPIERROR_INPUTERROR_TAPIMsgLevelType = -12030;
	public static final int TAPIERROR_INPUTERROR_TAPITransferDirectType = -12031;
	public static final int TAPIERROR_INPUTERROR_TAPITransferStateType = -12032;
	public static final int TAPIERROR_INPUTERROR_TAPITransferTypeType = -12033;
	public static final int TAPIERROR_INPUTERROR_TAPITransferDeviceIDType = -12034;
	public static final int TAPIERROR_INPUTERROR_TAPITacticsTypeType = -12035;
	public static final int TAPIERROR_INPUTERROR_TAPIORDERACT = -12036;
	public static final int TAPIERROR_INPUTERROR_TAPIBillTypeType = -12037;
	public static final int TAPIERROR_INPUTERROR_TAPIBillFileTypeType = -12038;
	public static final int TAPIERROR_INPUTERROR_TAPIOFFFlagType = -12039;
	public static final int TAPIERROR_INPUTERROR_TAPICashAdjustTypeType = -12040;
	public static final int TAPIERROR_INPUTERROR_TAPITriggerConditionType = -12041;
	public static final int TAPIERROR_INPUTERROR_TAPITriggerPriceTypeType = -12042;
	public static final int TAPIERROR_INPUTERROR_TAPITradingStateType = -12043;
	public static final int TAPIERROR_INPUTERROR_TAPIMarketLevelType = -12044;
	public static final int TAPIERROR_INPUTERROR_TAPIOrderQryTypeType = -12045;
	public static final int TAPIERROR_INPUTERROR_QryHisQuoteParam = -13001;
	public static final int TAPIERROR_DISCONNECT_CLOSE_INIT = 1;
	public static final int TAPIERROR_DISCONNECT_CLOSE_PASS = 2;
	public static final int TAPIERROR_DISCONNECT_READ_ERROR = 3;
	public static final int TAPIERROR_DISCONNECT_WRITE_ERROR = 4;
	public static final int TAPIERROR_DISCONNECT_BUF_FULL = 5;
	public static final int TAPIERROR_DISCONNECT_IOCP_ERROR = 6;
	public static final int TAPIERROR_DISCONNECT_PARSE_ERROR = 7;
	public static final int TAPIERROR_DISCONNECT_CONNECT_TIMEOUT = 8;
	public static final int TAPIERROR_DISCONNECT_INIT_ERROR = 9;
	public static final int TAPIERROR_DISCONNECT_HAS_CONNECTED = 10;
	public static final int TAPIERROR_DISCONNECT_HAS_EXIT = 11;
	public static final int TAPIERROR_DISCONNECT_TRY_LATER = 12;
	public static final int TAPIERROR_LOGIN = 10001;
	public static final int TAPIERROR_LOGIN_USER = 10002;
	public static final int TAPIERROR_LOGIN_DDA = 10003;
	public static final int TAPIERROR_LOGIN_LICENSE = 10004;
	public static final int TAPIERROR_LOGIN_MODULE = 10005;
	public static final int TAPIERROR_LOGIN_FORCE = 10006;
	public static final int TAPIERROR_LOGIN_STATE = 10007;
	public static final int TAPIERROR_LOGIN_PASS = 10008;
	public static final int TAPIERROR_LOGIN_RIGHT = 10009;
	public static final int TAPIERROR_LOGIN_COUNT = 10010;
	public static final int TAPIERROR_LOGIN_NOTIN_SERVERFLAGUSRES = 10011;
	public static final int TAPIERROR_USERINFO_QRY = 10101;
	public static final int TAPIERROR_USERINFO_ADD = 10102;
	public static final int TAPIERROR_USERINFO_MOD = 10103;
	public static final int TAPIERROR_USERINFO_DEL = 10104;
	public static final int TAPIERROR_ACCOUNTNO_IN_USERINFO_DEL = 10105;
	public static final int TAPIERROR_USERSTATE_QRY = 10201;
	public static final int TAPIERROR_USERSTATE_ADD = 10202;
	public static final int TAPIERROR_USERSTATE_MOD = 10203;
	public static final int TAPIERROR_USERSTATE_DEL = 10204;
	public static final int TAPIERROR_LICENSEINFO_QRY = 10301;
	public static final int TAPIERROR_LICENSEINFO_ADD = 10302;
	public static final int TAPIERROR_LICENSEINFO_MOD = 10303;
	public static final int TAPIERROR_LICENSEINFO_DEL = 10304;
	public static final int TAPIERROR_LICENSEINFO_IN_USERLICENSE_DEL = 10305;
	public static final int TAPIERROR_USERLICENSE_QRY = 10401;
	public static final int TAPIERROR_USERLICENSE_ADD = 10402;
	public static final int TAPIERROR_USERLICENSE_DEL = 10403;
	public static final int TAPIERROR_RIGHTINFO_QRY = 10501;
	public static final int TAPIERROR_ROLEINFO_QRY = 10601;
	public static final int TAPIERROR_ROLEINFO_ADD = 10602;
	public static final int TAPIERROR_ROLEINFO_MOD = 10603;
	public static final int TAPIERROR_ROLEINFO_DEL = 10604;
	public static final int TAPIERROR_ROLENO_IN_USERROLE_DEL = 10605;
	public static final int TAPIERROR_ROLERIGHT_QRY = 10701;
	public static final int TAPIERROR_ROLERIGHT_ADD = 10702;
	public static final int TAPIERROR_ROLERIGHT_DEL = 10703;
	public static final int TAPIERROR_USERROLE_QRY = 10801;
	public static final int TAPIERROR_USERROLE_ADD = 10802;
	public static final int TAPIERROR_USERROLE_DEL = 10803;
	public static final int TAPIERROR_USERRIGHT_QRY = 10901;
	public static final int TAPIERROR_USERRIGHT_ADD = 10902;
	public static final int TAPIERROR_USERRIGHT_DEL = 10903;
	public static final int TAPIERROR_USERALLRIGHT_QRY = 11001;
	public static final int TAPIERROR_USERALLRIGHT_ADD_NOTICE = 11002;
	public static final int TAPIERROR_USERALLRIGHT_DEL_NOTICE = 11003;
	public static final int TAPIERROR_ACCOUNTGROUPINFO_QRY = 11101;
	public static final int TAPIERROR_ACCOUNTGROUPINFO_ADD = 11102;
	public static final int TAPIERROR_ACCOUNTGROUPINFO_MOD = 11103;
	public static final int TAPIERROR_ACCOUNTGROUPINFO_DEL = 11104;
	public static final int TAPIERROR_GROUPACCOUNT_QRY = 11201;
	public static final int TAPIERROR_GROUPACCOUNT_ADD = 11202;
	public static final int TAPIERROR_GROUPACCOUNT_DEL = 11203;
	public static final int TAPIERROR_GROUPACCOUNT_ONETOONE = 11204;
	public static final int TAPIERROR_USERGROUP_QRY = 11301;
	public static final int TAPIERROR_USERGROUP_ADD = 11302;
	public static final int TAPIERROR_USERGROUP_DEL = 11303;
	public static final int TAPIERROR_USERACCOUNT_QRY = 11401;
	public static final int TAPIERROR_USERACCOUNT_ADD = 11402;
	public static final int TAPIERROR_USERACCOUNT_DEL = 11403;
	public static final int TAPIERROR_USERALLACCOUNT_QRY = 11501;
	public static final int TAPIERROR_USERALLACCOUNT_ADD_NOTICE = 11502;
	public static final int TAPIERROR_USERALLACCOUNT_DEL_NOTICE = 11503;
	public static final int TAPIERROR_PASSWORDTYPEINFO_QRY = 11601;
	public static final int TAPIERROR_PASSWORDTYPEINFO_MOD = 11602;
	public static final int TAPIERROR_USERPASSWORD_MOD = 11701;
	public static final int TAPIERROR_USERPASSWORD_MOD_SOURCE = 11702;
	public static final int TAPIERROR_USERPASSWORD_MOD_SAME = 11703;
	public static final int TAPIERROR_USERPASSWORD_MOD_COMPLEXITY = 11704;
	public static final int TAPIERROR_LINKINFO_QRY = 11801;
	public static final int TAPIERROR_LINKDETAILINFO_QRY = 11802;
	public static final int TAPIERROR_LINKINFO_DEL = 11803;
	public static final int TAPIERROR_USERRESERVEDINFO_MOD = 11901;
	public static final int TAPIERROR_SERVERFLAGUSERS_QRY = 12001;
	public static final int TAPIERROR_SERVERFLAGUSERS_ADD = 12002;
	public static final int TAPIERROR_SERVERFLAGUSERS_DEL = 12003;
	public static final int TAPIERROR_GROUPPROPERTYINFO_QRY = 12011;
	public static final int TAPIERROR_GROUPPROPERTYINFO_ADD = 12012;
	public static final int TAPIERROR_GROUPPROPERTYINFO_MOD = 12013;
	public static final int TAPIERROR_GROUPPROPERTYINFO_DEL = 12014;
	public static final int TAPIERROR_INTERFUTUREBANKPASSWORDAUTH_REQ = 12021;
	public static final int TAPIERROR_ACCOUNTPASSWORD_MOD = 12031;
	public static final int TAPIERROR_ACCOUNTPASSWORDUSER_MOD = 12032;
	public static final int TAPIERROR_ACCOUNTPASSWORD_ERROR = 12033;
	public static final int TAPIERROR_ORDERINSERT_ACCOUNT = 60001;
	public static final int TAPIERROR_ORDERINSERT_ACCOUNT_STATE = 60002;
	public static final int TAPIERROR_ORDERINSERT_CONTRACT = 60011;
	public static final int TAPIERROR_ORDERINSERT_TRADEROUTE = 60021;
	public static final int TAPIERROR_ORDERINSERT_POSITIONMAX = 60022;
	public static final int TAPIERROR_ORDER_NOTRADE = 60023;
	public static final int TAPIERROR_ORDER_CLOSE = 60024;
	public static final int TAPIERROR_ORDERINSERT_NOTENOUGHFUND = 60031;
	public static final int TAPIERROR_ORDERINSERT_ORDERTYPE = 60032;
	public static final int TAPIERROR_ORDERINSERT_TIMEINFORCE = 60033;
	public static final int TAPIERROR_ORDERINSERT_NO_TACTICS = 60034;
	public static final int TAPIERROR_ORDERINSERT_POSITION_CANNOT_CLOSE = 60035;
	public static final int TAPIERROR_ORDERINSERT_AUTOCHECK_FAIL = 60036;
	public static final int TAPIERROR_ORDERINSERT_LME_NOTREADY = 60037;
	public static final int TAPIERROR_ORDERINSERT_CLOSEMODE = 60038;
	public static final int TAPIERROR_ORDERINSERT_PARENTNOTENOUGHFUND = 60039;
	public static final int TAPIERROR_SWAP_CONTRACT = 60040;
	public static final int TAPIERROR_USERNO_NOTHAS_ACCOUNT = 60051;
	public static final int TAPIERROR_UPPERCHANNEL_BROKEN = 60052;
	public static final int TAPIERROR_UPPERCHANNEL_NOT_EXIST = 60053;
	public static final int TAPIERROR_ORDERDELETE_NOT_SYSNO = 60061;
	public static final int TAPIERROR_ORDERDELETE_NOT_STATE = 60062;
	public static final int TAPIERROR_ORDERACTIVE_NOT_STATE = 60063;
	public static final int TAPIERROR_ORDERCHECK_NOT_STATE = 60071;
	public static final int TAPIERROR_ORDERCHECK_FAIL = 60072;
	public static final int TAPIERROR_ORDERMODIFY_NOT_STATE = 60081;
	public static final int TAPIERROR_ORDERMODIFY_BACK_INPUT = 60082;
	public static final int TAPIERROR_ORDERINSERT_FEE = 60091;
	public static final int TAPIERROR_ORDERINSERT_MARGIN = 60092;
	public static final int TAPIERROR_ORDER_NO_PERMIT = 60100;
	public static final int TAPIERROR_RSPQUOTE_NO_PERMIT = 60101;
	public static final int TAPIERROR_RSPQUOTE_CHILD_NO_PERMIT = 60102;
	public static final int TAPIERROR_TRADENO_NOT_FIND = 60103;
	public static final int TAPIERROR_ORDER_NO_CLOSE = 60104;
	public static final int TAPIERROR_QRY_QUOTE_NO_PERMIT = 60105;
	public static final int TAPIERROR_CURRENCYINFO_QRY = 20101;
	public static final int TAPIERROR_TCURRENCYINFO_QRY = 20102;
	public static final int TAPIERROR_CURRENCYINFO_ADD = 20103;
	public static final int TAPIERROR_CURRENCYINFO_DEL = 20104;
	public static final int TAPIERROR_CURRENCYINFO_MOD = 20105;
	public static final int TAPIERROR_CURRENCYINFO_CASCADE_DEL = 20106;
	public static final int TAPIERROR_CURRENCYCHANGE_INFO_QRY = 20107;
	public static final int TAPIERROR_ACCOUNTINFO_QRY = 20201;
	public static final int TAPIERROR_ACCOUNTSUMMARY_QRY = 20202;
	public static final int TAPIERROR_ACCOUNTINFO_ADD = 20203;
	public static final int TAPIERROR_ACCOUNTINFO_DEL = 20204;
	public static final int TAPIERROR_ACCOUNTINFO_MOD = 20205;
	public static final int TAPIERROR_ALLACCOUNTINFO_QRY = 20206;
	public static final int TAPIERROR_ORGINFO_QRY = 20301;
	public static final int TAPIERROR_ORGINFO_ADD = 20302;
	public static final int TAPIERROR_ORGINFO_DEL = 20303;
	public static final int TAPIERROR_ORGINFO_MOD = 20304;
	public static final int TAPIERROR_ACCOUNTCERTIFICATE_QRY = 20401;
	public static final int TAPIERROR_ACCOUNTCERTIFICATE_ADD = 20402;
	public static final int TAPIERROR_ACCOUNTCERTIFICATE_DEL = 20403;
	public static final int TAPIERROR_ACCOUNTCERTIFICATE_MOD = 20404;
	public static final int TAPIERROR_PARENTACCOUNT_QRY = 20501;
	public static final int TAPIERROR_TPARENTACCOUNT_QRY = 20502;
	public static final int TAPIERROR_PARENTACCOUNT_ADD = 20503;
	public static final int TAPIERROR_PARENTACCOUNT_DEL = 20504;
	public static final int TAPIERROR_PARENTACCOUNT_MOD = 20505;
	public static final int TAPIERROR_EXCHANGEINFO_QRY = 20601;
	public static final int TAPIERROR_EXCHANGEINFO_ADD = 20602;
	public static final int TAPIERROR_EXCHANGEINFO_DEL = 20603;
	public static final int TAPIERROR_EXCHANGEINFO_MOD = 20604;
	public static final int TAPIERROR_TRADENO_QRY = 20701;
	public static final int TAPIERROR_TRADENO_ADD = 20702;
	public static final int TAPIERROR_TRADENO_DEL = 20703;
	public static final int TAPIERROR_TRADENO_MOD = 20704;
	public static final int TAPIERROR_TRADENO_EXIT = 20705;
	public static final int TAPIERROR_ACCOUNTBANKINFO_QRY = 20801;
	public static final int TAPIERROR_ACCOUNTBANKINFO_ADD = 20802;
	public static final int TAPIERROR_ACCOUNTBANKINFO_DEL = 20803;
	public static final int TAPIERROR_ACCOUNTBANKINFO_MOD = 20804;
	public static final int TAPIERROR_PARTYINFO_QRY = 20901;
	public static final int TAPIERROR_PARTYINFO_ADD = 20902;
	public static final int TAPIERROR_PARTYINFO_DEL = 20903;
	public static final int TAPIERROR_PARTYINFO_MOD = 20904;
	public static final int TAPIERROR_ATTRIBUTEINFO_QRY = 21001;
	public static final int TAPIERROR_ATTRIBUTEINFO_ADD = 21002;
	public static final int TAPIERROR_ATTRIBUTEINFO_DEL = 21003;
	public static final int TAPIERROR_ATTRIBUTEINFO_MOD = 21004;
	public static final int TAPIERROR_ACCOUNTATTRIBUTE_QRY = 21101;
	public static final int TAPIERROR_ACCOUNTATTRIBUTE_ADD = 21102;
	public static final int TAPIERROR_ACCOUNTATTRIBUTE_MOD = 21103;
	public static final int TAPIERROR_UPPERINFO_QRY = 21201;
	public static final int TAPIERROR_UPPERINFO_ADD = 21202;
	public static final int TAPIERROR_UPPERINFO_DEL = 21203;
	public static final int TAPIERROR_UPPERINFO_MOD = 21204;
	public static final int TAPIERROR_UPPERINFO_CASCADE_DEL = 21205;
	public static final int TAPIERROR_UPPERBANKINFO_QRY = 21301;
	public static final int TAPIERROR_UPPERBANKINFO_ADD = 21302;
	public static final int TAPIERROR_UPPERBANKINFO_DEL = 21303;
	public static final int TAPIERROR_UPPERBANKINFO_MOD = 21304;
	public static final int TAPIERROR_UPPERBANKINFO_CASCADE_DEL = 21305;
	public static final int TAPIERROR_UPPERCHANNEL_QRY = 21401;
	public static final int TAPIERROR_UPPERCHANNEL_ADD = 21402;
	public static final int TAPIERROR_UPPERCHANNEL_DEL = 21403;
	public static final int TAPIERROR_UPPERCHANNEL_MOD = 21404;
	public static final int TAPIERROR_UPPERCHANNEL_CASCADE_DEL = 21405;
	public static final int TAPIERROR_CURRENCYGROUP_QRY = 21501;
	public static final int TAPIERROR_CURRENCYGROUP_ADD = 21502;
	public static final int TAPIERROR_CURRENCYGROUP_DEL = 21503;
	public static final int TAPIERROR_CURRENCYGROUP_MOD = 21504;
	public static final int TAPIERROR_CURRENCYGROUP_CASCADE_DEL = 21505;
	public static final int TAPIERROR_BANKINFO_QRY = 21601;
	public static final int TAPIERROR_BANKINFO_ADD = 21602;
	public static final int TAPIERROR_BANKINFO_DEL = 21603;
	public static final int TAPIERROR_BANKINFO_MOD = 21604;
	public static final int TAPIERROR_BANKINFO_CASCADE_DEL = 21605;
	public static final int TAPIERROR_INTERNALBANK_QRY = 21701;
	public static final int TAPIERROR_INTERNALBANK_ADD = 21702;
	public static final int TAPIERROR_INTERNALBANK_DEL = 21703;
	public static final int TAPIERROR_INTERNALBANK_MOD = 21704;
	public static final int TAPIERROR_SWAPRATE_QRY = 21801;
	public static final int TAPIERROR_SWAPRATE_ADD = 21802;
	public static final int TAPIERROR_SWAPRATE_DEL = 21803;
	public static final int TAPIERROR_SWAPRATE_MOD = 21804;
	public static final int TAPIERROR_ACCOUNTSWAPVALUE_QRY = 21901;
	public static final int TAPIERROR_ACCOUNTSWAPVALUE_ADD = 21902;
	public static final int TAPIERROR_ACCOUNTSWAPVALUE_DEL = 21903;
	public static final int TAPIERROR_ACCOUNTSWAPVALUE_MOD = 21904;
	public static final int TAPIERROR_COMMODITYINFO_QRY = 22001;
	public static final int TAPIERROR_TCOMMODITYINFO_QRY = 22002;
	public static final int TAPIERROR_COMMODITYINFO_ADD = 22003;
	public static final int TAPIERROR_COMMODITYINFO_DEL = 22004;
	public static final int TAPIERROR_COMMODITYINFO_MOD = 22005;
	public static final int TAPIERROR_COMMODITYSECTOR_QRY = 22101;
	public static final int TAPIERROR_COMMODITYSECTOR_ADD = 22102;
	public static final int TAPIERROR_COMMODITYSECTOR_DEL = 22103;
	public static final int TAPIERROR_COMMODITYSECTOR_MOD = 22104;
	public static final int TAPIERROR_COMMODITYSECTOR_CASCADE_DEL = 22105;
	public static final int TAPIERROR_COMMODITYSECTOR_CHILD_DEL = 22106;
	public static final int TAPIERROR_SECTORMAPCOMMODITY_QRY = 22201;
	public static final int TAPIERROR_SECTORMAPCOMMODITY_ADD = 22202;
	public static final int TAPIERROR_SECTORMAPCOMMODITY_DEL = 22203;
	public static final int TAPIERROR_SECTORMAPCOMMODITY_MOD = 22204;
	public static final int TAPIERROR_COMMODITYGROUP_QRY = 22301;
	public static final int TAPIERROR_COMMODITYGROUP_ADD = 22302;
	public static final int TAPIERROR_COMMODITYGROUP_DEL = 22303;
	public static final int TAPIERROR_COMMODITYGROUP_MOD = 22304;
	public static final int TAPIERROR_COMMODITYGROUP_CASCADE_DEL = 22305;
	public static final int TAPIERROR_GROUPMAPCOMMODITY_QRY = 22401;
	public static final int TAPIERROR_GROUPMAPCOMMODITY_ADD = 22402;
	public static final int TAPIERROR_GROUPMAPCOMMODITY_DEL = 22403;
	public static final int TAPIERROR_GROUPMAPCOMMODITY_MOD = 22404;
	public static final int TAPIERROR_TRADINGTIMEBUCKET_QRY = 22501;
	public static final int TAPIERROR_TRADINGTIMEBUCKET_ADD = 22502;
	public static final int TAPIERROR_TRADINGTIMEBUCKET_DEL = 22503;
	public static final int TAPIERROR_TRADINGTIMEBUCKET_MOD = 22504;
	public static final int TAPIERROR_COMMODITYQUOTEINFO_QRY = 22601;
	public static final int TAPIERROR_COMMODITYQUOTEINFO_ADD = 22602;
	public static final int TAPIERROR_COMMODITYQUOTEINFO_DEL = 22603;
	public static final int TAPIERROR_COMMODITYQUOTEINFO_MOD = 22604;
	public static final int TAPIERROR_COMMODITYRELATEINFO_QRY = 22701;
	public static final int TAPIERROR_COMMODITYRELATEINFO_ADD = 22702;
	public static final int TAPIERROR_COMMODITYRELATEINFO_DEL = 22703;
	public static final int TAPIERROR_COMMODITYRELATEINFO_MOD = 22704;
	public static final int TAPIERROR_CONTRACTINFO_QRY = 22801;
	public static final int TAPIERROR_CONTRACTINFO_ADD = 22802;
	public static final int TAPIERROR_CONTRACTINFO_DEL = 22803;
	public static final int TAPIERROR_CONTRACTINFO_MOD = 22804;
	public static final int TAPIERROR_CONTRACTINFO_CASCADE_DEL = 22805;
	public static final int TAPIERROR_SPECIALOPTIONFUTURE_QRY = 22901;
	public static final int TAPIERROR_SPECIALOPTIONFUTURE_ADD = 22902;
	public static final int TAPIERROR_SPECIALOPTIONFUTURE_DEL = 22903;
	public static final int TAPIERROR_SPECIALOPTIONFUTURE_MOD = 22904;
	public static final int TAPIERROR_UPPERCOMMODITYMAPPING_QRY = 23001;
	public static final int TAPIERROR_UPPERCOMMODITYMAPPING_ADD = 23002;
	public static final int TAPIERROR_UPPERCOMMODITYMAPPING_DEL = 23003;
	public static final int TAPIERROR_UPPERCOMMODITYMAPPING_MOD = 23004;
	public static final int TAPIERROR_OUTSIDECOMMODITYMAPPING_QRY = 23101;
	public static final int TAPIERROR_OUTSIDECOMMODITYMAPPING_ADD = 23102;
	public static final int TAPIERROR_OUTSIDECOMMODITYMAPPING_DEL = 23103;
	public static final int TAPIERROR_OUTSIDECOMMODITYMAPPING_MOD = 23104;
	public static final int TAPIERROR_OUTSIDEDATASOURCE_QRY = 23201;
	public static final int TAPIERROR_OUTSIDEDATASOURCE_ADD = 23202;
	public static final int TAPIERROR_OUTSIDEDATASOURCE_DEL = 23203;
	public static final int TAPIERROR_OUTSIDEDATASOURCE_MOD = 23204;
	public static final int TAPIERROR_UPPERFEE_QRY = 23301;
	public static final int TAPIERROR_UPPERFEE_ADD = 23302;
	public static final int TAPIERROR_UPPERFEE_DEL = 23303;
	public static final int TAPIERROR_UPPERFEE_MOD = 23304;
	public static final int TAPIERROR_TEMPLATEFEE_QRY = 23401;
	public static final int TAPIERROR_TEMPLATEFEE_ADD = 23402;
	public static final int TAPIERROR_TEMPLATEFEE_DEL = 23403;
	public static final int TAPIERROR_TEMPLATEFEE_MOD = 23404;
	public static final int TAPIERROR_ACCOUNTFEETEMPLATE_QRY = 23501;
	public static final int TAPIERROR_ACCOUNTFEETEMPLATE_ADD = 23502;
	public static final int TAPIERROR_ACCOUNTFEETEMPLATE_DEL = 23503;
	public static final int TAPIERROR_ACCOUNTFEETEMPLATE_MOD = 23504;
	public static final int TAPIERROR_UPPEROTHERFEE_QRY = 23601;
	public static final int TAPIERROR_UPPEROTHERFEE_ADD = 23602;
	public static final int TAPIERROR_UPPEROTHERFEE_DEL = 23603;
	public static final int TAPIERROR_UPPEROTHERFEE_MOD = 23604;
	public static final int TAPIERROR_ACCOUNTOTHERFEE_QRY = 23701;
	public static final int TAPIERROR_ACCOUNTOTHERFEE_ADD = 23702;
	public static final int TAPIERROR_ACCOUNTOTHERFEE_DEL = 23703;
	public static final int TAPIERROR_ACCOUNTOTHERFEE_MOD = 23704;
	public static final int TAPIERROR_UPPERMARGIN_QRY = 23801;
	public static final int TAPIERROR_UPPERMARGIN_ADD = 23802;
	public static final int TAPIERROR_UPPERMARGIN_DEL = 23803;
	public static final int TAPIERROR_UPPERMARGIN_MOD = 23804;
	public static final int TAPIERROR_UPPERMARGINADJUST_QRY = 23901;
	public static final int TAPIERROR_UPPERMARGINADJUST_ADD = 23902;
	public static final int TAPIERROR_UPPERMARGINADJUST_DEL = 23903;
	public static final int TAPIERROR_UPPERMARGINADJUST_MOD = 23904;
	public static final int TAPIERROR_TEMPLATEMARGIN_QRY = 24001;
	public static final int TAPIERROR_TEMPLATEMARGIN_ADD = 24002;
	public static final int TAPIERROR_TEMPLATEMARGIN_DEL = 24003;
	public static final int TAPIERROR_TEMPLATEMARGIN_MOD = 24004;
	public static final int TAPIERROR_ACCOUNTMARGINTEMPLATE_QRY = 24101;
	public static final int TAPIERROR_ACCOUNTMARGINTEMPLATE_ADD = 24102;
	public static final int TAPIERROR_ACCOUNTMARGINTEMPLATE_DEL = 24103;
	public static final int TAPIERROR_ACCOUNTMARGINTEMPLATE_MOD = 24104;
	public static final int TAPIERROR_TEMPLATEMARGINADJUST_QRY = 24201;
	public static final int TAPIERROR_TEMPLATEMARGINADJUST_ADD = 24202;
	public static final int TAPIERROR_TEMPLATEMARGINADJUST_DEL = 24203;
	public static final int TAPIERROR_TEMPLATEMARGINADJUST_MOD = 24204;
	public static final int TAPIERROR_LOCKEDPERCENTAGE_QRY = 24301;
	public static final int TAPIERROR_LOCKEDPERCENTAGE_ADD = 24302;
	public static final int TAPIERROR_LOCKEDPERCENTAGE_DEL = 24303;
	public static final int TAPIERROR_LOCKEDPERCENTAGE_MOD = 24304;
	public static final int TAPIERROR_TRADINGRIGHT_QRY = 24401;
	public static final int TAPIERROR_TRADINGRIGHT_ADD = 24402;
	public static final int TAPIERROR_TRADINGRIGHT_DEL = 24403;
	public static final int TAPIERROR_TRADINGRIGHT_MOD = 24404;
	public static final int TAPIERROR_ONCEMAX_QRY = 24501;
	public static final int TAPIERROR_ONCEMAX_ADD = 24502;
	public static final int TAPIERROR_ONCEMAX_DEL = 24503;
	public static final int TAPIERROR_ONCEMAX_MOD = 24504;
	public static final int TAPIERROR_POSITIONMAX_QRY = 24601;
	public static final int TAPIERROR_POSITIONMAX_ADD = 24602;
	public static final int TAPIERROR_POSITIONMAX_DEL = 24603;
	public static final int TAPIERROR_POSITIONMAX_MOD = 24604;
	public static final int TAPIERROR_TRADINGROUTE_QRY = 24701;
	public static final int TAPIERROR_TRADINGROUTE_ADD = 24702;
	public static final int TAPIERROR_TRADINGROUTE_DEL = 24703;
	public static final int TAPIERROR_TRADINGROUTE_MOD = 24704;
	public static final int TAPIERROR_QUOTEROUTE_QRY = 24801;
	public static final int TAPIERROR_QUOTEROUTE_ADD = 24802;
	public static final int TAPIERROR_QUOTEROUTE_DEL = 24803;
	public static final int TAPIERROR_QUOTEROUTE_MOD = 24804;
	public static final int TAPIERROR_SYSTEMPARAMETER_QRY = 24901;
	public static final int TAPIERROR_SYSTEMPARAMETER_ADD = 24902;
	public static final int TAPIERROR_SYSTEMPARAMETER_DEL = 24903;
	public static final int TAPIERROR_SYSTEMPARAMETER_MOD = 24904;
	public static final int TAPIERROR_ITEMINFO_QRY = 25001;
	public static final int TAPIERROR_ITEMVALUEINFO_QRY = 25002;
	public static final int TAPIERROR_TEMPLATEFEEINFO_QRY = 25101;
	public static final int TAPIERROR_TEMPLATEFEEINFO_ADD = 25102;
	public static final int TAPIERROR_TEMPLATEFEEINFO_DEL = 25103;
	public static final int TAPIERROR_TEMPLATEFEEINFO_MOD = 25104;
	public static final int TAPIERROR_TEMPLATEFEEINFO_CASCADE_DEL = 25105;
	public static final int TAPIERROR_TEMPLATEMARGININFO_QRY = 25201;
	public static final int TAPIERROR_TEMPLATEMARGININFO_ADD = 25202;
	public static final int TAPIERROR_TEMPLATEMARGININFO_DEL = 25203;
	public static final int TAPIERROR_TEMPLATEMARGININFO_MOD = 25204;
	public static final int TAPIERROR_TEMPLATEMARGININFO_CASCADE_DEL = 25205;
	public static final int TAPIERROR_OTHERFEETYPEINFO_QRY = 25301;
	public static final int TAPIERROR_OTHERFEETYPEINFO_ADD = 25302;
	public static final int TAPIERROR_OTHERFEETYPEINFO_DEL = 25303;
	public static final int TAPIERROR_OTHERFEETYPEINFO_MOD = 25304;
	public static final int TAPIERROR_OTHERFEETYPEINFO_CASCADE_DEL = 25305;
	public static final int TAPIERROR_COMMODITYORDERTYPE_QRY = 25501;
	public static final int TAPIERROR_COMMODITYORDERTYPE_ADD = 25502;
	public static final int TAPIERROR_COMMODITYORDERTYPE_DEL = 25503;
	public static final int TAPIERROR_COMMODITYORDERTYPE_MOD = 25504;
	public static final int TAPIERROR_ORDERTIMEINFORCE_QRY = 25601;
	public static final int TAPIERROR_ORDERTIMEINFORCE_ADD = 25602;
	public static final int TAPIERROR_ORDERTIMEINFORCE_DEL = 25603;
	public static final int TAPIERROR_ORDERTIMEINFORCE_MOD = 25604;
	public static final int TAPIERROR_ATTRIBUTELEVELINFO_QRY = 25701;
	public static final int TAPIERROR_ATTRIBUTELEVELINFO_ADD = 25702;
	public static final int TAPIERROR_ATTRIBUTELEVELINFO_DEL = 25703;
	public static final int TAPIERROR_ATTRIBUTELEVELINFO_MOD = 25704;
	public static final int TAPIERROR_ATTRIBUTELEVELINFO_CASCADE_DEL = 25705;
	public static final int TAPIERROR_CALENDARTEMPLATEINFO_QRY = 25801;
	public static final int TAPIERROR_CALENDARTEMPLATEINFO_ADD = 25802;
	public static final int TAPIERROR_CALENDARTEMPLATEINFO_DEL = 25803;
	public static final int TAPIERROR_CALENDARTEMPLATEINFO_MOD = 25804;
	public static final int TAPIERROR_COMMODITYCALENDARTEMPLATE_QRY = 25901;
	public static final int TAPIERROR_COMMODITYCALENDARTEMPLATE_ADD = 25902;
	public static final int TAPIERROR_COMMODITYCALENDARTEMPLATE_DEL = 25903;
	public static final int TAPIERROR_COMMODITYCALENDARTEMPLATE_MOD = 25904;
	public static final int TAPIERROR_ACCOUNTREALVALUE_QRY = 26001;
	public static final int TAPIERROR_ACCOUNTREALVALUE_ADD = 26002;
	public static final int TAPIERROR_ACCOUNTREALVALUE_DEL = 26003;
	public static final int TAPIERROR_ACCOUNTREALVALUE_MOD = 26004;
	public static final int TAPIERROR_TOOPTIONCMB_REQ = 26101;
	public static final int TAPIERROR_CALENDARTEMPLATEBASE_QRY = 26201;
	public static final int TAPIERROR_CALENDARTEMPLATEBASE_ADD = 26202;
	public static final int TAPIERROR_CALENDARTEMPLATEBASE_DEL = 26203;
	public static final int TAPIERROR_CALENDARTEMPLATEBASE_MOD = 26204;
	public static final int TAPIERROR_CERTIFICATE_QRY = 26301;
	public static final int TAPIERROR_TRADESERVERFLAG_QRY = 26401;
	public static final int TAPIERROR_TRADESERVERFLAG_ADD = 26402;
	public static final int TAPIERROR_TRADESERVERFLAG_DEL = 26403;
	public static final int TAPIERROR_TRADESERVERFLAG_MOD = 26404;
	public static final int TAPIERROR_TRADESERVERFLAG_CASCADE_DEL = 26405;
	public static final int TAPIERROR_TRADESERVERFLAG_FEETEMPLATE_QRY = 26501;
	public static final int TAPIERROR_TRADESERVERFLAG_MARGINTEMPLATE_QRY = 26601;
	public static final int TAPIERROR_TRADESERVERFLAG_ACCOUNT_FEEINFO_QRY = 26701;
	public static final int TAPIERROR_TRADESERVERFLAG_ACCOUNT_MARGININFO_QRY = 26801;
	public static final int TAPIERROR_COUNTY_QRY = 26901;
	public static final int TAPIERROR_PROVINCE_QRY = 27001;
	public static final int TAPIERROR_BANKLOGINOUT_QRY = 27101;
	public static final int TAPIERROR_BANKLOGINOUT_ADD = 27102;
	public static final int TAPIERROR_TRANSFERFUTUREBANK_QRY = 27201;
	public static final int TAPIERROR_TRANSFERFUTUREBANK_ADD = 27202;
	public static final int TAPIERROR_TRANSFERRENT_QRY = 27301;
	public static final int TAPIERROR_TRANSFERRENT_ADD = 27302;
	public static final int TAPIERROR_TRANSFERRENT_MOD = 27303;
	public static final int TAPIERROR_TRANSFERRENT_DEL = 27304;
	public static final int TAPIERROR_TRANSFERTIME_QRY = 27401;
	public static final int TAPIERROR_TRANSFERTIME_ADD = 27402;
	public static final int TAPIERROR_TRANSFERTIME_MOD = 27403;
	public static final int TAPIERROR_TRANSFERTIME_DEL = 27404;
	public static final int TAPIERROR_BANKSIGNEDINFO_QRY = 27501;
	public static final int TAPIERROR_BANKSIGNEDINFO_ADD = 27502;
	public static final int TAPIERROR_TRADINGTIMEBUCKETBASE_QRY = 27601;
	public static final int TAPIERROR_TRADINGTIMEBUCKETBASE_ADD = 27602;
	public static final int TAPIERROR_TRADINGTIMEBUCKETBASE_DEL = 27603;
	public static final int TAPIERROR_TRADINGTIMEBUCKETBASE_MOD = 27604;
	public static final int TAPIERROR_TRADINGTIMEBUCKETBASE_CASCADE_DEL = 27605;
	public static final int TAPIERROR_CLASSIFY_QRY = 27701;
	public static final int TAPIERROR_ORGANTYPE_QRY = 27801;
	public static final int TAPIERROR_TRADINGCALENDARINFO_QRY = 27901;
	public static final int TAPIERROR_TRADINGCALENDARINFO_ADD = 27902;
	public static final int TAPIERROR_TRADINGCALENDARINFO_MOD = 27903;
	public static final int TAPIERROR_TRADINGCALENDARINFO_DEL = 27904;
	public static final int TAPIERROR_TRADING_CLENDAR_SETTLE_TRADE_QRY = 27905;
	public static final int TAPIERROR_EXCHANGETRADINGCALENDARINFO_QRY = 28001;
	public static final int TAPIERROR_EXCHANGETRADINGCALENDARINFO_ADD = 28002;
	public static final int TAPIERROR_EXCHANGETRADINGCALENDARINFO_MOD = 28003;
	public static final int TAPIERROR_EXCHANGETRADINGCALENDARINFO_DEL = 28004;
	public static final int TAPIERROR_EXCHANGE_TRADING_DETAILDATE_QRY = 28005;
	public static final int TAPIERROR_CONTRACTNEARDELIVERY_QRY = 28101;
	public static final int TAPIERROR_CONTRACTNEARDELIVERY_ADD = 28102;
	public static final int TAPIERROR_CONTRACTNEARDELIVERY_DEL = 28103;
	public static final int TAPIERROR_CHECKTABLEINFO_QRY = 28201;
	public static final int TAPIERROR_CHECKTABLEINFO_ADD = 28202;
	public static final int TAPIERROR_CHECKTABLEINFO_MOD = 28203;
	public static final int TAPIERROR_CHECKTABLEINFO_DEL = 28204;
	public static final int TAPIERROR_CHECKTABLEBASEINFO_QRY = 28205;
	public static final int TAPIERROR_CHECKTABLEDELINFO_QRY = 28206;
	public static final int TAPIERROR_CHECKTABLEDELINFO_ADD = 28207;
	public static final int TAPIERROR_CHECKTABLEDELINFO_DEL = 28208;
	public static final int TAPIERROR_CHECKTABLEBASEINFO_ADD = 28209;
	public static final int TAPIERROR_CHECKTABLEBASEINFO_MOD = 28210;
	public static final int TAPIERROR_OPERATORLOGINFO_QRY = 28301;
	public static final int TAPIERROR_OPERATORLOGINFO_ADD = 28302;
	public static final int TAPIERROR_OPERATORLOGINFO_DEL = 28303;
	public static final int TAPIERROR_RISKPARAMETER_QRY = 28304;
	public static final int TAPIERROR_RISKPARAMETER_MOD = 28305;
	public static final int TAPIERROR_TRANSFERCOUNTVALUE_QRY = 28306;
	public static final int TAPIERROR_TRANSFERCOUNTVALUE_ADD = 28307;
	public static final int TAPIERROR_BANAUTO_ORDERCHECK_QRY = 28401;
	public static final int TAPIERROR_BANAUTO_ORDERCHECK_ADD = 28402;
	public static final int TAPIERROR_BANAUTO_ORDERCHECK_DEL = 28403;
	public static final int TAPIERROR_USER_QUOTE_QTY_QRY = 28501;
	public static final int TAPIERROR_USER_QUOTE_QTY_ADD = 28502;
	public static final int TAPIERROR_USER_QUOTE_QTY_MOD = 28503;
	public static final int TAPIERROR_USER_QUOTE_QTY_DEL = 28504;
	public static final int TAPIERROR_SECTOR_PARENT_QRY = 28601;
	public static final int TAPIERROR_SECTOR_PARENT_ADD = 28602;
	public static final int TAPIERROR_SECTOR_PARENT_MOD = 28603;
	public static final int TAPIERROR_SECTOR_PARENT_DEL = 28604;
	public static final int TAPIERROR_MEASURE_UNIT_QRY = 28701;
	public static final int TAPIERROR_MEASURE_CONVERSION_QRY = 28702;
	public static final int TAPIERROR_CHARGE_CONVERSION_QRY = 28703;
	public static final int TAPIERROR_CHARGE_UNIT_QRY = 28801;
	public static final int TAPIERROR_CHARGE_UNIT_ADD = 28802;
	public static final int TAPIERROR_CHARGE_UNIT_MOD = 28803;
	public static final int TAPIERROR_CHARGE_UNIT_DEL = 28804;
	public static final int TAPIERROR_USER_ORDER_FREQUENCE_QRY = 28901;
	public static final int TAPIERROR_USER_ORDER_FREQUENCE_ADD = 28902;
	public static final int TAPIERROR_USER_ORDER_FREQUENCE_MOD = 28903;
	public static final int TAPIERROR_USER_ORDER_FREQUENCE_DEL = 28904;
	public static final int TAPIERROR_DATA_LINKINFO_QRY = 29001;
	public static final int TAPIERROR_DATA_LINKINFO_ADD = 29002;
	public static final int TAPIERROR_DATA_LINKINFO_MOD = 29003;
	public static final int TAPIERROR_DATA_LINKINFO_DEL = 29004;
	public static final int TAPIERROR_ONLYCANCLOSEDAYS_QRY = 29101;
	public static final int TAPIERROR_ONLYCANCLOSEDAYS_ADD = 29102;
	public static final int TAPIERROR_ONLYCANCLOSEDAYS_DEL = 29103;
	public static final int TAPIERROR_ONLYCANCLOSEDAYS_MOD = 29104;
	public static final int TAPIERROR_LMETRADINGCALENDARINFO_QRY = 29201;
	public static final int TAPIERROR_LMETRADINGCALENDARINFO_ADD = 29202;
	public static final int TAPIERROR_LEMTRADINGCALENDARINFO_MOD = 29203;
	public static final int TAPIERROR_LEMTRADINGCALENDARINFO_DEL = 29204;
	public static final int TAPIERROR_LEM_TRADING_DETAILDATE_QRY = 29205;
	public static final int TAPIERROR_TEMPLATE_MINMAX_FEE_QRY = 29301;
	public static final int TAPIERROR_TEMPLATE_MINMAX_FEE_ADD = 29302;
	public static final int TAPIERROR_TEMPLATE_MINMAX_FEE_DEL = 29303;
	public static final int TAPIERROR_TEMPLATE_MINMAX_FEE_MOD = 29304;
	public static final int TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_QRY = 29401;
	public static final int TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_ADD = 29402;
	public static final int TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_DEL = 29403;
	public static final int TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_MOD = 29404;
	public static final int TAPIERROR_ACCOUNT_SEAT_INFO_QRY = 29411;
	public static final int TAPIERROR_ACCOUNT_SEAT_INFO_ADD = 29412;
	public static final int TAPIERROR_ACCOUNT_SEAT_INFO_DEL = 29413;
	public static final int TAPIERROR_SEAT_INFO_QRY = 29421;
	public static final int TAPIERROR_SEAT_INFO_ADD = 29422;
	public static final int TAPIERROR_SEAT_INFO_DEL = 29423;
	public static final int TAPIERROR_SEAT_INFO_MAIN_EXIT_ADD = 29422;
	public static final int TAPIERROR_ACCOUNTFEE_PARAMETER_QRY = 29431;
	public static final int TAPIERROR_ACCOUNTMARGIN_PARAMETER_QRY = 29432;
	public static final int TAPIERROR_TEMPLATEFEE_BATCH_MOD = 29433;
	public static final int TAPIERROR_TEMPLATEMARGIN_BATCH_MOD = 29434;
	public static final int TAPIERROR_FOREIGN_EXCHANGE_NEWRATE_QRY = 29441;
	public static final int TAPIERROR_FOREIGN_EXCHANGE_CURRATE_QRY = 29442;
	public static final int TAPIERROR_FOREIGN_EXCHANGE_RATE_MOD = 29443;
	public static final int TAPIERROR_FOREIGN_EXCHANGE_RATE_ADD = 29444;
	public static final int TAPIERROR_FOREIGN_EXCHANGE_RATE_DEL = 29445;
	public static final int TAPIERROR_MAIL_INFO_QRY = 29451;
	public static final int TAPIERROR_MAIL_INFO_ADD = 29452;
	public static final int TAPIERROR_MAIL_INFO_MOD = 29453;
	public static final int TAPIERROR_MAIL_INFO_DEL = 29454;
	public static final int TAPIERROR_FOREX_RATE_INFO_QRY = 29461;
	public static final int TAPIERROR_FOREX_RATE_INFO_ADD = 29462;
	public static final int TAPIERROR_FOREX_RATE_INFO_MOD = 29463;
	public static final int TAPIERROR_FOREX_RATE_INFO_DEL = 29464;
	public static final int TAPIERROR_FOREX_HOLIDAY_QRY = 29471;
	public static final int TAPIERROR_FOREX_HOLIDAY_ADD = 29472;
	public static final int TAPIERROR_FOREX_HOLIDAY_MOD = 29473;
	public static final int TAPIERROR_FOREX_HOLIDAY_DEL = 29474;
	public static final int TAPIERROR_ACCOUNT_RELATEINFO_QRY = 29481;
	public static final int TAPIERROR_ACCOUNT_RELATEINFO_ADD = 29482;
	public static final int TAPIERROR_ACCOUNT_RELATEINFO_MOD = 29483;
	public static final int TAPIERROR_ACCOUNT_RELATEINFO_DEL = 29484;
	public static final int TAPIERROR_HISORDER_QRY = 40001;
	public static final int TAPIERROR_HISORDER_ADD = 40002;
	public static final int TAPIERROR_HISORDER_MOD = 40003;
	public static final int TAPIERROR_HISORDER_DEL = 40004;
	public static final int TAPIERROR_ORDERFORTRADE_QRY = 40005;
	public static final int TAPIERROR_HISMATCH_QRY = 40101;
	public static final int TAPIERROR_HISMATCH_ADD = 40102;
	public static final int TAPIERROR_HISMATCH_MOD = 40103;
	public static final int TAPIERROR_HISMATCH_DEL = 40104;
	public static final int TAPIERROR_MATCHFORTRADE_QRY = 40105;
	public static final int TAPIERROR_HISPOSITION_QRY = 40201;
	public static final int TAPIERROR_HISPOSITION_ADD = 40202;
	public static final int TAPIERROR_HISPOSITION_MOD = 40203;
	public static final int TAPIERROR_HISPOSITION_DEL = 40204;
	public static final int TAPIERROR_POSITIONFORTRADE_QRY = 40205;
	public static final int TAPIERROR_LASTSETTLEDATE_QRY = 40206;
	public static final int TAPIERROR_HISCLOSE_QRY = 40301;
	public static final int TAPIERROR_HISUNEXPCLOSE_QRY = 40401;
	public static final int TAPIERROR_HISUNEXPCLOSE_ADD = 40402;
	public static final int TAPIERROR_HISUNEXPCLOSE_MOD = 40403;
	public static final int TAPIERROR_HISUNEXPCLOSE_DEL = 40404;
	public static final int TAPIERROR_HISDELIVERY_QRY = 40501;
	public static final int TAPIERROR_HISDELIVERY_ADD = 40502;
	public static final int TAPIERROR_HISDELIVERY_MOD = 40503;
	public static final int TAPIERROR_HISDELIVERY_DEL = 40504;
	public static final int TAPIERROR_SETTLEPRICE_QRY = 40601;
	public static final int TAPIERROR_SETTLEPRICE_ADD = 40602;
	public static final int TAPIERROR_SETTLEPRICE_MOD = 40603;
	public static final int TAPIERROR_SETTLEPRICE_DEL = 40604;
	public static final int TAPIERROR_VALIDCONTRACT_GEN = 40701;
	public static final int TAPIERROR_POSITIONMOVE_QRY = 40801;
	public static final int TAPIERROR_POSITIONMOVE_ADD = 40802;
	public static final int TAPIERROR_POSITIONMOVE_DEL = 40803;
	public static final int TAPIERROR_ACCOUNTCASHINOUT_QRY = 40901;
	public static final int TAPIERROR_ACCOUNTCASHINOUT_ADD = 40902;
	public static final int TAPIERROR_ACCOUNTCASHINOUTADD_NOTICE = 40903;
	public static final int TAPIERROR_ACCOUNTCASHADJUST_QRY = 41001;
	public static final int TAPIERROR_ACCOUNTCASHADJUST_ADD = 41002;
	public static final int TAPIERROR_ACCOUNTCASHADJUSTADD_NOTICE = 41003;
	public static final int TAPIERROR_ACCOUNTCASHSWAP_QRY = 41201;
	public static final int TAPIERROR_ACCOUNTCASHSWAP_ADD = 41202;
	public static final int TAPIERROR_ACCOUNTCASHSWAPADD_NOTICE = 41203;
	public static final int TAPIERROR_TRANSFERINFO_QRY = 41301;
	public static final int TAPIERROR_TRANSFERINFO_ADD = 41302;
	public static final int TAPIERROR_ATRANSFERINFOADD_NOTICE = 41303;
	public static final int TAPIERROR_SPANMARGIN_QRY = 41401;
	public static final int TAPIERROR_SPANMARGIN_ADD = 41402;
	public static final int TAPIERROR_SPANMARGIN_MOD = 41403;
	public static final int TAPIERROR_SPANMARGIN_DEL = 41404;
	public static final int TAPIERROR_ACCOUNTFUND_QRY = 41501;
	public static final int TAPIERROR_ACCOUNTFUNDFORTRADE_QRY = 41502;
	public static final int TAPIERROR_ACCOUNTFUND_ADD = 41503;
	public static final int TAPIERROR_ACCOUNTFUND_DEL = 41504;
	public static final int TAPIERROR_ACCOUNTFROZENFUND_QRY = 41601;
	public static final int TAPIERROR_ACCOUNTFROZENFUND_ADD = 41602;
	public static final int TAPIERROR_ACCOUNTFROZENADD_NOTICE = 41603;
	public static final int TAPIERROR_ACCOUNTFROZENFUND_MOD = 41604;
	public static final int TAPIERROR_ACCOUNTFROZENMOD_NOTICE = 41605;
	public static final int TAPIERROR_UPPERCASHINOUT_QRY = 41701;
	public static final int TAPIERROR_UPPERCASHINOUT_ADD = 41702;
	public static final int TAPIERROR_UPPERCASHINOUT_MOD = 41703;
	public static final int TAPIERROR_UPPERCASHINOUT_DEL = 41704;
	public static final int TAPIERROR_UPPERCASHADJUST_QRY = 41801;
	public static final int TAPIERROR_UPPERCASHADJUST_ADD = 41802;
	public static final int TAPIERROR_UPPERCASHADJUST_MOD = 41803;
	public static final int TAPIERROR_UPPERCASHADJUST_DEL = 41804;
	public static final int TAPIERROR_UPPERFUND_QRY = 41901;
	public static final int TAPIERROR_SETTLEDEAL_QRY = 42001;
	public static final int TAPIERROR_SETTLEPROCESS_QRY = 42101;
	public static final int TAPIERROR_SettleBatchNo_QRY = 42102;
	public static final int TAPIERROR_LOG_QRY = 42201;
	public static final int TAPIERROR_TRADEMESSAGE_SEND = 42301;
	public static final int TAPIERROR_TRADEMESSAGE_QRY = 42302;
	public static final int TAPIERROR_TRADEMESSAGE_NOTICE = 42303;
	public static final int TAPIERROR_QUOTEMESSAGE_SEND = 42401;
	public static final int TAPIERROR_QUOTEMESSAGE_QRY = 42402;
	public static final int TAPIERROR_QUOTEMESSAGE_NOTICE = 42403;
	public static final int TAPIERROR_TRADINGSTATISTICS_REQ = 42501;
	public static final int TAPIERROR_PCS_REQ = 42601;
	public static final int TAPIERROR_CGM_REQ = 42602;
	public static final int TAPIERROR_LARGETRADER_REQ = 42603;
	public static final int TAPIERROR_PCS_QRY_REQ = 42604;
	public static final int TAPIERROR_CGM_QRY_REQ = 42605;
	public static final int TAPIERROR_LARGETRADER_QRY_REQ = 42606;
	public static final int TAPIERROR_CME_MATCH_IMPORT_REQ = 42701;
	public static final int TAPIERROR_CME_MATCHT_QRY_REQ = 42702;
	public static final int TAPIERROR_CME_POSITION_IMPORT_REQ = 42703;
	public static final int TAPIERROR_CME_POSITION_QRY_REQ = 42704;
	public static final int TAPIERROR_CMEMATCH_DEL_REQ = 42705;
	public static final int TAPIERROR_CMEPOSITION_DEL_REQ = 42706;
	public static final int TAPIERROR_MQ_MATCH_ADD_REQ = 42801;
	public static final int TAPIERROR_MQ_MATCHT_QRY_REQ = 42802;
	public static final int TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_QRY_REQ = 42901;
	public static final int TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_ADD_REQ = 42902;
	public static final int TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_MOD_REQ = 42903;
	public static final int TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_DEL_REQ = 42904;
	public static final int TAPIERROR_CHECK_MATCH_REQ = 43001;
	public static final int TAPIERROR_CHECK_POSITION_REQ = 43002;
	public static final int TAPIERROR_DEAL_POSITION_REQ = 43101;
	public static final int TAPIERROR_POSITIONMORTGAGE_QRY_REQ = 43201;
	public static final int TAPIERROR_POSITIONMORTGAGE_ADD_REQ = 43202;
	public static final int TAPIERROR_POSITIONMORTGAGE_MOD_REQ = 43203;
	public static final int TAPIERROR_POSITIONMORTGAGE_DEL_REQ = 43204;
	public static final int TAPIERROR_DCEMARGINPREFERENT_QRY_REQ = 43301;
	public static final int TAPIERROR_DCEMARGINPREFERENT_ADD_REQ = 43302;
	public static final int TAPIERROR_DCEMARGINPREFERENT_MOD_REQ = 43303;
	public static final int TAPIERROR_DCEMARGINPREFERENT_DEL_REQ = 43304;
	public static final int TAPIERROR_ZCEAPPLYCMB_QRY_REQ = 43401;
	public static final int TAPIERROR_ZCEAPPLYCMB_ADD_REQ = 43402;
	public static final int TAPIERROR_ZCEAPPLYCMB_MOD_REQ = 43403;
	public static final int TAPIERROR_ZCEAPPLYCMB_DEL_REQ = 43404;
	public static final int TAPIERROR_MATCHREPORT_REQ = 43501;
	public static final int TAPIERROR_POSITIONREPORT_REQ = 43502;
	public static final int TAPIERROR_ACCOUNTAUTHCASH_ADD_REQ = 43601;
	public static final int TAPIERROR_ACCOUNTAUTHCASH_DEL_REQ = 43602;
	public static final int TAPIERROR_FOREIGNPOSITION_CHECK_REQ = 43701;
	public static final int TAPIERROR_ACCOUNTFUND_CHECK_REQ = 43702;
	public static final int TAPIERROR_UNEXPCLOSE_CHECK_REQ = 43703;
	public static final int TAPIERROR_OTHERFUND_QRY_REQ = 43801;
	public static final int TAPIERROR_OTHERFUND_ADD_REQ = 43802;
	public static final int TAPIERROR_OTHERFUND_MOD_REQ = 43803;
	public static final int TAPIERROR_OTHERFUND_DEL_REQ = 43804;
	public static final int TAPIERROR_ACCOUNTFUND_NOTICE_REQ = 43901;
	public static final int TAPIERROR_POSITIONMOVEBYACCOUNT_QRY_REQ = 44001;
	public static final int TAPIERROR_POSITIONMOVEBYACCOUNT_ADD_REQ = 44002;
	public static final int TAPIERROR_POSITIONMOVEBYACCOUNT_MOD_REQ = 44003;
	public static final int TAPIERROR_POSITIONMOVEBYACCOUNT_DEL_REQ = 44004;
	public static final int TAPIERROR_ADJUSTMATCH_REQ = 44101;
	public static final int TAPIERROR_SWAPREPORT_REQ = 44201;
	public static final int TAPIERROR_ADDFOURCEREPORT_REQ = 44301;
	public static final int TAPIERROR_ACCOUNTFUNDREPORT_REQ = 44401;
	public static final int TAPIERROR_DELIVERYALARMREPORT_REQ = 44501;
	public static final int TAPIERROR_OHCL_QRY_REQ = 446001;
	public static final int TAPIERROR_OHCL_ADD_REQ = 44602;
	public static final int TAPIERROR_OHCL_MOD_REQ = 44603;
	public static final int TAPIERROR_OHCL_DEL_REQ = 44604;
	public static final int TAPIERROR_TODELIVERY_QRY_REQ = 44701;
	public static final int TAPIERROR_TODELIVERY_ADD_REQ = 44702;
	public static final int TAPIERROR_TODELIVERY_MOD_REQ = 44703;
	public static final int TAPIERROR_TODELIVERY_DEL_REQ = 44704;
	public static final int TAPIERROR_ACCOUNTPLEDGE_QRY_REQ = 44801;
	public static final int TAPIERROR_ACCOUNTPLEDGE_ADD_REQ = 44802;
	public static final int TAPIERROR_SETTLESALE_QRY_REQ = 44901;
	public static final int TAPIERROR_SETTLESALE_ADD_REQ = 44902;
	public static final int TAPIERROR_SETTLESALE_DEL_REQ = 44903;
	public static final int TAPIERROR_ORDER_FREQUENCY = 61001;
	public static final int TAPIERROR_ORDER_QUERYING = 61002;
	public static final int TAPIERROR_1MINUTEBYCOUNT_QRY = 70101;
	public static final int TAPIERROR_1MINUTEBYPERIOD_QRY = 70102;
	public static final int TAPIERROR_1MINUTEBYDATE_QRY = 70103;
	public static final int TAPIERROR_3MINUTEBYCOUNT_QRY = 70201;
	public static final int TAPIERROR_3MINUTEBYPERIOD_QRY = 70202;
	public static final int TAPIERROR_3MINUTEBYDATE_QRY = 70203;
	public static final int TAPIERROR_5MINUTEBYCOUNT_QRY = 70301;
	public static final int TAPIERROR_5MINUTEBYPERIOD_QRY = 70302;
	public static final int TAPIERROR_5MINUTEBYDATE_QRY = 70303;
	public static final int TAPIERROR_10MINUTEBYCOUNT_QRY = 70401;
	public static final int TAPIERROR_10MINUTEBYPERIOD_QRY = 70402;
	public static final int TAPIERROR_10MINUTEBYDATE_QRY = 70403;
	public static final int TAPIERROR_15MINUTEBYCOUNT_QRY = 70501;
	public static final int TAPIERROR_15MINUTEBYPERIOD_QRY = 70502;
	public static final int TAPIERROR_15MINUTEBYDATE_QRY = 70503;
	public static final int TAPIERROR_30MINUTEBYCOUNT_QRY = 70601;
	public static final int TAPIERROR_30MINUTEBYPERIOD_QRY = 70602;
	public static final int TAPIERROR_30MINUTEBYDATE_QRY = 70603;
	public static final int TAPIERROR_60MINUTEBYCOUNT_QRY = 70701;
	public static final int TAPIERROR_60MINUTEBYPERIOD_QRY = 70702;
	public static final int TAPIERROR_60MINUTEBYDATE_QRY = 70703;
	public static final int TAPIERROR_120MINUTEBYCOUNT_QRY = 70801;
	public static final int TAPIERROR_120MINUTEBYPERIOD_QRY = 70802;
	public static final int TAPIERROR_120MINUTEBYDATE_QRY = 70803;
	public static final int TAPIERROR_240MINUTEBYCOUNT_QRY = 70901;
	public static final int TAPIERROR_240MINUTEBYPERIOD_QRY = 70902;
	public static final int TAPIERROR_240MINUTEBYDATE_QRY = 70903;
	public static final int TAPIERROR_30SECONDSBYCOUNT_QRY = 71001;
	public static final int TAPIERROR_30SECONDSBYPERIOD_QRY = 71002;
	public static final int TAPIERROR_30SECONDSBYDATE_QRY = 71003;
	public static final int TAPIERROR_TICKBYCOUNT_QRY = 71101;
	public static final int TAPIERROR_TICKBYPERIOD_QRY = 71102;
	public static final int TAPIERROR_TICKBYDATE_QRY = 71103;
	public static final int TAPIERROR_DAYBYCOUNT_QRY = 71201;
	public static final int TAPIERROR_DAYBYPERIOD_QRY = 71202;
	public static final int TAPIERROR_DAYBYDATE_QRY = 71203;
	public static final int TAPIERROR_WEEKBYCOUNT_QRY = 71301;
	public static final int TAPIERROR_WEEKBYPERIOD_QRY = 71302;
	public static final int TAPIERROR_WEEKBYDATE_QRY = 71303;
	public static final int TAPIERROR_MONTHBYCOUNT_QRY = 71401;
	public static final int TAPIERROR_MONTHBYPERIOD_QRY = 71402;
	public static final int TAPIERROR_MONTHBYDATE_QRY = 71403;
	public static final int TAPIERROR_YEARBYCOUNT_QRY = 71501;
	public static final int TAPIERROR_YEARBYPERIOD_QRY = 71502;
	public static final int TAPIERROR_YEARBYDATE_QRY = 71503;
	public static final int TAPIERROR_NMINUTESBYCOUNT_QRY = 71601;
	public static final int TAPIERROR_NMINUTESBYPERIOD_QRY = 71602;
	public static final int TAPIERROR_NMINUTESBYDATE_QRY = 71603;
	public static final int TAPIERROR_NDAYSBYCOUNT_QRY = 71701;
	public static final int TAPIERROR_NDAYSBYPERIOD_QRY = 71702;
	public static final int TAPIERROR_NDAYSBYDATE_QRY = 71703;
	public static final int TAPIERROR_NSECONDBYCOUNT_QRY = 71801;
	public static final int TAPIERROR_NSECONDSBYPERIOD_QRY = 71802;
	public static final int TAPIERROR_NSECONDSBYDATE_QRY = 71803;
	public static final int TAPIERROR_SUBSCRIBEQUOTE_MAX = 72001;
	public static final int TAPIERROR_SUBSCRIBEQUOTE_EXCHANGE_MAX = 72002;
	public static final int TAPIERROR_SUBSCRIBEQUOTE_NO_RIGHT = 72101;
	public static final int TAPIERROR_SUBSCRIBEQUOTE_NO_EXCHANGE_RIGHT = 72102;
	public static final int TAPIERROR_ORDER_SEND = 80001;
	public static final int TAPIERROR_DLG_NULL = 80002;
	public static final int TAPIERROR_ORDER_FIELD = 80003;
	public static final int TAPIERROR_TRADE_REJ_BYUPPER = 80004;
	public static final int TAPIERROR_TAPSERVER_CREATE = 81001;
	public static final int TAPIERROR_CONNECT_BUS = 81002;
	public static final int TAPIERROR_GWRCV_DATA = 81003;
	public static final int TAPIERROR_FRAME_FLAG = 81004;
	public static final int TAPIERROR_GWREC_DATA_PARTICAL = 81005;
	public static final int TAPIERROR_FRAMEHEAD_TYPE = 81006;
	public static final int TAPIERROR_MANAGESERVER_MATCH = 81007;
	public static final int TAPIERROR_QRY_INNERCOMM0DITY = 81008;
	public static final int TAPIERROR_CLIENTNO = 81009;
	public static final int TAPIERROR_QRY_UPPERCOMMODITY = 81010;
	public static final int TAPIERROR_QRY_MARKETSTATE = 81011;
	public static final int TAPIERROR_TRADEFRONT_TAPSERVER_CREATE = 82001;
	public static final int TAPIERROR_TRADEFRONT_CONNECT_BUS = 82002;
	public static final int TAPIERROR_TRADEFRONT_LINK_THREAD = 82003;
	public static final int TAPIERROR_TRADEFRONT_SUBLOGIN = 82004;
	public static final int TAPIERROR_TRADEFRONT_SUBLOGINQUERY = 82005;
	public static final int TAPIERROR_TRADEFRONT_SUBMANAGEBASIC = 82006;
	public static final int TAPIERROR_TRADEFRONT_SUBMANAGEADVANCED = 82007;
	public static final int TAPIERROR_TRADEFRONT_SUBSETTLE = 82008;
	public static final int TAPIERROR_TRADEFRONT_SUBSETTLEMESSAGE = 82009;
	public static final int TAPIERROR_TRADEFRONT_SUBSETTLEMONEY = 82010;
	public static final int TAPIERROR_TRADEFRONT_SUBTRADE = 82011;
	public static final int TAPIERROR_TRADEFRONT_SERVERSTART_IOCP = 82012;
	public static final int TAPIERROR_TRADEFRONT_SERVERSTART_WORKER = 82013;
	public static final int TAPIERROR_TRADEFRONT_SERVERSTART_LISTEN = 82014;
	public static final int TAPIERROR_TRADEFRONT_SERVERSTART_PORT = 82015;
	public static final int TAPIERROR_TRADEFRONT_MODULETYPEERR = 82016;
	public static final int TAPIERROR_TRADEFRONT_SENDDATAERR = 82017;
	public static final int TAPIERROR_TRADEFRONT_NOTALLOWLOGIN = 82018;
	public static final int TAPIERROR_TRADEFRONT_TOOMANYDATA = 82019;
	public static final int TAPIERROR_TRADEFRONT_NODATA = 82020;
	public static final int TAPIERROR_TRADEFRONT_DICONNECT_SMTRADE = 82021;
	public static final int TAPIERROR_TRADEFRONT_DICONNECT_TRADE = 82022;
	public static final int TAPIERROR_QUOTEFRONT_UNKNOWN_PROTOCOL = 83001;
	public static final int TAPIERROR_ACCOUNTNO_NOEXIT = 90001;
	public static final int TAPIERROR_BANKSINGED_NOTALLOW = 90002;
	public static final int TAPIERROR_BANKPASSWORDAUTH = 90003;
	public static final int TAPIERROR_BANKFUTUREVALUE_NOTEXIT = 90004;
	public static final int TAPIERROR_BANKFUTURETRANSFER_NOTENOUGH = 90005;
	public static final int TAPIERROR_BANKFUTURETRANSFER_MORE_SIGMAXVALUE = 90006;
	public static final int TAPIERROR_BANKFUTURETRANSFER_MORE_DAYMAXCOUNT = 90007;
	public static final int TAPIERROR_BANKFUTURETRANSFER_MORE_DAYMAXVALUE = 90008;
	public static final int TAPIERROR_FUTURE_FROZEN_FAIL = 90009;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCINFO = 90010;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCBANKINFO = 90011;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCFUNDINFO = 90012;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NORENTINFO = 90013;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NOCOUNTVALUEINFO = 90014;
	public static final int TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCCERTINFO = 90015;
	public static final int TAPIERROR_BANKWAY_STOP = 90016;
	public static final int TAPIERROR_TRANSFERINFO_LOST = 90017;
	public static final int TAPIERROR_BANK_NOTALLOWTRANSFER = 90018;
	public static final int TAPIERROR_CASHIN_NOREVERSE = 90019;
	public static final int TAPIERROR_RISKCOMMODITY_QRY = 91001;
	public static final int TAPIERROR_RISKCONTRACT_FUND = 91002;
	public static final int TAPIERROR_RISKFUND_QRY = 91003;
	public static final int TAPIERROR_CONTRACTQUOTE_ADD = 91004;

	public static String code2Name(int arg) {
		switch (arg) {
			case -13001 :
				return "TAPIERROR_INPUTERROR_QryHisQuoteParam";
			case -12045 :
				return "TAPIERROR_INPUTERROR_TAPIOrderQryTypeType";
			case -12044 :
				return "TAPIERROR_INPUTERROR_TAPIMarketLevelType";
			case -12043 :
				return "TAPIERROR_INPUTERROR_TAPITradingStateType";
			case -12042 :
				return "TAPIERROR_INPUTERROR_TAPITriggerPriceTypeType";
			case -12041 :
				return "TAPIERROR_INPUTERROR_TAPITriggerConditionType";
			case -12040 :
				return "TAPIERROR_INPUTERROR_TAPICashAdjustTypeType";
			case -12039 :
				return "TAPIERROR_INPUTERROR_TAPIOFFFlagType";
			case -12038 :
				return "TAPIERROR_INPUTERROR_TAPIBillFileTypeType";
			case -12037 :
				return "TAPIERROR_INPUTERROR_TAPIBillTypeType";
			case -12036 :
				return "TAPIERROR_INPUTERROR_TAPIORDERACT";
			case -12035 :
				return "TAPIERROR_INPUTERROR_TAPITacticsTypeType";
			case -12034 :
				return "TAPIERROR_INPUTERROR_TAPITransferDeviceIDType";
			case -12033 :
				return "TAPIERROR_INPUTERROR_TAPITransferTypeType";
			case -12032 :
				return "TAPIERROR_INPUTERROR_TAPITransferStateType";
			case -12031 :
				return "TAPIERROR_INPUTERROR_TAPITransferDirectType";
			case -12030 :
				return "TAPIERROR_INPUTERROR_TAPIMsgLevelType";
			case -12029 :
				return "TAPIERROR_INPUTERROR_TAPIMsgTypeType";
			case -12028 :
				return "TAPIERROR_INPUTERROR_TAPIMsgReceiverType";
			case -12027 :
				return "TAPIERROR_INPUTERROR_TAPIPartyCertificateTypeType";
			case -12026 :
				return "TAPIERROR_INPUTERROR_TAPIPartyTypeType";
			case -12025 :
				return "TAPIERROR_INPUTERROR_TAPIContractTypeType";
			case -12024 :
				return "TAPIERROR_INPUTERROR_TAPIDeliveryModeType";
			case -12023 :
				return "TAPIERROR_INPUTERROR_TAPICmbDirectType";
			case -12022 :
				return "TAPIERROR_INPUTERROR_TAPIOptionMarginCalculateModeType";
			case -12021 :
				return "TAPIERROR_INPUTERROR_TAPIMarginCalculateModeType";
			case -12020 :
				return "TAPIERROR_INPUTERROR_TAPIBankAccountTransferStateType";
			case -12019 :
				return "TAPIERROR_INPUTERROR_TAPIBankAccountSwapStateType";
			case -12018 :
				return "TAPIERROR_INPUTERROR_TAPIBankAccountStateType";
			case -12017 :
				return "TAPIERROR_INPUTERROR_TAPIBankAccountLWFlagType";
			case -12016 :
				return "TAPIERROR_INPUTERROR_TAPIOptionAlgType";
			case -12015 :
				return "TAPIERROR_INPUTERROR_TAPIFutureAlgType";
			case -12014 :
				return "TAPIERROR_INPUTERROR_TAPIOpenCloseModeType";
			case -12013 :
				return "TAPIERROR_INPUTERROR_TAPIMatchSourceType";
			case -12012 :
				return "TAPIERROR_INPUTERROR_TAPICalculateModeType";
			case -12011 :
				return "TAPIERROR_INPUTERROR_TAPIOrderStateType";
			case -12010 :
				return "TAPIERROR_INPUTERROR_TAPIHedgeFlagType";
			case -12009 :
				return "TAPIERROR_INPUTERROR_TAPIPositionEffectType";
			case -12008 :
				return "TAPIERROR_INPUTERROR_TAPISideType";
			case -12007 :
				return "TAPIERROR_INPUTERROR_TAPITimeInForceType";
			case -12006 :
				return "TAPIERROR_INPUTERROR_TAPIOrderSourceType";
			case -12005 :
				return "TAPIERROR_INPUTERROR_TAPIOrderTypeType";
			case -12004 :
				return "TAPIERROR_INPUTERROR_TAPIAccountFamilyType";
			case -12003 :
				return "TAPIERROR_INPUTERROR_TAPIAccountState";
			case -12002 :
				return "TAPIERROR_INPUTERROR_TAPIUserTypeType";
			case -12001 :
				return "TAPIERROR_INPUTERROR_TAPIAccountType";
			case -11002 :
				return "TAPIERROR_INPUTERROR_TAPIHisQuoteType";
			case -11001 :
				return "TAPIERROR_INPUTERROR_TAPIBucketDateFlag";
			case -10004 :
				return "TAPIERROR_INPUTERROR_TAPICallOrPutFlagType";
			case -10003 :
				return "TAPIERROR_INPUTERROR_TAPICommodityType";
			case -10002 :
				return "TAPIERROR_INPUTERROR_TAPILOGLEVEL";
			case -10001 :
				return "TAPIERROR_INPUTERROR_TAPIYNFLAG";
			case -10000 :
				return "TAPIERROR_INPUTERROR_NULL";
			case -21 :
				return "TAPIERROR_CallOneTimeOnly";
			case -20 :
				return "TAPIERROR_NotImplemented";
			case -19 :
				return "TAPIERROR_UDP_LISTENING";
			case -18 :
				return "TAPIERROR_UDP_LISTEN_FAILED";
			case -17 :
				return "TAPIERROR_API_NotReady";
			case -16 :
				return "TAPIERROR_AuthCode_TypeNotMatch";
			case -15 :
				return "TAPIERROR_AuthCode_Expired";
			case -14 :
				return "TAPIERROR_AuthCode_Invalid";
			case -13 :
				return "TAPIERROR_InputValueError";
			case -12 :
				return "TAPIERROR_LastReqNotFinish";
			case -11 :
				return "TAPIERROR_InnerError";
			case -10 :
				return "TAPIERROR_RepeatLogin";
			case -9 :
				return "TAPIERROR_DataPathAvaiable";
			case -8 :
				return "TAPIERROR_NOFrontAvailable";
			case -7 :
				return "TAPIERROR_CurTestNotOver";
			case -6 :
				return "TAPIERROR_NotReadyTestNetwork";
			case -5 :
				return "TAPIERROR_TestIDError";
			case -4 :
				return "TAPIERROR_SendDataError";
			case -3 :
				return "TAPIERROR_HostUnavailable";
			case -2 :
				return "TAPIERROR_LinkAuthFail";
			case -1 :
				return "TAPIERROR_ConnectFail";
			case 0 :
				return "TAPIERROR_SUCCEED";
			case 1 :
				return "TAPIERROR_DISCONNECT_CLOSE_INIT";
			case 2 :
				return "TAPIERROR_DISCONNECT_CLOSE_PASS";
			case 3 :
				return "TAPIERROR_DISCONNECT_READ_ERROR";
			case 4 :
				return "TAPIERROR_DISCONNECT_WRITE_ERROR";
			case 5 :
				return "TAPIERROR_DISCONNECT_BUF_FULL";
			case 6 :
				return "TAPIERROR_DISCONNECT_IOCP_ERROR";
			case 7 :
				return "TAPIERROR_DISCONNECT_PARSE_ERROR";
			case 8 :
				return "TAPIERROR_DISCONNECT_CONNECT_TIMEOUT";
			case 9 :
				return "TAPIERROR_DISCONNECT_INIT_ERROR";
			case 10 :
				return "TAPIERROR_DISCONNECT_HAS_CONNECTED";
			case 11 :
				return "TAPIERROR_DISCONNECT_HAS_EXIT";
			case 12 :
				return "TAPIERROR_DISCONNECT_TRY_LATER";
			case 10001 :
				return "TAPIERROR_LOGIN";
			case 10002 :
				return "TAPIERROR_LOGIN_USER";
			case 10003 :
				return "TAPIERROR_LOGIN_DDA";
			case 10004 :
				return "TAPIERROR_LOGIN_LICENSE";
			case 10005 :
				return "TAPIERROR_LOGIN_MODULE";
			case 10006 :
				return "TAPIERROR_LOGIN_FORCE";
			case 10007 :
				return "TAPIERROR_LOGIN_STATE";
			case 10008 :
				return "TAPIERROR_LOGIN_PASS";
			case 10009 :
				return "TAPIERROR_LOGIN_RIGHT";
			case 10010 :
				return "TAPIERROR_LOGIN_COUNT";
			case 10011 :
				return "TAPIERROR_LOGIN_NOTIN_SERVERFLAGUSRES";
			case 10101 :
				return "TAPIERROR_USERINFO_QRY";
			case 10102 :
				return "TAPIERROR_USERINFO_ADD";
			case 10103 :
				return "TAPIERROR_USERINFO_MOD";
			case 10104 :
				return "TAPIERROR_USERINFO_DEL";
			case 10105 :
				return "TAPIERROR_ACCOUNTNO_IN_USERINFO_DEL";
			case 10201 :
				return "TAPIERROR_USERSTATE_QRY";
			case 10202 :
				return "TAPIERROR_USERSTATE_ADD";
			case 10203 :
				return "TAPIERROR_USERSTATE_MOD";
			case 10204 :
				return "TAPIERROR_USERSTATE_DEL";
			case 10301 :
				return "TAPIERROR_LICENSEINFO_QRY";
			case 10302 :
				return "TAPIERROR_LICENSEINFO_ADD";
			case 10303 :
				return "TAPIERROR_LICENSEINFO_MOD";
			case 10304 :
				return "TAPIERROR_LICENSEINFO_DEL";
			case 10305 :
				return "TAPIERROR_LICENSEINFO_IN_USERLICENSE_DEL";
			case 10401 :
				return "TAPIERROR_USERLICENSE_QRY";
			case 10402 :
				return "TAPIERROR_USERLICENSE_ADD";
			case 10403 :
				return "TAPIERROR_USERLICENSE_DEL";
			case 10501 :
				return "TAPIERROR_RIGHTINFO_QRY";
			case 10601 :
				return "TAPIERROR_ROLEINFO_QRY";
			case 10602 :
				return "TAPIERROR_ROLEINFO_ADD";
			case 10603 :
				return "TAPIERROR_ROLEINFO_MOD";
			case 10604 :
				return "TAPIERROR_ROLEINFO_DEL";
			case 10605 :
				return "TAPIERROR_ROLENO_IN_USERROLE_DEL";
			case 10701 :
				return "TAPIERROR_ROLERIGHT_QRY";
			case 10702 :
				return "TAPIERROR_ROLERIGHT_ADD";
			case 10703 :
				return "TAPIERROR_ROLERIGHT_DEL";
			case 10801 :
				return "TAPIERROR_USERROLE_QRY";
			case 10802 :
				return "TAPIERROR_USERROLE_ADD";
			case 10803 :
				return "TAPIERROR_USERROLE_DEL";
			case 10901 :
				return "TAPIERROR_USERRIGHT_QRY";
			case 10902 :
				return "TAPIERROR_USERRIGHT_ADD";
			case 10903 :
				return "TAPIERROR_USERRIGHT_DEL";
			case 11001 :
				return "TAPIERROR_USERALLRIGHT_QRY";
			case 11002 :
				return "TAPIERROR_USERALLRIGHT_ADD_NOTICE";
			case 11003 :
				return "TAPIERROR_USERALLRIGHT_DEL_NOTICE";
			case 11101 :
				return "TAPIERROR_ACCOUNTGROUPINFO_QRY";
			case 11102 :
				return "TAPIERROR_ACCOUNTGROUPINFO_ADD";
			case 11103 :
				return "TAPIERROR_ACCOUNTGROUPINFO_MOD";
			case 11104 :
				return "TAPIERROR_ACCOUNTGROUPINFO_DEL";
			case 11201 :
				return "TAPIERROR_GROUPACCOUNT_QRY";
			case 11202 :
				return "TAPIERROR_GROUPACCOUNT_ADD";
			case 11203 :
				return "TAPIERROR_GROUPACCOUNT_DEL";
			case 11204 :
				return "TAPIERROR_GROUPACCOUNT_ONETOONE";
			case 11301 :
				return "TAPIERROR_USERGROUP_QRY";
			case 11302 :
				return "TAPIERROR_USERGROUP_ADD";
			case 11303 :
				return "TAPIERROR_USERGROUP_DEL";
			case 11401 :
				return "TAPIERROR_USERACCOUNT_QRY";
			case 11402 :
				return "TAPIERROR_USERACCOUNT_ADD";
			case 11403 :
				return "TAPIERROR_USERACCOUNT_DEL";
			case 11501 :
				return "TAPIERROR_USERALLACCOUNT_QRY";
			case 11502 :
				return "TAPIERROR_USERALLACCOUNT_ADD_NOTICE";
			case 11503 :
				return "TAPIERROR_USERALLACCOUNT_DEL_NOTICE";
			case 11601 :
				return "TAPIERROR_PASSWORDTYPEINFO_QRY";
			case 11602 :
				return "TAPIERROR_PASSWORDTYPEINFO_MOD";
			case 11701 :
				return "TAPIERROR_USERPASSWORD_MOD";
			case 11702 :
				return "TAPIERROR_USERPASSWORD_MOD_SOURCE";
			case 11703 :
				return "TAPIERROR_USERPASSWORD_MOD_SAME";
			case 11704 :
				return "TAPIERROR_USERPASSWORD_MOD_COMPLEXITY";
			case 11801 :
				return "TAPIERROR_LINKINFO_QRY";
			case 11802 :
				return "TAPIERROR_LINKDETAILINFO_QRY";
			case 11803 :
				return "TAPIERROR_LINKINFO_DEL";
			case 11901 :
				return "TAPIERROR_USERRESERVEDINFO_MOD";
			case 12001 :
				return "TAPIERROR_SERVERFLAGUSERS_QRY";
			case 12002 :
				return "TAPIERROR_SERVERFLAGUSERS_ADD";
			case 12003 :
				return "TAPIERROR_SERVERFLAGUSERS_DEL";
			case 12011 :
				return "TAPIERROR_GROUPPROPERTYINFO_QRY";
			case 12012 :
				return "TAPIERROR_GROUPPROPERTYINFO_ADD";
			case 12013 :
				return "TAPIERROR_GROUPPROPERTYINFO_MOD";
			case 12014 :
				return "TAPIERROR_GROUPPROPERTYINFO_DEL";
			case 12021 :
				return "TAPIERROR_INTERFUTUREBANKPASSWORDAUTH_REQ";
			case 12031 :
				return "TAPIERROR_ACCOUNTPASSWORD_MOD";
			case 12032 :
				return "TAPIERROR_ACCOUNTPASSWORDUSER_MOD";
			case 12033 :
				return "TAPIERROR_ACCOUNTPASSWORD_ERROR";
			case 20101 :
				return "TAPIERROR_CURRENCYINFO_QRY";
			case 20102 :
				return "TAPIERROR_TCURRENCYINFO_QRY";
			case 20103 :
				return "TAPIERROR_CURRENCYINFO_ADD";
			case 20104 :
				return "TAPIERROR_CURRENCYINFO_DEL";
			case 20105 :
				return "TAPIERROR_CURRENCYINFO_MOD";
			case 20106 :
				return "TAPIERROR_CURRENCYINFO_CASCADE_DEL";
			case 20107 :
				return "TAPIERROR_CURRENCYCHANGE_INFO_QRY";
			case 20201 :
				return "TAPIERROR_ACCOUNTINFO_QRY";
			case 20202 :
				return "TAPIERROR_ACCOUNTSUMMARY_QRY";
			case 20203 :
				return "TAPIERROR_ACCOUNTINFO_ADD";
			case 20204 :
				return "TAPIERROR_ACCOUNTINFO_DEL";
			case 20205 :
				return "TAPIERROR_ACCOUNTINFO_MOD";
			case 20206 :
				return "TAPIERROR_ALLACCOUNTINFO_QRY";
			case 20301 :
				return "TAPIERROR_ORGINFO_QRY";
			case 20302 :
				return "TAPIERROR_ORGINFO_ADD";
			case 20303 :
				return "TAPIERROR_ORGINFO_DEL";
			case 20304 :
				return "TAPIERROR_ORGINFO_MOD";
			case 20401 :
				return "TAPIERROR_ACCOUNTCERTIFICATE_QRY";
			case 20402 :
				return "TAPIERROR_ACCOUNTCERTIFICATE_ADD";
			case 20403 :
				return "TAPIERROR_ACCOUNTCERTIFICATE_DEL";
			case 20404 :
				return "TAPIERROR_ACCOUNTCERTIFICATE_MOD";
			case 20501 :
				return "TAPIERROR_PARENTACCOUNT_QRY";
			case 20502 :
				return "TAPIERROR_TPARENTACCOUNT_QRY";
			case 20503 :
				return "TAPIERROR_PARENTACCOUNT_ADD";
			case 20504 :
				return "TAPIERROR_PARENTACCOUNT_DEL";
			case 20505 :
				return "TAPIERROR_PARENTACCOUNT_MOD";
			case 20601 :
				return "TAPIERROR_EXCHANGEINFO_QRY";
			case 20602 :
				return "TAPIERROR_EXCHANGEINFO_ADD";
			case 20603 :
				return "TAPIERROR_EXCHANGEINFO_DEL";
			case 20604 :
				return "TAPIERROR_EXCHANGEINFO_MOD";
			case 20701 :
				return "TAPIERROR_TRADENO_QRY";
			case 20702 :
				return "TAPIERROR_TRADENO_ADD";
			case 20703 :
				return "TAPIERROR_TRADENO_DEL";
			case 20704 :
				return "TAPIERROR_TRADENO_MOD";
			case 20705 :
				return "TAPIERROR_TRADENO_EXIT";
			case 20801 :
				return "TAPIERROR_ACCOUNTBANKINFO_QRY";
			case 20802 :
				return "TAPIERROR_ACCOUNTBANKINFO_ADD";
			case 20803 :
				return "TAPIERROR_ACCOUNTBANKINFO_DEL";
			case 20804 :
				return "TAPIERROR_ACCOUNTBANKINFO_MOD";
			case 20901 :
				return "TAPIERROR_PARTYINFO_QRY";
			case 20902 :
				return "TAPIERROR_PARTYINFO_ADD";
			case 20903 :
				return "TAPIERROR_PARTYINFO_DEL";
			case 20904 :
				return "TAPIERROR_PARTYINFO_MOD";
			case 21001 :
				return "TAPIERROR_ATTRIBUTEINFO_QRY";
			case 21002 :
				return "TAPIERROR_ATTRIBUTEINFO_ADD";
			case 21003 :
				return "TAPIERROR_ATTRIBUTEINFO_DEL";
			case 21004 :
				return "TAPIERROR_ATTRIBUTEINFO_MOD";
			case 21101 :
				return "TAPIERROR_ACCOUNTATTRIBUTE_QRY";
			case 21102 :
				return "TAPIERROR_ACCOUNTATTRIBUTE_ADD";
			case 21103 :
				return "TAPIERROR_ACCOUNTATTRIBUTE_MOD";
			case 21201 :
				return "TAPIERROR_UPPERINFO_QRY";
			case 21202 :
				return "TAPIERROR_UPPERINFO_ADD";
			case 21203 :
				return "TAPIERROR_UPPERINFO_DEL";
			case 21204 :
				return "TAPIERROR_UPPERINFO_MOD";
			case 21205 :
				return "TAPIERROR_UPPERINFO_CASCADE_DEL";
			case 21301 :
				return "TAPIERROR_UPPERBANKINFO_QRY";
			case 21302 :
				return "TAPIERROR_UPPERBANKINFO_ADD";
			case 21303 :
				return "TAPIERROR_UPPERBANKINFO_DEL";
			case 21304 :
				return "TAPIERROR_UPPERBANKINFO_MOD";
			case 21305 :
				return "TAPIERROR_UPPERBANKINFO_CASCADE_DEL";
			case 21401 :
				return "TAPIERROR_UPPERCHANNEL_QRY";
			case 21402 :
				return "TAPIERROR_UPPERCHANNEL_ADD";
			case 21403 :
				return "TAPIERROR_UPPERCHANNEL_DEL";
			case 21404 :
				return "TAPIERROR_UPPERCHANNEL_MOD";
			case 21405 :
				return "TAPIERROR_UPPERCHANNEL_CASCADE_DEL";
			case 21501 :
				return "TAPIERROR_CURRENCYGROUP_QRY";
			case 21502 :
				return "TAPIERROR_CURRENCYGROUP_ADD";
			case 21503 :
				return "TAPIERROR_CURRENCYGROUP_DEL";
			case 21504 :
				return "TAPIERROR_CURRENCYGROUP_MOD";
			case 21505 :
				return "TAPIERROR_CURRENCYGROUP_CASCADE_DEL";
			case 21601 :
				return "TAPIERROR_BANKINFO_QRY";
			case 21602 :
				return "TAPIERROR_BANKINFO_ADD";
			case 21603 :
				return "TAPIERROR_BANKINFO_DEL";
			case 21604 :
				return "TAPIERROR_BANKINFO_MOD";
			case 21605 :
				return "TAPIERROR_BANKINFO_CASCADE_DEL";
			case 21701 :
				return "TAPIERROR_INTERNALBANK_QRY";
			case 21702 :
				return "TAPIERROR_INTERNALBANK_ADD";
			case 21703 :
				return "TAPIERROR_INTERNALBANK_DEL";
			case 21704 :
				return "TAPIERROR_INTERNALBANK_MOD";
			case 21801 :
				return "TAPIERROR_SWAPRATE_QRY";
			case 21802 :
				return "TAPIERROR_SWAPRATE_ADD";
			case 21803 :
				return "TAPIERROR_SWAPRATE_DEL";
			case 21804 :
				return "TAPIERROR_SWAPRATE_MOD";
			case 21901 :
				return "TAPIERROR_ACCOUNTSWAPVALUE_QRY";
			case 21902 :
				return "TAPIERROR_ACCOUNTSWAPVALUE_ADD";
			case 21903 :
				return "TAPIERROR_ACCOUNTSWAPVALUE_DEL";
			case 21904 :
				return "TAPIERROR_ACCOUNTSWAPVALUE_MOD";
			case 22001 :
				return "TAPIERROR_COMMODITYINFO_QRY";
			case 22002 :
				return "TAPIERROR_TCOMMODITYINFO_QRY";
			case 22003 :
				return "TAPIERROR_COMMODITYINFO_ADD";
			case 22004 :
				return "TAPIERROR_COMMODITYINFO_DEL";
			case 22005 :
				return "TAPIERROR_COMMODITYINFO_MOD";
			case 22101 :
				return "TAPIERROR_COMMODITYSECTOR_QRY";
			case 22102 :
				return "TAPIERROR_COMMODITYSECTOR_ADD";
			case 22103 :
				return "TAPIERROR_COMMODITYSECTOR_DEL";
			case 22104 :
				return "TAPIERROR_COMMODITYSECTOR_MOD";
			case 22105 :
				return "TAPIERROR_COMMODITYSECTOR_CASCADE_DEL";
			case 22106 :
				return "TAPIERROR_COMMODITYSECTOR_CHILD_DEL";
			case 22201 :
				return "TAPIERROR_SECTORMAPCOMMODITY_QRY";
			case 22202 :
				return "TAPIERROR_SECTORMAPCOMMODITY_ADD";
			case 22203 :
				return "TAPIERROR_SECTORMAPCOMMODITY_DEL";
			case 22204 :
				return "TAPIERROR_SECTORMAPCOMMODITY_MOD";
			case 22301 :
				return "TAPIERROR_COMMODITYGROUP_QRY";
			case 22302 :
				return "TAPIERROR_COMMODITYGROUP_ADD";
			case 22303 :
				return "TAPIERROR_COMMODITYGROUP_DEL";
			case 22304 :
				return "TAPIERROR_COMMODITYGROUP_MOD";
			case 22305 :
				return "TAPIERROR_COMMODITYGROUP_CASCADE_DEL";
			case 22401 :
				return "TAPIERROR_GROUPMAPCOMMODITY_QRY";
			case 22402 :
				return "TAPIERROR_GROUPMAPCOMMODITY_ADD";
			case 22403 :
				return "TAPIERROR_GROUPMAPCOMMODITY_DEL";
			case 22404 :
				return "TAPIERROR_GROUPMAPCOMMODITY_MOD";
			case 22501 :
				return "TAPIERROR_TRADINGTIMEBUCKET_QRY";
			case 22502 :
				return "TAPIERROR_TRADINGTIMEBUCKET_ADD";
			case 22503 :
				return "TAPIERROR_TRADINGTIMEBUCKET_DEL";
			case 22504 :
				return "TAPIERROR_TRADINGTIMEBUCKET_MOD";
			case 22601 :
				return "TAPIERROR_COMMODITYQUOTEINFO_QRY";
			case 22602 :
				return "TAPIERROR_COMMODITYQUOTEINFO_ADD";
			case 22603 :
				return "TAPIERROR_COMMODITYQUOTEINFO_DEL";
			case 22604 :
				return "TAPIERROR_COMMODITYQUOTEINFO_MOD";
			case 22701 :
				return "TAPIERROR_COMMODITYRELATEINFO_QRY";
			case 22702 :
				return "TAPIERROR_COMMODITYRELATEINFO_ADD";
			case 22703 :
				return "TAPIERROR_COMMODITYRELATEINFO_DEL";
			case 22704 :
				return "TAPIERROR_COMMODITYRELATEINFO_MOD";
			case 22801 :
				return "TAPIERROR_CONTRACTINFO_QRY";
			case 22802 :
				return "TAPIERROR_CONTRACTINFO_ADD";
			case 22803 :
				return "TAPIERROR_CONTRACTINFO_DEL";
			case 22804 :
				return "TAPIERROR_CONTRACTINFO_MOD";
			case 22805 :
				return "TAPIERROR_CONTRACTINFO_CASCADE_DEL";
			case 22901 :
				return "TAPIERROR_SPECIALOPTIONFUTURE_QRY";
			case 22902 :
				return "TAPIERROR_SPECIALOPTIONFUTURE_ADD";
			case 22903 :
				return "TAPIERROR_SPECIALOPTIONFUTURE_DEL";
			case 22904 :
				return "TAPIERROR_SPECIALOPTIONFUTURE_MOD";
			case 23001 :
				return "TAPIERROR_UPPERCOMMODITYMAPPING_QRY";
			case 23002 :
				return "TAPIERROR_UPPERCOMMODITYMAPPING_ADD";
			case 23003 :
				return "TAPIERROR_UPPERCOMMODITYMAPPING_DEL";
			case 23004 :
				return "TAPIERROR_UPPERCOMMODITYMAPPING_MOD";
			case 23101 :
				return "TAPIERROR_OUTSIDECOMMODITYMAPPING_QRY";
			case 23102 :
				return "TAPIERROR_OUTSIDECOMMODITYMAPPING_ADD";
			case 23103 :
				return "TAPIERROR_OUTSIDECOMMODITYMAPPING_DEL";
			case 23104 :
				return "TAPIERROR_OUTSIDECOMMODITYMAPPING_MOD";
			case 23201 :
				return "TAPIERROR_OUTSIDEDATASOURCE_QRY";
			case 23202 :
				return "TAPIERROR_OUTSIDEDATASOURCE_ADD";
			case 23203 :
				return "TAPIERROR_OUTSIDEDATASOURCE_DEL";
			case 23204 :
				return "TAPIERROR_OUTSIDEDATASOURCE_MOD";
			case 23301 :
				return "TAPIERROR_UPPERFEE_QRY";
			case 23302 :
				return "TAPIERROR_UPPERFEE_ADD";
			case 23303 :
				return "TAPIERROR_UPPERFEE_DEL";
			case 23304 :
				return "TAPIERROR_UPPERFEE_MOD";
			case 23401 :
				return "TAPIERROR_TEMPLATEFEE_QRY";
			case 23402 :
				return "TAPIERROR_TEMPLATEFEE_ADD";
			case 23403 :
				return "TAPIERROR_TEMPLATEFEE_DEL";
			case 23404 :
				return "TAPIERROR_TEMPLATEFEE_MOD";
			case 23501 :
				return "TAPIERROR_ACCOUNTFEETEMPLATE_QRY";
			case 23502 :
				return "TAPIERROR_ACCOUNTFEETEMPLATE_ADD";
			case 23503 :
				return "TAPIERROR_ACCOUNTFEETEMPLATE_DEL";
			case 23504 :
				return "TAPIERROR_ACCOUNTFEETEMPLATE_MOD";
			case 23601 :
				return "TAPIERROR_UPPEROTHERFEE_QRY";
			case 23602 :
				return "TAPIERROR_UPPEROTHERFEE_ADD";
			case 23603 :
				return "TAPIERROR_UPPEROTHERFEE_DEL";
			case 23604 :
				return "TAPIERROR_UPPEROTHERFEE_MOD";
			case 23701 :
				return "TAPIERROR_ACCOUNTOTHERFEE_QRY";
			case 23702 :
				return "TAPIERROR_ACCOUNTOTHERFEE_ADD";
			case 23703 :
				return "TAPIERROR_ACCOUNTOTHERFEE_DEL";
			case 23704 :
				return "TAPIERROR_ACCOUNTOTHERFEE_MOD";
			case 23801 :
				return "TAPIERROR_UPPERMARGIN_QRY";
			case 23802 :
				return "TAPIERROR_UPPERMARGIN_ADD";
			case 23803 :
				return "TAPIERROR_UPPERMARGIN_DEL";
			case 23804 :
				return "TAPIERROR_UPPERMARGIN_MOD";
			case 23901 :
				return "TAPIERROR_UPPERMARGINADJUST_QRY";
			case 23902 :
				return "TAPIERROR_UPPERMARGINADJUST_ADD";
			case 23903 :
				return "TAPIERROR_UPPERMARGINADJUST_DEL";
			case 23904 :
				return "TAPIERROR_UPPERMARGINADJUST_MOD";
			case 24001 :
				return "TAPIERROR_TEMPLATEMARGIN_QRY";
			case 24002 :
				return "TAPIERROR_TEMPLATEMARGIN_ADD";
			case 24003 :
				return "TAPIERROR_TEMPLATEMARGIN_DEL";
			case 24004 :
				return "TAPIERROR_TEMPLATEMARGIN_MOD";
			case 24101 :
				return "TAPIERROR_ACCOUNTMARGINTEMPLATE_QRY";
			case 24102 :
				return "TAPIERROR_ACCOUNTMARGINTEMPLATE_ADD";
			case 24103 :
				return "TAPIERROR_ACCOUNTMARGINTEMPLATE_DEL";
			case 24104 :
				return "TAPIERROR_ACCOUNTMARGINTEMPLATE_MOD";
			case 24201 :
				return "TAPIERROR_TEMPLATEMARGINADJUST_QRY";
			case 24202 :
				return "TAPIERROR_TEMPLATEMARGINADJUST_ADD";
			case 24203 :
				return "TAPIERROR_TEMPLATEMARGINADJUST_DEL";
			case 24204 :
				return "TAPIERROR_TEMPLATEMARGINADJUST_MOD";
			case 24301 :
				return "TAPIERROR_LOCKEDPERCENTAGE_QRY";
			case 24302 :
				return "TAPIERROR_LOCKEDPERCENTAGE_ADD";
			case 24303 :
				return "TAPIERROR_LOCKEDPERCENTAGE_DEL";
			case 24304 :
				return "TAPIERROR_LOCKEDPERCENTAGE_MOD";
			case 24401 :
				return "TAPIERROR_TRADINGRIGHT_QRY";
			case 24402 :
				return "TAPIERROR_TRADINGRIGHT_ADD";
			case 24403 :
				return "TAPIERROR_TRADINGRIGHT_DEL";
			case 24404 :
				return "TAPIERROR_TRADINGRIGHT_MOD";
			case 24501 :
				return "TAPIERROR_ONCEMAX_QRY";
			case 24502 :
				return "TAPIERROR_ONCEMAX_ADD";
			case 24503 :
				return "TAPIERROR_ONCEMAX_DEL";
			case 24504 :
				return "TAPIERROR_ONCEMAX_MOD";
			case 24601 :
				return "TAPIERROR_POSITIONMAX_QRY";
			case 24602 :
				return "TAPIERROR_POSITIONMAX_ADD";
			case 24603 :
				return "TAPIERROR_POSITIONMAX_DEL";
			case 24604 :
				return "TAPIERROR_POSITIONMAX_MOD";
			case 24701 :
				return "TAPIERROR_TRADINGROUTE_QRY";
			case 24702 :
				return "TAPIERROR_TRADINGROUTE_ADD";
			case 24703 :
				return "TAPIERROR_TRADINGROUTE_DEL";
			case 24704 :
				return "TAPIERROR_TRADINGROUTE_MOD";
			case 24801 :
				return "TAPIERROR_QUOTEROUTE_QRY";
			case 24802 :
				return "TAPIERROR_QUOTEROUTE_ADD";
			case 24803 :
				return "TAPIERROR_QUOTEROUTE_DEL";
			case 24804 :
				return "TAPIERROR_QUOTEROUTE_MOD";
			case 24901 :
				return "TAPIERROR_SYSTEMPARAMETER_QRY";
			case 24902 :
				return "TAPIERROR_SYSTEMPARAMETER_ADD";
			case 24903 :
				return "TAPIERROR_SYSTEMPARAMETER_DEL";
			case 24904 :
				return "TAPIERROR_SYSTEMPARAMETER_MOD";
			case 25001 :
				return "TAPIERROR_ITEMINFO_QRY";
			case 25002 :
				return "TAPIERROR_ITEMVALUEINFO_QRY";
			case 25101 :
				return "TAPIERROR_TEMPLATEFEEINFO_QRY";
			case 25102 :
				return "TAPIERROR_TEMPLATEFEEINFO_ADD";
			case 25103 :
				return "TAPIERROR_TEMPLATEFEEINFO_DEL";
			case 25104 :
				return "TAPIERROR_TEMPLATEFEEINFO_MOD";
			case 25105 :
				return "TAPIERROR_TEMPLATEFEEINFO_CASCADE_DEL";
			case 25201 :
				return "TAPIERROR_TEMPLATEMARGININFO_QRY";
			case 25202 :
				return "TAPIERROR_TEMPLATEMARGININFO_ADD";
			case 25203 :
				return "TAPIERROR_TEMPLATEMARGININFO_DEL";
			case 25204 :
				return "TAPIERROR_TEMPLATEMARGININFO_MOD";
			case 25205 :
				return "TAPIERROR_TEMPLATEMARGININFO_CASCADE_DEL";
			case 25301 :
				return "TAPIERROR_OTHERFEETYPEINFO_QRY";
			case 25302 :
				return "TAPIERROR_OTHERFEETYPEINFO_ADD";
			case 25303 :
				return "TAPIERROR_OTHERFEETYPEINFO_DEL";
			case 25304 :
				return "TAPIERROR_OTHERFEETYPEINFO_MOD";
			case 25305 :
				return "TAPIERROR_OTHERFEETYPEINFO_CASCADE_DEL";
			case 25501 :
				return "TAPIERROR_COMMODITYORDERTYPE_QRY";
			case 25502 :
				return "TAPIERROR_COMMODITYORDERTYPE_ADD";
			case 25503 :
				return "TAPIERROR_COMMODITYORDERTYPE_DEL";
			case 25504 :
				return "TAPIERROR_COMMODITYORDERTYPE_MOD";
			case 25601 :
				return "TAPIERROR_ORDERTIMEINFORCE_QRY";
			case 25602 :
				return "TAPIERROR_ORDERTIMEINFORCE_ADD";
			case 25603 :
				return "TAPIERROR_ORDERTIMEINFORCE_DEL";
			case 25604 :
				return "TAPIERROR_ORDERTIMEINFORCE_MOD";
			case 25701 :
				return "TAPIERROR_ATTRIBUTELEVELINFO_QRY";
			case 25702 :
				return "TAPIERROR_ATTRIBUTELEVELINFO_ADD";
			case 25703 :
				return "TAPIERROR_ATTRIBUTELEVELINFO_DEL";
			case 25704 :
				return "TAPIERROR_ATTRIBUTELEVELINFO_MOD";
			case 25705 :
				return "TAPIERROR_ATTRIBUTELEVELINFO_CASCADE_DEL";
			case 25801 :
				return "TAPIERROR_CALENDARTEMPLATEINFO_QRY";
			case 25802 :
				return "TAPIERROR_CALENDARTEMPLATEINFO_ADD";
			case 25803 :
				return "TAPIERROR_CALENDARTEMPLATEINFO_DEL";
			case 25804 :
				return "TAPIERROR_CALENDARTEMPLATEINFO_MOD";
			case 25901 :
				return "TAPIERROR_COMMODITYCALENDARTEMPLATE_QRY";
			case 25902 :
				return "TAPIERROR_COMMODITYCALENDARTEMPLATE_ADD";
			case 25903 :
				return "TAPIERROR_COMMODITYCALENDARTEMPLATE_DEL";
			case 25904 :
				return "TAPIERROR_COMMODITYCALENDARTEMPLATE_MOD";
			case 26001 :
				return "TAPIERROR_ACCOUNTREALVALUE_QRY";
			case 26002 :
				return "TAPIERROR_ACCOUNTREALVALUE_ADD";
			case 26003 :
				return "TAPIERROR_ACCOUNTREALVALUE_DEL";
			case 26004 :
				return "TAPIERROR_ACCOUNTREALVALUE_MOD";
			case 26101 :
				return "TAPIERROR_TOOPTIONCMB_REQ";
			case 26201 :
				return "TAPIERROR_CALENDARTEMPLATEBASE_QRY";
			case 26202 :
				return "TAPIERROR_CALENDARTEMPLATEBASE_ADD";
			case 26203 :
				return "TAPIERROR_CALENDARTEMPLATEBASE_DEL";
			case 26204 :
				return "TAPIERROR_CALENDARTEMPLATEBASE_MOD";
			case 26301 :
				return "TAPIERROR_CERTIFICATE_QRY";
			case 26401 :
				return "TAPIERROR_TRADESERVERFLAG_QRY";
			case 26402 :
				return "TAPIERROR_TRADESERVERFLAG_ADD";
			case 26403 :
				return "TAPIERROR_TRADESERVERFLAG_DEL";
			case 26404 :
				return "TAPIERROR_TRADESERVERFLAG_MOD";
			case 26405 :
				return "TAPIERROR_TRADESERVERFLAG_CASCADE_DEL";
			case 26501 :
				return "TAPIERROR_TRADESERVERFLAG_FEETEMPLATE_QRY";
			case 26601 :
				return "TAPIERROR_TRADESERVERFLAG_MARGINTEMPLATE_QRY";
			case 26701 :
				return "TAPIERROR_TRADESERVERFLAG_ACCOUNT_FEEINFO_QRY";
			case 26801 :
				return "TAPIERROR_TRADESERVERFLAG_ACCOUNT_MARGININFO_QRY";
			case 26901 :
				return "TAPIERROR_COUNTY_QRY";
			case 27001 :
				return "TAPIERROR_PROVINCE_QRY";
			case 27101 :
				return "TAPIERROR_BANKLOGINOUT_QRY";
			case 27102 :
				return "TAPIERROR_BANKLOGINOUT_ADD";
			case 27201 :
				return "TAPIERROR_TRANSFERFUTUREBANK_QRY";
			case 27202 :
				return "TAPIERROR_TRANSFERFUTUREBANK_ADD";
			case 27301 :
				return "TAPIERROR_TRANSFERRENT_QRY";
			case 27302 :
				return "TAPIERROR_TRANSFERRENT_ADD";
			case 27303 :
				return "TAPIERROR_TRANSFERRENT_MOD";
			case 27304 :
				return "TAPIERROR_TRANSFERRENT_DEL";
			case 27401 :
				return "TAPIERROR_TRANSFERTIME_QRY";
			case 27402 :
				return "TAPIERROR_TRANSFERTIME_ADD";
			case 27403 :
				return "TAPIERROR_TRANSFERTIME_MOD";
			case 27404 :
				return "TAPIERROR_TRANSFERTIME_DEL";
			case 27501 :
				return "TAPIERROR_BANKSIGNEDINFO_QRY";
			case 27502 :
				return "TAPIERROR_BANKSIGNEDINFO_ADD";
			case 27601 :
				return "TAPIERROR_TRADINGTIMEBUCKETBASE_QRY";
			case 27602 :
				return "TAPIERROR_TRADINGTIMEBUCKETBASE_ADD";
			case 27603 :
				return "TAPIERROR_TRADINGTIMEBUCKETBASE_DEL";
			case 27604 :
				return "TAPIERROR_TRADINGTIMEBUCKETBASE_MOD";
			case 27605 :
				return "TAPIERROR_TRADINGTIMEBUCKETBASE_CASCADE_DEL";
			case 27701 :
				return "TAPIERROR_CLASSIFY_QRY";
			case 27801 :
				return "TAPIERROR_ORGANTYPE_QRY";
			case 27901 :
				return "TAPIERROR_TRADINGCALENDARINFO_QRY";
			case 27902 :
				return "TAPIERROR_TRADINGCALENDARINFO_ADD";
			case 27903 :
				return "TAPIERROR_TRADINGCALENDARINFO_MOD";
			case 27904 :
				return "TAPIERROR_TRADINGCALENDARINFO_DEL";
			case 27905 :
				return "TAPIERROR_TRADING_CLENDAR_SETTLE_TRADE_QRY";
			case 28001 :
				return "TAPIERROR_EXCHANGETRADINGCALENDARINFO_QRY";
			case 28002 :
				return "TAPIERROR_EXCHANGETRADINGCALENDARINFO_ADD";
			case 28003 :
				return "TAPIERROR_EXCHANGETRADINGCALENDARINFO_MOD";
			case 28004 :
				return "TAPIERROR_EXCHANGETRADINGCALENDARINFO_DEL";
			case 28005 :
				return "TAPIERROR_EXCHANGE_TRADING_DETAILDATE_QRY";
			case 28101 :
				return "TAPIERROR_CONTRACTNEARDELIVERY_QRY";
			case 28102 :
				return "TAPIERROR_CONTRACTNEARDELIVERY_ADD";
			case 28103 :
				return "TAPIERROR_CONTRACTNEARDELIVERY_DEL";
			case 28201 :
				return "TAPIERROR_CHECKTABLEINFO_QRY";
			case 28202 :
				return "TAPIERROR_CHECKTABLEINFO_ADD";
			case 28203 :
				return "TAPIERROR_CHECKTABLEINFO_MOD";
			case 28204 :
				return "TAPIERROR_CHECKTABLEINFO_DEL";
			case 28205 :
				return "TAPIERROR_CHECKTABLEBASEINFO_QRY";
			case 28206 :
				return "TAPIERROR_CHECKTABLEDELINFO_QRY";
			case 28207 :
				return "TAPIERROR_CHECKTABLEDELINFO_ADD";
			case 28208 :
				return "TAPIERROR_CHECKTABLEDELINFO_DEL";
			case 28209 :
				return "TAPIERROR_CHECKTABLEBASEINFO_ADD";
			case 28210 :
				return "TAPIERROR_CHECKTABLEBASEINFO_MOD";
			case 28301 :
				return "TAPIERROR_OPERATORLOGINFO_QRY";
			case 28302 :
				return "TAPIERROR_OPERATORLOGINFO_ADD";
			case 28303 :
				return "TAPIERROR_OPERATORLOGINFO_DEL";
			case 28304 :
				return "TAPIERROR_RISKPARAMETER_QRY";
			case 28305 :
				return "TAPIERROR_RISKPARAMETER_MOD";
			case 28306 :
				return "TAPIERROR_TRANSFERCOUNTVALUE_QRY";
			case 28307 :
				return "TAPIERROR_TRANSFERCOUNTVALUE_ADD";
			case 28401 :
				return "TAPIERROR_BANAUTO_ORDERCHECK_QRY";
			case 28402 :
				return "TAPIERROR_BANAUTO_ORDERCHECK_ADD";
			case 28403 :
				return "TAPIERROR_BANAUTO_ORDERCHECK_DEL";
			case 28501 :
				return "TAPIERROR_USER_QUOTE_QTY_QRY";
			case 28502 :
				return "TAPIERROR_USER_QUOTE_QTY_ADD";
			case 28503 :
				return "TAPIERROR_USER_QUOTE_QTY_MOD";
			case 28504 :
				return "TAPIERROR_USER_QUOTE_QTY_DEL";
			case 28601 :
				return "TAPIERROR_SECTOR_PARENT_QRY";
			case 28602 :
				return "TAPIERROR_SECTOR_PARENT_ADD";
			case 28603 :
				return "TAPIERROR_SECTOR_PARENT_MOD";
			case 28604 :
				return "TAPIERROR_SECTOR_PARENT_DEL";
			case 28701 :
				return "TAPIERROR_MEASURE_UNIT_QRY";
			case 28702 :
				return "TAPIERROR_MEASURE_CONVERSION_QRY";
			case 28703 :
				return "TAPIERROR_CHARGE_CONVERSION_QRY";
			case 28801 :
				return "TAPIERROR_CHARGE_UNIT_QRY";
			case 28802 :
				return "TAPIERROR_CHARGE_UNIT_ADD";
			case 28803 :
				return "TAPIERROR_CHARGE_UNIT_MOD";
			case 28804 :
				return "TAPIERROR_CHARGE_UNIT_DEL";
			case 28901 :
				return "TAPIERROR_USER_ORDER_FREQUENCE_QRY";
			case 28902 :
				return "TAPIERROR_USER_ORDER_FREQUENCE_ADD";
			case 28903 :
				return "TAPIERROR_USER_ORDER_FREQUENCE_MOD";
			case 28904 :
				return "TAPIERROR_USER_ORDER_FREQUENCE_DEL";
			case 29001 :
				return "TAPIERROR_DATA_LINKINFO_QRY";
			case 29002 :
				return "TAPIERROR_DATA_LINKINFO_ADD";
			case 29003 :
				return "TAPIERROR_DATA_LINKINFO_MOD";
			case 29004 :
				return "TAPIERROR_DATA_LINKINFO_DEL";
			case 29101 :
				return "TAPIERROR_ONLYCANCLOSEDAYS_QRY";
			case 29102 :
				return "TAPIERROR_ONLYCANCLOSEDAYS_ADD";
			case 29103 :
				return "TAPIERROR_ONLYCANCLOSEDAYS_DEL";
			case 29104 :
				return "TAPIERROR_ONLYCANCLOSEDAYS_MOD";
			case 29201 :
				return "TAPIERROR_LMETRADINGCALENDARINFO_QRY";
			case 29202 :
				return "TAPIERROR_LMETRADINGCALENDARINFO_ADD";
			case 29203 :
				return "TAPIERROR_LEMTRADINGCALENDARINFO_MOD";
			case 29204 :
				return "TAPIERROR_LEMTRADINGCALENDARINFO_DEL";
			case 29205 :
				return "TAPIERROR_LEM_TRADING_DETAILDATE_QRY";
			case 29301 :
				return "TAPIERROR_TEMPLATE_MINMAX_FEE_QRY";
			case 29302 :
				return "TAPIERROR_TEMPLATE_MINMAX_FEE_ADD";
			case 29303 :
				return "TAPIERROR_TEMPLATE_MINMAX_FEE_DEL";
			case 29304 :
				return "TAPIERROR_TEMPLATE_MINMAX_FEE_MOD";
			case 29401 :
				return "TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_QRY";
			case 29402 :
				return "TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_ADD";
			case 29403 :
				return "TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_DEL";
			case 29404 :
				return "TAPIERROR_ACCOUNT_MINMAX_FEETEMPLATE_MOD";
			case 29411 :
				return "TAPIERROR_ACCOUNT_SEAT_INFO_QRY";
			case 29412 :
				return "TAPIERROR_ACCOUNT_SEAT_INFO_ADD";
			case 29413 :
				return "TAPIERROR_ACCOUNT_SEAT_INFO_DEL";
			case 29421 :
				return "TAPIERROR_SEAT_INFO_QRY";
			case 29422 :
				return "TAPIERROR_SEAT_INFO_ADD";
			case 29423 :
				return "TAPIERROR_SEAT_INFO_DEL";
			case 29431 :
				return "TAPIERROR_ACCOUNTFEE_PARAMETER_QRY";
			case 29432 :
				return "TAPIERROR_ACCOUNTMARGIN_PARAMETER_QRY";
			case 29433 :
				return "TAPIERROR_TEMPLATEFEE_BATCH_MOD";
			case 29434 :
				return "TAPIERROR_TEMPLATEMARGIN_BATCH_MOD";
			case 29441 :
				return "TAPIERROR_FOREIGN_EXCHANGE_NEWRATE_QRY";
			case 29442 :
				return "TAPIERROR_FOREIGN_EXCHANGE_CURRATE_QRY";
			case 29443 :
				return "TAPIERROR_FOREIGN_EXCHANGE_RATE_MOD";
			case 29444 :
				return "TAPIERROR_FOREIGN_EXCHANGE_RATE_ADD";
			case 29445 :
				return "TAPIERROR_FOREIGN_EXCHANGE_RATE_DEL";
			case 29451 :
				return "TAPIERROR_MAIL_INFO_QRY";
			case 29452 :
				return "TAPIERROR_MAIL_INFO_ADD";
			case 29453 :
				return "TAPIERROR_MAIL_INFO_MOD";
			case 29454 :
				return "TAPIERROR_MAIL_INFO_DEL";
			case 29461 :
				return "TAPIERROR_FOREX_RATE_INFO_QRY";
			case 29462 :
				return "TAPIERROR_FOREX_RATE_INFO_ADD";
			case 29463 :
				return "TAPIERROR_FOREX_RATE_INFO_MOD";
			case 29464 :
				return "TAPIERROR_FOREX_RATE_INFO_DEL";
			case 29471 :
				return "TAPIERROR_FOREX_HOLIDAY_QRY";
			case 29472 :
				return "TAPIERROR_FOREX_HOLIDAY_ADD";
			case 29473 :
				return "TAPIERROR_FOREX_HOLIDAY_MOD";
			case 29474 :
				return "TAPIERROR_FOREX_HOLIDAY_DEL";
			case 29481 :
				return "TAPIERROR_ACCOUNT_RELATEINFO_QRY";
			case 29482 :
				return "TAPIERROR_ACCOUNT_RELATEINFO_ADD";
			case 29483 :
				return "TAPIERROR_ACCOUNT_RELATEINFO_MOD";
			case 29484 :
				return "TAPIERROR_ACCOUNT_RELATEINFO_DEL";
			case 40001 :
				return "TAPIERROR_HISORDER_QRY";
			case 40002 :
				return "TAPIERROR_HISORDER_ADD";
			case 40003 :
				return "TAPIERROR_HISORDER_MOD";
			case 40004 :
				return "TAPIERROR_HISORDER_DEL";
			case 40005 :
				return "TAPIERROR_ORDERFORTRADE_QRY";
			case 40101 :
				return "TAPIERROR_HISMATCH_QRY";
			case 40102 :
				return "TAPIERROR_HISMATCH_ADD";
			case 40103 :
				return "TAPIERROR_HISMATCH_MOD";
			case 40104 :
				return "TAPIERROR_HISMATCH_DEL";
			case 40105 :
				return "TAPIERROR_MATCHFORTRADE_QRY";
			case 40201 :
				return "TAPIERROR_HISPOSITION_QRY";
			case 40202 :
				return "TAPIERROR_HISPOSITION_ADD";
			case 40203 :
				return "TAPIERROR_HISPOSITION_MOD";
			case 40204 :
				return "TAPIERROR_HISPOSITION_DEL";
			case 40205 :
				return "TAPIERROR_POSITIONFORTRADE_QRY";
			case 40206 :
				return "TAPIERROR_LASTSETTLEDATE_QRY";
			case 40301 :
				return "TAPIERROR_HISCLOSE_QRY";
			case 40401 :
				return "TAPIERROR_HISUNEXPCLOSE_QRY";
			case 40402 :
				return "TAPIERROR_HISUNEXPCLOSE_ADD";
			case 40403 :
				return "TAPIERROR_HISUNEXPCLOSE_MOD";
			case 40404 :
				return "TAPIERROR_HISUNEXPCLOSE_DEL";
			case 40501 :
				return "TAPIERROR_HISDELIVERY_QRY";
			case 40502 :
				return "TAPIERROR_HISDELIVERY_ADD";
			case 40503 :
				return "TAPIERROR_HISDELIVERY_MOD";
			case 40504 :
				return "TAPIERROR_HISDELIVERY_DEL";
			case 40601 :
				return "TAPIERROR_SETTLEPRICE_QRY";
			case 40602 :
				return "TAPIERROR_SETTLEPRICE_ADD";
			case 40603 :
				return "TAPIERROR_SETTLEPRICE_MOD";
			case 40604 :
				return "TAPIERROR_SETTLEPRICE_DEL";
			case 40701 :
				return "TAPIERROR_VALIDCONTRACT_GEN";
			case 40801 :
				return "TAPIERROR_POSITIONMOVE_QRY";
			case 40802 :
				return "TAPIERROR_POSITIONMOVE_ADD";
			case 40803 :
				return "TAPIERROR_POSITIONMOVE_DEL";
			case 40901 :
				return "TAPIERROR_ACCOUNTCASHINOUT_QRY";
			case 40902 :
				return "TAPIERROR_ACCOUNTCASHINOUT_ADD";
			case 40903 :
				return "TAPIERROR_ACCOUNTCASHINOUTADD_NOTICE";
			case 41001 :
				return "TAPIERROR_ACCOUNTCASHADJUST_QRY";
			case 41002 :
				return "TAPIERROR_ACCOUNTCASHADJUST_ADD";
			case 41003 :
				return "TAPIERROR_ACCOUNTCASHADJUSTADD_NOTICE";
			case 41201 :
				return "TAPIERROR_ACCOUNTCASHSWAP_QRY";
			case 41202 :
				return "TAPIERROR_ACCOUNTCASHSWAP_ADD";
			case 41203 :
				return "TAPIERROR_ACCOUNTCASHSWAPADD_NOTICE";
			case 41301 :
				return "TAPIERROR_TRANSFERINFO_QRY";
			case 41302 :
				return "TAPIERROR_TRANSFERINFO_ADD";
			case 41303 :
				return "TAPIERROR_ATRANSFERINFOADD_NOTICE";
			case 41401 :
				return "TAPIERROR_SPANMARGIN_QRY";
			case 41402 :
				return "TAPIERROR_SPANMARGIN_ADD";
			case 41403 :
				return "TAPIERROR_SPANMARGIN_MOD";
			case 41404 :
				return "TAPIERROR_SPANMARGIN_DEL";
			case 41501 :
				return "TAPIERROR_ACCOUNTFUND_QRY";
			case 41502 :
				return "TAPIERROR_ACCOUNTFUNDFORTRADE_QRY";
			case 41503 :
				return "TAPIERROR_ACCOUNTFUND_ADD";
			case 41504 :
				return "TAPIERROR_ACCOUNTFUND_DEL";
			case 41601 :
				return "TAPIERROR_ACCOUNTFROZENFUND_QRY";
			case 41602 :
				return "TAPIERROR_ACCOUNTFROZENFUND_ADD";
			case 41603 :
				return "TAPIERROR_ACCOUNTFROZENADD_NOTICE";
			case 41604 :
				return "TAPIERROR_ACCOUNTFROZENFUND_MOD";
			case 41605 :
				return "TAPIERROR_ACCOUNTFROZENMOD_NOTICE";
			case 41701 :
				return "TAPIERROR_UPPERCASHINOUT_QRY";
			case 41702 :
				return "TAPIERROR_UPPERCASHINOUT_ADD";
			case 41703 :
				return "TAPIERROR_UPPERCASHINOUT_MOD";
			case 41704 :
				return "TAPIERROR_UPPERCASHINOUT_DEL";
			case 41801 :
				return "TAPIERROR_UPPERCASHADJUST_QRY";
			case 41802 :
				return "TAPIERROR_UPPERCASHADJUST_ADD";
			case 41803 :
				return "TAPIERROR_UPPERCASHADJUST_MOD";
			case 41804 :
				return "TAPIERROR_UPPERCASHADJUST_DEL";
			case 41901 :
				return "TAPIERROR_UPPERFUND_QRY";
			case 42001 :
				return "TAPIERROR_SETTLEDEAL_QRY";
			case 42101 :
				return "TAPIERROR_SETTLEPROCESS_QRY";
			case 42102 :
				return "TAPIERROR_SettleBatchNo_QRY";
			case 42201 :
				return "TAPIERROR_LOG_QRY";
			case 42301 :
				return "TAPIERROR_TRADEMESSAGE_SEND";
			case 42302 :
				return "TAPIERROR_TRADEMESSAGE_QRY";
			case 42303 :
				return "TAPIERROR_TRADEMESSAGE_NOTICE";
			case 42401 :
				return "TAPIERROR_QUOTEMESSAGE_SEND";
			case 42402 :
				return "TAPIERROR_QUOTEMESSAGE_QRY";
			case 42403 :
				return "TAPIERROR_QUOTEMESSAGE_NOTICE";
			case 42501 :
				return "TAPIERROR_TRADINGSTATISTICS_REQ";
			case 42601 :
				return "TAPIERROR_PCS_REQ";
			case 42602 :
				return "TAPIERROR_CGM_REQ";
			case 42603 :
				return "TAPIERROR_LARGETRADER_REQ";
			case 42604 :
				return "TAPIERROR_PCS_QRY_REQ";
			case 42605 :
				return "TAPIERROR_CGM_QRY_REQ";
			case 42606 :
				return "TAPIERROR_LARGETRADER_QRY_REQ";
			case 42701 :
				return "TAPIERROR_CME_MATCH_IMPORT_REQ";
			case 42702 :
				return "TAPIERROR_CME_MATCHT_QRY_REQ";
			case 42703 :
				return "TAPIERROR_CME_POSITION_IMPORT_REQ";
			case 42704 :
				return "TAPIERROR_CME_POSITION_QRY_REQ";
			case 42705 :
				return "TAPIERROR_CMEMATCH_DEL_REQ";
			case 42706 :
				return "TAPIERROR_CMEPOSITION_DEL_REQ";
			case 42801 :
				return "TAPIERROR_MQ_MATCH_ADD_REQ";
			case 42802 :
				return "TAPIERROR_MQ_MATCHT_QRY_REQ";
			case 42901 :
				return "TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_QRY_REQ";
			case 42902 :
				return "TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_ADD_REQ";
			case 42903 :
				return "TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_MOD_REQ";
			case 42904 :
				return "TAPIERROR_OMNIBUSACCOUNTCLOSEINFO_DEL_REQ";
			case 43001 :
				return "TAPIERROR_CHECK_MATCH_REQ";
			case 43002 :
				return "TAPIERROR_CHECK_POSITION_REQ";
			case 43101 :
				return "TAPIERROR_DEAL_POSITION_REQ";
			case 43201 :
				return "TAPIERROR_POSITIONMORTGAGE_QRY_REQ";
			case 43202 :
				return "TAPIERROR_POSITIONMORTGAGE_ADD_REQ";
			case 43203 :
				return "TAPIERROR_POSITIONMORTGAGE_MOD_REQ";
			case 43204 :
				return "TAPIERROR_POSITIONMORTGAGE_DEL_REQ";
			case 43301 :
				return "TAPIERROR_DCEMARGINPREFERENT_QRY_REQ";
			case 43302 :
				return "TAPIERROR_DCEMARGINPREFERENT_ADD_REQ";
			case 43303 :
				return "TAPIERROR_DCEMARGINPREFERENT_MOD_REQ";
			case 43304 :
				return "TAPIERROR_DCEMARGINPREFERENT_DEL_REQ";
			case 43401 :
				return "TAPIERROR_ZCEAPPLYCMB_QRY_REQ";
			case 43402 :
				return "TAPIERROR_ZCEAPPLYCMB_ADD_REQ";
			case 43403 :
				return "TAPIERROR_ZCEAPPLYCMB_MOD_REQ";
			case 43404 :
				return "TAPIERROR_ZCEAPPLYCMB_DEL_REQ";
			case 43501 :
				return "TAPIERROR_MATCHREPORT_REQ";
			case 43502 :
				return "TAPIERROR_POSITIONREPORT_REQ";
			case 43601 :
				return "TAPIERROR_ACCOUNTAUTHCASH_ADD_REQ";
			case 43602 :
				return "TAPIERROR_ACCOUNTAUTHCASH_DEL_REQ";
			case 43701 :
				return "TAPIERROR_FOREIGNPOSITION_CHECK_REQ";
			case 43702 :
				return "TAPIERROR_ACCOUNTFUND_CHECK_REQ";
			case 43703 :
				return "TAPIERROR_UNEXPCLOSE_CHECK_REQ";
			case 43801 :
				return "TAPIERROR_OTHERFUND_QRY_REQ";
			case 43802 :
				return "TAPIERROR_OTHERFUND_ADD_REQ";
			case 43803 :
				return "TAPIERROR_OTHERFUND_MOD_REQ";
			case 43804 :
				return "TAPIERROR_OTHERFUND_DEL_REQ";
			case 43901 :
				return "TAPIERROR_ACCOUNTFUND_NOTICE_REQ";
			case 44001 :
				return "TAPIERROR_POSITIONMOVEBYACCOUNT_QRY_REQ";
			case 44002 :
				return "TAPIERROR_POSITIONMOVEBYACCOUNT_ADD_REQ";
			case 44003 :
				return "TAPIERROR_POSITIONMOVEBYACCOUNT_MOD_REQ";
			case 44004 :
				return "TAPIERROR_POSITIONMOVEBYACCOUNT_DEL_REQ";
			case 44101 :
				return "TAPIERROR_ADJUSTMATCH_REQ";
			case 44201 :
				return "TAPIERROR_SWAPREPORT_REQ";
			case 44301 :
				return "TAPIERROR_ADDFOURCEREPORT_REQ";
			case 44401 :
				return "TAPIERROR_ACCOUNTFUNDREPORT_REQ";
			case 44501 :
				return "TAPIERROR_DELIVERYALARMREPORT_REQ";
			case 44602 :
				return "TAPIERROR_OHCL_ADD_REQ";
			case 44603 :
				return "TAPIERROR_OHCL_MOD_REQ";
			case 44604 :
				return "TAPIERROR_OHCL_DEL_REQ";
			case 44701 :
				return "TAPIERROR_TODELIVERY_QRY_REQ";
			case 44702 :
				return "TAPIERROR_TODELIVERY_ADD_REQ";
			case 44703 :
				return "TAPIERROR_TODELIVERY_MOD_REQ";
			case 44704 :
				return "TAPIERROR_TODELIVERY_DEL_REQ";
			case 44801 :
				return "TAPIERROR_ACCOUNTPLEDGE_QRY_REQ";
			case 44802 :
				return "TAPIERROR_ACCOUNTPLEDGE_ADD_REQ";
			case 44901 :
				return "TAPIERROR_SETTLESALE_QRY_REQ";
			case 44902 :
				return "TAPIERROR_SETTLESALE_ADD_REQ";
			case 44903 :
				return "TAPIERROR_SETTLESALE_DEL_REQ";
			case 60001 :
				return "TAPIERROR_ORDERINSERT_ACCOUNT";
			case 60002 :
				return "TAPIERROR_ORDERINSERT_ACCOUNT_STATE";
			case 60011 :
				return "TAPIERROR_ORDERINSERT_CONTRACT";
			case 60021 :
				return "TAPIERROR_ORDERINSERT_TRADEROUTE";
			case 60022 :
				return "TAPIERROR_ORDERINSERT_POSITIONMAX";
			case 60023 :
				return "TAPIERROR_ORDER_NOTRADE";
			case 60024 :
				return "TAPIERROR_ORDER_CLOSE";
			case 60031 :
				return "TAPIERROR_ORDERINSERT_NOTENOUGHFUND";
			case 60032 :
				return "TAPIERROR_ORDERINSERT_ORDERTYPE";
			case 60033 :
				return "TAPIERROR_ORDERINSERT_TIMEINFORCE";
			case 60034 :
				return "TAPIERROR_ORDERINSERT_NO_TACTICS";
			case 60035 :
				return "TAPIERROR_ORDERINSERT_POSITION_CANNOT_CLOSE";
			case 60036 :
				return "TAPIERROR_ORDERINSERT_AUTOCHECK_FAIL";
			case 60037 :
				return "TAPIERROR_ORDERINSERT_LME_NOTREADY";
			case 60038 :
				return "TAPIERROR_ORDERINSERT_CLOSEMODE";
			case 60039 :
				return "TAPIERROR_ORDERINSERT_PARENTNOTENOUGHFUND";
			case 60040 :
				return "TAPIERROR_SWAP_CONTRACT";
			case 60051 :
				return "TAPIERROR_USERNO_NOTHAS_ACCOUNT";
			case 60052 :
				return "TAPIERROR_UPPERCHANNEL_BROKEN";
			case 60053 :
				return "TAPIERROR_UPPERCHANNEL_NOT_EXIST";
			case 60061 :
				return "TAPIERROR_ORDERDELETE_NOT_SYSNO";
			case 60062 :
				return "TAPIERROR_ORDERDELETE_NOT_STATE";
			case 60063 :
				return "TAPIERROR_ORDERACTIVE_NOT_STATE";
			case 60071 :
				return "TAPIERROR_ORDERCHECK_NOT_STATE";
			case 60072 :
				return "TAPIERROR_ORDERCHECK_FAIL";
			case 60081 :
				return "TAPIERROR_ORDERMODIFY_NOT_STATE";
			case 60082 :
				return "TAPIERROR_ORDERMODIFY_BACK_INPUT";
			case 60091 :
				return "TAPIERROR_ORDERINSERT_FEE";
			case 60092 :
				return "TAPIERROR_ORDERINSERT_MARGIN";
			case 60100 :
				return "TAPIERROR_ORDER_NO_PERMIT";
			case 60101 :
				return "TAPIERROR_RSPQUOTE_NO_PERMIT";
			case 60102 :
				return "TAPIERROR_RSPQUOTE_CHILD_NO_PERMIT";
			case 60103 :
				return "TAPIERROR_TRADENO_NOT_FIND";
			case 60104 :
				return "TAPIERROR_ORDER_NO_CLOSE";
			case 60105 :
				return "TAPIERROR_QRY_QUOTE_NO_PERMIT";
			case 61001 :
				return "TAPIERROR_ORDER_FREQUENCY";
			case 61002 :
				return "TAPIERROR_ORDER_QUERYING";
			case 70101 :
				return "TAPIERROR_1MINUTEBYCOUNT_QRY";
			case 70102 :
				return "TAPIERROR_1MINUTEBYPERIOD_QRY";
			case 70103 :
				return "TAPIERROR_1MINUTEBYDATE_QRY";
			case 70201 :
				return "TAPIERROR_3MINUTEBYCOUNT_QRY";
			case 70202 :
				return "TAPIERROR_3MINUTEBYPERIOD_QRY";
			case 70203 :
				return "TAPIERROR_3MINUTEBYDATE_QRY";
			case 70301 :
				return "TAPIERROR_5MINUTEBYCOUNT_QRY";
			case 70302 :
				return "TAPIERROR_5MINUTEBYPERIOD_QRY";
			case 70303 :
				return "TAPIERROR_5MINUTEBYDATE_QRY";
			case 70401 :
				return "TAPIERROR_10MINUTEBYCOUNT_QRY";
			case 70402 :
				return "TAPIERROR_10MINUTEBYPERIOD_QRY";
			case 70403 :
				return "TAPIERROR_10MINUTEBYDATE_QRY";
			case 70501 :
				return "TAPIERROR_15MINUTEBYCOUNT_QRY";
			case 70502 :
				return "TAPIERROR_15MINUTEBYPERIOD_QRY";
			case 70503 :
				return "TAPIERROR_15MINUTEBYDATE_QRY";
			case 70601 :
				return "TAPIERROR_30MINUTEBYCOUNT_QRY";
			case 70602 :
				return "TAPIERROR_30MINUTEBYPERIOD_QRY";
			case 70603 :
				return "TAPIERROR_30MINUTEBYDATE_QRY";
			case 70701 :
				return "TAPIERROR_60MINUTEBYCOUNT_QRY";
			case 70702 :
				return "TAPIERROR_60MINUTEBYPERIOD_QRY";
			case 70703 :
				return "TAPIERROR_60MINUTEBYDATE_QRY";
			case 70801 :
				return "TAPIERROR_120MINUTEBYCOUNT_QRY";
			case 70802 :
				return "TAPIERROR_120MINUTEBYPERIOD_QRY";
			case 70803 :
				return "TAPIERROR_120MINUTEBYDATE_QRY";
			case 70901 :
				return "TAPIERROR_240MINUTEBYCOUNT_QRY";
			case 70902 :
				return "TAPIERROR_240MINUTEBYPERIOD_QRY";
			case 70903 :
				return "TAPIERROR_240MINUTEBYDATE_QRY";
			case 71001 :
				return "TAPIERROR_30SECONDSBYCOUNT_QRY";
			case 71002 :
				return "TAPIERROR_30SECONDSBYPERIOD_QRY";
			case 71003 :
				return "TAPIERROR_30SECONDSBYDATE_QRY";
			case 71101 :
				return "TAPIERROR_TICKBYCOUNT_QRY";
			case 71102 :
				return "TAPIERROR_TICKBYPERIOD_QRY";
			case 71103 :
				return "TAPIERROR_TICKBYDATE_QRY";
			case 71201 :
				return "TAPIERROR_DAYBYCOUNT_QRY";
			case 71202 :
				return "TAPIERROR_DAYBYPERIOD_QRY";
			case 71203 :
				return "TAPIERROR_DAYBYDATE_QRY";
			case 71301 :
				return "TAPIERROR_WEEKBYCOUNT_QRY";
			case 71302 :
				return "TAPIERROR_WEEKBYPERIOD_QRY";
			case 71303 :
				return "TAPIERROR_WEEKBYDATE_QRY";
			case 71401 :
				return "TAPIERROR_MONTHBYCOUNT_QRY";
			case 71402 :
				return "TAPIERROR_MONTHBYPERIOD_QRY";
			case 71403 :
				return "TAPIERROR_MONTHBYDATE_QRY";
			case 71501 :
				return "TAPIERROR_YEARBYCOUNT_QRY";
			case 71502 :
				return "TAPIERROR_YEARBYPERIOD_QRY";
			case 71503 :
				return "TAPIERROR_YEARBYDATE_QRY";
			case 71601 :
				return "TAPIERROR_NMINUTESBYCOUNT_QRY";
			case 71602 :
				return "TAPIERROR_NMINUTESBYPERIOD_QRY";
			case 71603 :
				return "TAPIERROR_NMINUTESBYDATE_QRY";
			case 71701 :
				return "TAPIERROR_NDAYSBYCOUNT_QRY";
			case 71702 :
				return "TAPIERROR_NDAYSBYPERIOD_QRY";
			case 71703 :
				return "TAPIERROR_NDAYSBYDATE_QRY";
			case 71801 :
				return "TAPIERROR_NSECONDBYCOUNT_QRY";
			case 71802 :
				return "TAPIERROR_NSECONDSBYPERIOD_QRY";
			case 71803 :
				return "TAPIERROR_NSECONDSBYDATE_QRY";
			case 72001 :
				return "TAPIERROR_SUBSCRIBEQUOTE_MAX";
			case 72002 :
				return "TAPIERROR_SUBSCRIBEQUOTE_EXCHANGE_MAX";
			case 72101 :
				return "TAPIERROR_SUBSCRIBEQUOTE_NO_RIGHT";
			case 72102 :
				return "TAPIERROR_SUBSCRIBEQUOTE_NO_EXCHANGE_RIGHT";
			case 80001 :
				return "TAPIERROR_ORDER_SEND";
			case 80002 :
				return "TAPIERROR_DLG_NULL";
			case 80003 :
				return "TAPIERROR_ORDER_FIELD";
			case 80004 :
				return "TAPIERROR_TRADE_REJ_BYUPPER";
			case 81001 :
				return "TAPIERROR_TAPSERVER_CREATE";
			case 81002 :
				return "TAPIERROR_CONNECT_BUS";
			case 81003 :
				return "TAPIERROR_GWRCV_DATA";
			case 81004 :
				return "TAPIERROR_FRAME_FLAG";
			case 81005 :
				return "TAPIERROR_GWREC_DATA_PARTICAL";
			case 81006 :
				return "TAPIERROR_FRAMEHEAD_TYPE";
			case 81007 :
				return "TAPIERROR_MANAGESERVER_MATCH";
			case 81008 :
				return "TAPIERROR_QRY_INNERCOMM0DITY";
			case 81009 :
				return "TAPIERROR_CLIENTNO";
			case 81010 :
				return "TAPIERROR_QRY_UPPERCOMMODITY";
			case 81011 :
				return "TAPIERROR_QRY_MARKETSTATE";
			case 82001 :
				return "TAPIERROR_TRADEFRONT_TAPSERVER_CREATE";
			case 82002 :
				return "TAPIERROR_TRADEFRONT_CONNECT_BUS";
			case 82003 :
				return "TAPIERROR_TRADEFRONT_LINK_THREAD";
			case 82004 :
				return "TAPIERROR_TRADEFRONT_SUBLOGIN";
			case 82005 :
				return "TAPIERROR_TRADEFRONT_SUBLOGINQUERY";
			case 82006 :
				return "TAPIERROR_TRADEFRONT_SUBMANAGEBASIC";
			case 82007 :
				return "TAPIERROR_TRADEFRONT_SUBMANAGEADVANCED";
			case 82008 :
				return "TAPIERROR_TRADEFRONT_SUBSETTLE";
			case 82009 :
				return "TAPIERROR_TRADEFRONT_SUBSETTLEMESSAGE";
			case 82010 :
				return "TAPIERROR_TRADEFRONT_SUBSETTLEMONEY";
			case 82011 :
				return "TAPIERROR_TRADEFRONT_SUBTRADE";
			case 82012 :
				return "TAPIERROR_TRADEFRONT_SERVERSTART_IOCP";
			case 82013 :
				return "TAPIERROR_TRADEFRONT_SERVERSTART_WORKER";
			case 82014 :
				return "TAPIERROR_TRADEFRONT_SERVERSTART_LISTEN";
			case 82015 :
				return "TAPIERROR_TRADEFRONT_SERVERSTART_PORT";
			case 82016 :
				return "TAPIERROR_TRADEFRONT_MODULETYPEERR";
			case 82017 :
				return "TAPIERROR_TRADEFRONT_SENDDATAERR";
			case 82018 :
				return "TAPIERROR_TRADEFRONT_NOTALLOWLOGIN";
			case 82019 :
				return "TAPIERROR_TRADEFRONT_TOOMANYDATA";
			case 82020 :
				return "TAPIERROR_TRADEFRONT_NODATA";
			case 82021 :
				return "TAPIERROR_TRADEFRONT_DICONNECT_SMTRADE";
			case 82022 :
				return "TAPIERROR_TRADEFRONT_DICONNECT_TRADE";
			case 83001 :
				return "TAPIERROR_QUOTEFRONT_UNKNOWN_PROTOCOL";
			case 90001 :
				return "TAPIERROR_ACCOUNTNO_NOEXIT";
			case 90002 :
				return "TAPIERROR_BANKSINGED_NOTALLOW";
			case 90003 :
				return "TAPIERROR_BANKPASSWORDAUTH";
			case 90004 :
				return "TAPIERROR_BANKFUTUREVALUE_NOTEXIT";
			case 90005 :
				return "TAPIERROR_BANKFUTURETRANSFER_NOTENOUGH";
			case 90006 :
				return "TAPIERROR_BANKFUTURETRANSFER_MORE_SIGMAXVALUE";
			case 90007 :
				return "TAPIERROR_BANKFUTURETRANSFER_MORE_DAYMAXCOUNT";
			case 90008 :
				return "TAPIERROR_BANKFUTURETRANSFER_MORE_DAYMAXVALUE";
			case 90009 :
				return "TAPIERROR_FUTURE_FROZEN_FAIL";
			case 90010 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCINFO";
			case 90011 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCBANKINFO";
			case 90012 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCFUNDINFO";
			case 90013 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NORENTINFO";
			case 90014 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NOCOUNTVALUEINFO";
			case 90015 :
				return "TAPIERROR_BANKFUTURETRANSFER_FTOB_NOACCCERTINFO";
			case 90016 :
				return "TAPIERROR_BANKWAY_STOP";
			case 90017 :
				return "TAPIERROR_TRANSFERINFO_LOST";
			case 90018 :
				return "TAPIERROR_BANK_NOTALLOWTRANSFER";
			case 90019 :
				return "TAPIERROR_CASHIN_NOREVERSE";
			case 91001 :
				return "TAPIERROR_RISKCOMMODITY_QRY";
			case 91002 :
				return "TAPIERROR_RISKCONTRACT_FUND";
			case 91003 :
				return "TAPIERROR_RISKFUND_QRY";
			case 91004 :
				return "TAPIERROR_CONTRACTQUOTE_ADD";
			case 446001 :
				return "TAPIERROR_OHCL_QRY_REQ";
			default :
				return "Unknown Error Code" + arg;
		}
	}

	public static String code2Message(int arg) {
		switch (arg) {
			case -13001 :
				return "历史行情查询参数不合法";
			case -12045 :
				return "输入错误的:TAPIOrderQryTypeType";
			case -12044 :
				return "输入错误的:TAPIMarketLevelType";
			case -12043 :
				return "输入错误的:TAPITradingStateType";
			case -12042 :
				return "输入错误的:TAPITriggerPriceTypeType";
			case -12041 :
				return "输入错误的:TAPITriggerConditionType";
			case -12040 :
				return "输入错误的:TAPICashAdjustTypeType";
			case -12039 :
				return "输入错误的:TAPIOFFFlagType";
			case -12038 :
				return "输入错误的:TAPIBillFileTypeType";
			case -12037 :
				return "输入错误的:TAPIBillTypeType";
			case -12036 :
				return "输入错误的:TAPIORDERACT";
			case -12035 :
				return "输入错误的:TAPITacticsTypeType";
			case -12034 :
				return "输入错误的:TAPITransferDeviceIDType";
			case -12033 :
				return "输入错误的:TAPITransferTypeType";
			case -12032 :
				return "输入错误的:TAPITransferStateType";
			case -12031 :
				return "输入错误的:TAPITransferDirectType";
			case -12030 :
				return "输入错误的:TAPIMsgLevelType";
			case -12029 :
				return "输入错误的:TAPIMsgTypeType";
			case -12028 :
				return "输入错误的:TAPIMsgReceiverType";
			case -12027 :
				return "输入错误的:TAPIPartyCertificateTypeType";
			case -12026 :
				return "输入错误的:TAPIPartyTypeType";
			case -12025 :
				return "输入错误的:TAPIContractTypeType";
			case -12024 :
				return "输入错误的:TAPIDeliveryModeType";
			case -12023 :
				return "输入错误的:TAPICmbDirectType";
			case -12022 :
				return "输入错误的:TAPIOptionMarginCalculateModeType";
			case -12021 :
				return "输入错误的:TAPIMarginCalculateModeType";
			case -12020 :
				return "输入错误的:TAPIBankAccountTransferStateType";
			case -12019 :
				return "输入错误的:TAPIBankAccountSwapStateType";
			case -12018 :
				return "输入错误的:TAPIBankAccountStateType";
			case -12017 :
				return "输入错误的:TAPIBankAccountLWFlagType";
			case -12016 :
				return "输入错误的:TAPIOptionAlgType";
			case -12015 :
				return "输入错误的:TAPIFutureAlgType";
			case -12014 :
				return "输入错误的:TAPIOpenCloseModeType";
			case -12013 :
				return "输入错误的:TAPIMatchSourceType";
			case -12012 :
				return "输入错误的:TAPICalculateModeType";
			case -12011 :
				return "输入错误的:TAPIOrderStateType";
			case -12010 :
				return "输入错误的:TAPIHedgeFlagType";
			case -12009 :
				return "输入错误的:TAPIPositionEffectType";
			case -12008 :
				return "输入错误的:TAPISideType";
			case -12007 :
				return "输入错误的:TAPITimeInForceType";
			case -12006 :
				return "输入错误的:TAPIOrderSourceType";
			case -12005 :
				return "输入错误的:TAPIOrderTypeType";
			case -12004 :
				return "输入错误的:TAPIAccountFamilyType";
			case -12003 :
				return "输入错误的:TAPIAccountState";
			case -12002 :
				return "输入错误的:TAPIUserTypeType";
			case -12001 :
				return "输入错误的:TAPIAccountType";
			case -11002 :
				return "输入错误的:TAPIHisQuoteType";
			case -11001 :
				return "输入错误的:TAPIBucketDateFlag";
			case -10004 :
				return "输入错误的:TAPICallOrPutFlagType";
			case -10003 :
				return "输入错误的:TAPICommodityType";
			case -10002 :
				return "输入错误的:TAPILOGLEVEL";
			case -10001 :
				return "输入错误的:TAPIYNFLAG";
			case -10000 :
				return "输入数据为NULL";
			case -21 :
				return "每次登陆只允许调用一次";
			case -20 :
				return "接口未实现";
			case -19 :
				return "UDP正在监听";
			case -18 :
				return "UDP端口监听失败";
			case -17 :
				return "API还没有准备好";
			case -16 :
				return "授权码类型不匹配";
			case -15 :
				return "授权码超期";
			case -14 :
				return "授权码不合法";
			case -13 :
				return "输入参数非法";
			case -12 :
				return "上一次请求还没有结束";
			case -11 :
				return "内部错误";
			case -10 :
				return "重复登录";
			case -9 :
				return "数据路径不可用";
			case -8 :
				return "没用可用的接入前置";
			case -7 :
				return "当前网络测试还没结束";
			case -6 :
				return "没准备好测试网络";
			case -5 :
				return "测试编号不合法";
			case -4 :
				return "发送数据错误";
			case -3 :
				return "主机地址不可用";
			case -2 :
				return "链路认证失败";
			case -1 :
				return "连接服务失败";
			case 0 :
				return "成功";
			case 1 :
				return "主动断开";
			case 2 :
				return "被动断开";
			case 3 :
				return "读错误";
			case 4 :
				return "写错误";
			case 5 :
				return "缓冲区满";
			case 6 :
				return "异步操作错误";
			case 7 :
				return "解析数据错误";
			case 8 :
				return "连接超时";
			case 9 :
				return "初始化失败";
			case 10 :
				return "已经连接";
			case 11 :
				return "工作线程已结束";
			case 12 :
				return "操作正在进行，请稍后重试";
			case 10001 :
				return "登录过程执行错误";
			case 10002 :
				return "登录用户不存在";
			case 10003 :
				return "需要进行动态认证";
			case 10004 :
				return "登录用户未授权";
			case 10005 :
				return "登录模块不正确";
			case 10006 :
				return "需要强制修改密码";
			case 10007 :
				return "登录状态禁止登陆";
			case 10008 :
				return "登录密码不正确";
			case 10009 :
				return "没有该模块登录权限";
			case 10010 :
				return "登录数量超限";
			case 10011 :
				return "登录用户不在服务器标识下可登录用户列表中";
			case 10101 :
				return "登录用户信息查询失败";
			case 10102 :
				return "登录用户信息增加失败";
			case 10103 :
				return "登录用户信息修改失败";
			case 10104 :
				return "登录用户信息删除失败";
			case 10105 :
				return "存在关联信息，删除失败";
			case 10201 :
				return "登录用户状态查询失败";
			case 10202 :
				return "登录用户状态增加失败";
			case 10203 :
				return "登录用户状态修改失败";
			case 10204 :
				return "登录用户状态删除失败";
			case 10301 :
				return "软件授权信息查询失败";
			case 10302 :
				return "软件授权信息增加失败";
			case 10303 :
				return "软件授权信息修改失败";
			case 10304 :
				return "软件授权信息删除失败";
			case 10305 :
				return "存在关联信息，删除失败";
			case 10401 :
				return "登录用户软件授权查询失败";
			case 10402 :
				return "登录用户软件授权增加失败";
			case 10403 :
				return "登录用户软件授权删除失败";
			case 10501 :
				return "权限信息查询失败";
			case 10601 :
				return "角色信息查询失败";
			case 10602 :
				return "角色信息增加失败";
			case 10603 :
				return "角色信息修改失败";
			case 10604 :
				return "角色信息删除失败";
			case 10605 :
				return "存在关联信息，删除失败";
			case 10701 :
				return "角色下属权限查询失败";
			case 10702 :
				return "角色下属权限增加失败";
			case 10703 :
				return "角色下属权限删除失败";
			case 10801 :
				return "登录用户下属角色查询失败";
			case 10802 :
				return "登录用户下属角色增加失败";
			case 10803 :
				return "登录用户下属角色删除失败";
			case 10901 :
				return "登录用户下属权限查询失败";
			case 10902 :
				return "登录用户下属权限增加失败";
			case 10903 :
				return "登录用户下属权限删除失败";
			case 11001 :
				return "登录用户下属所有权限查询失败";
			case 11002 :
				return "登录用户下属所有权限增加通知失败";
			case 11003 :
				return "登录用户下属所有权限删除通知失败";
			case 11101 :
				return "账号分组信息查询失败";
			case 11102 :
				return "账号分组信息增加失败";
			case 11103 :
				return "账号分组信息修改失败";
			case 11104 :
				return "账号分组信息删除失败";
			case 11201 :
				return "账号分组下属资金账号查询失败";
			case 11202 :
				return "账号分组下属资金账号增加失败";
			case 11203 :
				return "账号分组下属资金账号删除失败";
			case 11204 :
				return "账号分组下属资金账号增加失败，该分组属性一个客户只能对应一个分组";
			case 11301 :
				return "登录用户下属账号分组查询失败";
			case 11302 :
				return "登录用户下属账号分组增加失败";
			case 11303 :
				return "登录用户下属账号分组删除失败";
			case 11401 :
				return "登录用户下属资金账号查询失败";
			case 11402 :
				return "登录用户下属资金账号增加失败";
			case 11403 :
				return "登录用户下属资金账号删除失败";
			case 11501 :
				return "登录用户下属所有资金账号查询失败";
			case 11502 :
				return "登录用户下属所有资金账号增加通知失败";
			case 11503 :
				return "登录用户下属所有资金账号删除通知失败";
			case 11601 :
				return "密码类型信息查询失败";
			case 11602 :
				return "密码类型信息查询失败";
			case 11701 :
				return "登录用户密码修改失败";
			case 11702 :
				return "登录用户密码修改失败——原始密码错误";
			case 11703 :
				return "登录用户密码修改失败——不能与前n次密码相同";
			case 11704 :
				return "新密码不符合密码复杂度要求";
			case 11801 :
				return "连接信息查询失败";
			case 11802 :
				return "连接详细信息查询失败";
			case 11803 :
				return "连接信息删除失败";
			case 11901 :
				return "登录用户预留信息修改失败";
			case 12001 :
				return "服务器标识下可登录用户列表查询失败";
			case 12002 :
				return "服务器标识下可登录用户列表增加失败";
			case 12003 :
				return "服务器标识下可登录用户列表删除失败";
			case 12011 :
				return "分组属性信息查失败";
			case 12012 :
				return "分组属性信息增加失败";
			case 12013 :
				return "分组属性信息修改失败";
			case 12014 :
				return "分组属性信息删除失败";
			case 12021 :
				return "内部银期认证请求失败";
			case 12031 :
				return "资金账号银期密码个人修改请求失败";
			case 12032 :
				return "资金账号银期密码用户修改请求失败";
			case 12033 :
				return "资金账号银期密码修改原始密码错误";
			case 20101 :
				return "币种查询失败";
			case 20102 :
				return "交易币种查询失败";
			case 20103 :
				return "币种增加失败";
			case 20104 :
				return "币种删除失败";
			case 20105 :
				return "币种修改失败";
			case 20106 :
				return "币种级联删除失败";
			case 20107 :
				return "币种汇率变更历史流水查询失败";
			case 20201 :
				return "资金账号信息查询失败";
			case 20202 :
				return "资金账号摘要查询失败";
			case 20203 :
				return "资金账号信息增加失败";
			case 20204 :
				return "资金账号信息删除失败";
			case 20205 :
				return "资金账号信息修改失败";
			case 20206 :
				return "全部资金账号信息查询失败";
			case 20301 :
				return "机构客户信息查询失败";
			case 20302 :
				return "机构客户信息增加失败";
			case 20303 :
				return "机构客户信息删除失败";
			case 20304 :
				return "机构客户信息修改失败";
			case 20401 :
				return "客户证件信息查询失败";
			case 20402 :
				return "客户证件信息增加失败";
			case 20403 :
				return "客户证件信息删除失败";
			case 20404 :
				return "客户证件信息修改失败";
			case 20501 :
				return "客户父资金账号查询失败";
			case 20502 :
				return "客户父资金账号查询失败(交易)";
			case 20503 :
				return "客户父资金账号增加失败";
			case 20504 :
				return "客户父资金账号删除失败";
			case 20505 :
				return "客户父资金账号修改失败";
			case 20601 :
				return "交易所信息查询失败";
			case 20602 :
				return "交易所信息增加失败";
			case 20603 :
				return "交易所信息删除失败";
			case 20604 :
				return "交易所信息修改失败";
			case 20701 :
				return "客户交易编码查询失败";
			case 20702 :
				return "客户交易编码增加失败";
			case 20703 :
				return "客户交易编码删除失败";
			case 20704 :
				return "客户交易编码修改失败";
			case 20705 :
				return "客户交易编码账户已存在";
			case 20801 :
				return "客户银行信息查询失败";
			case 20802 :
				return "客户银行信息增加失败";
			case 20803 :
				return "客户银行信息删除失败";
			case 20804 :
				return "客户银行信息修改失败";
			case 20901 :
				return "关系人信息查询失败";
			case 20902 :
				return "关系人信息增加失败";
			case 20903 :
				return "关系人信息删除失败";
			case 20904 :
				return "关系人信息修改失败";
			case 21001 :
				return "属性信息查询失败";
			case 21002 :
				return "属性信息增加失败";
			case 21003 :
				return "属性信息删除失败";
			case 21004 :
				return "属性信息修改失败";
			case 21101 :
				return "客户属性信息查询失败";
			case 21102 :
				return "客户属性信息增加失败";
			case 21103 :
				return "客户属性信息修改失败";
			case 21201 :
				return "上手信息查询失败";
			case 21202 :
				return "上手信息增加失败";
			case 21203 :
				return "上手信息删除失败";
			case 21204 :
				return "上手信息修改失败";
			case 21205 :
				return "上手信息级联删除失败";
			case 21301 :
				return "上手银行信息查询失败";
			case 21302 :
				return "上手银行信息增加失败";
			case 21303 :
				return "上手银行信息删除失败";
			case 21304 :
				return "上手银行信息修改失败";
			case 21305 :
				return "上手银行信息级联删除失败";
			case 21401 :
				return "上手通道信息查询失败";
			case 21402 :
				return "上手通道信息增加失败";
			case 21403 :
				return "上手通道信息删除失败";
			case 21404 :
				return "上手通道信息修改失败";
			case 21405 :
				return "上手通道信息级联删除失败";
			case 21501 :
				return "币种组信息查询失败";
			case 21502 :
				return "币种组信息增加失败";
			case 21503 :
				return "币种组信息删除失败";
			case 21504 :
				return "币种组信息修改失败";
			case 21505 :
				return "币种组信息存在币种信息关联删除失败";
			case 21601 :
				return "银行标识查询失败";
			case 21602 :
				return "银行标识增加失败";
			case 21603 :
				return "银行标识删除失败";
			case 21604 :
				return "银行标识修改失败";
			case 21605 :
				return "银行标识信息存在级联而删除失败";
			case 21701 :
				return "公司银行信息查询失败";
			case 21702 :
				return "公司银行信息增加失败";
			case 21703 :
				return "公司银行信息删除失败";
			case 21704 :
				return "公司银行信息修改失败";
			case 21801 :
				return "汇兑汇率查询失败";
			case 21802 :
				return "汇兑汇率增加失败";
			case 21803 :
				return "汇兑汇率删除失败";
			case 21804 :
				return "汇兑汇率修改失败";
			case 21901 :
				return "客户换汇额度查询失败";
			case 21902 :
				return "客户换汇额度增加失败";
			case 21903 :
				return "客户换汇额度删除失败";
			case 21904 :
				return "客户换汇额度修改失败";
			case 22001 :
				return "品种信息查询失败";
			case 22002 :
				return "品种信息查询失败(交易)";
			case 22003 :
				return "品种信息增加失败";
			case 22004 :
				return "品种信息删除失败";
			case 22005 :
				return "品种信息修改失败";
			case 22101 :
				return "品种板块查询失败";
			case 22102 :
				return "品种板块增加失败";
			case 22103 :
				return "品种板块删除失败";
			case 22104 :
				return "品种板块修改失败";
			case 22105 :
				return "品种板块与板块映射品种级联删除失败";
			case 22106 :
				return "父品种板块有下属子品种板块删除失败";
			case 22201 :
				return "品种板块对应品种查询失败";
			case 22202 :
				return "品种板块对应品种增加失败";
			case 22203 :
				return "品种板块对应品种删除失败";
			case 22204 :
				return "品种板块对应品种修改失败";
			case 22301 :
				return "品种组查询失败";
			case 22302 :
				return "品种组增加失败";
			case 22303 :
				return "品种组删除失败";
			case 22304 :
				return "品种组修改失败";
			case 22305 :
				return "品种组级联删除失败";
			case 22401 :
				return "分组对应品种查询失败";
			case 22402 :
				return "分组对应品种增加失败";
			case 22403 :
				return "分组对应品种删除失败";
			case 22404 :
				return "分组对应品种修改失败";
			case 22501 :
				return "交易时段模板查询失败";
			case 22502 :
				return "交易时段模板增加失败";
			case 22503 :
				return "交易时段模板删除失败";
			case 22504 :
				return "交易时段模板修改失败";
			case 22601 :
				return "品种行情信息查询失败";
			case 22602 :
				return "品种行情信息增加失败";
			case 22603 :
				return "品种行情信息删除失败";
			case 22604 :
				return "品种行情信息修改失败";
			case 22701 :
				return "品种关联信息查询失败";
			case 22702 :
				return "品种关联信息增加失败";
			case 22703 :
				return "品种关联信息删除失败";
			case 22704 :
				return "品种关联信息修改失败";
			case 22801 :
				return "合约信息查询失败";
			case 22802 :
				return "合约信息增加失败";
			case 22803 :
				return "合约信息删除失败";
			case 22804 :
				return "合约信息修改失败";
			case 22805 :
				return "合约信息因有持仓级联删除失败";
			case 22901 :
				return "特殊期权标的查询失败";
			case 22902 :
				return "特殊期权标的增加失败";
			case 22903 :
				return "特殊期权标的删除失败";
			case 22904 :
				return "特殊期权标的修改失败";
			case 23001 :
				return "上手品种代码映射查询失败";
			case 23002 :
				return "上手品种代码映射增加失败";
			case 23003 :
				return "上手品种代码映射删除失败";
			case 23004 :
				return "上手品种代码映射修改失败";
			case 23101 :
				return "外部品种代码映射查询失败";
			case 23102 :
				return "外部品种代码映射增加失败";
			case 23103 :
				return "外部品种代码映射删除失败";
			case 23104 :
				return "外部品种代码映射修改失败";
			case 23201 :
				return "外部数据来源查询失败";
			case 23202 :
				return "外部数据来源增加失败";
			case 23203 :
				return "外部数据来源删除失败";
			case 23204 :
				return "外部数据来源修改失败";
			case 23301 :
				return "上手手续费查询失败";
			case 23302 :
				return "上手手续费增加失败";
			case 23303 :
				return "上手手续费删除失败";
			case 23304 :
				return "上手手续费修改失败";
			case 23401 :
				return "手续费模板查询失败";
			case 23402 :
				return "手续费模板增加失败";
			case 23403 :
				return "手续费模板删除失败";
			case 23404 :
				return "手续费模板修改失败";
			case 23501 :
				return "客户对应手续费模板查询失败";
			case 23502 :
				return "客户对应手续费模板增加失败";
			case 23503 :
				return "客户对应手续费模板删除失败";
			case 23504 :
				return "客户对应手续费模板修改失败";
			case 23601 :
				return "上手其他费用查询失败";
			case 23602 :
				return "上手其他费用增加失败";
			case 23603 :
				return "上手其他费用删除失败";
			case 23604 :
				return "上手其他费用修改失败";
			case 23701 :
				return "客户其他费用查询失败";
			case 23702 :
				return "客户其他费用增加失败";
			case 23703 :
				return "客户其他费用删除失败";
			case 23704 :
				return "客户其他费用修改失败";
			case 23801 :
				return "上手保证金查询失败";
			case 23802 :
				return "上手保证金增加失败";
			case 23803 :
				return "上手保证金删除失败";
			case 23804 :
				return "上手保证金修改失败";
			case 23901 :
				return "上手保证金调整查询失败";
			case 23902 :
				return "上手保证金调整增加失败";
			case 23903 :
				return "上手保证金调整删除失败";
			case 23904 :
				return "上手保证金调整修改失败";
			case 24001 :
				return "保证金模板查询失败";
			case 24002 :
				return "保证金模板增加失败";
			case 24003 :
				return "保证金模板删除失败";
			case 24004 :
				return "保证金模板修改失败";
			case 24101 :
				return "客户对应保证金模板查询失败";
			case 24102 :
				return "客户对应保证金模板增加失败";
			case 24103 :
				return "客户对应保证金模板删除失败";
			case 24104 :
				return "客户对应保证金模板修改失败";
			case 24201 :
				return "保证金模板调整查询失败";
			case 24202 :
				return "保证金模板调整增加失败";
			case 24203 :
				return "保证金模板调整删除失败";
			case 24204 :
				return "保证金模板调整修改失败";
			case 24301 :
				return "锁仓比例查询失败";
			case 24302 :
				return "锁仓比例增加失败";
			case 24303 :
				return "锁仓比例删除失败";
			case 24304 :
				return "锁仓比例修改失败";
			case 24401 :
				return "交易权限查询失败";
			case 24402 :
				return "交易权限增加失败";
			case 24403 :
				return "交易权限删除失败";
			case 24404 :
				return "交易权限修改失败";
			case 24501 :
				return "最大下单量查询失败";
			case 24502 :
				return "最大下单量增加失败";
			case 24503 :
				return "最大下单量删除失败";
			case 24504 :
				return "最大下单量修改失败";
			case 24601 :
				return "最大持仓量查询失败";
			case 24602 :
				return "最大持仓量增加失败";
			case 24603 :
				return "最大持仓量删除失败";
			case 24604 :
				return "最大持仓量修改失败";
			case 24701 :
				return "交易路由控制查询失败";
			case 24702 :
				return "交易路由控制增加失败";
			case 24703 :
				return "交易路由控制删除失败";
			case 24704 :
				return "交易路由控制修改失败";
			case 24801 :
				return "行情路由控制查询失败";
			case 24802 :
				return "行情路由控制增加失败";
			case 24803 :
				return "行情路由控制删除失败";
			case 24804 :
				return "行情路由控制修改失败";
			case 24901 :
				return "系统参数查询失败";
			case 24902 :
				return "系统参数增加失败";
			case 24903 :
				return "系统参数删除失败";
			case 24904 :
				return "系统参数修改失败";
			case 25001 :
				return "项目信息定义查询失败";
			case 25002 :
				return "项目值信息定义修改失败";
			case 25101 :
				return "手续费模板信息查询失败";
			case 25102 :
				return "手续费模板信息增加失败";
			case 25103 :
				return "手续费模板信息删除失败";
			case 25104 :
				return "手续费模板信息修改失败";
			case 25105 :
				return "手续费模板信息级联删除失败";
			case 25201 :
				return "保证金模板信息查询失败";
			case 25202 :
				return "保证金模板信息增加失败";
			case 25203 :
				return "保证金模板信息删除失败";
			case 25204 :
				return "保证金模板信息修改失败";
			case 25205 :
				return "保证金模板信息级联删除失败";
			case 25301 :
				return "其他费用类型信息查询失败";
			case 25302 :
				return "其他费用类型信息增加失败";
			case 25303 :
				return "其他费用类型信息删除失败";
			case 25304 :
				return "其他费用类型信息修改失败";
			case 25305 :
				return "其他费用类型信息级联删除失败";
			case 25501 :
				return "品种委托类型查询失败";
			case 25502 :
				return "品种委托类型增加失败";
			case 25503 :
				return "品种委托类型删除失败";
			case 25504 :
				return "品种委托类型修改失败";
			case 25601 :
				return "品种委托时间有效性查询失败";
			case 25602 :
				return "品种委托时间有效性增加失败";
			case 25603 :
				return "品种委托时间有效性删除失败";
			case 25604 :
				return "品种委托时间有效性修改失败";
			case 25701 :
				return "属性级别信息查询失败";
			case 25702 :
				return "属性级别信息增加失败";
			case 25703 :
				return "属性级别信息删除失败";
			case 25704 :
				return "属性级别信息修改失败";
			case 25705 :
				return "属性级别信息级联删除失败";
			case 25801 :
				return "交易日历模板信息查询失败";
			case 25802 :
				return "交易日历模板信息增加失败";
			case 25803 :
				return "交易日历模板信息删除失败";
			case 25804 :
				return "交易日历模板信息修改失败";
			case 25901 :
				return "品种交易日历模板查询失败";
			case 25902 :
				return "品种交易日历模板增加失败";
			case 25903 :
				return "品种交易日历模板删除失败";
			case 25904 :
				return "品种交易日历模板修改失败";
			case 26001 :
				return "实值额查询失败";
			case 26002 :
				return "实值额增加失败";
			case 26003 :
				return "实值额删除失败";
			case 26004 :
				return "实值额修改失败";
			case 26101 :
				return "自动生成期权组合失败";
			case 26201 :
				return "交易日历模板信息基础查询失败";
			case 26202 :
				return "交易日历模板信息基础增加失败";
			case 26203 :
				return "交易日历模板信息基础删除失败";
			case 26204 :
				return "交易日历模板信息基础修改失败";
			case 26301 :
				return "账户证件类型查询失败";
			case 26401 :
				return "服务器标识查询失败";
			case 26402 :
				return "服务器标识增加失败";
			case 26403 :
				return "服务器标识删除失败";
			case 26404 :
				return "服务器标识修改失败";
			case 26405 :
				return "服务器标识级联删除失败";
			case 26501 :
				return "服务器标识映射资金账号对应手续费查询失败";
			case 26601 :
				return "服务器标识映射资金账号对应保证金查询失败";
			case 26701 :
				return "服务器标识映射资金账号对应手续费信息查询失败";
			case 26801 :
				return "服务器标识映射资金账号对应保证金信息查询失败";
			case 26901 :
				return "县市信息查询失败";
			case 27001 :
				return "省份信息查询失败";
			case 27101 :
				return "银期签到签退查询失败";
			case 27102 :
				return "银期签到签退增加失败";
			case 27201 :
				return "银期流水查询失败";
			case 27202 :
				return "银期流水增加失败";
			case 27301 :
				return "银期转账参数查询失败";
			case 27302 :
				return "银期转账参数增加失败";
			case 27303 :
				return "银期转账参数修改失败";
			case 27304 :
				return "银期转账参数删除失败";
			case 27401 :
				return "银期转账时间段查询失败";
			case 27402 :
				return "银期转账时间段增加失败";
			case 27403 :
				return "银期转账时间段修改失败";
			case 27404 :
				return "银期转账时间段删除失败";
			case 27501 :
				return "银期转账签解约历史流水查询失败";
			case 27502 :
				return "银期转账签解约历史流水增加失败";
			case 27601 :
				return "交易时段模板基础查询失败";
			case 27602 :
				return "交易时段模板基础增加失败";
			case 27603 :
				return "交易时段模板基础删除失败";
			case 27604 :
				return "交易时段模板基础修改失败";
			case 27605 :
				return "交易时段模板基础级联删除失败";
			case 27701 :
				return "机构分类信息查询失败";
			case 27801 :
				return "组织性质信息查询失败";
			case 27901 :
				return "9.0系统交易日历信息查询失败";
			case 27902 :
				return "9.0系统交易日历信息增加失败";
			case 27903 :
				return "9.0系统交易日历信息修改失败";
			case 27904 :
				return "9.0系统交易日历信息删除失败";
			case 27905 :
				return "通过交易日历查询当前交易日和上次结算日查询失败";
			case 28001 :
				return "交易所交易日止信息查询失败";
			case 28002 :
				return "交易所交易日止信息增加失败";
			case 28003 :
				return "交易所交易日止信息修改失败";
			case 28004 :
				return "交易所交易日止信息删除失败";
			case 28005 :
				return "根据交易日查询交易所详细日期查询失败";
			case 28101 :
				return "合约临时交割信息查询失败";
			case 28102 :
				return "合约临时交割信息增加失败";
			case 28103 :
				return "合约临时交割信息删除失败";
			case 28201 :
				return "审核信息表查询失败";
			case 28202 :
				return "审核信息表增加失败";
			case 28203 :
				return "审核信息表修改失败";
			case 28204 :
				return "审核信息表删除失败";
			case 28205 :
				return "判断是否为审核表查询失败";
			case 28206 :
				return "审核数据删除信息表查询失败";
			case 28207 :
				return "审核数据删除信息表增加失败";
			case 28208 :
				return "审核数据删除信息表删除失败";
			case 28209 :
				return "审核基础信息表增加失败";
			case 28210 :
				return "审核基础信息表修改失败";
			case 28301 :
				return "操作日志查询失败";
			case 28302 :
				return "操作日志增加失败";
			case 28303 :
				return "操作日志删除失败";
			case 28304 :
				return "风险参数查询失败";
			case 28305 :
				return "风险参数修改失败";
			case 28306 :
				return "出金笔数，金额查询失败";
			case 28307 :
				return "出金笔数，金额增加失败";
			case 28401 :
				return "禁止自动复核订单查询失败";
			case 28402 :
				return "禁止自动复核订单增加失败";
			case 28403 :
				return "禁止自动复核订单删除失败";
			case 28501 :
				return "资金账号对应交易所的行情合约数量查询失败";
			case 28502 :
				return "资金账号对应交易所的行情合约数量增加失败";
			case 28503 :
				return "资金账号对应交易所的行情合约数量修改失败";
			case 28504 :
				return "资金账号对应交易所的行情合约数量删除失败";
			case 28601 :
				return "父品种板块查询失败";
			case 28602 :
				return "父品种板块增加失败";
			case 28603 :
				return "父品种板块修改失败";
			case 28604 :
				return "父品种板块删除失败";
			case 28701 :
				return "计量单位信息查询失败";
			case 28702 :
				return "计量单位换算关系信息查询失败";
			case 28703 :
				return "计价单位换算关系信息查询失败";
			case 28801 :
				return "计价单位信息查询失败";
			case 28802 :
				return "计价单位信息增加失败";
			case 28803 :
				return "计价单位信息修改失败";
			case 28804 :
				return "计价位信息删除失败";
			case 28901 :
				return "用户下单频率查询失败";
			case 28902 :
				return "用户下单频率增加失败";
			case 28903 :
				return "用户下单频率修改失败";
			case 28904 :
				return "用户下单频率删除失败";
			case 29001 :
				return "数据链接查询失败";
			case 29002 :
				return "数据链接增加失败";
			case 29003 :
				return "数据链接修改失败";
			case 29004 :
				return "数据链接删除失败";
			case 29101 :
				return "只可平仓提前天数查询失败";
			case 29102 :
				return "只可平仓提前天数增加失败";
			case 29103 :
				return "只可平仓提前天数删除失败";
			case 29104 :
				return "只可平仓提前天数修改失败";
			case 29201 :
				return "LME交易日历信息查询失败";
			case 29202 :
				return "LME交易日历信息增加失败";
			case 29203 :
				return "LME交易日历信息修改失败";
			case 29204 :
				return "LME交易日历信息删除失败";
			case 29205 :
				return "根据交易日查询LME详细交易日期查询失败";
			case 29301 :
				return "手续费区间模板查询失败";
			case 29302 :
				return "手续费区间模板增加失败";
			case 29303 :
				return "手续费区间模板删除失败";
			case 29304 :
				return "手续费区间模板修改失败";
			case 29401 :
				return "客户对应手续费区间模板查询失败";
			case 29402 :
				return "客户对应手续费区间模板增加失败";
			case 29403 :
				return "客户对应手续费区间模板删除失败";
			case 29404 :
				return "客户对应手续费区间模板修改失败";
			case 29411 :
				return "资金账户所属一线通编号系统查询失败";
			case 29412 :
				return "资金账户所属一线通编号系统增加失败";
			case 29413 :
				return "资金账户所属一线通编号系统删除失败";
			case 29421 :
				return "一线通账号信息查询失败";
			case 29422 :
				return "一线通账号信息增加失败";
			case 29423 :
				return "一线通账号信息删除失败";
			case 29431 :
				return "客户最终手续费查询失败";
			case 29432 :
				return "客户最终保证金查询失败";
			case 29433 :
				return "手续费模板批量修改失败";
			case 29434 :
				return "保证金模板批量修改失败";
			case 29441 :
				return "外汇期货最新费率查询失败";
			case 29442 :
				return "外汇期货当前费率查询失败";
			case 29443 :
				return "外汇期货费率修改失败";
			case 29444 :
				return "外汇期货费率增加失败";
			case 29445 :
				return "外汇期货费率删除失败";
			case 29451 :
				return "邮件信息查询失败";
			case 29452 :
				return "邮件信息增加失败";
			case 29453 :
				return "邮件信息修改失败";
			case 29454 :
				return "邮件信息删除失败";
			case 29461 :
				return "外汇利率查询失败";
			case 29462 :
				return "外汇利率增加失败";
			case 29463 :
				return "外汇利率修改失败";
			case 29464 :
				return "外汇利率删除失败";
			case 29471 :
				return "外汇假期查询失败";
			case 29472 :
				return "外汇假期增加失败";
			case 29473 :
				return "外汇假期修改失败";
			case 29474 :
				return "外汇假期删除失败";
			case 29481 :
				return "客户关联查询失败";
			case 29482 :
				return "客户关联增加失败";
			case 29483 :
				return "客户关联修改失败";
			case 29484 :
				return "客户关联删除失败";
			case 40001 :
				return "历史委托查询错误";
			case 40002 :
				return "历史委托增加错误";
			case 40003 :
				return "历史委托修改错误";
			case 40004 :
				return "历史委托删除";
			case 40005 :
				return "交易服务器委托查询错误";
			case 40101 :
				return "历史成交查询错误";
			case 40102 :
				return "历史成交增加错误";
			case 40103 :
				return "历史成交修改错误";
			case 40104 :
				return "历史成交删除错误";
			case 40105 :
				return "交易服务器成交查询错误";
			case 40201 :
				return "历史持仓查询错误";
			case 40202 :
				return "历史持仓增加错误";
			case 40203 :
				return "历史持仓修改错误";
			case 40204 :
				return "历史持仓删除错误";
			case 40205 :
				return "交易服务器持仓查询错误";
			case 40206 :
				return "上一交易日查询错误";
			case 40301 :
				return "历史平仓查询错误";
			case 40401 :
				return "历史未到期平仓查询错误";
			case 40402 :
				return "历史未到期平仓增加错误";
			case 40403 :
				return "历史未到期平仓修改错误";
			case 40404 :
				return "历史未到期平仓删除错误";
			case 40501 :
				return "历史交割查询错误";
			case 40502 :
				return "历史交割增加错误";
			case 40503 :
				return "历史交割修改错误";
			case 40504 :
				return "历史交割删除错误";
			case 40601 :
				return "结算价查询错误";
			case 40602 :
				return "结算价增加错误";
			case 40603 :
				return "结算价修改错误";
			case 40604 :
				return "结算价删除错误";
			case 40701 :
				return "有效合约生成错误";
			case 40801 :
				return "移仓查询错误";
			case 40802 :
				return "移仓增加错误";
			case 40803 :
				return "移仓删除错误";
			case 40901 :
				return "客户出入金查询错误";
			case 40902 :
				return "客户出入金增加错误";
			case 40903 :
				return "客户出入金增加通知错误";
			case 41001 :
				return "客户资金调整查询错误";
			case 41002 :
				return "客户资金调增增加错误";
			case 41003 :
				return "客户资金调整增加通知错误";
			case 41201 :
				return "客户资金汇兑查询错误";
			case 41202 :
				return "客户资金汇兑增加错误";
			case 41203 :
				return "客户资金汇兑增加通知错误";
			case 41301 :
				return "客户转账信息查询错误";
			case 41302 :
				return "客户转账信息增加错误";
			case 41303 :
				return "客户转账增加通知错误";
			case 41401 :
				return "Span保证金查询错误";
			case 41402 :
				return "Span保证金增加错误";
			case 41403 :
				return "Span保证金修改错误";
			case 41404 :
				return "Span保证金修改错误";
			case 41501 :
				return "客户资金查询失败";
			case 41502 :
				return "交易查询客户资金失败";
			case 41503 :
				return "客户资金增加失败";
			case 41504 :
				return "客户资金删除失败";
			case 41601 :
				return "客户冻结资金查询错误";
			case 41602 :
				return "客户冻结资金增加错误";
			case 41603 :
				return "客户冻结资金增加通知错误";
			case 41604 :
				return "客户冻结资金修改错误";
			case 41605 :
				return "客户冻结资金修改通知错误";
			case 41701 :
				return "上手出入金查询错误";
			case 41702 :
				return "上手出入金增加错误";
			case 41703 :
				return "上手出入金修改错误";
			case 41704 :
				return "上手出入金删除错误";
			case 41801 :
				return "上手资金调整查询错误";
			case 41802 :
				return "上手资金调整增加错误";
			case 41803 :
				return "上手资金调整修改错误";
			case 41804 :
				return "上手资金调整删除错误";
			case 41901 :
				return "上手资金查询错误";
			case 42001 :
				return "结算请求错误";
			case 42101 :
				return "结算过程查询错误";
			case 42102 :
				return "结算批次号查询错误";
			case 42201 :
				return "日志查询错误";
			case 42301 :
				return "交易消息发送错误";
			case 42302 :
				return "交易消息查询错误";
			case 42303 :
				return "交易消息推送通知错误";
			case 42401 :
				return "行情消息发送错误";
			case 42402 :
				return "行情消息查询错误";
			case 42403 :
				return "行情消息推送通知错误";
			case 42501 :
				return "交易统计表错误";
			case 42601 :
				return "PCS请求失败";
			case 42602 :
				return "CGM请求失败";
			case 42603 :
				return "LargeTrader请求失败";
			case 42604 :
				return "PCS查询请求失败";
			case 42605 :
				return "CGM查询请求失败";
			case 42606 :
				return "LargeTrader查询请求失败";
			case 42701 :
				return "CME成交导入请求失败";
			case 42702 :
				return "CME成交查询请求失败";
			case 42703 :
				return "CME持仓导入请求失败";
			case 42704 :
				return "CME持仓查询请求失败";
			case 42705 :
				return "CME成交删除请求失败";
			case 42706 :
				return "CME持仓删除请求失败";
			case 42801 :
				return "MQ成交增加请求失败";
			case 42802 :
				return "MQ成交查询请求失败";
			case 42901 :
				return "集合账户平仓信息查询请求失败";
			case 42902 :
				return "集合账户平仓信息增加请求失败";
			case 42903 :
				return "集合账户平仓信息修改请求失败";
			case 42904 :
				return "集合账户平仓信息删除请求失败";
			case 43001 :
				return "成交核对请求失败";
			case 43002 :
				return "持仓核对请求失败";
			case 43101 :
				return "持仓处理请求失败";
			case 43201 :
				return "持仓折抵查询请求失败";
			case 43202 :
				return "持仓折抵增加请求失败";
			case 43203 :
				return "持仓折抵修改请求失败";
			case 43204 :
				return "持仓折抵删除请求失败";
			case 43301 :
				return "大连保证金优惠参数信息查询请求失败";
			case 43302 :
				return "大连保证金优惠参数信息增加请求失败";
			case 43303 :
				return "大连保证金优惠参数信息修改请求失败";
			case 43304 :
				return "大连保证金优惠参数信息删除请求失败";
			case 43401 :
				return "郑商所组合申请信息查询请求失败";
			case 43402 :
				return "郑商所组合申请信息增加请求失败";
			case 43403 :
				return "郑商所组合申请信息修改请求失败";
			case 43404 :
				return "郑商所组合申请信息删除请求失败";
			case 43501 :
				return "成交核对报表请求失败";
			case 43502 :
				return "持仓核对报表请求失败";
			case 43601 :
				return "客户授信资金增加请求失败";
			case 43602 :
				return "客户授信资金查询请求失败";
			case 43701 :
				return "外盘持仓核对请求错误";
			case 43702 :
				return "外盘客户资金核对请求错误";
			case 43703 :
				return "外盘未到期平仓核对请求错误";
			case 43801 :
				return "其他资金查询请求错误";
			case 43802 :
				return "其他资金增加请求错误";
			case 43803 :
				return "其他资金修改请求错误";
			case 43804 :
				return "其他资金删除请求错误";
			case 43901 :
				return "客户资金刷新通知请求错误";
			case 44001 :
				return "根据客户移仓信息查询请求错误";
			case 44002 :
				return "根据客户移仓信息增加请求错误";
			case 44003 :
				return "根据客户移仓信息修改请求错误";
			case 44004 :
				return "根据客户移仓信息删除请求错误";
			case 44101 :
				return "调单请求错误";
			case 44201 :
				return "换汇通知表错误";
			case 44301 :
				return "追保强平报表错误";
			case 44401 :
				return "资金对账表错误";
			case 44501 :
				return "交割警示表错误";
			case 44602 :
				return "外汇高开低收价格增加请求错误";
			case 44603 :
				return "外汇高开低收价格修改请求错误";
			case 44604 :
				return "外汇高开低收价格删除请求错误";
			case 44701 :
				return "待交割信息查询请求错误";
			case 44702 :
				return "待交割信息增加请求错误";
			case 44703 :
				return "待交割信息修改请求错误";
			case 44704 :
				return "待交割信息删除请求错误";
			case 44801 :
				return "客户质押资金查询请求错误";
			case 44802 :
				return "客户质押资金增加请求错误";
			case 44901 :
				return "客户结售汇查询请求错误";
			case 44902 :
				return "客户结售汇增加请求错误";
			case 44903 :
				return "客户结售汇删除请求错误";
			case 60001 :
				return "资金账号不存在";
			case 60002 :
				return "资金账号状态不正确";
			case 60011 :
				return "下单无效的合约";
			case 60021 :
				return "下单合约无交易路由";
			case 60022 :
				return "持仓量超过最大限制";
			case 60023 :
				return "禁止交易";
			case 60024 :
				return "只可平仓";
			case 60031 :
				return "下单资金不足";
			case 60032 :
				return "不支持的订单类型";
			case 60033 :
				return "不支持的时间有效类型";
			case 60034 :
				return "不支持的策略单类型";
			case 60035 :
				return "平仓数量超过已有持仓量";
			case 60036 :
				return "下单自动审核失败";
			case 60037 :
				return "LME未准备就绪";
			case 60038 :
				return "平仓方式错误";
			case 60039 :
				return "下单对应的父账号资金不足";
			case 60040 :
				return "互换单的合约格式错误";
			case 60051 :
				return "当前客户不能使用此账号交易";
			case 60052 :
				return "上手通道状态不正常";
			case 60053 :
				return "上手通道未开通";
			case 60061 :
				return "撤单无此系统号";
			case 60062 :
				return "此状态不允许撤单";
			case 60063 :
				return "此状态不允许激活";
			case 60071 :
				return "此状态禁止审核";
			case 60072 :
				return "订单审核失败";
			case 60081 :
				return "此状态不允许改单";
			case 60082 :
				return "人工单不允许改单";
			case 60091 :
				return "手续费参数错误";
			case 60092 :
				return "保证金参数错误";
			case 60100 :
				return "操作账号只可查询";
			case 60101 :
				return "非做市商不能应价";
			case 60102 :
				return "即使子帐号又是做市商不能应价";
			case 60103 :
				return "下单找不到交易编码";
			case 60104 :
				return "操作账号只可开仓";
			case 60105 :
				return "操作账号没有上期挂单查询权限";
			case 61001 :
				return "订单操作频率过高";
			case 61002 :
				return "委托查询返回前不能进行下次查询";
			case 70101 :
				return "一分钟数据按照根数查询失败";
			case 70102 :
				return "一分钟数据按时间段查询失败";
			case 70103 :
				return "一分钟数据按DATE查询失败";
			case 70201 :
				return "三分钟数据按照根数查询失败";
			case 70202 :
				return "三分钟数据按时间段查询失败";
			case 70203 :
				return "三分钟数据按DATE查询失败";
			case 70301 :
				return "五分钟数据按照根数查询失败";
			case 70302 :
				return "五分钟数据按时间段查询失败";
			case 70303 :
				return "五分钟数据按DATE查询失败";
			case 70401 :
				return "十分钟数据按照根数查询失败";
			case 70402 :
				return "十分钟数据按时间段查询失败";
			case 70403 :
				return "十分钟数据按DATE查询失败";
			case 70501 :
				return "十五分钟数据按照根数查询失败";
			case 70502 :
				return "十五分钟数据按时间段查询失败";
			case 70503 :
				return "十五分钟数据按DATE查询失败";
			case 70601 :
				return "三十分钟数据按照根数查询失败";
			case 70602 :
				return "三十分钟数据按时间段查询失败";
			case 70603 :
				return "三十分钟数据按DATE查询失败";
			case 70701 :
				return "六十分钟数据按照根数查询失败";
			case 70702 :
				return "六十分钟数据按时间段查询失败";
			case 70703 :
				return "六十分钟数据按DATE查询失败";
			case 70801 :
				return "120分钟数据按照根数查询失败";
			case 70802 :
				return "120分钟数据按时间段查询失败";
			case 70803 :
				return "120分钟数据按DATE查询失败";
			case 70901 :
				return "240分钟数据按照根数查询失败";
			case 70902 :
				return "240分钟数据按时间段查询失败";
			case 70903 :
				return "240分钟数据按DATE查询失败";
			case 71001 :
				return "30秒数据按照根数查询失败";
			case 71002 :
				return "30秒数据按时间段查询失败";
			case 71003 :
				return "30秒数据按DATE查询失败";
			case 71101 :
				return "Tick数据按照根数查询失败";
			case 71102 :
				return "Tick数据按时间段查询失败";
			case 71103 :
				return "Tick数据按DATE查询失败";
			case 71201 :
				return "日线数据按照根数查询失败";
			case 71202 :
				return "日线数据按时间段查询失败";
			case 71203 :
				return "日线数据按DATE查询失败";
			case 71301 :
				return "周线数据按照根数查询失败";
			case 71302 :
				return "周线数据按时间段查询失败";
			case 71303 :
				return "周线数据按DATE查询失败";
			case 71401 :
				return "月线数据按照根数查询失败";
			case 71402 :
				return "月线数据按时间段查询失败";
			case 71403 :
				return "月线数据按DATE查询失败";
			case 71501 :
				return "年线数据按照根数查询失败";
			case 71502 :
				return "年线数据按时间段查询失败";
			case 71503 :
				return "年线数据按DATE查询失败";
			case 71601 :
				return "N分钟数据按照根数查询失败";
			case 71602 :
				return "N分钟数据按时间段查询失败";
			case 71603 :
				return "N分钟数据按DATE查询失败";
			case 71701 :
				return "N天数据按照根数查询失败";
			case 71702 :
				return "N天数据按时间段查询失败";
			case 71703 :
				return "N天数据按DATE查询失败";
			case 71801 :
				return "N秒数据按照根数查询失败";
			case 71802 :
				return "N秒数据按时间段查询失败";
			case 71803 :
				return "N秒数据按DATE查询失败";
			case 72001 :
				return "超过行情最大总订阅数";
			case 72002 :
				return "超过该交易所行情最大订阅数";
			case 72101 :
				return "没有该行情的订阅权限";
			case 72102 :
				return "没有该交易所下行情的订阅权限";
			case 80001 :
				return "发送数据失败";
			case 80002 :
				return "发送报单失败，网关没连接到交易所";
			case 80003 :
				return "报单字段有误";
			case 80004 :
				return "被上手拒绝";
			case 81001 :
				return "创建交易服务对象失败";
			case 81002 :
				return "连接总线失败";
			case 81003 :
				return "接收到的数据错误";
			case 81004 :
				return "数据帧头标识错误";
			case 81005 :
				return "数据不全";
			case 81006 :
				return "FrameHead_TYPE错误";
			case 81007 :
				return "管理服务发来的数据";
			case 81008 :
				return "没有对应的内部代码";
			case 81009 :
				return "没有对应的客户编码";
			case 81010 :
				return "没能对应的外部代码";
			case 81011 :
				return "网关当前不能查询交易所时间";
			case 82001 :
				return "创建交易服务对象失败";
			case 82002 :
				return "连接总线失败";
			case 82003 :
				return "启动链路线程失败";
			case 82004 :
				return "订阅登录服务失败";
			case 82005 :
				return "订阅登录查询服务失败";
			case 82006 :
				return "订阅管理基本服务失败";
			case 82007 :
				return "订阅管理高级服务失败";
			case 82008 :
				return "订阅结算服务失败";
			case 82009 :
				return "订阅结算信息服务失败";
			case 82010 :
				return "订阅结算资金服务失败";
			case 82011 :
				return "订阅交易服务失败";
			case 82012 :
				return "完成端口创建失败";
			case 82013 :
				return "创建并启动工作线程失败";
			case 82014 :
				return "创建并启动侦听线程失败";
			case 82015 :
				return "侦听端口失败";
			case 82016 :
				return "前置不允许该模块登录";
			case 82017 :
				return "前置提交数据失败";
			case 82018 :
				return "前置不允许登录";
			case 82019 :
				return "一次请求太多数据";
			case 82020 :
				return "前置没有所要数据";
			case 82021 :
				return "下单失败，小前置与服务器断开";
			case 82022 :
				return "下单失败，前置与交易服务器断开";
			case 83001 :
				return "不支持的行情协议";
			case 90001 :
				return "期货资金账户不存在";
			case 90002 :
				return "本银行不允许从期货端发起签解约";
			case 90003 :
				return "银期认证密码错误";
			case 90004 :
				return "账户没有该币种资金记录";
			case 90005 :
				return "账户对应币种出金金额大于可转资金";
			case 90006 :
				return "账户对应币种出金超过单笔最大金额";
			case 90007 :
				return "账户对应币种出金超过单日最大出金笔数";
			case 90008 :
				return "账户对应币种出金超过单日最大出金金额";
			case 90009 :
				return "资金冻结失败";
			case 90010 :
				return "转账查询不到账户信息";
			case 90011 :
				return "转账查询不到客户银行信息";
			case 90012 :
				return "转账查询不到客户资金信息";
			case 90013 :
				return "转账查询不到转账参数信息";
			case 90014 :
				return "转账查询不到已出金信息";
			case 90015 :
				return "转账查询不到账户证件信息";
			case 90016 :
				return "银期网关没开启或异常";
			case 90017 :
				return "没有收到或丢失转账流水";
			case 90018 :
				return "客户银行禁止转账";
			case 90019 :
				return "银行转期货操作已完成,无法冲正";
			case 91001 :
				return "风控品种信息查询失败";
			case 91002 :
				return "预算查询不到合约信息";
			case 91003 :
				return "风险资金查询不到风险参数";
			case 91004 :
				return "合约行情价格增加失败";
			case 446001 :
				return "外汇高开低收价格查询请求错误";
			default :
				return "Unknown Error Code" + arg;
		}
	}
}