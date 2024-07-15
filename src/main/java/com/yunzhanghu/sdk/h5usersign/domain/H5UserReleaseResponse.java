package com.yunzhanghu.sdk.h5usersign.domain;

// 用户解约（测试账号专用接口）返回
public class H5UserReleaseResponse {
    
    // 是否解约成功
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "H5UserReleaseResponse{" +
                " status='" + status + '\'' + 
               "}";
    }
}