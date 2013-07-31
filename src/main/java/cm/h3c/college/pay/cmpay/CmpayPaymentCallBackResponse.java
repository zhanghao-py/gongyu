package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCallBackResponse {
	private String MCODE;// 	功能码 	101440 	M 
	private String MID;// 	系统跟踪号	同原交易	M 
	private String DATE;// 	交易日期	YYYYMMDD 	M 
	private String TIME;// 	交易时间	HHMMSS 	M 
	private String RCODE;// 	返回码 	000000表示成功，其它失败	M 
	private String DESC;// 	返回信息		M 
	private String SIGN;// 	签名 	172位	M 

}
