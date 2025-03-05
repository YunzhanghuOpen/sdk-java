package com.yunzhanghu.sdk.dataservice.domain;

// 查询月订单汇总数据返回
public class ListMonthlyOrderSummaryResponse {
    
    // 汇总数据列表
    private ListMonthlyOrderSummary summary;

    public void setSummary(ListMonthlyOrderSummary summary) {
        this.summary = summary;
    }

    public ListMonthlyOrderSummary getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "ListMonthlyOrderSummaryResponse{" +
                " summary='" + summary + '\'' + 
               "}";
    }
}