package cm.h3c.college.pay.payment.service;

import java.util.List;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.payment.web.action.dto.OrderVO;


public interface OrderService {
	
	public void checkOrderForm(OrderForm form) throws ServiceException;
	
	public Long doCreateOrder(OrderForm form) throws ServiceException;
	
	public void doPayOrder(Long orderId) throws ServiceException;
	
//	public void doFinishOrder(Long orderId) throws ServiceException;
		
	
	public void doRecharge2CAMS(Long orderId) throws ServiceException;
	
	public void doCancelOrderAutomatically() throws ServiceException;
	
	
	public Order findOrderById(Long id) throws ServiceException;
	
	public void updateOrdersStatus2CanceledByIds(List<Long> ids) throws ServiceException;

	public void updateOrderStatus2PayingById(Long id) throws ServiceException;

	public OrderVO findOrderVOById(Long orderId) throws ServiceException;
}
