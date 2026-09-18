package com.yunzhanghu.sdk.walletdeduct.domain;

// 申请钱包余额扣减返回
public class CreateWalletDeductResponse {

    // 平台企业订单号
    private String orderId;

    // 云账户钱包余额扣减订单号
    private String ref;

    // 扣减金额
    private String amount;

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

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "CreateWalletDeductResponse{" +
                " orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
               "}";
    }
}
