package cm.h3c.college.pay.cmpay;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.umpay.mpay.SignEncException;
import com.umpay.mpay.SignUtil;

public class CmpayObjectFactoryTest {

	@Test
	public void testToXml() throws SignEncException {
		CmpayObjectFactory factory = new CmpayObjectFactory();
		CmpayPaymentCheckRequest request = new CmpayPaymentCheckRequest();
		request.MID = "1234";
		request.DATE = "20130801";
		request.TIME = "210400";
		request.MERID = "123456789012345";
		request.ORDERID = "12345678901234567890";
		String xml = factory.cmpayPaymentCheckRequest2Xml(request);
		System.out.println(xml);
		
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCheckRequest.class);
		System.out.println(xstream.toXML(request));
		
		CmpayPaymentCheckRequest request2 = (CmpayPaymentCheckRequest) xstream.fromXML(xml);
		assertTrue(SignUtil.doCheckSign(request2.prepareSignData(), request.getSign()));
		assertEquals(request.MID, request2.MID);
	}

	@Test
	public void testCreatePaymentRequest() {
		
	}
}
