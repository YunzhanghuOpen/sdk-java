package com.yunzhanghu.sdk.walletwithdraw.domain;

// 发起钱包余额提现请求
public class CreateWalletWithdrawRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 劳动者信息
    private WalletWithdrawUserInfo userInfo;

    // 钱包 ID
    private String walletId;

    // 平台企业订单号
    private String orderId;

    // 平台企业的微信 AppID
    private String wxAppId;

    // 提现金额
    private String amount;

    // 提现渠道
    private String channel;

    // 收款账号
    private String account;

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

    public void setUserInfo(WalletWithdrawUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public WalletWithdrawUserInfo getUserInfo() {
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

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
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
        return "CreateWalletWithdrawRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", wxAppId='" + wxAppId + '\'' +
                ", amount='" + amount + '\'' +
                ", channel='" + channel + '\'' +
                ", account='" + account + '\'' +
                ", remark='" + remark + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
               "}";
    }
}
