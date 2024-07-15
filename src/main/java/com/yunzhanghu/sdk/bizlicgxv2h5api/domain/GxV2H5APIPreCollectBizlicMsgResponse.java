package com.yunzhanghu.sdk.bizlicgxv2h5api.domain;

// 工商实名信息录入返回
public class GxV2H5APIPreCollectBizlicMsgResponse {
    
    // 平台企业端的用户 ID
    private String dealerUserId;

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    @Override
    public String toString() {
        return "GxV2H5APIPreCollectBizlicMsgResponse{" +
                " dealerUserId='" + dealerUserId + '\'' + 
               "}";
    }
}