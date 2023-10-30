package com.yunzhanghu.sdk.payment.domain;




// 批次撤销请求
public class CancelBatchOrderRequest {
    
    // 平台企业批次号
    private String batchId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

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
        return "CancelBatchOrderRequest{" +
                       " batchId='" + batchId + '\'' + 
                       ", dealerId='" + dealerId + '\'' + 
                       ", brokerId='" + brokerId + '\'' + 
                     '}';
    }
}