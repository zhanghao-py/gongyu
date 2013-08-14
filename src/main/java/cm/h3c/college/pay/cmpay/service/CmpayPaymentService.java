package cm.h3c.college.pay.cmpay.service;

import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Order;

public interface CmpayPaymentService {
	public static final String RCODE_SUCCESS = "000000";
	
	public CmpayPaymentCheckResponse checkPayment(Long orderId, String merId) throws ServiceException;
	
	CmpayPaymentRequest createPayment(Order order, String merId) throws ServiceException;
}
