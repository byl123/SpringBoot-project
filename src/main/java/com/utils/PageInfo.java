package com.utils;

import java.io.Serializable;

/**
 * 分页信息
 */
public class PageInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * 总记录数
     */
    private Long total;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 当前页
     */
    private Integer pageCurrent;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    
    
	public PageInfo() {
		super();
	}

	public PageInfo(Long total, Integer totalPages, Integer pageCurrent, Integer pageSize) {
		this.total = total;
		this.totalPages = totalPages;
		this.pageCurrent = pageCurrent;
		this.pageSize = pageSize;
	}
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
