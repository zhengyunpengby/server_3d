package com.door.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.door.bean.Customer;
import com.door.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CustomerService customerService;	
	private Customer customer;

	public String login(){
		customer = customerService.getCustomer(customer);
		if (customer != null){
			return "success";
		}else{
			return "error";
		}		
	}
	
	public String regist(){
		customerService.addCustomer(customer);
		return "success";
	}
}
