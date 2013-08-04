package cm.h3c.college.pay.payment.ws.delegate;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.ws.soap.SOAPKeepSessionHandlerSettor;
import cm.h3c.college.pay.payment.bo.College;

import com.h3c.imc.common.ws.xsd.WSCommonResult;
import com.h3c.imc.imcplatservice.ImcplatService;
import com.h3c.imc.imcplatservice.ImcplatServicePortType;
import com.h3c.imc.imcplatservice.LogoutResponse;

public class ImcplatServiceDelegator {
	
	private Logger log = Logger.getLogger(ImcplatServiceDelegator.class);
	
//	private final String wsdlUrl = "/imcws/services/imcplatService?wsdl";
	private final String wsdlUrl = "/imcws/services/imcplatService.wsdl";
	
	private String baseUrl;
	private String opUsername;
	private String opPassword;
	
	private ImcplatServicePortType imcplatService;
	
	public ImcplatServiceDelegator(College college) {
		this.baseUrl = college.getUrl();
		this.opUsername = college.getOperatorUsername();
		this.opPassword = college.getOperatorPassword();
		init();
	}
	
	private void init() {
		String url = baseUrl + wsdlUrl;
		
		if ( !(url.startsWith("http") || url.startsWith("https")) ) {
			log.error("can't init ImcplatServiceDelegator caused by url prefix illegal!");
			return;
		}
		
		ImcplatService remoteImplService = null;
		
		try {
			remoteImplService = new ImcplatService(new URL(url));
		} catch (MalformedURLException e) {
			log.warn(e);
		}
		
		imcplatService = remoteImplService.getImcplatServiceHttpSoap12Endpoint();
		SOAPKeepSessionHandlerSettor.getInstance().setHandler((BindingProvider) imcplatService);
	}
	
	public void login() throws ServiceException {
		
		WSCommonResult result = imcplatService.login(opUsername, opPassword);

		int errorCode = result.getErrorCode();
		
		if (errorCode > 0) {
			String errorMsg = result.getErrorMsg().getValue();
			String msg = "error code is " + errorCode + ", error msg is " + errorMsg;
			log.warn(msg);
			throw new ServiceException(msg);
		}
		
		return;
	}
	
	public void logout() throws ServiceException {
		
		LogoutResponse response = imcplatService.logout();
		WSCommonResult result = response.getReturn().getValue();
		
		int errorCode = result.getErrorCode();

		if (errorCode > 0) {
			String errorMsg = result.getErrorMsg().getValue();
			String msg = "error code is " + errorCode + ", error msg is " + errorMsg;
			log.warn(msg);
			throw new ServiceException(errorMsg);
		}
		
		return;
	}

}
