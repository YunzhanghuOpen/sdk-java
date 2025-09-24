package com.yunzhanghu.sdk.payment.domain;

// 订单支付状态回调通知数据
public class NotifyOrderData {

    // 平台企业订单号
    private String orderId;

    // 订单金额
    private String pay;

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 姓名
    private String realName;

    // 收款人账号
    private String cardNo;

    // 身份证号码
    private String idCard;

    // 手机号
    private String phoneNo;

    // 订单状态码
    private String status;

    // 订单详细状态码
    private String statusDetail;

    // 订单状态码描述
    private String statusMessage;

    // 订单详细状态码描述
    private String statusDetailMessage;

    // 订单状态补充信息
    private String supplementalDetailMessage;

    // 综合服务主体支付金额
    private String brokerAmount;

    // 综合服务平台流水号
    private String ref;

    // 支付交易流水号
    private String brokerBankBill;

    // 支付路径
    private String withdrawPlatform;

    // 订单接收时间，精确到秒
    private String createdAt;

    // 订单完成时间，精确到秒
    private String finishedTime;

    // 应收综合服务主体加成服务费金额
    private String brokerFee;

    // 应收余额账户支出加成服务费金额
    private String brokerRealFee;

    // 应收加成服务费抵扣金额
    private String brokerDeductFee;

    // 应收用户加成服务费金额
    private String userFee;

    // 实收综合服务主体加成服务费金额
    private String receivedBrokerFee;

    // 实收余额账户支出加成服务费金额
    private String receivedBrokerRealFee;

    // 实收加成服务费抵扣金额
    private String receivedBrokerDeductFee;

    // 实收用户加成服务费金额
    private String receivedUserFee;

    // 订单备注
    private String payRemark;

    // 银行名称
    private String bankName;

    // 项目标识
    private String projectId;

    // 平台企业用户 ID
    private String userId;

    // 用户实收金额
    private String userRealAmount;

    // 缴税明细
    private TaxDetail taxDetail;

    // 互联网平台名称
    private String dealerPlatformName;

    // 用户名称/昵称
    private String dealerUserNickname;

    // 用户唯一标识码
    private String dealerUserId;

    // 预扣税费总额
    private String tax;

    // 实缴税费总额
    private String receivedTaxAmount;

    // 用户实收金额（追缴前）
    private String userRealExcludingVatAmount;

    // 已追缴增附税（本笔订单）
    private String userRecoverTaxAmount;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
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

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
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

    public void setSupplementalDetailMessage(String supplementalDetailMessage) {
        this.supplementalDetailMessage = supplementalDetailMessage;
    }

    public String getSupplementalDetailMessage() {
        return supplementalDetailMessage;
    }

    public void setBrokerAmount(String brokerAmount) {
        this.brokerAmount = brokerAmount;
    }

