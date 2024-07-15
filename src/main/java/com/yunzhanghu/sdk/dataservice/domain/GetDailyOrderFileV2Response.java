package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单文件（支付和退款订单）返回
public class GetDailyOrderFileV2Response {
    
    // 下载地址
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "GetDailyOrderFileV2Response{" +
                " url='" + url + '\'' + 
               "}";
    }
}