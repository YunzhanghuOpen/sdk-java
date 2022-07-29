package com.yunzhanghu.sdk.authentication.domain;




// 查看免验证用户名单是否存在返回
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
              '}';
    }
}