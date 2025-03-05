package com.yunzhanghu.sdk.dataservice.domain;

// 查询月订单汇总数据请求
public class ListMonthlyOrderSummaryRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 支付路径，银行卡、支付宝、微信
    private String channel;
    
    // 汇总月份，格式：yyyy-MM
    private String month;
    
    // 筛选类型，apply：按订单创建时间汇总 complete：按订单完成时间汇总
    private String filterType;

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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getFilterType() {
        return filterType;
    }

    @Override
    public String toString() {
        return "ListMonthlyOrderSummaryRequest{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", channel='" + channel + '\'' + 
                ", month='" + month + '\'' + 
                ", filterType='" + filterType + '\'' + 
               "}";
    }
}