package org.viewsoft.boot.platform.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @intro JSON返回数据封装
 * @version 1.0
 * @author lengyu
 * @since 2017年3月1日 下午6:28:17
 */
public class JsonResult<T> {
	private boolean success;// 是否成功或失败
	private T data;// 成功对应返回的数据结果集
	private String url;// 请求URL
	private Map<String, Object> errors = new HashMap<String, Object>();// 失败对应返回的数据结果集

	public JsonResult() {
		this(true);
	}

	public JsonResult(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, Object> errors) {
		this.errors = errors;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
