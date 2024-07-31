package com.yunzhanghu.sdk.authentication.domain;

// 上传非居民身份证验证名单信息返回
public class UserExemptedInfoResponse {
    
    // 是否上传成功
    private String ok;

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getOk() {
        return ok;
    }

    @Override
    public String toString() {
        return "UserExemptedInfoResponse{" +
                " ok='" + ok + '\'' + 
               "}";
    }
}