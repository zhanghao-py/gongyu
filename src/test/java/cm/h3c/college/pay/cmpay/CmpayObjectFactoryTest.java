package cm.h3c.college.pay.cmpay;

import static org.junit.Assert.*;

import org.junit.Test;

public class CmpayObjectFactoryTest {

	@Test
	public void testToXml() {
		CmpayObjectFactory factory = new CmpayObjectFactory();
		CmpayPaymentCheckRequest request = new CmpayPaymentCheckRequest();
		String xml = factory.cmpayPaymentCheckRequest2Xml(request);
		System.out.println(xml);
	}

}
