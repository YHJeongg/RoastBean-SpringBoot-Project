package com.rb.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.rb.base.model.MyOrderListDto;
import com.rb.base.model.UserDto;

public interface UserInfoService {
	
	public UserDto userInfoList(HttpServletRequest request) throws Exception;
	
	public int userPwCheck(HttpServletRequest request) throws Exception;
	
	public void userInfoUpdate(HttpServletRequest request) throws Exception;

	public List<MyOrderListDto> myOrderList(HttpServletRequest request) throws Exception;

}