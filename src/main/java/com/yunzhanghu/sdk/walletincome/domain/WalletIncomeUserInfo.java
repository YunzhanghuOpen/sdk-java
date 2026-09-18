package com.yunzhanghu.sdk.walletincome.domain;

// 劳动者信息
public class WalletIncomeUserInfo {

    // 姓名
    private String realName;

    // 证件号
    private String idCard;

    // 证件类型编码
    private String cardType;

    // 手机号
    private String phoneNo;

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

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "WalletIncomeUserInfo{" +
                " realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", cardType='" + cardType + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
               "}";
    }
}
