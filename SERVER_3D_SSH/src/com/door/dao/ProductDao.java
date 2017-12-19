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
	public Map<String,Object> findProductById(String product_ID);
	/*
	 * ͨ����Ʒ��Ų��Ҳ�Ʒ
	 */
	public Map<String,Object> findProductByNo(String product_no);
	/*
	 * ͨ����Ʒ�����Ҳ�Ʒ
	 */
	public Map<String,Object> findProductByName(String  product_name);
	/*
	 * �г����в�Ʒ
	 */
	public List<Map<String,Object>> findProductAll();
	/*
	 * �г����Ȳ�Ʒ
	 */
	public List<Map<String,Object>> findProductMap(Map<String,Integer> map);
	/*
	 * ͨ����Ʒ���Ͳ��Ҳ�Ʒ������
	 */
	public List<Map<String,Object>> findProductByType(String product_type);
	/*
	 * ͨ����Ʒ���ʲ��Ҳ�Ʒ������
	 */
	public List<Map<String,Object>> findProductByTexture(String Texture);
	/*
	 * ͨ����Ʒ���ʲ��Ҳ�Ʒ������
	 * max_price,min_price
	 */
	public List<Map<String,Object>> findProductByPrice(Map<String,Double> map);
	/*
	 * ͨ����Ʒ��������ɸѡ��ͬʱ�������ɸѡ��
	 */
	public List<Map<String,Object>> findProductsAnd(Map<String,String> map);
	/*
	 * ͨ����Ʒ��������ɸѡ����������һ�ּ��ɣ�
	 */
	public List<Map<String,Object>> findProductsOr(Map<String,String> map );
	/*
	 * ͨ����Ʒ�ؼ���
	 */
	public List<Map<String,Object>> findProductByKey(String key);
	
	/*
	 * ���Ӳ�Ʒ
	 * �������Ӹ���
	 */
	public int updateProduct(Product product);
}
