package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.exception.WebException;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class ExceptionController {

	private final Logger logger = LogManager.getLogger(this.getClass());

	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception e) {
		ModelAndView mav = new ModelAndView("404page");
		logger.error("异常信息：", e);
		return mav;
	}

	@ExceptionHandler(WebException.class)
	public ModelAndView webExceptionHandler(WebException e) {
		ModelAndView mav = new ModelAndView("404page");
		logger.error("异常信息：", e);
		return mav;
	}

	/**
	 * 封装异常信息
	 * 
	 * @param e
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getExceptionAllinformation(Exception e) {
		StringBuilder out = new StringBuilder();
		// 获取异常消息
		out.append("\n\t" + e.getClass() + ": " + e.getMessage() + "\r\n");
		// 获取堆栈异常信息
		StackTraceElement[] trace = e.getStackTrace();
		for (StackTraceElement s : trace) {
			out.append("\tat " + s + "\r\n");
		}
		return out.toString();
	}
}
