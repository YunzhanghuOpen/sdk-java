package com.yunzhanghu.sdk.authentication.domain;




// 银行卡信息查询返回
public class GetBankCardInfoResponse {
    
    // 银行代码
    private String bankCode;
    
    // 银行名称
    private String bankName;
    
    // 卡类型
    private String cardType;
    
    // 云账户是否支持向该银行支付
    private boolean isSupport;
    
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
    
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
    
    public void setIsSupport(boolean isSupport) {
        this.isSupport = isSupport;
    }

    public boolean getIsSupport() {
        return isSupport;
    }
    
    @Override
    public String toString() {
        return "GetBankCardInfoResponse{" +
             " bankCode='" + bankCode + '\'' + 
             ", bankName='" + bankName + '\'' + 
             ", cardType='" + cardType + '\'' + 
             ", isSupport='" + isSupport + '\'' + 
              '}';
    }
}