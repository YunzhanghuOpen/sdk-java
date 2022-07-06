package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.utils.CipherUtil;
import com.yunzhanghu.sdk.utils.JsonUtil;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class YzhSha256Sign extends YzhSign {

    public YzhSha256Sign(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    @Override
    public String sign(String request) throws Exception {
        Mac sha256Hmac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKey = new SecretKeySpec(getYzhConfig().getYzhAppKey().getBytes(), "HmacSHA256");
        sha256Hmac.init(secretKey);
        return byteArrayToHexString(sha256Hmac.doFinal(request.getBytes()));
    }

    @Override
    public String encData(Object request) throws Exception {
        return CipherUtil.encData(getYzhConfig().getYzh3DesKey(), JsonUtil.toLowerCasesWithUnderScoresJson(request), StandardCharsets.UTF_8);
    }

    private String byteArrayToHexString(byte[] b) {
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
