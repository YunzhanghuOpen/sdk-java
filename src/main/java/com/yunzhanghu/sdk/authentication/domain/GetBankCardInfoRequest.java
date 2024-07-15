package com.yunzhanghu.sdk.authentication.domain;

// 银行卡信息查询请求
public class GetBankCardInfoRequest {
    
    // 银行卡号
    private String cardNo;
    
    // 银行名称
    private String bankName;

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "GetBankCardInfoRequest{" +
                " cardNo='" + cardNo + '\'' + 
                ", bankName='" + bankName + '\'' + 
               "}";
    }
}