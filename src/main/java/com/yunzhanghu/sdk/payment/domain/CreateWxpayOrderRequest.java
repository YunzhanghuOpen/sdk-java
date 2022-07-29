package com.yunzhanghu.sdk.payment.domain;




// 微信实时下单请求
public class CreateWxpayOrderRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 微信用户 openid
    private String openid;
    
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
    
    // 平台企业微信 AppID
    private String wxAppId;
    
    // 微信支付模式，固定值：transfer
    private String wxpayMode;
    
    // 项目标识
    private String projectId;
    
    // 描述信息，该字段已废弃
    private String notes;
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
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOpenid() {
        return openid;
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
    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public String getWxAppId() {
        return wxAppId;
    }
    public void setWxpayMode(String wxpayMode) {
        this.wxpayMode = wxpayMode;
    }

    public String getWxpayMode() {
        return wxpayMode;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }


    @Override
    public String toString() {
        return "CreateWxpayOrderRequest{" +
                ", orderId='" + orderId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", openid='" + openid + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", pay='" + pay + '\'' +
                ", payRemark='" + payRemark + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", wxAppId='" + wxAppId + '\'' +
                ", wxpayMode='" + wxpayMode + '\'' +
                ", projectId='" + projectId + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}