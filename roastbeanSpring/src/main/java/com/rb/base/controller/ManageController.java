package com.rb.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rb.base.service.ManageMainService;

@Controller
public class ManageController {
	
	@Autowired
	ManageMainService service;
	
	// AdminMain 
	@RequestMapping("/ManageMain")
	public String ManageMain(HttpServletRequest request)throws Exception{
		
//		service.order_date_sales(request);
//		service.order_week_sales(request);
//		service.order_date_order_quantity_NQP(request);   임마 하나 
//		service.order_date_order_price_NQP(request);		임마 둘 
//		service.week_order_product_order_price_NQP(request); //ok
//		service.week_order_product_order_quantity_NQP(request);//ok
		service.monthly_statistics(request);
		service.count_new_users(request);
		service.todayNewQNA(request);
		service.totalQNA(request);
		service.doneanswerQNA(request);
		service.today_sum_community(request);
		
		return "ManageMain";
	}//ManageMain End
	
	
	
//	//UserList
//	@RequestMapping("/UserList")
//	public String UserList(HttpServletRequest request, Model model)throws Exception{
//		service.userList(request,model);
//		
//		return "manage_UserList";
//	}//UserList
	
	//UserList
	@RequestMapping("/UserList")
	public String UserList(HttpServletRequest request, Model model)throws Exception{
		service.userList(request,model);
		
		return "manage_UserList";
	}//UserList
}//class end 
