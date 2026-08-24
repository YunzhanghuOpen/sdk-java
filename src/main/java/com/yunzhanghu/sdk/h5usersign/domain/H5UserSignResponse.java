package com.yunzhanghu.sdk.h5usersign.domain;

// 申请签约返回
public class H5UserSignResponse {
    
    // H5 签约页面 URL
    private String url;

    // 微信签约小程序码 URL
    private String wxMpCodeUrl;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setWxMpCodeUrl(String wxMpCodeUrl) {
        this.wxMpCodeUrl = wxMpCodeUrl;
    }

    public String getWxMpCodeUrl() {
        return wxMpCodeUrl;
    }

    @Override
    public String toString() {
        return "H5UserSignResponse{" +
                " url='" + url + '\'' +
                " wxMpCodeUrl='" + wxMpCodeUrl + '\'' +
               "}";
    }
}