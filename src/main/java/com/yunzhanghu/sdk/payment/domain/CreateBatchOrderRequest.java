package com.yunzhanghu.sdk.payment.domain;

// 批次下单请求
public class CreateBatchOrderRequest {
    
    // 平台企业批次号
    private String batchId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 支付路径
    private String channel;
    
    // 平台企业的微信 AppID
    private String wxAppId;
    
    // 订单总金额
    private String totalPay;
    
    // 总笔数
    private String totalCount;
    
    // 支付模式
    private String mode;
    
    // 订单列表
    private BatchOrderInfo[] orderList;

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

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setOrderList(BatchOrderInfo[] orderList) {
        this.orderList = orderList;
    }

    public BatchOrderInfo[] getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "CreateBatchOrderRequest{" +
                " batchId='" + batchId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", channel='" + channel + '\'' +
                ", wxAppId='" + wxAppId + '\'' +
                ", totalPay='" + totalPay + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", mode='" + mode + '\'' +
                ", orderList='" + orderList + '\'' +
                '}';
    }
}