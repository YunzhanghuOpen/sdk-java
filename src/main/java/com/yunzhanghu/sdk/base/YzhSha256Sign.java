package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.utils.DESUtil;
import com.yunzhanghu.sdk.utils.JsonUtil;
import com.yunzhanghu.sdk.utils.Sha256Util;
import java.nio.charset.StandardCharsets;

public class YzhSha256Sign extends YzhSign {

    public YzhSha256Sign(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    @Override
    public String sign(String request) throws Exception {
    	return Sha256Util.sign(request, getYzhConfig().getYzhAppKey(), StandardCharsets.UTF_8);
    }

    @Override
    public String encData(Object request) throws Exception {
        return DESUtil.encode(getYzhConfig().getYzh3DesKey(), JsonUtil.toLowerCasesWithUnderScoresJson(request), StandardCharsets.UTF_8);
    }

}
