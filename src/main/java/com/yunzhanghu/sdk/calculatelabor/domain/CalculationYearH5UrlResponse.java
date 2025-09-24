package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务年度税费测算-H5 返回
public class CalculationYearH5UrlResponse {
    
    // 年度劳务测算 H5 页面 URL
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "CalculationYearH5UrlResponse{" +
                " url='" + url + '\'' + 
               "}";
    }
}