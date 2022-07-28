package com.yunzhanghu.sdk.h5usersign.domain;




// 获取用户签约状态返回
public class GetH5UserSignStatusResponse {
    
    // 签约时间
    private String signedAt;
    
    // 用户签约状态
    private int status;
    public void setSignedAt(String signedAt) {
        this.signedAt = signedAt;
    }

    public String getSignedAt() {
        return signedAt;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "GetH5UserSignStatusResponse{" +
                ", signedAt='" + signedAt + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}