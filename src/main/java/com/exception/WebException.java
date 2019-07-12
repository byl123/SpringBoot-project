package com.exception;

/**
 * 运行时异常类
 */
public class WebException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer statusCode;
	public String message;
	
	public WebException() {
		super();
	}
	public WebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public WebException(String message, Throwable cause) {
		super(message, cause);
	}
	public WebException(String message) {
		super(message);
	}
	public WebException(Throwable cause) {
		super(cause);
	}
	public WebException(Integer statusCode,String message) {
		super(message);
		this.message = message;
		this.statusCode = statusCode;
	}
	
	
}
