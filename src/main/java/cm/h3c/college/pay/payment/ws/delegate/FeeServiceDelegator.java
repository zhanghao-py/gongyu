package cm.h3c.college.pay.payment.ws.delegate;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.ws.soap.SOAPKeepSessionHandlerSettor;
import cm.h3c.college.pay.payment.bo.College;

import com.h3c.imc.acm.feeservice.FeeService;
import com.h3c.imc.acm.feeservice.FeeServicePortType;
import com.h3c.imc.acmws.fee.xsd.ObjectFactory;
import com.h3c.imc.acmws.fee.xsd.PaymentInfo;
import com.h3c.imc.common.ws.xsd.WSCommonResult;

public class FeeServiceDelegator {

	private Logger log = Logger.getLogger(FeeServiceDelegator.class);
	
	private final String wsdlUrl = "/imcws/services/feeService?wsdl";
//	private final String wsdlUrl = "/imcws/services/feeService.wsdl";
	
	private String baseUrl;
	
	private FeeServicePortType feeService;
	private ImcplatServiceDelegator imcplatServiceDelegator;
	
	public FeeServiceDelegator(College college) {
		this.baseUrl = college.getUrl();
		init();
		imcplatServiceDelegator = new ImcplatServiceDelegator(college);
	}

	private void init() {
		String url = baseUrl + wsdlUrl;
		
		FeeService remoteImplService = null;
		
		try {
			remoteImplService = new FeeService(new URL(url));
		} catch (MalformedURLException e) {
			log.warn(e);
		}
		
		feeService = remoteImplService.getFeeServiceHttpSoap12Endpoint();
		SOAPKeepSessionHandlerSettor.getInstance().setHandler((BindingProvider) feeService);
	}
	
	public void pay(String account, String money) throws ServiceException {
		
		ObjectFactory of = new ObjectFactory();
		PaymentInfo info = new PaymentInfo();
		info.setUserName(of.createPaymentInfoUserName(account));
		info.setAmount(of.createPaymentInfoAmount(money));
		
		imcplatServiceDelegator.login();
		WSCommonResult result = feeService.pay(info);
		imcplatServiceDelegator.logout();
		
		int errorCode = result.getErrorCode();
		
		if (errorCode > 0) {
			String errorMsg = result.getErrorMsg().getValue();
			String msg = "error code is " + errorCode + ", error msg is " + errorMsg;
			log.warn(msg);
			throw new ServiceException(msg);
		}
		
		return;
	}
	
}