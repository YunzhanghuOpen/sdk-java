package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单汇总数据返回
public class ListDailyOrderSummaryResponse {
    
    // 汇总数据列表
    private ListDailyOrderSummary[] summaryList;

    public void setSummaryList(ListDailyOrderSummary[] summaryList) {
        this.summaryList = summaryList;
    }

    public ListDailyOrderSummary[] getSummaryList() {
        return summaryList;
    }

    @Override
    public String toString() {
        return "ListDailyOrderSummaryResponse{" +
                " summaryList='" + summaryList + '\'' + 
               "}";
    }
}