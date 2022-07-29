package com.yunzhanghu.sdk.payment.domain;




// 账户信息
public class AccountInfo {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 银行卡余额
    private String bankCardBalance;
    
    // 是否开通银行卡支付路径
    private boolean isBankCard;
    
    // 支付宝余额
    private String alipayBalance;
    
    // 是否开通支付宝支付路径
    private boolean isAlipay;
    
    // 微信余额
    private String wxpayBalance;
    
    // 是否开通微信支付路径
    private boolean isWxpay;
    
    // 加成服务费返点余额
    private String rebateFeeBalance;
    
    // 业务服务费余额
    private String acctBalance;
    
    // 总余额
    private String totalBalance;
    
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }
    
    public void setBankCardBalance(String bankCardBalance) {
        this.bankCardBalance = bankCardBalance;
    }

    public String getBankCardBalance() {
        return bankCardBalance;
    }
    
    public void setIsBankCard(boolean isBankCard) {
        this.isBankCard = isBankCard;
    }

    public boolean getIsBankCard() {
        return isBankCard;
    }
    
    public void setAlipayBalance(String alipayBalance) {
        this.alipayBalance = alipayBalance;
    }

    public String getAlipayBalance() {
        return alipayBalance;
    }
    
    public void setIsAlipay(boolean isAlipay) {
        this.isAlipay = isAlipay;
    }

    public boolean getIsAlipay() {
        return isAlipay;
    }
    
    public void setWxpayBalance(String wxpayBalance) {
        this.wxpayBalance = wxpayBalance;
    }

    public String getWxpayBalance() {
        return wxpayBalance;
    }
    
    public void setIsWxpay(boolean isWxpay) {
        this.isWxpay = isWxpay;
    }

    public boolean getIsWxpay() {
        return isWxpay;
    }
    
    public void setRebateFeeBalance(String rebateFeeBalance) {
        this.rebateFeeBalance = rebateFeeBalance;
    }

    public String getRebateFeeBalance() {
        return rebateFeeBalance;
    }
    
    public void setAcctBalance(String acctBalance) {
        this.acctBalance = acctBalance;
    }

    public String getAcctBalance() {
        return acctBalance;
    }
    
    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getTotalBalance() {
        return totalBalance;
    }
    
    @Override
    public String toString() {
        return "AccountInfo{" +
             " brokerId='" + brokerId + '\'' + 
             ", bankCardBalance='" + bankCardBalance + '\'' + 
             ", isBankCard='" + isBankCard + '\'' + 
             ", alipayBalance='" + alipayBalance + '\'' + 
             ", isAlipay='" + isAlipay + '\'' + 
             ", wxpayBalance='" + wxpayBalance + '\'' + 
             ", isWxpay='" + isWxpay + '\'' + 
             ", rebateFeeBalance='" + rebateFeeBalance + '\'' + 
             ", acctBalance='" + acctBalance + '\'' + 
             ", totalBalance='" + totalBalance + '\'' + 
              '}';
    }
}