package com.yunzhanghu.sdk.utils;

import java.nio.charset.Charset;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Sha256Util {
	
	public static String sign( String content, String key, Charset charset) {
		return  getSign(content, key, charset);
	}
	
	public static boolean verify(String content, String sign, String key, Charset charset) {
		String data = getSign(content, key, charset);
		return sign.equals(data);
	}
	
	
	private static String getSign(String content, String key, Charset charset) {
		try {
			Mac sha256Hmac = Mac.getInstance("HmacSHA256");
	        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(charset), "HmacSHA256");
	        sha256Hmac.init(secretKey);
	        return byteArrayToHexString(sha256Hmac.doFinal(content.getBytes()));
		} catch (Exception e) {
			String errorMessage = "签名遭遇异常，content=" + content + " key=" +key + " reason=" + e.getMessage();
            throw new RuntimeException(errorMessage, e);
		}
	}
	
	private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b != null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }
}
