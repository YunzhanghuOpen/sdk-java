package com.yunzhanghu.sdk.authentication.domain;




// 上传免验证用户名单信息返回
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
                ", ok='" + ok + '\'' +
                '}';
    }
}