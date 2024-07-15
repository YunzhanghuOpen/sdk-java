package com.yunzhanghu.sdk.apiusersign.domain;

// 获取用户签约状态返回
public class GetApiUserSignStatusResponse {
    
    // 签约时间
    private String signedAt;
    
    // 用户签约状态
    private String status;

    public void setSignedAt(String signedAt) {
        this.signedAt = signedAt;
    }

    public String getSignedAt() {
        return signedAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "GetApiUserSignStatusResponse{" +
                " signedAt='" + signedAt + '\'' + 
                ", status='" + status + '\'' + 
               "}";
    }
}