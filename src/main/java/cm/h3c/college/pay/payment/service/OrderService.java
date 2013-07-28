package cm.h3c.college.pay.payment.service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;


public interface OrderService {
	
	public void login();
	
	public void pay();
	
	public Long doCreateOrder(OrderForm form) throws ServiceException;
	
	public void checkOrderForm(OrderForm form) throws ServiceException;

}
