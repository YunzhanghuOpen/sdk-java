package com.yunzhanghu.sdk.authentication.domain;




// 银行卡四要素确认鉴权请求
public class BankCardFourAuthConfirmRequest {
    
    // 银行卡号
    private String cardNo;
    
    // 身份证号
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 银行预留手机号
    private String mobile;
    
    // 短信验证码
    private String captcha;
    
    // 交易凭证
    private String ref;
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
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }


    @Override
    public String toString() {
        return "BankCardFourAuthConfirmRequest{" +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", realName='" + realName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", captcha='" + captcha + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}