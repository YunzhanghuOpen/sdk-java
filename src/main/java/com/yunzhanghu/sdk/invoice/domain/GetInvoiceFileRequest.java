package com.yunzhanghu.sdk.invoice.domain;




// 下载发票 PDF 请求
public class GetInvoiceFileRequest {
    
    // 发票申请编号
    private String invoiceApplyId;
    
    // 发票申请单 ID
    private String applicationId;
    public void setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
    }

    public String getInvoiceApplyId() {
        return invoiceApplyId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }


    @Override
    public String toString() {
        return "GetInvoiceFileRequest{" +
                ", invoiceApplyId='" + invoiceApplyId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                '}';
    }
}