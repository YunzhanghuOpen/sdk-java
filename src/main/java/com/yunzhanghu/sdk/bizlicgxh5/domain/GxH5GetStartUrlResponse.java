package com.yunzhanghu.sdk.bizlicgxh5.domain;




// 预启动返回
public class GxH5GetStartUrlResponse {
    
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
        return "GxH5GetStartUrlResponse{" +
                       " h5Url='" + h5Url + '\'' + 
                     '}';
    }
}