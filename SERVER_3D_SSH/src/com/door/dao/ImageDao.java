package com.door.dao;

import java.util.List;
import java.util.Map;

import com.door.bean.Image;

public interface ImageDao {
	/*
	 * 增加产品图片
	 */
	public int addImage(Image image);
	/*
	 * 批量增加产品图片
	 */
	public int addImage(List<Image> image);
	/*
	 * 查找产品主图片（展示产品列表时显示的图片：main_flag=1）
	 */
	public Image findImageMain(String ProductId);
	/*
	 * 查找产品所有图片
	 */
	public List<Image> findImageByProduct(String ProductId);
	/*
	 * 修改主图片
	 * product_id,image_id
	 */
	public int updateImageMain(Map<String,String> map);
	/*
	 * 删除产品图片
	 */
	public int deleteImage(Image image);
}
