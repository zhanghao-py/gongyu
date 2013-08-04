package cm.h3c.college.pay.payment.service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.cons.LogType;

public interface LogService {

	public void doLog(LogType type, String content) throws ServiceException;

	void doLog(LogType type, Long orderId, String content)
			throws ServiceException;
}
