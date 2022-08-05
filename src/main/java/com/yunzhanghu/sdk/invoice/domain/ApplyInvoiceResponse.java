package com.yunzhanghu.sdk.invoice.domain;




// 开票申请返回
public class ApplyInvoiceResponse {
    
    // 发票申请单 ID
    private String applicationId;
    
    // 发票张数
    private long count;
    
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }
    
    public void setCount(long count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "ApplyInvoiceResponse{" +
             " applicationId='" + applicationId + '\'' + 
             ", count='" + count + '\'' + 
              '}';
    }
}