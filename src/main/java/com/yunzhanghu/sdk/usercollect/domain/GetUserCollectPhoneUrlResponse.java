package com.yunzhanghu.sdk.usercollect.domain;

// 获取收集手机号码页面返回
public class GetUserCollectPhoneUrlResponse {
    
    // 收集手机号码页面 URL
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "GetUserCollectPhoneUrlResponse{" +
                " url='" + url + '\'' + 
               "}";
    }
}