package com.yunzhanghu.sdk.payment.domain;

// 查询批次订单信息返回
public class QueryBatchOrderResponse {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业批次号
    private String batchId;
    
    // 总笔数
    private String totalCount;
    
    // 订单总金额
    private String totalPay;
    
    // 支付路径
    private String channel;
    
    // 批次状态码
    private String batchStatus;
    
    // 批次状态码描述
    private String batchStatusMessage;
    
    // 批次接收时间
    private String batchReceivedTime;
    
    // 批次订单列表
    private QueryBatchOrderInfo[] orderList;

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

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatusMessage(String batchStatusMessage) {
        this.batchStatusMessage = batchStatusMessage;
    }

    public String getBatchStatusMessage() {
        return batchStatusMessage;
    }

    public void setBatchReceivedTime(String batchReceivedTime) {
        this.batchReceivedTime = batchReceivedTime;
    }

    public String getBatchReceivedTime() {
        return batchReceivedTime;
    }

    public void setOrderList(QueryBatchOrderInfo[] orderList) {
        this.orderList = orderList;
    }

    public QueryBatchOrderInfo[] getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "QueryBatchOrderResponse{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", batchId='" + batchId + '\'' + 
                ", totalCount='" + totalCount + '\'' + 
                ", totalPay='" + totalPay + '\'' + 
                ", channel='" + channel + '\'' + 
                ", batchStatus='" + batchStatus + '\'' + 
                ", batchStatusMessage='" + batchStatusMessage + '\'' + 
                ", batchReceivedTime='" + batchReceivedTime + '\'' + 
                ", orderList='" + orderList + '\'' + 
               "}";
    }
}