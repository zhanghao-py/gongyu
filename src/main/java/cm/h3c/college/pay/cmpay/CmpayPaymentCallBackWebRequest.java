package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCallBackWebRequest {
	private String merId;// 	商户编号	15位	M 
	private String mid ;//	系统跟踪号	14位	M 
	private String omid;// 	交易流水号	暂无意义	M 
	private String txnTyp;// 	业务类型	直接支付：DODIRECTPAYMENTB2C担保交易：B2C-DOGUARANTEE C2C担保交易：C2C-DOGUARANTEE 预授权：DOAHTORIZATION 预授权确认：DOCAPTURE 预授权取消：DOVOID 订单查询：ORDERSEARCH 退款： ORDERREFUND 	M 
	private String amout;// 	支付金额	单位分 	M 
	private String orderId;// 	原商户订单号		M 
	private String orderDate;// 	订单日期		M 
	private String payDate;// 	财务时间		M 
	private String remark;// 	备注 		O 
	private String status;// 	支付结果	PADSUCCESS：预授权成功PADFAILED：预授权失败REFUSE：用户拒付SUCCESS：成功FAILED：失败	M 
	private String SIGN;// 	签名 	172位	M

}
