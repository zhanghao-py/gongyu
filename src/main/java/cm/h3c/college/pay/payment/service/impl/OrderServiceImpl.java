package cm.h3c.college.pay.payment.service.impl;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cm.h3c.college.pay.payment.service.OrderService;

import com.h3c.imc.acm.feeservice.FeeService;
import com.h3c.imc.acm.feeservice.FeeServicePortType;
import com.h3c.imc.acmws.fee.xsd.ObjectFactory;
import com.h3c.imc.acmws.fee.xsd.PaymentInfo;
import com.h3c.imc.common.ws.xsd.WSCommonResult;
import com.h3c.imc.imcplatservice.ImcplatService;
import com.h3c.imc.imcplatservice.ImcplatServicePortType;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private Logger log = Logger.getLogger(OrderService.class);

	@Override
	public void login() {
		
		ImcplatService remoteImplService = null;

		try {
			File f = new File("offline/wsdl/imcplatService.wsdl");
			remoteImplService = new ImcplatService(f.toURL());
		} catch (MalformedURLException e) {
			log.warn(e);
		}

		ImcplatServicePortType imcplatService = remoteImplService
				.getImcplatServiceHttpSoap12Endpoint();

		String username = "admin";
		String password = "admin";

		WSCommonResult result = imcplatService.login(username, password);

		if (result.getErrorCode() > 0) {
			// throw exception
		}

		// do some action

		imcplatService.logout();
		
	}

	@Override
	public void pay() {
		FeeService remoteImplService = null;
		
		try {
			File f = new File("offline/wsdl/feeService.wsdl");
			remoteImplService = new FeeService(f.toURL());
		} catch (MalformedURLException e) {
			log.warn(e);
		}
		
		FeeServicePortType imcplatService = remoteImplService.getFeeServiceHttpSoap12Endpoint();
		
		ObjectFactory of = new ObjectFactory();
		PaymentInfo info = new PaymentInfo();
		info.setUserName(of.createPaymentInfoUserName("admin"));
		info.setAmount(of.createPaymentInfoAmount("10"));
		
		
		WSCommonResult result = imcplatService.pay(info);
		log.info("error code is " + result.getErrorCode() + ", msg is" + result.getErrorMsg().getValue());
		
	}


}
