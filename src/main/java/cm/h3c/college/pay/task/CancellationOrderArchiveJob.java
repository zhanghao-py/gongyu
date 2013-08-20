package cm.h3c.college.pay.task;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.service.facade.PaymentFacade;

public class CancellationOrderArchiveJob extends QuartzJobBean {

	private Logger logger = Logger.getLogger(CancellationOrderArchiveJob.class);

	@Resource(name = "paymentFacade")
	private PaymentFacade facade;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		
		OrderService orderService = facade.getOrderService();

		Long start = System.currentTimeMillis();
		
		try {
			orderService.doCancelOrderAutomatically();
		} catch (ServiceException e) {
			logger.warn(e);
		}
		
		Long end = System.currentTimeMillis();
		logger.info("it canceled all unpaid order automatically, last " + (end - start)
				+ " ms.");
	}

}
