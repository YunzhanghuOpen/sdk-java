package com.yunzhanghu.sdk.invoice.domain;



// 发票开具申请请求
public class ApplyInvoiceRequest {
    
    // 发票申请编号
    private String invoiceApplyId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 申请开票金额
    private String amount;
    
    // 发票类型
    private String invoiceType;
    
    // 开户行及账号
    private String bankNameAccount;
    
    // 货物或应税劳务、服务名称
    private String goodsServicesName;
    
    // 发票备注
    private String remark;

    public void setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
    }

    public String getInvoiceApplyId() {
        return invoiceApplyId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setBankNameAccount(String bankNameAccount) {
        this.bankNameAccount = bankNameAccount;
    }

    public String getBankNameAccount() {
        return bankNameAccount;
    }

    public void setGoodsServicesName(String goodsServicesName) {
        this.goodsServicesName = goodsServicesName;
    }

    public String getGoodsServicesName() {
        return goodsServicesName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return "ApplyInvoiceRequest{" +
             " invoiceApplyId='" + invoiceApplyId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
             ", dealerId='" + dealerId + '\'' + 
             ", amount='" + amount + '\'' + 
             ", invoiceType='" + invoiceType + '\'' + 
             ", bankNameAccount='" + bankNameAccount + '\'' + 
             ", goodsServicesName='" + goodsServicesName + '\'' + 
             ", remark='" + remark + '\'' + 
           '}';
    }
}