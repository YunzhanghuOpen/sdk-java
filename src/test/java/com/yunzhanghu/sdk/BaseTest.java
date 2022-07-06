package com.yunzhanghu.sdk;

import java.util.concurrent.ThreadLocalRandom;

public class BaseTest {

    public String getMess() {
        return ThreadLocalRandom.current().nextInt(10000000) + "";
    }

    public String getOrderId(String prefix) {
        return prefix + System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(1000);
    }
}
