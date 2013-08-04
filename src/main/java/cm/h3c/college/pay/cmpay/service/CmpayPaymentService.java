package cm.h3c.college.pay.cmpay.service;

import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Order;

public interface CmpayPaymentService {
	public static final String RCODE_SUCCESS = "000000";
	
	public enum PaymentResult {
		PADSUCCESS, //预授权成功
		PADFAILED, //预授权失败
		REFUSE, //用户拒付
		SUCCESS, //成功
		FAILED //失败
	}	
	
	public CmpayPaymentCheckResponse checkPayment(Order order) throws ServiceException;

	void submitPayment(Order order) throws ServiceException;
}
