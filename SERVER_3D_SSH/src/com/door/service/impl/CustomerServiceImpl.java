/**
 * 
 */
package com.door.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.door.bean.Customer;
import com.door.dao.CustomerDao;
import com.door.service.CustomerService;

/**
 * @author zyp
 * 客户service
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int count = customerDao.addCustomer(customer);
		return count;
	}

	@Override
	public Customer getCustomer(Customer customer) {
		
		return customerDao.getCustomer(customer.getCustomer_ID());
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer loginCustomer(String loginMg, String password) {
		Customer customer = null;
		Map<String,String> map = new HashMap<String,String>();
		map.put("userName", loginMg);
		map.put("tel", loginMg);
		map.put("password", password);
		
		customer = customerDao.getCustomerByUserName(map);
		if (customer==null){
			customer = customerDao.getCustomerByTel(map);
			if(customer==null){
				return null;
			}
		}
		return customer;
	}

	@Override
	public int verifyInfoTel(String tel) {	
		Integer i = customerDao.getTelCustomer(tel);
		if(i==null){
			return 0;
		}
		return i;
	}

	@Override
	public int verifyInfoUserName(String userName) {
		// TODO Auto-generated method stub
		Integer i = customerDao.getUserNameCustomer(userName);
		if(i==null){
			return 0;
		}
		return i;
	}
	
	

}
