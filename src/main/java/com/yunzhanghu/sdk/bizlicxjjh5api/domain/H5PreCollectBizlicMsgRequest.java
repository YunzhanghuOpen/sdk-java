package com.yunzhanghu.sdk.bizlicxjjh5api.domain;



// 工商实名信息录入请求
public class H5PreCollectBizlicMsgRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业端的用户 ID
    private String dealerUserId;
    
    // 手机号
    private String phoneNo;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 身份证住址
    private String idCardAddress;
    
    // 身份证签发机关
    private String idCardAgency;
    
    // 身份证民族
    private String idCardNation;
    
    // 身份证有效期开始时间
    private String idCardValidityStart;
    
    // 身份证有效期结束时间
    private String idCardValidityEnd;

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

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setIdCardAddress(String idCardAddress) {
        this.idCardAddress = idCardAddress;
    }

    public String getIdCardAddress() {
        return idCardAddress;
    }

    public void setIdCardAgency(String idCardAgency) {
        this.idCardAgency = idCardAgency;
    }

    public String getIdCardAgency() {
        return idCardAgency;
    }

    public void setIdCardNation(String idCardNation) {
        this.idCardNation = idCardNation;
    }

    public String getIdCardNation() {
        return idCardNation;
    }

    public void setIdCardValidityStart(String idCardValidityStart) {
        this.idCardValidityStart = idCardValidityStart;
    }

    public String getIdCardValidityStart() {
        return idCardValidityStart;
    }

    public void setIdCardValidityEnd(String idCardValidityEnd) {
        this.idCardValidityEnd = idCardValidityEnd;
    }

    public String getIdCardValidityEnd() {
        return idCardValidityEnd;
    }

    @Override
    public String toString() {
        return "H5PreCollectBizlicMsgRequest{" +
             " dealerId='" + dealerId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
             ", dealerUserId='" + dealerUserId + '\'' + 
             ", phoneNo='" + phoneNo + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", realName='" + realName + '\'' + 
             ", idCardAddress='" + idCardAddress + '\'' + 
             ", idCardAgency='" + idCardAgency + '\'' + 
             ", idCardNation='" + idCardNation + '\'' + 
             ", idCardValidityStart='" + idCardValidityStart + '\'' + 
             ", idCardValidityEnd='" + idCardValidityEnd + '\'' + 
           '}';
    }
}