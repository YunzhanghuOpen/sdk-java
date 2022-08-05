package com.yunzhanghu.sdk.apiusersign.domain;




// 用户解约请求
public class ApiUserSignReleaseRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 证件类型 idcard：身份证 mtphkm：港澳居民来往内地通行证 passport：护照 mtpt：台湾居民往来大陆通行证
    private String cardType;
    
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }
    
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
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
    
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
    
    @Override
    public String toString() {
        return "ApiUserSignReleaseRequest{" +
             " brokerId='" + brokerId + '\'' + 
             ", dealerId='" + dealerId + '\'' + 
             ", realName='" + realName + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", cardType='" + cardType + '\'' + 
              '}';
    }
}