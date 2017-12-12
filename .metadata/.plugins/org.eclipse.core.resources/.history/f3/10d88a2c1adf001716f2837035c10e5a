/**
 * 
 */
package com.door.service.impl;

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
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomer(Customer customer) {
		
		return customerDao.getCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
