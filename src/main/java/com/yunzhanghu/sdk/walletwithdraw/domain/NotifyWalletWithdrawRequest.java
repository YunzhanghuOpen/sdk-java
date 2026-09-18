package com.yunzhanghu.sdk.walletwithdraw.domain;

// 通知钱包余额提现结果回调通知请求
public class NotifyWalletWithdrawRequest {

    // 通知类型
    private String notifyType;

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

    // 云账户钱包提现订单号
    private String ref;

    // 提现金额支付金额
    private String amount;

    // 提现渠道
    private String channel;

    // 收款账号
    private String account;

    // 平台企业的微信 AppID
    private String wxAppId;

    // 备注
    private String remark;

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

    // 劳动者实收金额
    private String userReceivedAmount;

    // 劳动者历史订单需补缴税费金额
    private String userDebtRepaymentAmount;

    // 劳动者历史订单需补缴个税金额
    private String userDebtRepaymentPersonalAmount;

    // 劳动者历史订单需补缴增附税金额
    private String userDebtRepaymentAddedAmount;

    // 钱包出账金额
    private String walletOutflowAmount;

    // 钱包余额信息
    private WalletWithdrawWalletBalance walletBalance;

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

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
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

    public void setUserReceivedAmount(String userReceivedAmount) {
        this.userReceivedAmount = userReceivedAmount;
    }

    public String getUserReceivedAmount() {
        return userReceivedAmount;
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

    public void setWalletOutflowAmount(String walletOutflowAmount) {
        this.walletOutflowAmount = walletOutflowAmount;
    }

    public String getWalletOutflowAmount() {
        return walletOutflowAmount;
    }

    public void setWalletBalance(WalletWithdrawWalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public WalletWithdrawWalletBalance getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "NotifyWalletWithdrawRequest{" +
                " notifyType='" + notifyType + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
                ", channel='" + channel + '\'' +
                ", account='" + account + '\'' +
                ", wxAppId='" + wxAppId + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", finishedAt='" + finishedAt + '\'' +
                ", userReceivedAmount='" + userReceivedAmount + '\'' +
                ", userDebtRepaymentAmount='" + userDebtRepaymentAmount + '\'' +
                ", userDebtRepaymentPersonalAmount='" + userDebtRepaymentPersonalAmount + '\'' +
                ", userDebtRepaymentAddedAmount='" + userDebtRepaymentAddedAmount + '\'' +
                ", walletOutflowAmount='" + walletOutflowAmount + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
               "}";
    }
}
