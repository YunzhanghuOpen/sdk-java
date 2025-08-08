package com.yunzhanghu.sdk.usercollect.domain;

// 获取收集手机号码页面请求
public class GetUserCollectPhoneUrlRequest {
    
    // 手机号码收集 Token
    private String token;
    
    // 主题颜色
    private String color;
    
    // 回调地址
    private String url;
    
    // 跳转 URL
    private String redirectUrl;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    @Override
    public String toString() {
        return "GetUserCollectPhoneUrlRequest{" +
                " token='" + token + '\'' + 
                ", color='" + color + '\'' + 
                ", url='" + url + '\'' + 
                ", redirectUrl='" + redirectUrl + '\'' + 
               "}";
    }
}