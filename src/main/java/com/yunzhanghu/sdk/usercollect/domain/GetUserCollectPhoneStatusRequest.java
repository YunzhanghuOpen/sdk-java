package com.yunzhanghu.sdk.usercollect.domain;

// 查询手机号码绑定状态请求
public class GetUserCollectPhoneStatusRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业用户 ID
    private String dealerUserId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 证件类型编码
    private int certificateType;

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

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
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

    public void setCertificateType(int certificateType) {
        this.certificateType = certificateType;
    }

    public int getCertificateType() {
        return certificateType;
    }

    @Override
    public String toString() {
        return "GetUserCollectPhoneStatusRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", dealerUserId='" + dealerUserId + '\'' + 
                ", realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", certificateType='" + certificateType + '\'' + 
               "}";
    }
}