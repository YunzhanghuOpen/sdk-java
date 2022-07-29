package com.yunzhanghu.sdk.authentication.domain;




// 银行卡三要素验证请求
public class BankCardThreeVerifyRequest {
    
    // 银行卡号
    private String cardNo;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
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


    @Override
    public String toString() {
        return "BankCardThreeVerifyRequest{" +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}