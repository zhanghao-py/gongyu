package cm.h3c.college.pay.cmpay;

public interface CmpayPaymentCallbackable {

	String getStatus();

	Long parseOriginOrderId();

}
