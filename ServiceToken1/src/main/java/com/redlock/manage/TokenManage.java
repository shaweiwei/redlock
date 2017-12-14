package com.redlock.manage;

import java.util.HashMap;
import java.util.Map;

public class TokenManage {
	private Object lock = new Object();
	private static Map<String,String> userTokenMap = new HashMap<String,String>();
	
	public void synAddUserToken(){
		synchronized (lock) {
			userTokenMap.put("hihi", "haha");
		}
	}
}
