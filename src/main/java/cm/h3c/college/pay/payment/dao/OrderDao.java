package cm.h3c.college.pay.payment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.web.action.dto.OrderVO;

public interface OrderDao {
	
	public int save(Order order);
	
	public int update(Order order);
	
	public Order findById(Long id);
	
	public void updateOrdersStatusByIds(@Param("ids") List<Long> ids, @Param("status") Short status);

	public List<Order> findAllUnpaidOrdersMoreThan12Hours();

	public OrderVO findOrderVOById(Long id);

}
