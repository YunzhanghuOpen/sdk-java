package com.yunzhanghu.sdk.invoice.domain;




// 查询平台企业已开具和待开具发票金额请求
public class GetInvoiceStatRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 商户 ID
    private String dealerId;
    
    // 查询年份
    private int year;
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
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "GetInvoiceStatRequest{" +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}