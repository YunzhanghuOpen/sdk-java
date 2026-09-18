package com.yunzhanghu.sdk.walletincome.domain;

// 发起钱包余额入账返回
public class CreateWalletIncomeResponse {

    // 平台企业订单号
    private String orderId;

    // 云账户钱包入账订单号
    private String ref;

    // 税前收入金额
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
        return "CreateWalletIncomeResponse{" +
                " orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
               "}";
    }
}
