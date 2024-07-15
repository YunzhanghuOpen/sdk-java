package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.utils.DESUtil;
import com.yunzhanghu.sdk.utils.JsonUtil;
import com.yunzhanghu.sdk.utils.RSAUtil;
import java.nio.charset.StandardCharsets;

public class YzhRsaSign extends YzhSign {

    public YzhRsaSign(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    @Override
    public String sign(String request) throws Exception {
        return RSAUtil.sign(request, getYzhConfig().getYzhRsaPrivateKey(), StandardCharsets.UTF_8);
    }

    @Override
    public String encData(Object request) throws Exception {
        return DESUtil.encode(getYzhConfig().getYzh3DesKey(), JsonUtil.toLowerCasesWithUnderScoresJson(request), StandardCharsets.UTF_8);
    }

}
