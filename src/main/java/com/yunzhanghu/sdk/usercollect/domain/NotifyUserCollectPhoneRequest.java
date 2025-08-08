package com.yunzhanghu.sdk.usercollect.domain;

// 收集手机号码结果回调通知
public class NotifyUserCollectPhoneRequest {
    
    // 平台企业用户 ID
    private String dealerUserId;
    
    // 手机号码绑定状态
    private int status;

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "NotifyUserCollectPhoneRequest{" +
                " dealerUserId='" + dealerUserId + '\'' + 
                ", status='" + status + '\'' + 
               "}";
    }
}