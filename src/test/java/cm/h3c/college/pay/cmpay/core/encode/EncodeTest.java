package cm.h3c.college.pay.cmpay.core.encode;

import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.junit.Test;

import cm.h3c.college.pay.core.encode.des.DESCoder;

public class EncodeTest {
	
	@Test
	public void testEncodeBase64() {
		
		String data = "admin";
		String dataEncode = new String(Base64.encodeBase64(Base64.encodeBase64(data.getBytes())));
		System.out.println("encode : " + dataEncode);
		
		String dataDecode = new String(Base64.decodeBase64(Base64.decodeBase64(dataEncode)));
		System.out.println("decode : " + dataDecode);
	}
	
	@Test
	public void testEncodeDES() throws Exception {
		String inputStr = "admin";  
        String key = DESCoder.initKey();  
        System.out.println("原文:" + inputStr);  
  
        System.out.println("密钥:" + key);  
  
        byte[] inputData = inputStr.getBytes();  
        inputData = DESCoder.encrypt(inputData, key);  
  
        System.out.println("加密后:" + inputData.toString());  
  
        byte[] outputData = DESCoder.decrypt(inputData, key);  
        String outputStr = new String(outputData);  
  
        System.out.println("解密后:" + outputStr);  
  
        Assert.assertEquals(inputStr, outputStr); 
	}

	@Test
	public void testLong() {
		String orderId = "0" + Long.MAX_VALUE;
		Assert.assertEquals(Long.MAX_VALUE, Long.parseLong(orderId));
	}
}
