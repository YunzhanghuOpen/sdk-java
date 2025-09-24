package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务单笔结算税费测算-H5 返回
public class CalculationH5UrlResponse {
    
    // 连续劳务单笔结算税费测算 H5 页面 URL
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "CalculationH5UrlResponse{" +
                " url='" + url + '\'' + 
               "}";
    }
}