package com.yunzhanghu.sdk.walletbalancechange.domain;

import com.yunzhanghu.sdk.walletbalancequery.domain.WalletBalanceQueryUserInfo;
import com.yunzhanghu.sdk.walletbalancequery.domain.WalletBalanceQueryWalletBalance;

// 钱包余额变更结果回调通知请求
public class NotifyWalletBalanceChangeRequest {

    // 通知类型
    private String notifyType;

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 劳动者信息
    private WalletBalanceQueryUserInfo userInfo;

    // 钱包 ID
    private String walletId;

    // 余额变化批次 ID
    private String changeId;

    // 钱包余额变更金额
    private String changeAmount;

    // 需补缴个税
    private String userDebtRepaymentPersonalAmount;

    // 需补缴增附税
    private String userDebtRepaymentAddedAmount;

    // 余额变化时间
    private String changedAt;

    // 钱包余额信息
    private WalletBalanceQueryWalletBalance walletBalance;

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyType() {
        return notifyType;
    }

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

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public String getChangeAmount() {
        return changeAmount;
    }

    public void setUserDebtRepaymentPersonalAmount(String userDebtRepaymentPersonalAmount) {
        this.userDebtRepaymentPersonalAmount = userDebtRepaymentPersonalAmount;
    }

    public String getUserDebtRepaymentPersonalAmount() {
        return userDebtRepaymentPersonalAmount;
    }

    public void setUserDebtRepaymentAddedAmount(String userDebtRepaymentAddedAmount) {
        this.userDebtRepaymentAddedAmount = userDebtRepaymentAddedAmount;
    }

    public String getUserDebtRepaymentAddedAmount() {
        return userDebtRepaymentAddedAmount;
    }

    public void setChangedAt(String changedAt) {
        this.changedAt = changedAt;
    }

    public String getChangedAt() {
        return changedAt;
    }

    public void setWalletBalance(WalletBalanceQueryWalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public WalletBalanceQueryWalletBalance getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "NotifyWalletBalanceChangeRequest{" +
                " notifyType='" + notifyType + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", changeId='" + changeId + '\'' +
                ", changeAmount='" + changeAmount + '\'' +
                ", userDebtRepaymentPersonalAmount='" + userDebtRepaymentPersonalAmount + '\'' +
                ", userDebtRepaymentAddedAmount='" + userDebtRepaymentAddedAmount + '\'' +
                ", changedAt='" + changedAt + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
               "}";
    }
}
