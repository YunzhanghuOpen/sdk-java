package com.yunzhanghu.sdk.payment.domain;

// 查询劳动者退款订单信息请求
public class GetLaborRefundOrderRequest {

    // 平台企业 ID
    private String dealerId;

    // 平台企业订单号
    private String orderId;

    // 支付路径
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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "GetLaborRefundOrderRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", channel='" + channel + '\'' +
               "}";
    }
}
