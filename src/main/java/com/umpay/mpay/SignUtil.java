package com.umpay.mpay;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class SignUtil {
	private static String merprikeypath = "mer.prikey.path";
	private static String platcertpath = "plat.cert.path";

	private static final HashMap<String, SignUtil> signUtilMap = new HashMap<String, SignUtil>();

	private String merId;

	private SignUtil(String merId) throws SignEncException {
		this.merId = merId;

		getProp(platcertpath);
		getProp(merprikeypath);
	}

	private byte[] getProp(String key) throws SignEncException {
		InputStream in = null;
		ResourceBundle rb = null;
		byte[] kb = (byte[]) null;
		FileInputStream fis = null;
		String merPriKeyPath = "";
		try {
			rb = ResourceBundle.getBundle("com.umpay.mpay.SignVerProp");
		} catch (MissingResourceException mre) {
			throw new SignEncException("cannot find the SignVerProp.properties");
		}
		try {
			merPriKeyPath = rb.getString(key);
		} catch (MissingResourceException mre) {
			throw new SignEncException(
					"cannot find the value of mer.prikey.path in property file");
		}
		if ((merPriKeyPath == null) || (merPriKeyPath.trim().length() == 0))
			throw new SignEncException(
					"cannot find the value of mer.prikey.path in property file");
		kb = (byte[]) null;
		try {
			File f = new File(getClass().getClassLoader()
					.getResource("cmpay/" + merId + "/" + merPriKeyPath).getFile());
			kb = new byte[(int) f.length()];
			fis = new FileInputStream(f);
			fis.read(kb);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SignEncException("load the primary key failed");
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SignEncException("load the primary key failed");
			}
		}

		return kb;
	}

	private String sign(String dataToSign, byte[] privateKeyBytes)
			throws GeneralSecurityException, IOException {
		PKCS8EncodedKeySpec peks = new PKCS8EncodedKeySpec(privateKeyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		PrivateKey pk = kf.generatePrivate(peks);

		Signature sig = Signature.getInstance("SHA1withRSA");
		sig.initSign(pk);
		sig.update(dataToSign.getBytes("gb2312"));
		byte[] sb = sig.sign();

		BASE64Encoder base64 = new BASE64Encoder();
		String b64Str = base64.encode(sb);
		BufferedReader br = new BufferedReader(new StringReader(b64Str));
		String tmpStr = "";
		String tmpStr1 = "";
		while ((tmpStr = br.readLine()) != null) {
			tmpStr1 = tmpStr1 + tmpStr;
		}
		b64Str = tmpStr1;
		return b64Str;
	}

	private boolean verify(String data, String sign, byte[] publicKeyBytes)
			throws IOException, GeneralSecurityException {
		ByteArrayInputStream bais = new ByteArrayInputStream(publicKeyBytes);
		CertificateFactory cf = null;
		X509Certificate cert = null;
		cf = CertificateFactory.getInstance("X.509");
		cert = (X509Certificate) cf.generateCertificate(bais);

		BASE64Decoder base64 = new BASE64Decoder();
		byte[] signed = base64.decodeBuffer(sign);
		Signature sig = Signature.getInstance("SHA1withRSA");
		sig.initVerify(cert);
		sig.update(data.getBytes());
		return sig.verify(signed);
	}

	public static boolean doCheckSign(String value, String reqSign, String merId)
			throws SignEncException {
		if (value == null)
			throw new SignEncException(
					"the data string to be signed cannot be null");
		if (reqSign == null)
			throw new SignEncException(
					"the sign string to be signed cannot be null");
		if (merId == null)
			throw new SignEncException("the merId cannot be null");

		SignUtil mySign = getSignUtil(merId);
		byte[] publicKeyBytes = mySign.getProp(platcertpath);
		boolean flag = false;
		try {
			flag = mySign.verify(value, reqSign, publicKeyBytes);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static String doGenerateSign(String value, String merId)
			throws SignEncException {
		if (value == null)
			throw new SignEncException(
					"the data string to be signed cannot be null");
		if (merId == null)
			throw new SignEncException("the merId cannot be null");

		SignUtil mySign = getSignUtil(merId);
		byte[] privateKeyBytes = mySign.getProp(merprikeypath);
		String reqSign = "";
		try {
			reqSign = mySign.sign(value, privateKeyBytes);
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		return reqSign;
	}

	private synchronized static SignUtil getSignUtil(String merId)
			throws SignEncException {
		if (merId == null) {
			throw new IllegalArgumentException("merId should not be null.");
		}
		if (merId.length() != 15 ) { //商户编号15位
			throw new IllegalArgumentException("merId.length should not be 15.");
		}
		SignUtil util = signUtilMap.get(merId);
		if (util == null) {
			signUtilMap.put(merId, new SignUtil(merId));
		}
		util = signUtilMap.get(merId);
		return util;
	}
}