package com.yunzhanghu.sdk.walletdeduct.domain;

// 查询钱包余额扣减申请结果请求
public class QueryWalletDeductRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 平台企业订单号
    private String orderId;

    // 云账户钱包余额扣减订单号
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
        return "QueryWalletDeductRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
               "}";
    }
}
