package cm.h3c.college.pay.payment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Log;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.dao.LogDao;
import cm.h3c.college.pay.payment.service.LogService;

@Component("logService")
public class LogServiceImpl implements LogService {

	private Logger log = Logger.getLogger(LogService.class);

	@Resource(name = "logDao")
	private LogDao logDao;
	
	@Override
	public void doLog(LogType type, String content) throws ServiceException {
		if (ObjectUtils.equals(type, null)) {
			throw new ServiceException("type不能为空!");
		}
		
		if (StringUtils.isBlank(content)) {
			throw new ServiceException("日志内容不能为空!");
		}
		
		Log log = new Log();
		log.setType(type.getValue());
		log.setContent(content);
		logDao.save(log);
		
		return;
	}
	
	@Override
	public void doLog(LogType type, Long orderId, String content) throws ServiceException {
		if (ObjectUtils.equals(type, null)) {
			throw new ServiceException("type不能为空!");
		}
		
		if (ObjectUtils.equals(orderId, null) || orderId < 1) {
			throw new ServiceException("orderId不能为空!");
		}
		
		if (StringUtils.isBlank(content)) {
			throw new ServiceException("日志内容不能为空!");
		}
		
		Log log = new Log();
		log.setType(type.getValue());
		log.setOrderId(orderId);
		log.setContent(content);
		logDao.save(log);
		
		return;
	}

	@Override
	public List<Log> findByOrderId(Long orderId) throws ServiceException {
		return logDao.findByOrderId(orderId);
	}
	
	@Override
	public List<Log> findByOrderIdAndType(Long orderId, LogType type) throws ServiceException {
		return logDao.findByOrderIdAndType(orderId, type.getValue());
	}
	
	
}
