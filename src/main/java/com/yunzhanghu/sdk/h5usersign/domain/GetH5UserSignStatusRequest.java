package com.yunzhanghu.sdk.h5usersign.domain;

// 获取用户签约状态请求
public class GetH5UserSignStatusRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;

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

    @Override
    public String toString() {
        return "GetH5UserSignStatusRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
               "}";
    }
}