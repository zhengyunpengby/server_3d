package com.door.dao;

import org.apache.ibatis.annotations.Param;

import com.door.bean.Customer;

/*
 * 客户dao
 */

public interface CustomerDao {
	/*
	 * 新增客户（录入、注册）
	 */
	public int addCustomer(@Param(value = "customer") Customer customer);
	
	/*
	 * 获取单个客户基本信息
	 * 登录、个人查询
	 */
	public Customer getCustomer(@Param(value = "customer") Customer customer);
	
	/*
	 * 修改客户信息
	 * 删除客户（修改stat）、修改信息、授权
	 */
	public Customer updateCustomer( @Param(value = "customer")Customer customer);
}
