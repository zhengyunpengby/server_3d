package com.door.bean;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String customer_ID;
	private String cert_ID;
	private String userName;
	private String custName;
	private String password;
	private String role;
	private String tel;
	private String home_Address;
	private String work_Type;
	private String load_Stat;

	private String remark;
	private String stat;
	private Date load_Date;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	


	public Customer(String customer_ID, String cert_ID, String userName, String custName, String password, String role,
			String tel, String home_Address, String work_Type, String load_Stat, String remark, String stat,
			Date load_Date) {
		super();
		this.customer_ID = customer_ID;
		this.cert_ID = cert_ID;
		this.userName = userName;
		this.custName = custName;
		this.password = password;
		this.role = role;
		this.tel = tel;
		this.home_Address = home_Address;
		this.work_Type = work_Type;
		this.load_Stat = load_Stat;
		this.remark = remark;
		this.stat = stat;
		this.load_Date = load_Date;
	}




	public String getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}

	public String getCert_ID() {
		return cert_ID;
	}

	public void setCert_ID(String cert_ID) {
		this.cert_ID = cert_ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHome_Address() {
		return home_Address;
	}

	public void setHome_Address(String home_Address) {
		this.home_Address = home_Address;
	}

	public String getWork_Type() {
		return work_Type;
	}

	public void setWork_Type(String work_Type) {
		this.work_Type = work_Type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public Date getLoad_Date() {
		return load_Date;
	}

	public void setLoad_Date(Date load_Date) {
		this.load_Date = load_Date;
	}

	public String getLoad_Stat() {
		return load_Stat;
	}

	public void setLoad_Stat(String load_Stat) {
		this.load_Stat = load_Stat;
	}

	@Override
	public String toString() {
		return "Customer [customer_ID=" + customer_ID + ", cert_ID=" + cert_ID + ", userName=" + userName
				+ ", custName=" + custName + ", password=" + password + ", role=" + role + ", tel=" + tel
				+ ", home_Address=" + home_Address + ", work_Type=" + work_Type + ", load_Stat=" + load_Stat
				+ ", remark=" + remark + ", stat=" + stat + ", load_Date=" + load_Date + "]";
	}
	
	
		
}
