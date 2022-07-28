package com.yunzhanghu.sdk.payment.domain;




// 支付宝实时下单请求
public class CreateAlipayOrderRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 支付宝账户
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
    
    // 项目标识
    private String projectId;
    
    // 校验支付宝账户姓名，固定值：Check
    private String checkName;
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
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckName() {
        return checkName;
    }


    @Override
    public String toString() {
        return "CreateAlipayOrderRequest{" +
                ", orderId='" + orderId + '\'' +
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
                ", checkName='" + checkName + '\'' +
                '}';
    }
}