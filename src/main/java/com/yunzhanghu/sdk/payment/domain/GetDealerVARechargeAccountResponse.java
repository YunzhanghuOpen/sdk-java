package com.yunzhanghu.sdk.payment.domain;




// 查询平台企业汇款信息返回
public class GetDealerVARechargeAccountResponse {
    
    // 账户名称
    private String acctName;
    
    // 专属账户
    private String acctNo;
    
    // 银行名称
    private String bankName;
    
    // 付款账户
    private String dealerAcctName;
    
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctName() {
        return acctName;
    }
    
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctNo() {
        return acctNo;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
    
    public void setDealerAcctName(String dealerAcctName) {
        this.dealerAcctName = dealerAcctName;
    }

    public String getDealerAcctName() {
        return dealerAcctName;
    }
    
    @Override
    public String toString() {
        return "GetDealerVARechargeAccountResponse{" +
             " acctName='" + acctName + '\'' + 
             ", acctNo='" + acctNo + '\'' + 
             ", bankName='" + bankName + '\'' + 
             ", dealerAcctName='" + dealerAcctName + '\'' + 
              '}';
    }
}