package com.yunzhanghu.sdk.uploadusersign.domain;




// 用户签约信息上传请求
public class UploadUserSignRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 手机号
    private String phone;
    
    // 是否是海外用户
    private boolean isAbroad;
    
    // 签约回调地址
    private String notifyUrl;

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

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setIsAbroad(boolean isAbroad) {
        this.isAbroad = isAbroad;
    }

    public boolean getIsAbroad() {
        return isAbroad;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    @Override
    public String toString() {
        return "UploadUserSignRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", isAbroad='" + isAbroad + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                '}';
    }
}