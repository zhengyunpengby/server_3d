package com.door.service;


import java.util.List;
import java.util.Map;

import com.door.bean.Image;
import com.door.bean.Product;

public interface ProductService {
	public int addProduct(Product product,List<Image> images);
	public int addImage(String product_id,List<Image> images);
	/*
	 * 精确查询
	 */
	public Product findProdut(Product product);
	/*
	 * 模糊查询
	 * 类型，材质
	 */
	public List<Product> findProduts(Product product);
	/*
	 * 模糊查询
	 * 关键字，价格
	 */
	public List<Product> findProdutLike(Map<String,String> map);
	/*
	 * 模糊查询
	 * 类型，材质
	 */
	public List<Map<String,Object>> findProdutTop(String typeTop);
}
