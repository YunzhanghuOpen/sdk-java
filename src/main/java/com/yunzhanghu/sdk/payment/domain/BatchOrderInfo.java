package com.yunzhanghu.sdk.payment.domain;

// 批次下单订单信息
public class BatchOrderInfo {
    
    // 平台企业订单号
    private String orderId;
    
    // 姓名
    private String realName;
    
    // 身份证号码
    private String idCard;
    
    // 收款账号
    private String cardNo;
    
    // 微信用户 openid
    private String openid;
    
    // 手机号
    private String phoneNo;
    
    // 项目标识
    private String projectId;
    
    // 订单金额
    private String pay;
    
    // 订单备注
    private String payRemark;
    
    // 回调地址
    private String notifyUrl;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
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

    @Override
    public String toString() {
        return "BatchOrderInfo{" +
             " orderId='" + orderId + '\'' + 
             ", realName='" + realName + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", cardNo='" + cardNo + '\'' + 
             ", openid='" + openid + '\'' + 
             ", phoneNo='" + phoneNo + '\'' + 
             ", projectId='" + projectId + '\'' + 
             ", pay='" + pay + '\'' + 
             ", payRemark='" + payRemark + '\'' + 
             ", notifyUrl='" + notifyUrl + '\'' + 
           '}';
    }
}