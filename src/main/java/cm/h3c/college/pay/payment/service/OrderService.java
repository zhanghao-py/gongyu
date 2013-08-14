package cm.h3c.college.pay.payment.service;

import java.util.List;

import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.CamsResult;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.cons.PayResult;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;


public interface OrderService {
	
	public Long doCreateOrder(OrderForm form) throws ServiceException;
	
	public CmpayPaymentRequest doPayOrder(Long orderId) throws ServiceException;
	
	
	public void checkOrderForm(OrderForm form) throws ServiceException;
	
	public CmpayPaymentRequest doCreateAndPayOrder(OrderForm form) throws ServiceException;
	
	public void doCallbackOrder(CmpayPaymentCallbackRequest callback) throws ServiceException;
	
	public void doWebCallbackOrder(CmpayPaymentCallbackWebRequest callback) throws ServiceException;
	
	
	public void doCancelOrderAutomatically() throws ServiceException;
	
	public CmpayPaymentCheckResponse checkPayment(Long orderId) throws ServiceException;
	
	
	public Order findOrderById(Long id) throws ServiceException;
	
	public void updateOrdersStatusByIds(List<Long> orderIds, OrderStatus status) throws ServiceException;
	
	public void updateOrderStatusById(Long orderId, OrderStatus status) throws ServiceException;
	
	public void updateOrderPayResultById(Long orderId, PayResult payResult, LogType type) throws ServiceException;
	
	public void updateOrderCamsResultById(Long orderId, CamsResult camsResult) throws ServiceException;

	public String getCmpayUrl(String merId);
	
}
