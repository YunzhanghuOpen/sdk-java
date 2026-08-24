package com.yunzhanghu.sdk.h5usersign.domain;

// 申请签约请求
public class H5UserSignRequest {
    
    // 签约 token
    private String token;

    // 主题颜色
    private String color;

    // 签约完成回调地址
    private String url;

    // 签约事件状态回调地址
    private String eventCallbackUrl;

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

    public void setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
    }

    public String getEventCallbackUrl() {
        return eventCallbackUrl;
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
                " token='" + token + '\'' +
                ", color='" + color + '\'' +
                ", url='" + url + '\'' +
                ", eventCallbackUrl='" + eventCallbackUrl + '\'' +
                ", redirectUrl='" + redirectUrl + '\'' +
               "}";
    }
}