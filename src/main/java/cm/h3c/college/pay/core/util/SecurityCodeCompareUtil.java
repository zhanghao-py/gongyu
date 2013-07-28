package cm.h3c.college.pay.core.util;

import java.util.Map;

import cm.h3c.college.pay.core.config.SystemConfig;

import com.opensymphony.xwork2.ActionContext;


public class SecurityCodeCompareUtil {
	
	/**
	 * 输入验证码与图像验证做比较
	 * @param inputCode
	 * @return 相等 - true, 不相等 - false
	 */
	public static boolean compare(String inputCode) {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String code = (String) session.get(SystemConfig.SECURITY_CODE_KEY);
		return (code.compareToIgnoreCase(inputCode) == 0);
	}

}
