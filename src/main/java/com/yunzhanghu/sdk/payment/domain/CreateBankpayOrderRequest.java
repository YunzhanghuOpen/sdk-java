package com.yunzhanghu.sdk.payment.domain;

// 银行卡实时支付请求
public class CreateBankpayOrderRequest {

    // 平台企业订单号
    private String orderId;

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

    // 姓名
    private String realName;

    // 银行卡号
    private String cardNo;

    // 身份证号码
    private String idCard;

    // 手机号
    private String phoneNo;

    // 订单金额
    private String pay;

    // 订单备注
    private String payRemark;

    // 回调地址
    private String notifyUrl;

    // 业务线标识
    private String projectId;

    // 互联网平台名称
    private String dealerPlatformName;

    // 用户名称/昵称
    private String dealerUserNickname;

    // 用户唯一标识码
    private String dealerUserId;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
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

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
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

    @Override
    public String toString() {
        return "CreateBankpayOrderRequest{" +
                " orderId='" + orderId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", pay='" + pay + '\'' +
                ", payRemark='" + payRemark + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", projectId='" + projectId + '\'' +
                ", dealerPlatformName='" + dealerPlatformName + '\'' +
                ", dealerUserNickname='" + dealerUserNickname + '\'' +
                ", dealerUserId='" + dealerUserId + '\'' +
                "}";
    }
}