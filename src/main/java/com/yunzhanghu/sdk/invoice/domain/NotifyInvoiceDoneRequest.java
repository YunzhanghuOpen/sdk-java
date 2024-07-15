package com.yunzhanghu.sdk.invoice.domain;

// 发票开具完成通知
public class NotifyInvoiceDoneRequest {
    
    // 发票申请单 ID
    private String applicationId;
    
    // 发票申请编号
    private String invoiceApplyId;
    
    // 申请结果
    private String status;
    
    // 发票张数
    private int count;
    
    // 价税合计
    private String priceTaxAmount;
    
    // 不含税金额
    private String priceAmount;
    
    // 税额
    private String taxAmount;
    
    // 发票类型
    private String invoiceType;
    
    // 购方名称
    private String customerName;
    
    // 纳税人识别号
    private String customerTaxNum;
    
    // 购方地址、电话
    private String customerAddressTel;
    
    // 开户行及账号
    private String bankNameAccount;
    
    // 货物或应税劳务、服务名称
    private String goodsServicesName;
    
    // 发票备注
    private String remark;
    
    // 邮寄类型
    private String postType;
    
    // 快递单号
    private String[] waybillNumber;
    
    // 驳回原因
    private String rejectReason;

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
    }

    public String getInvoiceApplyId() {
        return invoiceApplyId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setPriceTaxAmount(String priceTaxAmount) {
        this.priceTaxAmount = priceTaxAmount;
    }

    public String getPriceTaxAmount() {
        return priceTaxAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerTaxNum(String customerTaxNum) {
        this.customerTaxNum = customerTaxNum;
    }

    public String getCustomerTaxNum() {
        return customerTaxNum;
    }

    public void setCustomerAddressTel(String customerAddressTel) {
        this.customerAddressTel = customerAddressTel;
    }

    public String getCustomerAddressTel() {
        return customerAddressTel;
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

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostType() {
        return postType;
    }

    public void setWaybillNumber(String[] waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String[] getWaybillNumber() {
        return waybillNumber;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    @Override
    public String toString() {
        return "NotifyInvoiceDoneRequest{" +
             " applicationId='" + applicationId + '\'' + 
             ", invoiceApplyId='" + invoiceApplyId + '\'' + 
             ", status='" + status + '\'' + 
             ", count='" + count + '\'' + 
             ", priceTaxAmount='" + priceTaxAmount + '\'' + 
             ", priceAmount='" + priceAmount + '\'' + 
             ", taxAmount='" + taxAmount + '\'' + 
             ", invoiceType='" + invoiceType + '\'' + 
             ", customerName='" + customerName + '\'' + 
             ", customerTaxNum='" + customerTaxNum + '\'' + 
             ", customerAddressTel='" + customerAddressTel + '\'' + 
             ", bankNameAccount='" + bankNameAccount + '\'' + 
             ", goodsServicesName='" + goodsServicesName + '\'' + 
             ", remark='" + remark + '\'' + 
             ", postType='" + postType + '\'' + 
             ", waybillNumber='" + waybillNumber + '\'' + 
             ", rejectReason='" + rejectReason + '\'' + 
           '}';
    }
}