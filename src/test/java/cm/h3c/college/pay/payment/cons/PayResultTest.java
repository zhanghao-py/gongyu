package cm.h3c.college.pay.payment.cons;

import org.apache.log4j.Logger;
import org.junit.Test;

public class PayResultTest {
	
	private static Logger LOG = Logger.getLogger(PayResultTest.class);
	
	@Test
	public void itShould() {
		String key = "PADFAILED";
		PayResult result = PayResult.valueOf(key);
		LOG.info(result.getValue());
	}

}
