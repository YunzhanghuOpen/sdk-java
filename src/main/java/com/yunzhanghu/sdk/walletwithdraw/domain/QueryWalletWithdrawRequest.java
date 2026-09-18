package com.yunzhanghu.sdk.walletwithdraw.domain;

// 查询钱包余额提现结果请求
public class QueryWalletWithdrawRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 提现渠道
    private String channel;

    // 平台企业订单号
    private String orderId;

    // 云账户钱包余额提现订单号
    private String ref;

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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
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

    @Override
    public String toString() {
        return "QueryWalletWithdrawRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", channel='" + channel + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
               "}";
    }
}
