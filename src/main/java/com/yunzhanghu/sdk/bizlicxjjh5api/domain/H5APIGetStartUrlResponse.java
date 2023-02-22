package com.yunzhanghu.sdk.bizlicxjjh5api.domain;



// 预启动返回
public class H5APIGetStartUrlResponse {
    
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
        return "H5APIGetStartUrlResponse{" +
             " h5Url='" + h5Url + '\'' + 
           '}';
    }
}