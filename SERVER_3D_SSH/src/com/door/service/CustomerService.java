package com.door.service;

import com.door.bean.Customer;

public interface CustomerService {
	public int addCustomer(Customer customer);
	public Customer getCustomer(Customer customer);
	public Customer loginCustomer(String loginMg,String password);
	public void updateCustomer(Customer customer);
	public int verifyInfoTel(String tel);
	public int verifyInfoUserName(String userName);
}
