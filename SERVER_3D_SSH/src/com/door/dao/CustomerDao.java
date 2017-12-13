package com.door.dao;

import java.util.Map;

import com.door.bean.Customer;



public interface CustomerDao {
	
	public int addCustomer(Customer customer);
	
	public Customer getCustomer(String customer_ID);
	
	public Customer getCustomerByUserName(Map<String,String> customer);
	
	public Customer getCustomerByTel(Map<String,String> customer);
	
	public Customer updateCustomer(Customer customer);
	
	public Integer getTelCustomer(String tel);
	
	public Integer getUserNameCustomer(String userName);
}
