package com.yunzhanghu.sdk.authentication.domain;

// 查看用户是否在非居民身份证验证名单中返回
public class UserWhiteCheckResponse {
    
    private boolean ok;

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean getOk() {
        return ok;
    }

    @Override
    public String toString() {
        return "UserWhiteCheckResponse{" +
                " ok='" + ok + '\'' + 
               "}";
    }
}