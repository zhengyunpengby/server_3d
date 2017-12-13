package com.door.utils;

import java.util.UUID;

public class CommonUtil {
	public static String generateUUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
}
