package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCheckResponse {
	private String MCODE;// 	功能码 	101455 	M 
	private String MID ;//	系统跟踪号	同原交易	M 
	private String DATE ;//	交易日期	YYYYMMDD 	M
	private String TIME ;//	交易时间	HHMMSS	M 
	private String PAYDAY;// 	账务日期	YYYYMMDD 	M 
	private String RCODE;// 	返回码 	000000表示成功，其它失败	M 
	private String DESC ;//	返回信息		M 
	private String ORDDATE ;//	下订日期		M 
	private String ORDTIME;// 	下订时间		M 
	private String ORDAMT;// 	消费金额		M 
	private String ORDSTS ;//	订单状态	S：交易完成 支付成功 B：订单初登记 W：等待付款 预授权成功 T：交易止付 支付失败 V：交易完成撤销 支付失败 R：交易退货 C：预授权撤销 支付失败 D：交易逾期 G：付款前待处理争议 A：付款后待处理争议 1位	M 
	private String PAYTYP ;//	支付类型		M 
	private String ORDEXPDAT;// 	订单失效日期		M 
	private String ORDEXPTIM ;//	订单失效时间		M 
	private String ORDACTDT ;//	订单最后记账时间		M 
	private String RJTRSN ;//	拒付原因		O 
	private String SIGN ;//	签名 	172位	M 

}
