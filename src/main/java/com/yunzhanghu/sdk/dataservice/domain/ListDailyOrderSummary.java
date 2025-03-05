package com.yunzhanghu.sdk.dataservice.domain;

// 日订单汇总数据详情
public class ListDailyOrderSummary {
    
    // 订单查询日期，格式：yyyy-MM-dd
    private String date;
    
    // 成功订单汇总
    private DailyOrderSummary success;
    
    // 处理中订单汇总
    private DailyOrderSummary processing;
    
    // 失败订单汇总
    private DailyOrderSummary failed;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setSuccess(DailyOrderSummary success) {
        this.success = success;
    }

    public DailyOrderSummary getSuccess() {
        return success;
    }

    public void setProcessing(DailyOrderSummary processing) {
        this.processing = processing;
    }

    public DailyOrderSummary getProcessing() {
        return processing;
    }

    public void setFailed(DailyOrderSummary failed) {
        this.failed = failed;
    }

    public DailyOrderSummary getFailed() {
        return failed;
    }

    @Override
    public String toString() {
        return "ListDailyOrderSummary{" +
                " date='" + date + '\'' + 
                ", success='" + success + '\'' + 
                ", processing='" + processing + '\'' + 
                ", failed='" + failed + '\'' + 
               "}";
    }
}