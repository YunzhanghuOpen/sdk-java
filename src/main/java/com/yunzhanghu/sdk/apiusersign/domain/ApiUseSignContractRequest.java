package com.yunzhanghu.sdk.apiusersign.domain;



// 获取协议预览 URL 请求
public class ApiUseSignContractRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    @Override
    public String toString() {
        return "ApiUseSignContractRequest{" +
             " dealerId='" + dealerId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
           '}';
    }
}