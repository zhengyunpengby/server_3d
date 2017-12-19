package com.door.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.door.bean.Image;
import com.door.bean.Product;
import com.door.dao.ImageDao;
import com.door.dao.ProductDao;
import com.door.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ImageDao imageDao;

	@Override
	public int addProduct(Product product, List<Image> images) {
		int count = productDao.addProduct(product);
		if(count>0){
			if(images!=null){
				count=imageDao.addImages(images);
				if(count==0){
					return 0;
				}
			}			
			return 1;
		}else{
			return 0;
		}		
	}

	@Override
	public int addImage(String product_id, List<Image> images) {
		int count = 0;
		if(images!=null){
			if(images.size()>1){
				count = imageDao.addImages(images);
			}else{
				count = imageDao.addImage(images.get(0));
			}
		};
		return count;
	}

	@Override
	public Map<String,Object> findProdut(Product product) {
		Map<String,Object> map= new HashMap<String,Object>();
		
		if(product!=null){
			if(product.getProduct_ID()!=null){
				map = productDao.findProductById(product.getProduct_ID());
			}
			else if(product.getProduct_no()!=null){
				map = productDao.findProductByNo(product.getProduct_no());
			}
			else if(product.getProduct_name()!=null){
				map = productDao.findProductByName(product.getProduct_name());
			}else{
				return null;
			}			
		}		
		return map;
	}

	@Override
	public List<Map<String,Object>> findProduts(Product product) {
		List<Map<String,Object>> maps= new ArrayList<Map<String,Object>>();
		if(product!=null){
			if(product.getTexture()!=null){
				maps = productDao.findProductByTexture(product.getTexture());
			}
			else if(product.getProduct_type()!=null){
				maps = productDao.findProductByType(product.getProduct_type());
			}			
		}	
		else{
			maps = productDao.findProductAll();
		}
		return maps;
	}

	@Override
	public List<Map<String,Object>> findProdutLike(Map<String, String> map) {
		if(map!=null){
			
		}	
		return null;
	}

	@Override
	public List<Map<String, Object>> findProdutTop(String typeTop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image findImage(String image_id) {
		return imageDao.findImage(image_id);
	}

	@Override
	public Image findMainImage(Product product) {		
		return imageDao.findImageMain(product.getProduct_ID());
	}

	@Override
	public Map<String, Object> findProdutdetail(Product product) {
		Map<String,Object> map= new HashMap<String,Object>();		
		List<Image> images = null;

		if(product!=null&&product.getProduct_ID()!=null){
			map = productDao.findProductById(product.getProduct_ID());
			images = imageDao.findImageByProduct(product.getProduct_ID());
		}	
		map.put("images", images);
		
		return map; 
	}
	
}
