package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.utils.JsonUtil;
import org.junit.Assert;
import org.junit.Test;

public class Base {

    @Test
    public void loadConfig() throws Exception {
        YzhConfig config = YzhConfig.loadConfig("yzh.properties");

        Assert.assertNotNull(config);
    }

    @Test
    public void fromJson() {
        YzhResponse response = JsonUtil.fromLowerCasesWithUnderScoresJson("{\"http_code\":1,\"request_id\":\"123\"}", YzhResponse.class);

        Assert.assertEquals(response.getRequestId(), "123");

        YzhResponse response2 = JsonUtil.fromLowerCasesWithUnderScoresJson("{\"http_code\":1,\"requestID\":\"123\"}", YzhResponse.class);

        Assert.assertEquals(response2.getRequestId(), "123");
    }

}
