package com.yunzhanghu.sdk.payment.domain;

// 批次确认请求
public class ConfirmBatchOrderRequest {
    
    // 平台企业批次号
    private String batchId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 支付路径
    private String channel;

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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "ConfirmBatchOrderRequest{" +
                " batchId='" + batchId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", channel='" + channel + '\'' + 
               "}";
    }
}