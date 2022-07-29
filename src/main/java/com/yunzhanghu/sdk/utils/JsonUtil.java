package com.yunzhanghu.sdk.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class JsonUtil {

    private static Gson gson = new Gson();

    public static <T> T fromJson(String json, Class<T> clazz) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        return gson.fromJson(json, clazz);
    }

    public static String toJson(Object object) {
        if (object == null) {
            return "";
        }
        return gson.toJson(object);
    }

    public static <T> T fromData(String message, Class<T> clazz) {
        if (StringUtils.isEmpty(message)) {
            return null;
        }

        Map<String, String> data = new HashMap<String, String>();
        for (String element : message.split("&")) {
            String[] eles = element.split("=", 2);
            data.put(eles[0], eles[1]);
        }

        return gson.fromJson(toJson(data), clazz);
    }

    public static <T> T fromLowerCasesWithUnderScoresJson(String data, Type t) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();
        return gson.fromJson(data, t);
    }

    public static String toLowerCasesWithUnderScoresJson(Object obj) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();
        return gson.toJson(obj);
    }

}
