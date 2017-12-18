package com.door.dao;

import java.util.List;
import java.util.Map;

import com.door.bean.Product;

public interface ProductDao {
	/*
	 * 增加产品
	 * 返回增加个数
	 */
	public int addProduct(Product product);
	/*
	 * 通过id查找产品(只有主图片main_flag=1)
	 * now：只取产品，图片另取
	 */
	public Product findProductById(String product_ID);
	/*
	 * 通过id查找产品（所有图片）
	 */
	public Product findProductsById(String product_ID);
	/*
	 * 通过产品编号查找产品
	 */
	public Product findProductByNo(String product_no);
	/*
	 * 通过产品名查找产品
	 */
	public Product findProductByName(String  product_name);
	/*
	 * 列出所有产品
	 */
	public List<Product> findProductAll();
	/*
	 * 列出优先产品
	 */
	public List<Map<String,Object>> findProductMap(Map<String,Integer> map);
	/*
	 * 通过产品类型查找产品：功能
	 */
	public List<Product> findProductByType(String product_type);
	/*
	 * 通过产品材质查找产品：材料
	 */
	public List<Product> findProductByTexture(String Texture);
	/*
	 * 通过产品材质查找产品：材料
	 * max_price,min_price
	 */
	public List<Product> findProductByPrice(Map<String,Double> map);
	/*
	 * 通过产品多种特性筛选（同时满足多种筛选）
	 */
	public List<Product> findProductsAnd(Map<String,String> map);
	/*
	 * 通过产品多种特性筛选（满足其中一种即可）
	 */
	public List<Product> findProductsOr(Map<String,String> map );
	/*
	 * 通过产品关键字
	 */
	public List<Product> findProductByKey(String key);
	
	/*
	 * 增加产品
	 * 返回增加个数
	 */
	public int updateProduct(Product product);
}
