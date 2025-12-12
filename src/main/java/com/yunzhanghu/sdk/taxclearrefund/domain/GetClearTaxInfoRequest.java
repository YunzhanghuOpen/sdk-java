package com.yunzhanghu.sdk.taxclearrefund.domain;

// 查询税费清缴完成结果请求
public class GetClearTaxInfoRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 报税属期
    private String taxMonth;

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

    public void setTaxMonth(String taxMonth) {
        this.taxMonth = taxMonth;
    }

    public String getTaxMonth() {
        return taxMonth;
    }

    @Override
    public String toString() {
        return "GetClearTaxInfoRequest{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", taxMonth='" + taxMonth + '\'' + 
               "}";
    }
}