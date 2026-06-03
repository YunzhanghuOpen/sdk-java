package com.yunzhanghu.sdk.h5usersign.domain;

// 申请解约返回
public class H5UserReleaseApplyResponse {
    
    // 签约状态
    private int status;
    
    // H5 解约页面 URL
    private String url;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "H5UserReleaseApplyResponse{" +
                " status='" + status + '\'' + 
                ", url='" + url + '\'' + 
               "}";
    }
}