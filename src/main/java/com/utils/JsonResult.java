package com.utils;

import java.io.Serializable;
/**
 * 自定义返回结果
 * @param <T>
 */
public class JsonResult<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 返回状态码
	 */
	private Integer statusCode;
	/**
	 * 返回消息
	 */
	private String message;
	/**
	 * 返回数据
	 */
	private T data;
	/**
	 * 返回分页信息
	 */
	private PageInfo pageInfo;

	
	/**
	 * 快速返回成功
	 * @return
	 */
	public static <T>JsonResult<T> SUCCESS(){
		return new JsonResult<T>();
	}
	/**
	 * 快速返回成功
	 * @param data
	 * @return
	 */
	public static <T>JsonResult<T> SUCCESS(T data){
		return new JsonResult<T>(ResultCode.SUCCESS.value(),ResultCode.SUCCESS.msg(),data);
	}
	/**
	 * 快速返回成功
	 * @param data
	 * @param pageInfo
	 * @return
	 */
	public static <T>JsonResult<T> SUCCESS(T data,PageInfo pageInfo){
		return new JsonResult<T>(ResultCode.SUCCESS.value(),ResultCode.SUCCESS.msg(),data,pageInfo);
	}
	/**
	 * 快速返回失败
	 * @return
	 */
	public static <T>JsonResult<T> FAIL(){
		return new JsonResult<T>(ResultCode.FAIL.value(),ResultCode.FAIL.msg());
	}
	/**
	 *  快速返回失败
	 * @param data
	 * @return
	 */
	public static <T>JsonResult<T> FAIL(T data){
		return new JsonResult<T>(ResultCode.FAIL.value(),ResultCode.FAIL.msg(),data);
	}
	/**
	 *  快速返回失败
	 * @param data
	 * @param pageInfo
	 * @return
	 */
	public static <T>JsonResult<T> FAIL(T data,PageInfo pageInfo){
		return new JsonResult<T>(ResultCode.FAIL.value(),ResultCode.FAIL.msg(),data,pageInfo);
	}
	/**
	 * 快速返回自定义状态
	 * @param resultCode
	 * @return
	 */
	public static <T>JsonResult<T> RESULT(ResultCode resultCode){
		return new JsonResult<T>(resultCode.value(),resultCode.msg());
	}
	/**
	 * 快速返回自定义状态
	 * @param statusCode
	 * @param message
	 * @return
	 */
	public static <T>JsonResult<T> RESULT(Integer statusCode,String message){
		return new JsonResult<T>(statusCode,message);
	}
	/**
	 * 快速返回自定义状态
	 * @param statusCode
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T>JsonResult<T> RESULT(Integer statusCode,String message,T data){
		return new JsonResult<T>(statusCode,message,data);
	}
	/**
	 * 快速返回自定义状态
	 * @param statusCode
	 * @param message
	 * @param data
	 * @param pageInfo
	 * @return
	 */
	public static <T>JsonResult<T> RESULT(Integer statusCode,String message,T data,PageInfo pageInfo){
		return new JsonResult<T>(statusCode,message,data,pageInfo);
	}
	/**
	 * 默认结果：成功
	 */
	public JsonResult() {
		this.statusCode = ResultCode.SUCCESS.value();
		this.message = ResultCode.SUCCESS.msg();
	}
	
	public JsonResult(Integer statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public JsonResult(Integer statusCode, String message, T data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}
	
	public JsonResult(Integer statusCode, String message, T data, PageInfo pageInfo) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
		this.pageInfo = pageInfo;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
}
