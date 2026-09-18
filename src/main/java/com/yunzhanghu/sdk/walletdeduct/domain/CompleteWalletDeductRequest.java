package com.yunzhanghu.sdk.walletdeduct.domain;

// 提交钱包余额扣减结果请求
public class CompleteWalletDeductRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 平台企业订单号
    private String orderId;

    // 云账户钱包余额扣减订单号
    private String ref;

    // 结算状态
    private String status;

    // 平台企业扣减交易流水号
    private String tradeNo;

    // 支付完成时间
    private String finishedAt;

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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    @Override
    public String toString() {
        return "CompleteWalletDeductRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", status='" + status + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", finishedAt='" + finishedAt + '\'' +
               "}";
    }
}
