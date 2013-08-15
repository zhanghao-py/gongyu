package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

public class CmpayPaymentFileNotifyResponse implements CmpaySignable {
	String MCODE = "101610";// 功能码 101610 M
	String MID;// 系统跟踪号 同原交易 M
	String DATE;// 交易日期 YYYYMMDD M
	String TIME;// 交易时间 HHMMSS M
	String RCODE;// 返回码 000000表示成功，其它失败 M
	String DESC;// 返回信息 M
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		StringBuilder ret = new StringBuilder();
		ret.append(StringUtils.stripToEmpty(MCODE));
		ret.append("|").append(StringUtils.stripToEmpty(MID));
		ret.append("|").append(StringUtils.stripToEmpty(DATE));
		ret.append("|").append(StringUtils.stripToEmpty(TIME));
		ret.append("|").append(StringUtils.stripToEmpty(RCODE));
		ret.append("|").append(StringUtils.stripToEmpty(DESC));
		return ret.toString();
	}

	@Override
	public String getSign() {
		return SIGN;
	}

	@Override
	public void setSign(String sign) {
		this.SIGN = sign;
	}

	public void setRcode(String rcode) {
		this.RCODE = rcode;
	}

	public void setDesc(String desc) {
		this.DESC = desc;
	}

}
