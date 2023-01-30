package com.yunzhanghu.sdk.bizlicxjjh5api.domain;



import java.util.List;

// 工商实名信息录入返回
public class H5PreCollectBizlicMsgResponse {
    
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
        return "H5PreCollectBizlicMsgResponse{" +
             " dealerUserId='" + dealerUserId + '\'' + 
           '}';
    }
}