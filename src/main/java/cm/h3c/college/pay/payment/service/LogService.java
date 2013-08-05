package cm.h3c.college.pay.payment.service;

import java.util.List;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Log;
import cm.h3c.college.pay.payment.cons.LogType;

public interface LogService {

	public void doLog(LogType type, String content) throws ServiceException;

	void doLog(LogType type, Long orderId, String content)
			throws ServiceException;

	List<Log> findByOrderId(Long orderId) throws ServiceException;
}
