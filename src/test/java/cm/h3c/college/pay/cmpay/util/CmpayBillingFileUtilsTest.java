package cm.h3c.college.pay.cmpay.util;

import java.io.File;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CmpayBillingFileUtilsTest {
	
	private static Logger log = Logger.getLogger(CmpayBillingFileUtilsTest.class);

	@Test
	public void testParse() {
		File f = new File("C:/Users/ZhangHao/Desktop/TRAN_MER_888000130000008_01210100_20111017.dat");
		log.info(CmpayBillingFileUtils.parse(f));
	}

}


