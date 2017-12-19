package com.door.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;   
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.door.bean.Image;
import com.door.bean.Product;
import com.door.service.ProductService;
import com.door.utils.CommonUtil;
import com.door.utils.PropertiesUtil;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class ProductAction extends ActionSupport {

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request = null;
	private HttpSession session = null;
	private HttpServletResponse response = null;
	
	@Autowired
	private ProductService productService;
	
	private File[] upload;      
    private String[] uploadFileName;        
    private String[] uploadContentType; 
    private long maximumSize;      
    private String allowedTypes;
    private String[] fileName;
    private Product product;
    List<Map<String,Object>> maps;
    private Map<String,Object> map;
    private String image_id;
    
    public String addProduct(){
    	product.setProduct_ID(CommonUtil.generateUUID());
    	product.setLoad_date(new Date());
    	product.setStat("N");
    	int count = productService.addProduct(product, null);
    	if(count>0){
    		return "success";
    	}else{
    		return "error";
    	}    	
    }
    
	public String addImages(){
    	List<Image> images = new ArrayList<Image>();
    	ByteArrayOutputStream byteArrayOutputStream = null;
    	InputStream inStream = null;
    	int count = 0;
    	if(upload==null){
    		upload = new File[0];
    	}
    	
    	Image img = productService.findMainImage(product);
    	try {
	    	for(int i=0;i<upload.length;i++){			    		
				inStream = new FileInputStream(upload[i]);
				byteArrayOutputStream = new ByteArrayOutputStream();
				byte[] data = new byte[1024];
				int length = 0;
				while((length=inStream.read(data))>0){
					byteArrayOutputStream.write(data, 0, length);
				}
				byteArrayOutputStream.flush();				
				
				Image image = new Image();
				image.setImage_ID(CommonUtil.generateUUID());
				image.setProduct_ID(product.getProduct_ID());
				image.setImage_data(byteArrayOutputStream.toByteArray());
				image.setLoad_date(new Date());
				image.setImage_name(uploadFileName[i]);
				image.setImage_type(uploadContentType[i]);
				if(img==null&&i==0){
					image.setMain_flag("Y");
				}
				
				images.add(image);
    		}
	    	
	    	count = productService.addImage(product.getProduct_ID(), images);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	finally {
			
			try {
				if(inStream!=null){
					inStream.close();
				}
				if(byteArrayOutputStream!=null){
					byteArrayOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
    	
    	if(count==upload.length){
    		return "success";
    	}
    	else{
    		return "error";
    	}
    }
    
    /*
     * 存储上传的图片在文件中
     * 废弃
     */
    public String upLoadProductImages(){
    	String path = PropertiesUtil.getProperte("product.photo");
    	URL url = ProductAction.class.getClassLoader().getResource("/");
    	String absolutePath = url.getPath().replace("WEB-INF/classes/", "").replace("%20", " ")+path+"/";    	

    	FileInputStream fis = null;
    	FileOutputStream fos = null;
    	
    	int fileNum = upload.length;
    	int count=0;
    	if(uploadFileName!=null){
    		
    		for(int i = 0;i<fileNum;i++){
    			try {
    				String fileContentType = uploadContentType[i];
    				fileContentType = fileContentType.substring(fileContentType.indexOf("/")+1);
    				
    				String filename  = absolutePath+CommonUtil.generateUUID()+"."+fileContentType;
    				File f = new File(filename);
    				if(!f.exists()){
    					f.createNewFile();
    				}
					fis = new FileInputStream(upload[i]);
					fos = new FileOutputStream(f);
					
					byte[] datas = new byte[1024];
					int length = 0;
					while((length=fis.read(datas))>0){
						
						fos.write(datas, 0, length);
						fos.flush();
					}
					count++;
				} catch (Exception e) {
					e.printStackTrace();
				}
    			finally{
    				try {
    					if(fis!=null){
    						fis.close();
    					}
						if(fos!=null){
							fos.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
    	    	}
    		}
    	}
    	if(count!=fileNum){
    		return "error";
    	}else{
    		File file = new File(absolutePath);
    		String parent = file.getParent();
    		parent=parent.substring(parent.lastIndexOf("\\")+1);
    		fileName = file.list();
    		for(int i=0;i<fileName.length;i++){
    			fileName[i] = parent+"/"+fileName[i];
    		}
    		return "success";
    	}   	
    	
    }
    
    public String showProduct(){
    	map = productService.findProdutdetail(product);
    	return "success";
    }
    
    public String listProducts(){
    	maps = productService.findProduts(product);
    	return "success";
    }
    
    public void showImage(){
    	//image_id
    	Image image = productService.findImage(image_id);
    	response = ServletActionContext.getResponse();
    	ServletOutputStream pw = null;
    	try {
			pw = response.getOutputStream();
			pw.write(image.getImage_data());
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		if(pw!=null){
    			try {
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    }

	public long getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(long maximumSize) {
		this.maximumSize = maximumSize;
	}

	public String getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(String allowedTypes) {
		this.allowedTypes = allowedTypes;
	}

	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String[] getFileName() {
		return fileName;
	}

	public void setFileName(String[] fileName) {
		this.fileName = fileName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Map<String, Object>> getMaps() {
		return maps;
	}

	public void setMaps(List<Map<String, Object>> maps) {
		this.maps = maps;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	
}
