package com.yunzhanghu.example.utils;

public class RSAUtil {
	
	/**
	 * 将 RSA 密钥从 PEM 转 String 格式
	 * 
	 * @param rsaKey PEM 格式的 RSA 密钥
	 * @return String 格式的 RSA 密钥
	 */
	public static String pem2String(String rsaKey) {
		if (rsaKey.isEmpty()) {
			throw new NullPointerException();
		}
		if (!rsaKey.startsWith("-")) {
			return rsaKey;
		}
		String[] rsaKeyArr = null;
		if (rsaKey.contains("\r")) {
			rsaKeyArr = rsaKey.split("\r\n");
		} else {
			rsaKeyArr = rsaKey.split("\n");
		}

		StringBuffer sbf = new StringBuffer();
		for (int i = 1; i < rsaKeyArr.length - 1; i++) {
			sbf.append(rsaKeyArr[i]);
		}
		return sbf.toString().replace("\r\n", "").replace("\r", "").replace("\n", "");
	}
}
