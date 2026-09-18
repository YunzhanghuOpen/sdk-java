package com.yunzhanghu.sdk.walletincome.domain;

// 平台信息
public class WalletIncomePlatformInfo {

    // 互联网平台名称
    private String platformName;

    // 劳动者 ID
    private String userId;

    // 劳动者名称或昵称
    private String userNickname;

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserNickname() {
        return userNickname;
    }

    @Override
    public String toString() {
        return "WalletIncomePlatformInfo{" +
                " platformName='" + platformName + '\'' +
                ", userId='" + userId + '\'' +
                ", userNickname='" + userNickname + '\'' +
               "}";
    }
}
