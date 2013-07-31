package cm.h3c.college.pay.cmpay;

public class CmpayPaymentCallBackWebRequest implements CmpaySignable {
	String merId;// 商户编号 15位 M
	String mid;// 系统跟踪号 14位 M
	String omid;// 交易流水号 暂无意义 M
	String txnTyp;// 业务类型 直接支付：DODIRECTPAYMENTB2C担保交易：B2C-DOGUARANTEE
					// C2C担保交易：C2C-DOGUARANTEE 预授权：DOAHTORIZATION
					// 预授权确认：DOCAPTURE 预授权取消：DOVOID 订单查询：ORDERSEARCH 退款：
					// ORDERREFUND M
	String amout;// 支付金额 单位分 M
	String orderId;// 原商户订单号 M
	String orderDate;// 订单日期 M
	String payDate;// 财务时间 M
	String remark;// 备注 O
	String status;// 支付结果
					// PADSUCCESS：预授权成功PADFAILED：预授权失败REFUSE：用户拒付SUCCESS：成功FAILED：失败
					// M
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSign() {
		return SIGN;
	}

	@Override
	public void setSign(String sign) {
		this.SIGN = sign;
	}

}
