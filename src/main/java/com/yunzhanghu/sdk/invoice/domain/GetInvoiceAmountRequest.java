package com.yunzhanghu.sdk.invoice.domain;

// 查询可开具发票额度和发票开具信息请求
public class GetInvoiceAmountRequest {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 查询开始日期
    private String startDate;

    // 查询结束日期
    private String endDate;

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

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "GetInvoiceAmountRequest{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "}";
    }
}