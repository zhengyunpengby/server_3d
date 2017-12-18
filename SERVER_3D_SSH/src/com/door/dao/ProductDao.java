package com.door.dao;

import java.util.List;
import java.util.Map;

import com.door.bean.Product;

public interface ProductDao {
	/*
	 * ���Ӳ�Ʒ
	 * �������Ӹ���
	 */
	public int addProduct(Product product);
	/*
	 * ͨ��id���Ҳ�Ʒ(ֻ����ͼƬmain_flag=1)
	 * now��ֻȡ��Ʒ��ͼƬ��ȡ
	 */
	public Product findProductById(String product_ID);
	/*
	 * ͨ��id���Ҳ�Ʒ������ͼƬ��
	 */
	public Product findProductsById(String product_ID);
	/*
	 * ͨ����Ʒ��Ų��Ҳ�Ʒ
	 */
	public Product findProductByNo(String product_no);
	/*
	 * ͨ����Ʒ�����Ҳ�Ʒ
	 */
	public Product findProductByName(String  product_name);
	/*
	 * �г����в�Ʒ
	 */
	public List<Product> findProductAll();
	/*
	 * �г����Ȳ�Ʒ
	 */
	public List<Map<String,Object>> findProductMap(Map<String,Integer> map);
	/*
	 * ͨ����Ʒ���Ͳ��Ҳ�Ʒ������
	 */
	public List<Product> findProductByType(String product_type);
	/*
	 * ͨ����Ʒ���ʲ��Ҳ�Ʒ������
	 */
	public List<Product> findProductByTexture(String Texture);
	/*
	 * ͨ����Ʒ���ʲ��Ҳ�Ʒ������
	 * max_price,min_price
	 */
	public List<Product> findProductByPrice(Map<String,Double> map);
	/*
	 * ͨ����Ʒ��������ɸѡ��ͬʱ�������ɸѡ��
	 */
	public List<Product> findProductsAnd(Map<String,String> map);
	/*
	 * ͨ����Ʒ��������ɸѡ����������һ�ּ��ɣ�
	 */
	public List<Product> findProductsOr(Map<String,String> map );
	/*
	 * ͨ����Ʒ�ؼ���
	 */
	public List<Product> findProductByKey(String key);
	
	/*
	 * ���Ӳ�Ʒ
	 * �������Ӹ���
	 */
	public int updateProduct(Product product);
}
