package cm.h3c.college.pay.cmpay.service.impl;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;
import cm.h3c.college.pay.cmpay.service.CmpayBillingService;
import cm.h3c.college.pay.cmpay.util.CmpayBilling;
import cm.h3c.college.pay.cmpay.util.CmpayBillingFileUtils;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;

@Component("cmpayBillingService")
public class CmpayBillingServiceImpl implements CmpayBillingService {

	private static Logger log = Logger.getLogger(CmpayBillingService.class);
	
	@Autowired
	private SystemConfig config;
	
	@Override
	public void doLogCmpayBilling(CmpayPaymentFileNotifyRequest notify) throws ServiceException {
		String fromFilePath = config.getCmpayBillingFileOrginalLocation() + notify.getFilename();
		String toFilePath = config.getCmpayBillingFileSafetyLocation() + notify.getFilename();
		
		File fromFile = new File(fromFilePath);
		File toFile = new File(toFilePath);
		
		try {
			FileCopyUtils.copy(fromFile, toFile);
			fromFile.delete();
		} catch (IOException e) {
			log.warn("", e);
		}
		
		CmpayBilling cmpay = CmpayBillingFileUtils.parse(toFile);
		
		// TODO:解析对账文件，并记录至数据库(header表，detail表)
		
		return;
	}
}
