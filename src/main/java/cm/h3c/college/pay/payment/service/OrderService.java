package cm.h3c.college.pay.payment.service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;


public interface OrderService {
	
	public Order findOrderById(Long id) throws ServiceException;
	
	public void doRecharge2CAMS(Long orderId) throws ServiceException;
	
	public Long doCreateOrder(OrderForm form) throws ServiceException;
	
	public void checkOrderForm(OrderForm form) throws ServiceException;
	

}
