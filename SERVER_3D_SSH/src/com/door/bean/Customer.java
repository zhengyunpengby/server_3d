package com.door.bean;

import java.util.Date;

public class Customer {
	private String Customer_ID;
	private String Cert_ID;
	private String UserName;
	private String UserName_Bak;
	private String Password;
	private String Role;
	private String TEL1;
	private String TEL2;
	private String Home_Address;
	private String Common_Address;
	private String Work_Type;
	private String Work_Unit;
	private String Remark;
	private String Stat;
	private Date Load_Date;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String customer_ID, String cert_ID, String userName, String userName_Bak, String password,
			String role, String tEL1, String tEL2, String home_Address, String common_Address, String work_Type,
			String work_Unit, String remark, String stat, Date load_Date) {
		super();
		Customer_ID = customer_ID;
		Cert_ID = cert_ID;
		UserName = userName;
		UserName_Bak = userName_Bak;
		Password = password;
		Role = role;
		TEL1 = tEL1;
		TEL2 = tEL2;
		Home_Address = home_Address;
		Common_Address = common_Address;
		Work_Type = work_Type;
		Work_Unit = work_Unit;
		Remark = remark;
		Stat = stat;
		Load_Date = load_Date;
	}



	public String getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(String customer_ID) {
		Customer_ID = customer_ID;
	}

	public String getCert_ID() {
		return Cert_ID;
	}

	public void setCert_ID(String cert_ID) {
		Cert_ID = cert_ID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserName_Bak() {
		return UserName_Bak;
	}

	public void setUserName_Bak(String userName_Bak) {
		UserName_Bak = userName_Bak;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getTEL1() {
		return TEL1;
	}

	public void setTEL1(String tEL1) {
		TEL1 = tEL1;
	}

	public String getTEL2() {
		return TEL2;
	}

	public void setTEL2(String tEL2) {
		TEL2 = tEL2;
	}

	public String getHome_Address() {
		return Home_Address;
	}

	public void setHome_Address(String home_Address) {
		Home_Address = home_Address;
	}

	public String getCommon_Address() {
		return Common_Address;
	}

	public void setCommon_Address(String common_Address) {
		Common_Address = common_Address;
	}

	public String getWork_Type() {
		return Work_Type;
	}

	public void setWork_Type(String work_Type) {
		Work_Type = work_Type;
	}

	public String getWork_Unit() {
		return Work_Unit;
	}

	public void setWork_Unit(String work_Unit) {
		Work_Unit = work_Unit;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getStat() {
		return Stat;
	}

	public void setStat(String stat) {
		Stat = stat;
	}

	public Date getLoad_Date() {
		return Load_Date;
	}

	public void setLoad_Date(Date load_Date) {
		Load_Date = load_Date;
	}
	
	
}
