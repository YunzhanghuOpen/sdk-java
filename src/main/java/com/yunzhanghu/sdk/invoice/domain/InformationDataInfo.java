package com.yunzhanghu.sdk.invoice.domain;

// 查询发票信息返回
public class InformationDataInfo {
    
    // 货物或应税劳务、服务名称
    private String goodsServicesName;
    
    // 发票号码
    private String invoiceNum;
    
    // 发票代码
    private String invoiceCode;
    
    // 不含税金额
    private String priceAmount;
    
    // 税额
    private String taxAmount;
    
    // 税率
    private String taxRate;
    
    // 价税合计
    private String priceTaxAmount;
    
    // 开票日期
    private String invoicedDate;

    public void setGoodsServicesName(String goodsServicesName) {
        this.goodsServicesName = goodsServicesName;
    }

    public String getGoodsServicesName() {
        return goodsServicesName;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceCode() {
        return invoiceCode;
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

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setPriceTaxAmount(String priceTaxAmount) {
        this.priceTaxAmount = priceTaxAmount;
    }

    public String getPriceTaxAmount() {
        return priceTaxAmount;
    }

    public void setInvoicedDate(String invoicedDate) {
        this.invoicedDate = invoicedDate;
    }

    public String getInvoicedDate() {
        return invoicedDate;
    }

    @Override
    public String toString() {
        return "InformationDataInfo{" +
             " goodsServicesName='" + goodsServicesName + '\'' + 
             ", invoiceNum='" + invoiceNum + '\'' + 
             ", invoiceCode='" + invoiceCode + '\'' + 
             ", priceAmount='" + priceAmount + '\'' + 
             ", taxAmount='" + taxAmount + '\'' + 
             ", taxRate='" + taxRate + '\'' + 
             ", priceTaxAmount='" + priceTaxAmount + '\'' + 
             ", invoicedDate='" + invoicedDate + '\'' + 
           '}';
    }
}