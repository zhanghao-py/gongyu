package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCallBackRequest {
	private String MCODE;//	功能码 	101440 	M 
	private String MID;// 	系统跟踪号	14 位	M 
	private String DATE;// 	交易日期	YYYYMMDD 	M 
	private String TIME;// 	交易时间	HHMMSS 	M 
	private String PAYDAY;// 	账务日期	YYYYMMDD 	M 
	private String MERID;// 	商户编号	15位	M 
	private String ORDERDATE;// 	订单日期	YYYYMMDD 8位	M 
	private String ORDERID;// 	订单号 	20位	M 
	private String STATUS;// 	状态 	PADSUCCESS：预授权成功PADFAILED：预授权失败REFUSE：用户拒付SUCCESS：成功FAILED：失败	M 
	private String REMARK;// 	备注 	最长60位	O 
	private String FROZENNO;// 	冻结编号	6为	M 
	private String SIGN;// 	签名 	172位	M 

}
