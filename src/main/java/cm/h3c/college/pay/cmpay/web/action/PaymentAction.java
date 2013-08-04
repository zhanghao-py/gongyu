package cm.h3c.college.pay.cmpay.web.action;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;

import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCheckRequest;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/cmpay")
public class PaymentAction extends ActionSupport implements ServletRequestAware {
	private static final long serialVersionUID = 20130803L;

	private InputStream inputStream;

	private HttpServletRequest request;

	@Action(value = "web", results = { @Result(type = "stream") })
	public String webCallback() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(ServletInputStream) request.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		System.out.println(line);

		String response = new CmpayObjectFactory()
				.cmpayPaymentCheckRequest2Xml(new CmpayPaymentCheckRequest());
		inputStream = new ByteArrayInputStream(response.getBytes("GBK"));
		return SUCCESS;
	}

	public String backCallback() {
		return ERROR;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
