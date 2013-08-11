<%@page import="cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest"%>
<%@page import="java.io.PrintWriter"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.apache.http.client.HttpResponseException"%>
<%@page import="org.apache.http.util.EntityUtils"%>
<%@page import="org.apache.http.HttpEntity"%>
<%@page import="org.apache.http.StatusLine"%>
<%@page import="org.apache.http.impl.client.DefaultHttpClient"%>
<%@page import="org.apache.http.HttpResponse"%>
<%@page import="org.apache.http.entity.ByteArrayEntity"%>
<%@page import="org.apache.http.client.methods.HttpPost"%>
<%@page import="cm.h3c.college.pay.core.config.SystemConfig"%>
<%@page import="cm.h3c.college.pay.cmpay.CmpayObjectFactory"%>
<%@page import="cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest"%>
<%@page import="org.apache.http.client.HttpClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>callback</title>
</head>
<body>
	<%
		final CmpayObjectFactory cmpayObjectFactory = (CmpayObjectFactory) WebApplicationContextUtils
				.getWebApplicationContext(session.getServletContext())
				.getBean("cmpayObjectFactory");
		final PrintWriter pageWriter = new PrintWriter(out);
		final String orderId = request.getParameter("orderId");

		new Thread(new Runnable() {
			public void run() {
				try {
					// create CmpayPaymentRequest
					CmpayPaymentCallbackRequest callbackRequest = new CmpayPaymentCallbackRequest();
					callbackRequest.setRemark("中文");
					callbackRequest.setOrderId(orderId);
					callbackRequest.setStatus("SUCCESS");
					String reqXml = cmpayObjectFactory
							.cmpayPaymentCallbackRequest2Xml(callbackRequest);

					DefaultHttpClient client = new DefaultHttpClient();
					HttpPost post = new HttpPost(
							"http://localhost:8080/gongyu/back.pay");
					ByteArrayEntity entity = new ByteArrayEntity(reqXml
							.getBytes("UTF-8"));
					post.setEntity(entity);
					String responseString;
					try {
						HttpResponse httpResponse = client.execute(post);

						StatusLine statusLine = httpResponse
								.getStatusLine();
						HttpEntity responseEntity = httpResponse
								.getEntity();
						if (statusLine.getStatusCode() >= 300) {
							EntityUtils.consume(responseEntity);
							throw new HttpResponseException(statusLine
									.getStatusCode(), statusLine
									.getReasonPhrase());
						}
						responseString = EntityUtils.toString(
								responseEntity, "UTF-8");
					} finally {
						if (post != null) {
							post.releaseConnection();
						}
					}
				} catch (Exception e) {
					e.printStackTrace(pageWriter);
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				try {
					CmpayPaymentCallbackWebRequest callbackRequest = new CmpayPaymentCallbackWebRequest();
					callbackRequest.setRemark("中文");
					callbackRequest.setOrderId(orderId);
					callbackRequest.setStatus("SUCCESS");
					String reqXml = cmpayObjectFactory
							.cmpayPaymentCallbackWebRequest2Xml(callbackRequest);
					DefaultHttpClient client = new DefaultHttpClient();
					HttpPost post = new HttpPost(
							"http://localhost:8080/gongyu/web.pay");
					ByteArrayEntity entity = new ByteArrayEntity(reqXml
							.getBytes("UTF-8"));
					post.setEntity(entity);
					String responseString;
					try {
						HttpResponse httpResponse = client.execute(post);

						StatusLine statusLine = httpResponse
								.getStatusLine();
						HttpEntity responseEntity = httpResponse
								.getEntity();
						if (statusLine.getStatusCode() >= 300) {
							EntityUtils.consume(responseEntity);
							throw new HttpResponseException(statusLine
									.getStatusCode(), statusLine
									.getReasonPhrase());
						}
						responseString = EntityUtils.toString(
								responseEntity, "UTF-8");
					} finally {
						if (post != null) {
							post.releaseConnection();
						}
					}
				} catch (Exception e) {
					e.printStackTrace(pageWriter);
				}
			}
		}).start();
	%>
</body>
</html>