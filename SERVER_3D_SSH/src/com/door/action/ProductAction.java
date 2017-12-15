package com.door.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.door.utils.CommonUtil;
import com.door.utils.PropertiesUtil;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class ProductAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File[] upload;      
    private String[] uploadFileName;        
    private String[] uploadContentType; 
    private long maximumSize;      
    private String allowedTypes;
    private String[] fileName;
    
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
					fis = new  FileInputStream(upload[i]);
					fos = new FileOutputStream(f);
					
					byte[] datas = new byte[1024];
					int length = 0;
					while((length=fis.read(datas))>0){
						fos.write(datas, 0, length);
						fos.flush();
					}
					count++;
				} catch (Exception e) {
					// TODO Auto-generated catch block
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
						// TODO Auto-generated catch block
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

	
}
