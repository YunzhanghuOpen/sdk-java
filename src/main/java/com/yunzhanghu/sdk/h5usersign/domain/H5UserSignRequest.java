package com.yunzhanghu.sdk.h5usersign.domain;




// H5 签约接口请求
public class H5UserSignRequest {
    
    // H5 签约 token
    private String token;
    
    // H5 页面主题颜色
    private String color;
    
    // 回调 URL 地址
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
        return "H5UserSignRequest{" +
                ", token='" + token + '\'' +
                ", color='" + color + '\'' +
                ", url='" + url + '\'' +
                ", redirectUrl='" + redirectUrl + '\'' +
                '}';
    }
}