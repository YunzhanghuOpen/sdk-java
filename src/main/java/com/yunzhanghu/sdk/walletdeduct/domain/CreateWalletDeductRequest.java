package com.yunzhanghu.sdk.walletdeduct.domain;

// 申请钱包余额扣减请求
public class CreateWalletDeductRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 劳动者信息
    private WalletDeductUserInfo userInfo;

    // 钱包 ID
    private String walletId;

    // 平台企业订单号
    private String orderId;

    // 业务场景
    private String scene;

    // 申请扣减金额
    private String amount;

    // 备注
    private String remark;

    // 通知地址
    private String notifyUrl;

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

    public void setUserInfo(WalletDeductUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public WalletDeductUserInfo getUserInfo() {
        return userInfo;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScene() {
        return scene;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    @Override
    public String toString() {
        return "CreateWalletDeductRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", scene='" + scene + '\'' +
                ", amount='" + amount + '\'' +
                ", remark='" + remark + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
               "}";
    }
}
