package cm.h3c.college.pay.cmpay;


public class CmpayObjectFactory4Test extends CmpayObjectFactory {

	public String cmpayPaymentCallbackRequest(
			CmpayPaymentCallbackRequest callBackRequest) {
		sign(callBackRequest);
		return toXml(callBackRequest);
	}
}
