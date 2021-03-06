package com.league.share.util;


public class ConstantUtil {
	public static final String DOMAIN = "www.silverfox-cn.com";
	public static final String WILDCARD_DOMAIN = "silverfox-cn.com";
	public static final String BACK_SLASH = "\\";
	public static final String SHARP = "#";
	public static final String PERCENT = "%";
	public static final String DOLLAR = "$";
	public static final String SLASH = "/";
	public static final String DOT =".";
	public static final String COMMA =",";
	public static final String MINUS = "-";
	public static final String UNDERLINE = "_";
	public static final String BLANK = "";
	public static final String SEMICOLON = ";";
	public static final String COLON = ":";
	public static final String EQUAL = "=";
	public static final String AND = "&";
	public static final String BR = "<br/>";
	public static final String EMPTY = "";
	public static final String ZERO = "0";
	public static final String SIX = "6";
	public static final String EIGHT = "8";
	public static final String THIRTY = "30";
	public static final String DEFAULT_PASSWORD = "e10adc3949ba59abbe56e057f20f883e";
	public static final String DEFAULT_SYSTEM_FONT = "Serif";
	
	public static final int DEFAULT_CHANNEL_CODE=0;
	public static final int WCHAT_CHANNEL_CODE=1;
	public static final int ANDROID_MARKET_CHANNEL_CODE=2;
	public static final int ONE = 1;
	public static final int REPAYMENT = 1;
	public static final int THIRTY_SECONDS = 30;
	public static final int SIXTY_SECONDS = 60;
	public static final int FIVE_MINUTE = 300;
	public static final int TWENTY_THREE = 23;
	public static final int TWENTY_FIVE = 25;
	public static final int FIFTY_NINE = 59;
	public static final int ONE_THOUSAND = 1000;
	public static final String NINE_TIME = " 09:00:00";
	public static final String MAX_TIME = " 23:59:59";
	public static final String PAYBACK_DECIMAL_FORMAT = "##0.00";
	public static final String SINGLE_DAY_PROFIT_FORMAT = "##0.00000";
	public static final String DECIMAL_FORMAT = "#,##0.00";
	public static final String NUMBER_DATETIME_FORMAT = "yyyyMMddHHmmss";
	public static final String NORMAL_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String NORMAL_DATEHOUR_FORMAT = "yyyy-MM-dd HH";
	public static final String NUMBER_DATE_FORMAT = "yyyyMMdd";
	public static final String NORMAL_DATE_FORMAT = "yyyy-MM-dd";
	public static final String NUMBER_MONTH_FORMAT = "yyyy-MM";
	public static final String HOUR_FORMAT = "HH";
	
	public static final int APP_PAGE_SIZE = 15;
	public static final int PAGE_SIZE = 15;
	public static final String CUSTOMER = "customer";
	public static final String UNIONPAY = "unionPay";
	public static final String IMAGE_TYPE="image/jpeg";
	public static final String[] TIME_POINT = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" };
	public static final String UTF_8 = "utf-8";
	public static final String GBK = "gbk";
	public static final String CODE = "code";
	public static final String RESULT = "result";
	public static final String MSG = "msg";
	public static final String KEY = "key";
	public static final String SIGN = "sign";
	public static final String SIGN_TYPE = "sign_type:signType";
	public static final String SMS_TEXT = "text";
	public static final String SMS_MOBILE = "mobile";
	public static final String MONTERNET_SMS_TEXT = "pszMsg";
	public static final String MONTERNET_SMS_MOBILE = "pszMobis";
	
	public static final String RESOURCE_SERVER_NAME = "silverfox-oauth2server";
	
	//for google authenticator
	public static final String USER_NAME = "name";
	public static final String SECRET_KEY = "secret";
	public static final String CREDENTIAL = "credential";
	public static final String VALIDATION_CODE = "validation";
	public static final String SCRATCH_CODES = "scratch";
	public static final String OTPAUTH = "otpauth";
	public static final String TOTP = "totp";
	public static final String ISSUER = "issuer";
	public static final String ALGORITHM = "algorithm";
	public static final String DIGITS = "digits";
	public static final String PERIOD = "period";
	
