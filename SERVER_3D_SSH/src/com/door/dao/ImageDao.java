package com.door.dao;

import java.util.List;
import java.util.Map;

import com.door.bean.Image;

public interface ImageDao {
	/*
	 * ���Ӳ�ƷͼƬ
	 */
	public int addImage(Image image);
	/*
	 * �������Ӳ�ƷͼƬ
	 */
	public int addImage(List<Image> image);
	/*
	 * ���Ҳ�Ʒ��ͼƬ��չʾ��Ʒ�б�ʱ��ʾ��ͼƬ��main_flag=1��
	 */
	public Image findImageMain(String ProductId);
	/*
	 * ���Ҳ�Ʒ����ͼƬ
	 */
	public List<Image> findImageByProduct(String ProductId);
	/*
	 * �޸���ͼƬ
	 * product_id,image_id
	 */
	public int updateImageMain(Map<String,String> map);
	/*
	 * ɾ����ƷͼƬ
	 */
	public int deleteImage(Image image);
}
