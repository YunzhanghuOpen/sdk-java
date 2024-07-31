package com.yunzhanghu.sdk.payment.domain;

// 重试挂起状态订单请求
public class RetryOrderRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业订单号
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;
    
    // 支付路径名
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
        return "RetryOrderRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", orderId='" + orderId + '\'' + 
                ", ref='" + ref + '\'' + 
                ", channel='" + channel + '\'' + 
               "}";
    }
}