package com.yunzhanghu.sdk.h5usersign.domain;

// 预申请签约返回
public class H5UserPresignResponse {
    
    // 用户 ID（废弃字段）
    private String uid;
    
    // H5 签约 token
    private String token;
    
    // 签约状态
    private int status;

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

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
        return "H5UserPresignResponse{" +
             " uid='" + uid + '\'' + 
             ", token='" + token + '\'' + 
             ", status='" + status + '\'' + 
           '}';
    }
}