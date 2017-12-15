package com.door.util;

import org.junit.Test;

import com.door.utils.CommonUtil;
import com.door.utils.PropertiesUtil;

public class CommentUtilJunit {

		/*@Test
		public void generateUUID(){
			String uuid = CommonUtil.generateUUID();
			System.out.println(uuid+"\n"+uuid.length());
		}*/
	
		@Test
		public void testProperties(){
			System.out.println(PropertiesUtil.getProperte("product.photo"));
		}
}
