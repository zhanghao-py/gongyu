package cm.h3c.college.pay.cmpay.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

public class CmpayBillingFileUtils {
	
	private static Logger log = Logger.getLogger(CmpayBillingFileUtils.class);
	
	private CmpayBillingFileUtils() {}
	
	public static CmpayBilling parse(File file) {
		
		CmpayBilling billing = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String filename = file.getName();
			String headLine = br.readLine();
			
			Header header = new Header(filename, headLine);
			List<Detail> details = new LinkedList<Detail>();
			
			String line = "";
			while( (line = br.readLine())!=null ) {
				Detail detail = new Detail(line);
				details.add(detail);
			}
			
			billing = new CmpayBilling(header, details);
			
		} catch (FileNotFoundException e) {
			log.warn("", e);
		} catch (IOException e) {
			log.warn("", e);
		} finally {
			IOUtils.closeQuietly(br);
			IOUtils.closeQuietly(fr);
		}
		
		return billing;
	}
}



