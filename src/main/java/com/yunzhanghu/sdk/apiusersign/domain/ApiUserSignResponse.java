package com.yunzhanghu.sdk.apiusersign.domain;

// 用户签约返回
public class ApiUserSignResponse {
    
    // 是否签约成功
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ApiUserSignResponse{" +
             " status='" + status + '\'' + 
           '}';
    }
}