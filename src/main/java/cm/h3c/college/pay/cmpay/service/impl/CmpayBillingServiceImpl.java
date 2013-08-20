package cm.h3c.college.pay.cmpay.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;
import cm.h3c.college.pay.cmpay.bo.CmpayBillingDetail;
import cm.h3c.college.pay.cmpay.bo.CmpayBillingHeader;
import cm.h3c.college.pay.cmpay.dao.CmpayBillingDao;
import cm.h3c.college.pay.cmpay.service.CmpayBillingService;
import cm.h3c.college.pay.cmpay.util.CmpayBillingFileUtils;
import cm.h3c.college.pay.cmpay.web.action.dto.CmpayBilling;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;

@Component("cmpayBillingService")
public class CmpayBillingServiceImpl implements CmpayBillingService {

	private static Logger log = Logger.getLogger(CmpayBillingService.class);
	
	@Autowired
	private SystemConfig config;
	
	@Autowired
	private CmpayBillingDao cmpayBillingDao;
	
	@Override
	public void doLogCmpayBilling(CmpayPaymentFileNotifyRequest notify) throws ServiceException {
		String fromFilePath = config.getCmpayBillingFileOrginalLocation() + notify.getFilename();
		String toFilePath = config.getCmpayBillingFileSafetyLocation() + notify.getFilename();
		
		File fromFile = new File(fromFilePath);
		File toFile = new File(toFilePath);
		
		// 移动到安全目录
		try {
			FileCopyUtils.copy(fromFile, toFile);
			fromFile.delete();
		} catch (IOException e) {
			log.warn("", e);
		}
		
		CmpayBilling cmpay = CmpayBillingFileUtils.parse(toFile);
		CmpayBillingHeader header = cmpay.getHeader();
		List<CmpayBillingDetail> details = cmpay.getDetails();
		
		// 解析对账文件，并记录至数据库
		int headerId = cmpayBillingDao.saveCmpayBillingHeader(header);
		for (CmpayBillingDetail detail : details ) {
			detail.setHeaderId(Long.valueOf(headerId));
			cmpayBillingDao.saveCmpayBillingDetail(detail);
		}
		
		return;
	}
	
}
