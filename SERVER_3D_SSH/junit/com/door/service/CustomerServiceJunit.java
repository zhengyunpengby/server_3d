package com.door.service;

import java.util.Date;  

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.door.bean.Customer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:/application-base.xml",
		"classpath:/application-bean.xml"}
)
public class CustomerServiceJunit {
	
	@Resource
	private CustomerService customerService;
	private Customer customer = new Customer("123", "zyp", "a", "a", "a", "a", "a", "a","a", "a", "a", "a", new Date());
	
	/*@Test
	public void getCustomer(){		
		customerService.addCustomer(customer);
		System.out.println("test");
	}*/
	
	/*@Test
	public void addCustomer(){
		customerService.addCustomer(customer);
	}*/
	
	@Test
	public void verifyInfo(){
		System.out.println(customerService.verifyInfoTel("123"));
		System.out.println(customerService.verifyInfoUserName("123"));
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
