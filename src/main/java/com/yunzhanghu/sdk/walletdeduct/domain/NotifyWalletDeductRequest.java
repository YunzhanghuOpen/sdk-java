package com.yunzhanghu.sdk.walletdeduct.domain;

// 钱包余额扣减申请结果回调通知请求
public class NotifyWalletDeductRequest {

    // 通知类型
    private String notifyType;

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

    // 云账户钱包余额扣减订单号
    private String ref;

    // 扣减金额
    private String amount;

    // 备注
    private String remark;

    // 申请处理状态
    private String status;

    // 申请处理状态详情
    private String statusDetail;

    // 申请处理状态描述
    private String statusMessage;

    // 申请处理状态详情描述
    private String statusDetailMessage;

    // 创建时间
    private String createdAt;

    // 处理完成时间
    private String finishedAt;

    // 劳动者实收金额
    private String userReceivedAmount;

    // 劳动者历史订单需补缴税费金额
    private String userDebtRepaymentAmount;

    // 钱包出账金额
    private String walletOutflowAmount;

    // 钱包余额信息
    private WalletDeductWalletBalance walletBalance;

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

    public void setWalletOutflowAmount(String walletOutflowAmount) {
        this.walletOutflowAmount = walletOutflowAmount;
    }

    public String getWalletOutflowAmount() {
        return walletOutflowAmount;
    }

    public void setWalletBalance(WalletDeductWalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public WalletDeductWalletBalance getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "NotifyWalletDeductRequest{" +
                " notifyType='" + notifyType + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", walletId='" + walletId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", scene='" + scene + '\'' +
                ", ref='" + ref + '\'' +
                ", amount='" + amount + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", finishedAt='" + finishedAt + '\'' +
                ", userReceivedAmount='" + userReceivedAmount + '\'' +
                ", userDebtRepaymentAmount='" + userDebtRepaymentAmount + '\'' +
                ", walletOutflowAmount='" + walletOutflowAmount + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
               "}";
    }
}
