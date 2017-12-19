package com.door.bean;

import java.io.Serializable;
import java.util.Date;

public class Image implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String image_ID;
	private String product_ID;
	private String image_name;
	private String image_type;
	private String main_flag;
	private byte[] image_data;
	private String remark;
	private Date load_date;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(String image_ID, String product_ID, String image_name, String image_type, String main_flag,
			byte[] image_data, String remark, Date load_date) {
		super();
		this.image_ID = image_ID;
		this.product_ID = product_ID;
		this.image_name = image_name;
		this.image_type = image_type;
		this.main_flag = main_flag;
		this.image_data = image_data;
		this.remark = remark;
		this.load_date = load_date;
	}

	public String getImage_ID() {
		return image_ID;
	}

	public void setImage_ID(String image_ID) {
		this.image_ID = image_ID;
	}

	public String getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public String getImage_type() {
		return image_type;
	}

	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}

	public String getMain_flag() {
		return main_flag;
	}

	public void setMain_flag(String main_flag) {
		this.main_flag = main_flag;
	}

	public byte[] getImage_data() {
		return image_data;
	}

	public void setImage_data(byte[] image_data) {
		this.image_data = image_data;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLoad_date() {
		return load_date;
	}

	public void setLoad_date(Date load_date) {
		this.load_date = load_date;
	}

	
}
