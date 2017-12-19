package com.door.service;


import java.util.List;
import java.util.Map;

import com.door.bean.Image;
import com.door.bean.Product;

public interface ProductService {
	public int addProduct(Product product,List<Image> images);
	public int addImage(String product_id,List<Image> images);
	/*
	 * ��ȷ��ѯ
	 */
	public Image findImage(String image_id);
	/*
	 * ��ȷ��ѯ
	 */
	public Image findMainImage(Product product);
	/*
	 * ��ȷ��ѯ
	 */
	public Map<String,Object> findProdutdetail(Product product);
	/*
	 * ��ȷ��ѯ
	 */
	public Map<String,Object> findProdut(Product product);
	/*
	 * ģ����ѯ
	 * ���ͣ�����
	 */
	public List<Map<String,Object>> findProduts(Product product);
	/*
	 * ģ����ѯ
	 * �ؼ��֣��۸�
	 */
	public List<Map<String,Object>> findProdutLike(Map<String,String> map);
	/*
	 * ģ����ѯ
	 * ���ͣ�����
	 */
	public List<Map<String,Object>> findProdutTop(String typeTop);
}
