package com.rb.base.dao;

import javax.servlet.http.HttpServletRequest;

import com.rb.base.model.ManageMainDto;

public interface AdminMainDao {
	
	public String order_date_sales(HttpServletRequest request) throws Exception; // 오늘 총 판매 금액
	public ManageMainDto order_date_sales_NQP() throws Exception; // 오늘 많이 팔린 상품의 이름,갯수, 가격	
	public String order_week_sales(HttpServletRequest request) throws Exception; // 오늘부터-7day 까지 매출금액
	
}//END 