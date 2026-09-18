package com.yunzhanghu.sdk.walletbalancequery.domain;

// 查询钱包余额请求
public class QueryWalletBalanceRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 劳动者信息
    private WalletBalanceQueryUserInfo userInfo;

    // 钱包 ID
    private String walletId;

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

    public void setUserInfo(WalletBalanceQueryUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public WalletBalanceQueryUserInfo getUserInfo() {
        return userInfo;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }

    @Override
    public String toString() {
        return "QueryWalletBalanceRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
               "}";
    }
}
