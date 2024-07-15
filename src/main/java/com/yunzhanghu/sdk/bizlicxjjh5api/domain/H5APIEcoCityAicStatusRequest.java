package com.yunzhanghu.sdk.bizlicxjjh5api.domain;

// 查询个体工商户状态请求
public class H5APIEcoCityAicStatusRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业端的用户 ID
    private String dealerUserId;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 用户唯一标识
    private String openId;

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

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    @Override
    public String toString() {
        return "H5APIEcoCityAicStatusRequest{" +
             " dealerId='" + dealerId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
             ", dealerUserId='" + dealerUserId + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", realName='" + realName + '\'' + 
             ", openId='" + openId + '\'' + 
           '}';
    }
}