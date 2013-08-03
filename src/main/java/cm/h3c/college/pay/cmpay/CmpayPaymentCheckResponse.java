package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

public class CmpayPaymentCheckResponse implements CmpaySignable {
	String MCODE;// 功能码 101455 M
	String MID;// 系统跟踪号 同原交易 M
	String DATE;// 交易日期 YYYYMMDD M
	String TIME;// 交易时间 HHMMSS M
	String PAYDAY;// 账务日期 YYYYMMDD M
	String RCODE;// 返回码 000000表示成功，其它失败 M
	String DESC;// 返回信息 M
	String ORDDATE;// 下订日期 M
	String ORDTIME;// 下订时间 M
	String ORDAMT;// 消费金额 M
	String ORDSTS;// 订单状态 S：交易完成 支付成功 B：订单初登记 W：等待付款 预授权成功 T：交易止付 支付失败
					// V：交易完成撤销 支付失败 R：交易退货 C：预授权撤销 支付失败 D：交易逾期
					// G：付款前待处理争议 A：付款后待处理争议 1位 M
	String PAYTYP;// 支付类型 M
	String ORDEXPDAT;// 订单失效日期 M
	String ORDEXPTIM;// 订单失效时间 M
	String ORDACTDT;// 订单最后记账时间 M
	String RJTRSN;// 拒付原因 O
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		StringBuilder ret = new StringBuilder();
		ret.append(StringUtils.stripToEmpty(MCODE));
		ret.append("|").append(StringUtils.stripToEmpty(MID));
		ret.append("|").append(StringUtils.stripToEmpty(DATE));
		ret.append("|").append(StringUtils.stripToEmpty(TIME));
		ret.append("|").append(StringUtils.stripToEmpty(PAYDAY));
		ret.append("|").append(StringUtils.stripToEmpty(RCODE));
		ret.append("|").append(StringUtils.stripToEmpty(DESC));
		ret.append("|").append(StringUtils.stripToEmpty(ORDDATE));
		ret.append("|").append(StringUtils.stripToEmpty(ORDTIME));
		ret.append("|").append(StringUtils.stripToEmpty(ORDAMT));
		ret.append("|").append(StringUtils.stripToEmpty(ORDSTS));
		ret.append("|").append(StringUtils.stripToEmpty(PAYTYP));
		ret.append("|").append(StringUtils.stripToEmpty(ORDEXPDAT));
		ret.append("|").append(StringUtils.stripToEmpty(ORDEXPTIM));
		ret.append("|").append(StringUtils.stripToEmpty(ORDACTDT));
		ret.append("|").append(StringUtils.stripToEmpty(RJTRSN));
		return ret.toString();
	}

	@Override
	public String getSign() {
		return SIGN;
	}

	public void setSign(String sign) {
		this.SIGN = sign;
	}

}
