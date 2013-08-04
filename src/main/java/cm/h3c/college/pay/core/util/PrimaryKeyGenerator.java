package cm.h3c.college.pay.core.util;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateFormatUtils;

public class PrimaryKeyGenerator {
	
	/**
	 * 生成主键, 日期yyyyMMddHHmmss + 4位随机数字
	 * @return
	 */
	public static Long getKey() {
		String keyPrefix = DateFormatUtils.format(System.currentTimeMillis(), "yyyyMMddHHmmss");
		String keyPostfix = SecurityCodeUtil.getRandomNumber();
		String key = keyPrefix + keyPostfix;
		return NumberUtils.createLong(key);
	}

}
