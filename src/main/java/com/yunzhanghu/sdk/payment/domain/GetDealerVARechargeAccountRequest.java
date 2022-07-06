package com.yunzhanghu.sdk.payment.domain;





public class GetDealerVARechargeAccountRequest {
    
    // 综合服务主体ID
    private String brokerId;
    
    // 商户ID
    private String dealerId;
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }


    @Override
    public String toString() {
        return "GetDealerVARechargeAccountRequest{" +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                '}';
    }
}