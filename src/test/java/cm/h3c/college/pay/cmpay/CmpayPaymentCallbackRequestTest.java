package cm.h3c.college.pay.cmpay;

import static org.junit.Assert.*;

import org.junit.Test;

public class CmpayPaymentCallbackRequestTest {

	@Test
	public void testPrepareSignDataOrder() {
		String expected = "MCODE=&MID=&DATE=&TIME=&PAYDAY=&MERID=&ORDERDATE=&ORDERID=&STATUS=&REMARK=&FROZENNO=";
		assertEquals(expected,
				new CmpayPaymentCallbackRequest().prepareSignData());
	}

}
