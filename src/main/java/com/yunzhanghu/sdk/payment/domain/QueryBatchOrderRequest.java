package com.yunzhanghu.sdk.payment.domain;




// 查询批次订单信息请求
public class QueryBatchOrderRequest {
    
    // 平台企业批次号
    private String batchId;
    
    // 平台企业 ID
    private String dealerId;

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

    @Override
    public String toString() {
        return "QueryBatchOrderRequest{" +
                   " batchId='" + batchId + '\'' + 
                   ", dealerId='" + dealerId + '\'' + 
                 '}';
    }
}