	public static final String PUSH_ANDROID = "/push/android";
	public static final String PUSH_IOS = "/push/ios";
	public static final String PUSH_SINGLE = "/push/single";
	public static final String PUSH_BATCH = "/push/batch";
	public static final String PUSH_ALL = "/push/all";
	public static final String PUSH_CHANNEL_ID = "channel_id";
	public static final String PUSH_CHANNEL_IDS = "channel_ids";
	public static final String PUSH_MSG_TYPE = "msg_type";
	public static final String PUSH_MSG = "msg";
	public static final String PUSH_MSG_EXPIRES = "msg_expires";
	public static final String PUSH_DEPLOY_STATUS = "deploy_status";
	public static final String PUSH_SEND_TIME = "send_time";
	public static final String PUSH_TOPIC_ID = "topic_id";
	public static final String PUSH_DEVICE_TYPE = "device_type";
	public static final short PUSH_OS_TYPE_ANDROID = 1;
	public static final short PUSH_OS_TYPE_IOS = 2;
	public static final int PUSH_MESSAGE_TYPE = 1;
	public static final int PUSH_ANDROID_DEVICE = 3;
	public static final int PUSH_IOS_DEVICE = 4;
	public static final boolean PUSH_IOS_DEVELOP = true;
	public static final short PUSH_SEND_TARGET_ALL = 0; 
	public static final short PUSH_SEND_TARGET_SPECIFIED = 1; 
	public static final String PUSH_REGEX_CHANNEL_ID = ";";
	public static final String PUSH_MSG_TITLE = "title";
	public static final String PUSH_MSG_DESCRIPTION = "description";
	public static final String PUSH_MSG_OPEN_TYPE = "open_type";
	public static final String PUSH_MSG_PKG_CONTENT = "pkg_content";
	public static final String PUSH_MSG_CUSTOM_CONTENT = "custom_content";
	public static final String PUSH_MSG_CONTENT = "content";
	public static final String PUSH_MSG_SEND_TARGET = "sendTarget";
	public static final String PUSH_MSG_EQUIPMENTS = "equipments";
	public static final String PUSH_MSG_ALERT = "alert";
	public static final String PUSH_MSG_APS = "aps";
	public static final String PUSH_MSG_ASSOCIATE_PRODUCT = "productId";
	public static final String PUSH_MSG_ASSOCIATE_NEWS = "newsId";
	public static final String STRTRUE = "true";
	public static final String STRFALSE = "false";
	public static final String EXCHANGE_ORDERID = "orderid";
	public static final String EXCHANGE_PHONENO = "phoneno";
	public static final String EXCHANGE_CARDNUM = "cardnum";
	
	public static final String USER_REBATE_ID = "userRebateId";
	public static final String CUMULATIVE = "cumulative";
	public static final String PAY_MONEY = "payMoney";
	public static final String CARD_NO = "cardNO";
	
	public static final String PROPERTY = "property";
	public static final String BANKNO = "bankNO";
	
	public static final String AES = "AES";
	public static final String RSA = "RSA";
	public static final String MD5 = "MD5";
	public static final String SHA1 = "SHA1";
	public static final String CBC_PADDING = "AES/CBC/PKCS5Padding";
	public static final String MD5_WITH_RSA = "MD5withRSA";
	public static final String BEARER = "Bearer";
	public static final String PAY_SUCCESS = "0000";
	public static final String PAY_IGNORE = "8901";
	
	public static final int[] INVESTMENT_AMOUNT = {300, 500, 700, 1000, 5000, 10000, 20000, 50000, 100000};
	public static final int FINANCE_PERIOD = 60;
	
	public static final String DEFAULT_MESSAGE = "";
	
	public static final int[] COUPON_AMOUNT = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,
		5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,8,8,8,9,9,10,10};
}