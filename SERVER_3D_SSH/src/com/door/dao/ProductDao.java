package com.door.dao;

import java.util.List;

import com.door.bean.Product;

public interface ProductDao {
	/*
	 * 增加产品
	 * 返回增加个数
	 */
	public int addProduct(Product product);
	/*
	 * 通过id查找产品(只有主图片main_flag=1)
	 */
	public Product findProductById();
	/*
	 * 通过id查找产品（所有图片）
	 */
	public Product findProductsById();
	/*
	 * 通过产品编号查找产品
	 */
	public Product findProductByNo();
	/*
	 * 通过产品名查找产品
	 */
	public Product findProductByName();
	/*
	 * 列出所有产品
	 */
	public List<Product> findProductAll();
	/*
	 * 通过产品类型查找产品：功能
	 */
	public List<Product> findProductByType();
	/*
	 * 通过产品材质查找产品：材料
	 */
	public List<Product> findProductByTexture();
}