    public String getBrokerAmount() {
        return brokerAmount;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setBrokerBankBill(String brokerBankBill) {
        this.brokerBankBill = brokerBankBill;
    }

    public String getBrokerBankBill() {
        return brokerBankBill;
    }

    public void setWithdrawPlatform(String withdrawPlatform) {
        this.withdrawPlatform = withdrawPlatform;
    }

    public String getWithdrawPlatform() {
        return withdrawPlatform;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setBrokerFee(String brokerFee) {
        this.brokerFee = brokerFee;
    }

    public String getBrokerFee() {
        return brokerFee;
    }

    public void setBrokerRealFee(String brokerRealFee) {
        this.brokerRealFee = brokerRealFee;
    }

    public String getBrokerRealFee() {
        return brokerRealFee;
    }

    public void setBrokerDeductFee(String brokerDeductFee) {
        this.brokerDeductFee = brokerDeductFee;
    }

    public String getBrokerDeductFee() {
        return brokerDeductFee;
    }

    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    public String getUserFee() {
        return userFee;
    }

    public void setReceivedBrokerFee(String receivedBrokerFee) {
        this.receivedBrokerFee = receivedBrokerFee;
    }

    public String getReceivedBrokerFee() {
        return receivedBrokerFee;
    }

    public void setReceivedBrokerRealFee(String receivedBrokerRealFee) {
        this.receivedBrokerRealFee = receivedBrokerRealFee;
    }

    public String getReceivedBrokerRealFee() {
        return receivedBrokerRealFee;
    }

    public void setReceivedBrokerDeductFee(String receivedBrokerDeductFee) {
        this.receivedBrokerDeductFee = receivedBrokerDeductFee;
    }

    public String getReceivedBrokerDeductFee() {
        return receivedBrokerDeductFee;
    }

    public void setReceivedUserFee(String receivedUserFee) {
        this.receivedUserFee = receivedUserFee;
    }

    public String getReceivedUserFee() {
        return receivedUserFee;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserRealAmount(String userRealAmount) {
        this.userRealAmount = userRealAmount;
    }

    public String getUserRealAmount() {
        return userRealAmount;
    }

    public void setTaxDetail(TaxDetail taxDetail) {
        this.taxDetail = taxDetail;
    }

    public TaxDetail getTaxDetail() {
        return taxDetail;
    }

    public void setDealerPlatformName(String dealerPlatformName) {
        this.dealerPlatformName = dealerPlatformName;
    }

    public String getDealerPlatformName() {
        return dealerPlatformName;
    }

    public void setDealerUserNickname(String dealerUserNickname) {
        this.dealerUserNickname = dealerUserNickname;
    }

    public String getDealerUserNickname() {
        return dealerUserNickname;
    }

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTax() {
        return tax;
    }

    public void setReceivedTaxAmount(String receivedTaxAmount) {
        this.receivedTaxAmount = receivedTaxAmount;
    }

    public String getReceivedTaxAmount() {
        return receivedTaxAmount;
    }

    public void setUserRealExcludingVatAmount(String userRealExcludingVatAmount) {
        this.userRealExcludingVatAmount = userRealExcludingVatAmount;
    }

    public String getUserRealExcludingVatAmount() {
        return userRealExcludingVatAmount;
    }

    public void setUserRecoverTaxAmount(String userRecoverTaxAmount) {
        this.userRecoverTaxAmount = userRecoverTaxAmount;
    }

    public String getUserRecoverTaxAmount() {
        return userRecoverTaxAmount;
    }

    @Override
    public String toString() {
        return "NotifyOrderData{" +
                " orderId='" + orderId + '\'' +
                ", pay='" + pay + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", realName='" + realName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", supplementalDetailMessage='" + supplementalDetailMessage + '\'' +
                ", brokerAmount='" + brokerAmount + '\'' +
                ", ref='" + ref + '\'' +
                ", brokerBankBill='" + brokerBankBill + '\'' +
                ", withdrawPlatform='" + withdrawPlatform + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", finishedTime='" + finishedTime + '\'' +
                ", brokerFee='" + brokerFee + '\'' +
                ", brokerRealFee='" + brokerRealFee + '\'' +
                ", brokerDeductFee='" + brokerDeductFee + '\'' +
                ", userFee='" + userFee + '\'' +
                ", receivedBrokerFee='" + receivedBrokerFee + '\'' +
                ", receivedBrokerRealFee='" + receivedBrokerRealFee + '\'' +
                ", receivedBrokerDeductFee='" + receivedBrokerDeductFee + '\'' +
                ", receivedUserFee='" + receivedUserFee + '\'' +
                ", payRemark='" + payRemark + '\'' +
                ", bankName='" + bankName + '\'' +
                ", projectId='" + projectId + '\'' +
                ", userId='" + userId + '\'' +
                ", userRealAmount='" + userRealAmount + '\'' +
                ", taxDetail='" + taxDetail + '\'' +
                ", dealerPlatformName='" + dealerPlatformName + '\'' +
                ", dealerUserNickname='" + dealerUserNickname + '\'' +
                ", dealerUserId='" + dealerUserId + '\'' +
                ", tax='" + tax + '\'' +
                ", receivedTaxAmount='" + receivedTaxAmount + '\'' +
                ", userRealExcludingVatAmount='" + userRealExcludingVatAmount + '\'' +
                ", userRecoverTaxAmount='" + userRecoverTaxAmount + '\'' +
                "}";
    }
}