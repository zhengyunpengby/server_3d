package com.door.utils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static final String propertiesName = "constant.properties";

	public static String getProperte(String key){
		String values = null;
		InputStream fis = null;
		Properties properties = new Properties();
		try {			
			fis = PropertiesUtil.class.getClassLoader().getResource(propertiesName).openStream();
			properties.load(fis);
			values=properties.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(fis!=null){
					fis.close();
				};
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return values;
	}
}
