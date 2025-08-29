package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务税费试算（计算器）请求
public class LaborCaculatorRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 月度收入列表
    private MonthSettlement[] monthSettlementList;

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

    public void setMonthSettlementList(MonthSettlement[] monthSettlementList) {
        this.monthSettlementList = monthSettlementList;
    }

    public MonthSettlement[] getMonthSettlementList() {
        return monthSettlementList;
    }

    @Override
    public String toString() {
        return "LaborCaculatorRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", monthSettlementList='" + monthSettlementList + '\'' + 
               "}";
    }
}