package com.yunzhanghu.sdk.realname.domain;


public class CollectRealNameInfoResponse {
    
    // 录入状态
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "CollectRealNameInfoResponse{" +
                " status='" + status + '\'' + 
               "}";
    }
}