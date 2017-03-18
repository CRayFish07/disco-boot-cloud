package cn.org.disco.boot.platform.exception;

/**
 * @intro JSON异常信息
 * @version 1.0
 * @author lengyu
 * @since 2017年3月1日 下午5:50:07
 */
public class JSONExceptionHandler extends Exception {
	private static final long serialVersionUID = 1L;

	public JSONExceptionHandler(String message) {
		super(message);
	}
}
