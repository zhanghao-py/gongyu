package cm.h3c.college.pay.cmpay;

public interface CmpaySignable {
	public String prepareSignData();

	public String getSign();

	public void setSign(String sign);
}
