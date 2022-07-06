package com.yunzhanghu.sdk.payment.domain;





public class ListAccountRequest {
    
    // 商户ID
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
                ", dealerId='" + dealerId + '\'' +
                '}';
    }
}