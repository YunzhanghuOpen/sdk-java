package com.yunzhanghu.sdk.utils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ThreadLocalRandom;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.constants.XmlData;

public class CustomerLinkUtil {

    public static String getCustomerLink(YzhConfig config, String baseUrl, String memberId) {
        return getLinkUrl(config, baseUrl, memberId);
    }

    private static String getLinkUrl(YzhConfig config, String baseUrl, String memberId) {
        try {
            String mess = ThreadLocalRandom.current().nextInt(1000) + "";
            String timestamp = Integer.parseInt(String.valueOf(System.currentTimeMillis() / 1000)) + "";
            
            String sign = signer(config, memberId, mess, timestamp);
            String url = new StringBuilder(baseUrl)
                    .append("?sign_type=")
                    .append(config.getSignType().getValue())
                    .append("&sign=")
                    .append(URLEncoder.encode(sign, XmlData.CHARSET))
                    .append("&member_id=")
                    .append(memberId)
                    .append("&mess=")
                    .append(mess)
                    .append("&timestamp=")
                    .append(timestamp)
                    .toString();
            return url;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private static String signer(YzhConfig config, String memberId, String mess, String timestamp) {
        String plain = getSignString(memberId, mess, timestamp, config.getYzhAppKey());
        String sign;
        if (YzhConfig.SignType.SHA256.equals(config.getSignType())) {
            sign = Sha256Util.sign(plain, config.getYzhAppKey(), StandardCharsets.UTF_8);
        } else if (YzhConfig.SignType.RSA.equals(config.getSignType())){
            sign = RSAUtil.sign(plain, config.getYzhRsaPrivateKey(), StandardCharsets.UTF_8);
        } else {
            throw new RuntimeException("signType can't be null!");
        }
        return sign;
    }

    private static String getSignString(String memberId, String mess, String timestamp, String appKey) {
        String plain = new StringBuilder("data=member_id=")
                .append(memberId)
                .append("&mess=")
                .append(mess)
                .append("&timestamp=")
                .append(timestamp)
                .append("&key=")
                .append(appKey)
                .toString();
        return plain;
    }
}