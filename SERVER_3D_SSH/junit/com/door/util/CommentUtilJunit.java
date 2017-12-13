package com.door.util;

import org.junit.Test;

import com.door.utils.CommonUtil;

public class CommentUtilJunit {

		@Test
		public void generateUUID(){
			String uuid = CommonUtil.generateUUID();
			System.out.println(uuid+"\n"+uuid.length());
		}
}
