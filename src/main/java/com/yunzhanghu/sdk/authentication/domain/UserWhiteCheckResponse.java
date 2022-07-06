package com.yunzhanghu.sdk.authentication.domain;




// 查看用户免验证名单是否存在响应
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
                ", ok='" + ok + '\'' +
                '}';
    }
}