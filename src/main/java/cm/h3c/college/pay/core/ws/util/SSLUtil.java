package cm.h3c.college.pay.core.ws.util;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.configuration.security.FiltersType;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.log4j.Logger;

public class SSLUtil {
	
	private static Logger log = Logger.getLogger(SSLUtil.class);

	public static void configureSSLOnTheClient(Object service, String keystoreLocation, String keyStorePwd, String trustStorePwd) {
//		File file = new File("D:/middleware/apache-tomcat-7.0.32/conf/tomcat.keystore");

		File file = new File(keystoreLocation);
		
		Client client = ClientProxy.getClient(service);
		HTTPConduit httpConduit = (HTTPConduit) client.getConduit();

		try {
			TLSClientParameters tlsParams = new TLSClientParameters();
			tlsParams.setDisableCNCheck(true);

			KeyStore keyStore = KeyStore.getInstance("JKS");
//			String trustStorePwd = "123456";
//			String storePassword = "123456";

			keyStore.load(new FileInputStream(file),
					keyStorePwd.toCharArray());
			TrustManagerFactory trustFactory = TrustManagerFactory
					.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			trustFactory.init(keyStore);
			TrustManager[] trustManagers = trustFactory.getTrustManagers();
			tlsParams.setTrustManagers(trustManagers);

			keyStore.load(new FileInputStream(file),
					keyStorePwd.toCharArray());
			KeyManagerFactory keyFactory = KeyManagerFactory
					.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			keyFactory.init(keyStore, trustStorePwd.toCharArray());
			KeyManager[] keyManagers = keyFactory.getKeyManagers();
			tlsParams.setKeyManagers(keyManagers);

			FiltersType filtersTypes = new FiltersType();
			filtersTypes.getInclude().add(".*_EXPORT_.*");
			filtersTypes.getInclude().add(".*_EXPORT1024_.*");
			filtersTypes.getInclude().add(".*_WITH_DES_.*");
			filtersTypes.getInclude().add(".*_WITH_NULL_.*");
			filtersTypes.getExclude().add(".*_DH_anon_.*");
			tlsParams.setCipherSuitesFilter(filtersTypes);

			httpConduit.setTlsClientParameters(tlsParams);
		} catch (Exception e) {
			log.warn(e);
		}
	}
}
