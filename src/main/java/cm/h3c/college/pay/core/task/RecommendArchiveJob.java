package cm.h3c.college.pay.core.task;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class RecommendArchiveJob extends QuartzJobBean {

	private Logger logger = Logger.getLogger(RecommendArchiveJob.class);

	/*
	private RecommendMgr recommendMgr;

	public void setRecommendMgr(RecommendMgr recommendMgr) {
		this.recommendMgr = recommendMgr;
	}
	*/

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		Long start = 0L;
		Long end = 0L;

		start = System.currentTimeMillis();
//		recommendMgr.refreshAllCachingData();
		end = System.currentTimeMillis();
		logger.info("reload all caching data finished, last " + (end - start)
				+ " ms.");
	}

}
