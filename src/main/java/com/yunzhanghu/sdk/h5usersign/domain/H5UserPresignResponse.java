package com.yunzhanghu.sdk.h5usersign.domain;




// H5 预申请签约接口返回
public class H5UserPresignResponse {
    
    // 用户 ID（废弃字段）
    private String uid;
    
    // H5 签约 token
    private String token;
    
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
    
    @Override
    public String toString() {
        return "H5UserPresignResponse{" +
             " uid='" + uid + '\'' + 
             ", token='" + token + '\'' + 
              '}';
    }
}