package com.yunzhanghu.sdk.taxclearrefund.domain;

// 退补税劳动者明细
public class LaborRefundInfo {
    
    // 劳动者姓名
    private String realName;
    
    // 劳动者证件号
    private String idCard;
    
    // 本批次退补给劳动者税费总额
    private String refundTax;
    
    // 退补税状态
    private String taxRefundStatus;
    
    // 劳动者收款账户
    private String receivingAccount;
    
    // 劳动者收款账号
    private String receivingChannel;
    
    // 退补税费时间
    private String refundTaxFinishedTime;

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

    public void setRefundTax(String refundTax) {
        this.refundTax = refundTax;
    }

    public String getRefundTax() {
        return refundTax;
    }

    public void setTaxRefundStatus(String taxRefundStatus) {
        this.taxRefundStatus = taxRefundStatus;
    }

    public String getTaxRefundStatus() {
        return taxRefundStatus;
    }

    public void setReceivingAccount(String receivingAccount) {
        this.receivingAccount = receivingAccount;
    }

    public String getReceivingAccount() {
        return receivingAccount;
    }

    public void setReceivingChannel(String receivingChannel) {
        this.receivingChannel = receivingChannel;
    }

    public String getReceivingChannel() {
        return receivingChannel;
    }

    public void setRefundTaxFinishedTime(String refundTaxFinishedTime) {
        this.refundTaxFinishedTime = refundTaxFinishedTime;
    }

    public String getRefundTaxFinishedTime() {
        return refundTaxFinishedTime;
    }

    @Override
    public String toString() {
        return "LaborRefundInfo{" +
                " realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", refundTax='" + refundTax + '\'' + 
                ", taxRefundStatus='" + taxRefundStatus + '\'' + 
                ", receivingAccount='" + receivingAccount + '\'' + 
                ", receivingChannel='" + receivingChannel + '\'' + 
                ", refundTaxFinishedTime='" + refundTaxFinishedTime + '\'' + 
               "}";
    }
}