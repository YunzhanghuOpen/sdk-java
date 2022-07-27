package com.yunzhanghu.sdk.authentication.domain;




// 身份证实名验证返回
public class IDCardVerifyRequest {
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
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
        return "IDCardVerifyRequest{" +
                ", idCard='" + idCard + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}