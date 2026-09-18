package com.yunzhanghu.sdk.walletincome.domain;

// 发起钱包余额入账请求
public class CreateWalletIncomeRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 劳动者信息
    private WalletIncomeUserInfo userInfo;

    // 钱包 ID
    private String walletId;

    // 平台信息
    private WalletIncomePlatformInfo platformInfo;

    // 平台企业订单号
    private String orderId;

    // 下单金额
    private String amount;

    // 获得收入时间
    private String earnedAt;

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

    public void setUserInfo(WalletIncomeUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public WalletIncomeUserInfo getUserInfo() {
        return userInfo;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setPlatformInfo(WalletIncomePlatformInfo platformInfo) {
        this.platformInfo = platformInfo;
    }

    public WalletIncomePlatformInfo getPlatformInfo() {
        return platformInfo;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setEarnedAt(String earnedAt) {
        this.earnedAt = earnedAt;
    }

    public String getEarnedAt() {
        return earnedAt;
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
        return "CreateWalletIncomeRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", platformInfo='" + platformInfo + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount='" + amount + '\'' +
                ", earnedAt='" + earnedAt + '\'' +
                ", remark='" + remark + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
               "}";
    }
}
