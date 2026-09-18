package com.yunzhanghu.sdk.walletincome.domain;

// 钱包余额入账结果回调通知请求
public class NotifyWalletIncomeRequest {

    // 通知类型
    private String notifyType;

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

    // 云账户钱包入账订单号
    private String ref;

    // 下单金额
    private String amount;

    // 税前金额
    private String beforeTaxAmount;

    // 备注
    private String remark;

    // 获得收入时间
    private String earnedAt;

    // 订单状态
    private String status;

    // 订单状态详情
    private String statusDetail;

    // 订单状态描述
    private String statusMessage;

    // 订单状态详情描述
    private String statusDetailMessage;

    // 创建时间
    private String createdAt;

    // 完成时间
    private String finishedAt;

    // 服务费信息
    private WalletIncomeFeeInfo feeInfo;

    // 税费信息
    private WalletIncomeTaxInfo taxInfo;

    // 劳动者历史订单需补缴税费金额
    private String userDebtRepaymentAmount;

    // 劳动者历史订单需补缴个税金额
    private String userDebtRepaymentPersonalAmount;

    // 劳动者历史订单需补缴增附税金额
    private String userDebtRepaymentAddedAmount;

    // 钱包入账金额
    private String walletInflowAmount;

    // 钱包余额信息
    private WalletIncomeWalletBalance walletBalance;

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

    public void setBeforeTaxAmount(String beforeTaxAmount) {
        this.beforeTaxAmount = beforeTaxAmount;
    }

    public String getBeforeTaxAmount() {
        return beforeTaxAmount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setEarnedAt(String earnedAt) {
        this.earnedAt = earnedAt;
    }

    public String getEarnedAt() {
        return earnedAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusDetailMessage(String statusDetailMessage) {
        this.statusDetailMessage = statusDetailMessage;
    }

    public String getStatusDetailMessage() {
        return statusDetailMessage;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFeeInfo(WalletIncomeFeeInfo feeInfo) {
        this.feeInfo = feeInfo;
    }

    public WalletIncomeFeeInfo getFeeInfo() {
        return feeInfo;
    }

    public void setTaxInfo(WalletIncomeTaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    public WalletIncomeTaxInfo getTaxInfo() {
        return taxInfo;
    }

    public void setUserDebtRepaymentAmount(String userDebtRepaymentAmount) {
        this.userDebtRepaymentAmount = userDebtRepaymentAmount;
    }

    public String getUserDebtRepaymentAmount() {
        return userDebtRepaymentAmount;
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

    public void setWalletInflowAmount(String walletInflowAmount) {
        this.walletInflowAmount = walletInflowAmount;
    }

    public String getWalletInflowAmount() {
        return walletInflowAmount;
    }

    public void setWalletBalance(WalletIncomeWalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public WalletIncomeWalletBalance getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "NotifyWalletIncomeRequest{" +
                " notifyType='" + notifyType + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", platformInfo='" + platformInfo + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
                ", beforeTaxAmount='" + beforeTaxAmount + '\'' +
                ", remark='" + remark + '\'' +
                ", earnedAt='" + earnedAt + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", finishedAt='" + finishedAt + '\'' +
                ", feeInfo='" + feeInfo + '\'' +
                ", taxInfo='" + taxInfo + '\'' +
                ", userDebtRepaymentAmount='" + userDebtRepaymentAmount + '\'' +
                ", userDebtRepaymentPersonalAmount='" + userDebtRepaymentPersonalAmount + '\'' +
                ", userDebtRepaymentAddedAmount='" + userDebtRepaymentAddedAmount + '\'' +
                ", walletInflowAmount='" + walletInflowAmount + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
               "}";
    }
}
