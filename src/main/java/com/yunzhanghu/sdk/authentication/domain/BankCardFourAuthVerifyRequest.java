package com.yunzhanghu.sdk.authentication.domain;

// 银行卡四要素鉴权请求（下发短信验证码）请求
public class BankCardFourAuthVerifyRequest {
    
    // 银行卡号
    private String cardNo;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 银行预留手机号
    private String mobile;

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

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "BankCardFourAuthVerifyRequest{" +
                " cardNo='" + cardNo + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", realName='" + realName + '\'' + 
                ", mobile='" + mobile + '\'' + 
               "}";
    }
}