package org.viewsoft.boot.platform.exception;

/**
 * @intro 全局异常处理,实现error.html页面展示：在templates目录下创建error.html，将请求的URL和Exception对象的message输出。
 *        <br />
 *        <span>@ControllerAdvice定义统一的异常处理类 </span> <br />
 *        <span>@ExceptionHandler用来定义函数针对的异常类型</span>
 * @version 1.0
 * @author lengyu
 * @since 2017年3月1日 下午5:24:46
 */
public class GlobalExceptionHandler extends Exception {

	private ErrorInfoInterface errorInfo;

	public GlobalExceptionHandler(ErrorInfoInterface errorInfo) {
		this.errorInfo = errorInfo;
	}

	public ErrorInfoInterface getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfoInterface errorInfo) {
		this.errorInfo = errorInfo;
	}
}