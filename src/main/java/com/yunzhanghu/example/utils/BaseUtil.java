package com.yunzhanghu.example.utils;

import java.util.concurrent.ThreadLocalRandom;

public class BaseUtil {

	public static String getMess() {
		return ThreadLocalRandom.current().nextInt(10000000) + "";
	}

	/**
	 * 获取随机字符串
	 * 
	 * @param prefix 字符串前缀
	 * @return 随机字符串
	 */
	public static String getRandomStr(String prefix) {
		return prefix + System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(1000);
	}
}
