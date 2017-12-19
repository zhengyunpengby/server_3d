package com.door.bean;

import java.io.Serializable;  
import java.util.Date;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String product_ID;
	private String product_no;
	private String product_name;
	private String product_type;
	private String Texture;
	private double height;
	private double width;
	private double thick;
	private double height_L;
	private double height_H;
	private double width_L;
	private double width_H;
	private double thick_L;
	private double thick_H;
	private String check_flag;
	private double pre_price;
	private double now_price;
	private double discount;
	private double discount_type;
	private String remark;
	private String stat;
	private Date load_date;
	
	
	public Product() {
	}

	

	public Product(String product_ID, String product_no, String product_name, String product_type, String texture,
			double height, double width, double thick, double height_L, double height_H, double width_L, double width_H,
			double thick_L, double thick_H, String check_flag, double pre_price, double now_price, double discount,
			double discount_type, String remark, String stat, Date load_date) {
		super();
		this.product_ID = product_ID;
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_type = product_type;
		Texture = texture;
		this.height = height;
		this.width = width;
		this.thick = thick;
		this.height_L = height_L;
		this.height_H = height_H;
		this.width_L = width_L;
		this.width_H = width_H;
		this.thick_L = thick_L;
		this.thick_H = thick_H;
		this.check_flag = check_flag;
		this.pre_price = pre_price;
		this.now_price = now_price;
		this.discount = discount;
		this.discount_type = discount_type;
		this.remark = remark;
		this.stat = stat;
		this.load_date = load_date;
	}



	public String getProduct_ID() {
		return product_ID;
	}


	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}



	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getProduct_type() {
		return product_type;
	}


	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}


	public String getTexture() {
		return Texture;
	}


	public void setTexture(String texture) {
		Texture = texture;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getThick() {
		return thick;
	}


	public void setThick(double thick) {
		this.thick = thick;
	}


	public double getHeight_L() {
		return height_L;
	}


	public void setHeight_L(double height_L) {
		this.height_L = height_L;
	}


	public double getHeight_H() {
		return height_H;
	}


	public void setHeight_H(double height_H) {
		this.height_H = height_H;
	}


	public double getWidth_L() {
		return width_L;
	}


	public void setWidth_L(double width_L) {
		this.width_L = width_L;
	}


	public double getWidth_H() {
		return width_H;
	}


	public void setWidth_H(double width_H) {
		this.width_H = width_H;
	}


	public double getThick_L() {
		return thick_L;
	}


	public void setThick_L(double thick_L) {
		this.thick_L = thick_L;
	}


	public double getThick_H() {
		return thick_H;
	}


	public void setThick_H(double thick_H) {
		this.thick_H = thick_H;
	}


	public String getCheck_flag() {
		return check_flag;
	}


	public void setCheck_flag(String check_flag) {
		this.check_flag = check_flag;
	}


	public double getPre_price() {
		return pre_price;
	}


	public void setPre_price(double pre_price) {
		this.pre_price = pre_price;
	}


	public double getNow_price() {
		return now_price;
	}


	public void setNow_price(double now_price) {
		this.now_price = now_price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getDiscount_type() {
		return discount_type;
	}


	public void setDiscount_type(double discount_type) {
		this.discount_type = discount_type;
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


	public Date getLoad_date() {
		return load_date;
	}


	public void setLoad_date(Date load_date) {
		this.load_date = load_date;
	}



	@Override
	public String toString() {
		return "Product [product_ID=" + product_ID + ", product_no=" + product_no + ", product_name=" + product_name
				+ ", product_type=" + product_type + ", Texture=" + Texture + ", height=" + height + ", width=" + width
				+ ", thick=" + thick + ", height_L=" + height_L + ", height_H=" + height_H + ", width_L=" + width_L
				+ ", width_H=" + width_H + ", thick_L=" + thick_L + ", thick_H=" + thick_H + ", check_flag="
				+ check_flag + ", pre_price=" + pre_price + ", now_price=" + now_price + ", discount=" + discount
				+ ", discount_type=" + discount_type + ", remark=" + remark + ", stat=" + stat + ", load_date="
				+ load_date + "]";
	}

	
}
