package com.yunzhanghu.sdk.utils;

import java.util.concurrent.ThreadLocalRandom;

public class BaseUtil {

    public static String getMess() {
        return ThreadLocalRandom.current().nextInt(10000000) + "";
    }

    public static String getOrderId(String prefix) {
        return prefix + System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(1000);
    }
}
