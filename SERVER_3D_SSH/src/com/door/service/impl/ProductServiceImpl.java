package com.door.service.impl;

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
		count = imageDao.addImages(images);
		return count;
	}

	@Override
	public Product findProdut(Product product) {
		if(product!=null){
			if(product.getProduct_ID()!=null){
				return productDao.findProductById(product.getProduct_ID());
			}
			if(product.getProduct_no()!=null){
				return productDao.findProductByNo(product.getProduct_no());
			}
			if(product.getProduct_name()!=null){
				return productDao.findProductByName(product.getProduct_name());
			}
		}		
		return null;
	}

	@Override
	public List<Product> findProduts(Product product) {
		if(product!=null){
			if(product.getTexture()!=null){
				return productDao.findProductByTexture(product.getTexture());
			}
			if(product.getProduct_type()!=null){
				return productDao.findProductByType(product.getProduct_type());
			}
		}		
		return null;
	}

	@Override
	public List<Product> findProdutLike(Map<String, String> map) {
		if(map!=null){
			
		}	
		return null;
	}

	@Override
	public List<Map<String, Object>> findProdutTop(String typeTop) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
