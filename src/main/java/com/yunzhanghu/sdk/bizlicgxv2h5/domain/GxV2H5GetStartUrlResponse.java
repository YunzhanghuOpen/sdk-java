package com.yunzhanghu.sdk.bizlicgxv2h5.domain;

// 预启动返回
public class GxV2H5GetStartUrlResponse {
    
    // 跳转 URL
    private String h5Url;

    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    public String getH5Url() {
        return h5Url;
    }

    @Override
    public String toString() {
        return "GxV2H5GetStartUrlResponse{" +
                " h5Url='" + h5Url + '\'' + 
               "}";
    }
}