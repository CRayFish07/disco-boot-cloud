package cn.org.disco.boot.platform.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.org.disco.boot.platform.bean.JsonResult;

/**
 * @intro 全局异常处理,实现error.html页面展示：在templates目录下创建error.html，将请求的URL和Exception对象的message输出。
 *        <br />
 *        <span>@ControllerAdvice定义统一的异常处理类 </span> <br />
 *        <span>@ExceptionHandler用来定义函数针对的异常类型</span>
 * @version 1.0
 * @author lengyu
 * @since 2017年3月1日 下午5:24:46
 */
@ControllerAdvice
class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";

	/**
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}

	/**
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@ExceptionHandler(value = JSONExceptionHandler.class)
	public JsonResult<String> jsonErrorHandler(HttpServletRequest req, JSONExceptionHandler e) throws Exception {
		JsonResult<String> r = new JsonResult<>();
		r.setSuccess(Boolean.FALSE);
		r.setData("Some Data");
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
