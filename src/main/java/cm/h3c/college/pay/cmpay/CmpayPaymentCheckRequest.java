package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCheckRequest {
	private String MCODE;// 	功能码 	101455 	M 
	private String MID ;//	系统跟踪号	14位	M 
	private String DATE;// 	交易日期	YYYYMMDD 	M 
	private String TIME;// 	交易时间	HHMMSS 	M 
	private String MERID;// 	商户编号	15位	M 
	private String ORDERID;// 	订单号 	20位	M 
	private String SIGN ;//	签名 	172位	M 

}
