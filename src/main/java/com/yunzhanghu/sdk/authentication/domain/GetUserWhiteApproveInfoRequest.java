package com.yunzhanghu.sdk.authentication.domain;

// 非居民身份证验证名单审核结果查询请求
public class GetUserWhiteApproveInfoRequest {
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 证件类型编码
    private String cardType;

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
        return "GetUserWhiteApproveInfoRequest{" +
                " realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", cardType='" + cardType + '\'' + 
               "}";
    }
}