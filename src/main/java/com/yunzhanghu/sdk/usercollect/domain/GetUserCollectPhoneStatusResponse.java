package com.yunzhanghu.sdk.usercollect.domain;

// 查询手机号码绑定状态返回
public class GetUserCollectPhoneStatusResponse {
    
    // 手机号码收集 Token
    private String token;
    
    // 绑定状态
    private int status;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "GetUserCollectPhoneStatusResponse{" +
                " token='" + token + '\'' + 
                ", status='" + status + '\'' + 
               "}";
    }
}