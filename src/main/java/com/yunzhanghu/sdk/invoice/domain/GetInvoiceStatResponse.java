package com.yunzhanghu.sdk.invoice.domain;

// 查询平台企业已开具和待开具发票金额返回
public class GetInvoiceStatResponse {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 已开发票金额
    private String invoiced;
    
    // 开票中发票金额
    private String invoicing;
    
    // 待开发票金额
    private String notInvoiced;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoicing(String invoicing) {
        this.invoicing = invoicing;
    }

    public String getInvoicing() {
        return invoicing;
    }

    public void setNotInvoiced(String notInvoiced) {
        this.notInvoiced = notInvoiced;
    }

    public String getNotInvoiced() {
        return notInvoiced;
    }

    @Override
    public String toString() {
        return "GetInvoiceStatResponse{" +
             " dealerId='" + dealerId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
             ", invoiced='" + invoiced + '\'' + 
             ", invoicing='" + invoicing + '\'' + 
             ", notInvoiced='" + notInvoiced + '\'' + 
           '}';
    }
}