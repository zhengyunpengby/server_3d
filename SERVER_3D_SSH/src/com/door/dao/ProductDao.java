package com.door.dao;

import java.util.List;

import com.door.bean.Product;

public interface ProductDao {
	/*
	 * ���Ӳ�Ʒ
	 * �������Ӹ���
	 */
	public int addProduct(Product product);
	/*
	 * ͨ��id���Ҳ�Ʒ(ֻ����ͼƬmain_flag=1)
	 */
	public Product findProductById();
	/*
	 * ͨ��id���Ҳ�Ʒ������ͼƬ��
	 */
	public Product findProductsById();
	/*
	 * ͨ����Ʒ��Ų��Ҳ�Ʒ
	 */
	public Product findProductByNo();
	/*
	 * ͨ����Ʒ�����Ҳ�Ʒ
	 */
	public Product findProductByName();
	/*
	 * �г����в�Ʒ
	 */
	public List<Product> findProductAll();
	/*
	 * ͨ����Ʒ���Ͳ��Ҳ�Ʒ������
	 */
	public List<Product> findProductByType();
	/*
	 * ͨ����Ʒ���ʲ��Ҳ�Ʒ������
	 */
	public List<Product> findProductByTexture();
}
