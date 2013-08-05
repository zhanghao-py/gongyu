package cm.h3c.college.pay.payment.dao;

import java.util.List;

import cm.h3c.college.pay.payment.bo.Log;

public interface LogDao {

	public int saveLog(Log log);

	public List<Log> findByOrderId(Long orderId);
}
