package com.yunzhanghu.example.config;

import com.yunzhanghu.sdk.base.YzhConfig;

public class Config {

	public static YzhConfig getYzhConfig() {
		try {
			return YzhConfig.loadConfig("yzh.properties");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
