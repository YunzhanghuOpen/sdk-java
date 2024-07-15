package com.yunzhanghu.sdk.payment.domain;

// 查询平台企业余额请求
public class ListAccountRequest {
    
    // 平台企业 ID
    private String dealerId;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    @Override
    public String toString() {
        return "ListAccountRequest{" +
             " dealerId='" + dealerId + '\'' + 
           '}';
    }
}