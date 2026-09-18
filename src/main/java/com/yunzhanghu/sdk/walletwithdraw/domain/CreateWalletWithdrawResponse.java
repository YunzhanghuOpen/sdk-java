package com.yunzhanghu.sdk.walletwithdraw.domain;

// 发起钱包余额提现返回
public class CreateWalletWithdrawResponse {

    // 平台企业订单号
    private String orderId;

    // 云账户钱包余额提现订单号
    private String ref;

    // 提现金额
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
        return "CreateWalletWithdrawResponse{" +
                " orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
               "}";
    }
}
