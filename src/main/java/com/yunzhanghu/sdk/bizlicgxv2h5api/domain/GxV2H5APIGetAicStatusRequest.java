package com.yunzhanghu.sdk.bizlicgxv2h5api.domain;




// 查询个体工商户状态请求
public class GxV2H5APIGetAicStatusRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 用户唯一标识
    private String openId;
    
    // 姓名
    private String realName;
    
    // 身份证号码
    private String idCard;
    
    // 平台企业端的用户 ID
    private String dealerUserId;

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

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
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

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    @Override
    public String toString() {
        return "GxV2H5APIGetAicStatusRequest{" +
                       " dealerId='" + dealerId + '\'' + 
                       ", brokerId='" + brokerId + '\'' + 
                       ", openId='" + openId + '\'' + 
                       ", realName='" + realName + '\'' + 
                       ", idCard='" + idCard + '\'' + 
                       ", dealerUserId='" + dealerUserId + '\'' + 
                     '}';
    }
}