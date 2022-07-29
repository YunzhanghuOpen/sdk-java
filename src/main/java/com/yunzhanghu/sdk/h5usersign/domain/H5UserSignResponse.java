package com.yunzhanghu.sdk.h5usersign.domain;




// H5 签约接口返回
public class H5UserSignResponse {
    
    // H5 签约页面 URL
    private String url;
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    
    @Override
    public String toString() {
        return "H5UserSignResponse{" +
             " url='" + url + '\'' + 
              '}';
    }
}