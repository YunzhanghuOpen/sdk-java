package com.yunzhanghu.sdk.payment.domain;

// 取消待支付订单请求
public class CancelOrderRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业订单号
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;
    
    // 支付路径名，银行卡（默认）、支付宝、微信
    private String channel;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "CancelOrderRequest{" +
             " dealerId='" + dealerId + '\'' + 
             ", orderId='" + orderId + '\'' + 
             ", ref='" + ref + '\'' + 
             ", channel='" + channel + '\'' + 
           '}';
    }
}