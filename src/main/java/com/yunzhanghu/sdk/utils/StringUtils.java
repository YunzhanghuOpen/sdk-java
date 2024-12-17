package com.yunzhanghu.sdk.utils;

import java.util.UUID;

public class StringUtils {

    public static String trim(Object object) {
        return object == null ? "" : object.toString().trim();
    }

    public static boolean isNull(String str) {
        return "".equals(trim(str));
    }

    public static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        }
        return "".equals(trim(object));
    }

    public static String getRequestId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getUA(){
    	// yunzhanghu-sdk-{{开发语言}}/{{sdk版本}}/{{语言版本}} 
        return "yunzhanghu-sdk-java/1.4.21-RELEASE/1.8/";
    }

}
