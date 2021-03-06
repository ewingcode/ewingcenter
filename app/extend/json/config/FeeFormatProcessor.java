/**
 * 
 */
package extend.json.config;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * 金额格式化处理器
 *  
 */
public class FeeFormatProcessor implements JsonValueProcessor {

	/**
	 * 数组暂不转换
	 */
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return value;
	}

	/**
	 * 整形以分为单位的金额转换成以元为单位的字符串金额
	 */
	public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
		if (value == null) {
			return "0.00";
		}

		long fee;
		try {
			fee = Long.parseLong(String.valueOf(value));
		} catch (Exception e) {
			return value;
		}

		if (fee == Integer.MAX_VALUE || fee == Long.MIN_VALUE) {
			fee = 0;
		}

		return new java.text.DecimalFormat("#0").format(fee / 100) + "."
				+ new java.text.DecimalFormat("#00").format(Math.abs(fee) % 100);
	}
}
