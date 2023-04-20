package com.yunzhanghu.sdk.payment.domain;

/**
 * @author Cloud
 * @date 2023-04-20-13:50
 */
public class GetBankInfoRequest {

    private String cardNo;

    private String bankName;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
