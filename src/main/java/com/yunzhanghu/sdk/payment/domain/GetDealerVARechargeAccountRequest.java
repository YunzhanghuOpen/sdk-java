package com.yunzhanghu.sdk.payment.domain;



// 查询平台企业汇款信息请求
public class GetDealerVARechargeAccountRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
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
             " brokerId='" + brokerId + '\'' + 
             ", dealerId='" + dealerId + '\'' + 
           '}';
    }
}