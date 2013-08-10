package cm.h3c.college.pay.payment.ws.delegate;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.log4j.Logger;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.ws.soap.SOAPKeepSessionHandlerSettor;
import cm.h3c.college.pay.payment.bo.College;

import com.h3c.imc.acm.acmuserservice.AcmUserService;
import com.h3c.imc.acm.acmuserservice.AcmUserServicePortType;
import com.h3c.imc.acmws.user.accessuser.xsd.AcmUser;
import com.h3c.imc.acmws.user.accessuser.xsd.RetAcmUser;

public class AcmUserServiceDelegator {

	private Logger log = Logger.getLogger(AcmUserServiceDelegator.class);
	
	private final String wsdlUrl = "/imcws/services/acmUserService?wsdl";
//	private final String wsdlUrl = "/imcws/services/acmUserService.wsdl";
	
	private String baseUrl;
	
	private AcmUserServicePortType acmUserService;
	private ImcplatServiceDelegator imcplatServiceDelegator;
	
	public AcmUserServiceDelegator(College college) {
		this.baseUrl = college.getUrl();
		init();
		imcplatServiceDelegator = new ImcplatServiceDelegator(college);
	}

	private void init() {
		String url = baseUrl + wsdlUrl;
		
		if ( !(url.startsWith("http") || url.startsWith("https")) ) {
			log.error("can't init AcmUserServiceDelegator caused by url prefix illegal!");
			return;
		}
		
		AcmUserService remoteImplService = null;
		
		try {
			remoteImplService = new AcmUserService(new URL(url));
		} catch (MalformedURLException e) {
			log.warn("", e);
		}
		
		acmUserService = remoteImplService.getAcmUserServiceHttpSoap12Endpoint();
		SOAPKeepSessionHandlerSettor.getInstance().setHandler((BindingProvider) acmUserService);
		Client client = ClientProxy.getClient(acmUserService);
		HTTPConduit http = (HTTPConduit) client.getConduit();
		
		TLSClientParameters param = new TLSClientParameters();
		param.setDisableCNCheck(Boolean.TRUE);
		
		http.setTlsClientParameters(param);
		
		return;
	}
	
	public AcmUser queryAcmUser(String username) throws ServiceException {
		imcplatServiceDelegator.login();
		RetAcmUser result = acmUserService.queryAcmUser(username);
//		imcplatServiceDelegator.logout();
		
		int errorCode = result.getErrorCode();
		
		if (errorCode > 0) {
			String errorMsg = result.getErrorMsg().getValue();
			String msg = "error code is " + errorCode + ", error msg is " + errorMsg;
			log.warn(msg);
			throw new ServiceException(errorMsg);
		}
		
		
		
		return result.getAcmUser().getValue();
	}
}
