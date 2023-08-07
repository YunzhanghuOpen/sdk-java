package com.yunzhanghu.sdk.base;


import com.yunzhanghu.sdk.constants.XmlData;
import com.yunzhanghu.sdk.utils.DESUtil;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ThreadLocalRandom;

public abstract class YzhSign {

    private YzhConfig yzhConfig;

    public YzhSign(YzhConfig yzhConfig) {
        setYzhConfig(yzhConfig);
    }

    protected SignedData sign(Object request) throws Exception {
        SignedData signedData = new SignedData();
        signedData.setSignType(getYzhConfig().getSignType().getValue());
        signedData.setMess(ThreadLocalRandom.current().nextInt(1000) + "");
        signedData.setTimestamp(Integer.parseInt(String.valueOf(System.currentTimeMillis() / 1000)));
        signedData.setData(encData(request));

        String plain = new StringBuilder("data=")
                .append(signedData.getData())
                .append("&mess=")
                .append(signedData.getMess())
                .append("&timestamp=")
                .append(signedData.getTimestamp())
                .append("&key=")
                .append(getYzhConfig().getYzhAppKey())
                .toString();

        signedData.setSign(sign(plain));
        return signedData;
    }

    protected abstract String sign(String request) throws Exception;

    protected abstract String encData(Object request) throws Exception;

    public String decrypt(String data) throws Exception {
        return DESUtil.decode(yzhConfig.getYzh3DesKey(), data, StandardCharsets.UTF_8);
    }

    public YzhConfig getYzhConfig() {
        return yzhConfig;
    }

    public void setYzhConfig(YzhConfig yzhConfig) {
        this.yzhConfig = yzhConfig;
    }

    public class SignedData {


        // 时间戳，精确到秒
        private int timestamp;


        // 签名
        private String sign;


        // 签名算法
        private String signType;


        // 随机数，用于签名
        private String mess;


        // 经过加密后的具体数据
        private String data;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getSignType() {
            return signType;
        }

        public void setSignType(String signType) {
            this.signType = signType;
        }

        public String getMess() {
            return mess;
        }

        public void setMess(String mess) {
            this.mess = mess;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        // 获取签名
        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        // 获取get请求明文串
        public String getPlainEncode() throws Exception {
            return new StringBuilder("data=")
                    .append(getEncode(data))
                    .append("&mess=")
                    .append(getEncode(mess))
                    .append("&timestamp=")
                    .append(timestamp)
                    .append("&sign_type=")
                    .append(getEncode(signType))
                    .append("&sign=")
                    .append(getEncode(getSign()))
                    .toString();
        }

        private String getEncode(String content) throws Exception {
            return URLEncoder.encode(content, XmlData.CHARSET);
        }
    }
}
