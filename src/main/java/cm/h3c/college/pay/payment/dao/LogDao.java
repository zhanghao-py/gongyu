package cm.h3c.college.pay.payment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cm.h3c.college.pay.payment.bo.Log;

public interface LogDao {

	public int save(Log log);

	public List<Log> findByOrderId(Long orderId);

	public List<Log> findByOrderIdAndType(@Param("orderId") Long orderId, @Param("type") Short type);
}
