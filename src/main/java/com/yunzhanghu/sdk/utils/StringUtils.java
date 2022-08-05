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

}
