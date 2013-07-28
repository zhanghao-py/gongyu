package cm.h3c.college.pay.payment.dao;

import cm.h3c.college.pay.payment.bo.Order;

public interface OrderDao {
	
	public int save(Order order);
	
	public int update(Order order);
	
	public Order findById(Long id);

}
