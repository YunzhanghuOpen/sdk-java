package com.yunzhanghu.sdk.walletbalancequery.domain;

// 劳动者信息
public class WalletBalanceQueryUserInfo {

    // 姓名
    private String realName;

    // 证件号
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
        return "WalletBalanceQueryUserInfo{" +
                " realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", cardType='" + cardType + '\'' +
               "}";
    }
}
