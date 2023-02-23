package com.yunzhanghu.sdk.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
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
        Runtime runtime = Runtime.getRuntime();
        String u = "";
        try {
            Process start = runtime.exec("uname -m -r -s");
            InputStream inputStream = start.getInputStream();
            byte[] res = new byte[1024];
            inputStream.read(res);
            u = new String(res, StandardCharsets.UTF_8).trim();
        }catch (IOException ex){
            u = "";
        }

        return "yunzhanghu-sdk-java/1.0.0/" + u + "/1.4.6-RELEASE";
    }

}
