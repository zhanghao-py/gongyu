package cm.h3c.college.pay.cmpay;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class CmpayClient {
	private DefaultHttpClient client = new DefaultHttpClient();

	protected String postRequest(String reqXml, String uri)
			throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(uri);
		ByteArrayEntity entity = new ByteArrayEntity(reqXml.getBytes("GBK"));
		post.setEntity(entity);
		try {
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			return client.execute(post, responseHandler);
		} finally {
			if (post != null) {
				post.releaseConnection();
			}
		}
	}

}
