package com.yunzhanghu.sdk.payment.domain;

/**
 * @author Cloud
 * @date 2023-04-20-13:49
 */
public class BankInfoResponse {

    private String bankCode;

    private String bankName;

    private  String cardType;

    private String isSupport;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(String isSupport) {
        this.isSupport = isSupport;
    }
}
