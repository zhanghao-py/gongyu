package cm.h3c.college.pay.cmpay;

public class CmpayPaymentRequest implements CmpaySignable {
	String mcode = "101425";// 功能码 101425
	String mid;// 系统跟踪号 14位
	String date;// 交易日期 YYYYMMDD
	String time;// 交易时间 HHMMSS
	String merId;// 商户编号 15位
	String orderId;// 商户订单号 20位
	String amout;// 订单金额 最长15位，分为单位
	String allowNote;// 是否允许用户对该笔订单进行评论 0表示允许，默认1表示不允许1位是否允许评论
	String authorizeMode;// 推荐用户进行确认的方式 WEB
	String currency;// 币种
					// CNY：可提现金额进行支付；用户只能选择可体现账户里的钱和银行账户里的钱进行支付。CMY：用不可提现金额支付，用户可以选择不可体现账户里面的钱+充值卡+银行卡进行支付3位
	String orderDate;// 订单日期 YYYYMMDD
	String period;// 有效期数量 3位
	String periodUnit;// 有效期单位 1位1-月2-日3-小时4-分钟
	String productDesc;// 产品描述 最长250位
	String productId;// 产品编号 最长50位
	String productName;// 产品名称 最长60位
	String txntyp;// 交易类型 1位S：直接支付
	String callBack;// 回调地址 商户的响应URL，用户在手机支付平台页面支付后，重定向和通知的地址最长100位
	String MOBILEID;// 用户手机号 11位
	String SIGN;// 签名 172位

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
