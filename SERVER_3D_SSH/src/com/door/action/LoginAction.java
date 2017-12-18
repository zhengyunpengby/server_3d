package com.door.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.door.bean.Customer;
import com.door.service.CustomerService;
import com.door.utils.CommonUtil;
import com.google.gson.Gson;
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
	private String loginMg;
	private String password;
	
	private HttpServletRequest request = null;
	private HttpSession session = null;
	private HttpServletResponse response = null;
	

	public String login(){
		request = ServletActionContext.getRequest();
		session = request.getSession();
		
		//验证用户名
		customer = customerService.loginCustomer(loginMg,password);

		if (customer != null){
			session.setAttribute("customer", customer);
			if("admin".equals(customer.getRole())){
				return "admin";
			}else{
				return "success";
			}			
		}else{
			return "error";
		}		
	}
	
	public String regist(){
		request = ServletActionContext.getRequest();
		session = request.getSession();
		
		String customer_ID = CommonUtil.generateUUID();
		Date load_date = new Date();
		customer.setCustomer_ID(customer_ID);
		customer.setLoad_Date(load_date);
		customer.setStat("N");
		//customer.setRole("admin");
		customer.setRole("user");
		
		int count = customerService.addCustomer(customer);
		if(count==1){
			session.setAttribute("customer", customer);
			return "success";
		}else{
			return "error";
		}
		
	}
	
	public void verifyInfoTel(){
		response = ServletActionContext.getResponse();
		PrintWriter pw = null;
		
		int count = customerService.verifyInfoTel(customer.getTel());
		Gson gson = new Gson();
		String countGson = gson.toJson(count);
		try {
			 pw = response.getWriter();
			 pw.write(countGson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	public void verifyInfoUserName(){
		response = ServletActionContext.getResponse();
		PrintWriter pw = null;
		int count = customerService.verifyInfoUserName(customer.getUserName());
		Gson gson = new Gson();
		String countGson = gson.toJson(count);
		try {
			 pw = response.getWriter();
			 pw.write(countGson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	/**
	 * @return
	 */
	public String logout(){
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
		session = request.getSession();
		customer = null;
		if (session != null) {  
            session.invalidate();//调用session的invalidate()方法，将保存的session删除  
        }  
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Expires", "0");
		return "success";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getLoginMg() {
		return loginMg;
	}

	public void setLoginMg(String loginMg) {
		this.loginMg = loginMg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
