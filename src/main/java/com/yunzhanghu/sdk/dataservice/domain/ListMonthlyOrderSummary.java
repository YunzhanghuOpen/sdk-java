package com.yunzhanghu.sdk.dataservice.domain;

// 月订单汇总数据详情
public class ListMonthlyOrderSummary {
    
    // 成功订单汇总
    private MonthlyOrderSummary success;
    
    // 处理中订单汇总
    private MonthlyOrderSummary processing;
    
    // 失败订单汇总
    private MonthlyOrderSummary failed;

    public void setSuccess(MonthlyOrderSummary success) {
        this.success = success;
    }

    public MonthlyOrderSummary getSuccess() {
        return success;
    }

    public void setProcessing(MonthlyOrderSummary processing) {
        this.processing = processing;
    }

    public MonthlyOrderSummary getProcessing() {
        return processing;
    }

    public void setFailed(MonthlyOrderSummary failed) {
        this.failed = failed;
    }

    public MonthlyOrderSummary getFailed() {
        return failed;
    }

    @Override
    public String toString() {
        return "ListMonthlyOrderSummary{" +
                " success='" + success + '\'' + 
                ", processing='" + processing + '\'' + 
                ", failed='" + failed + '\'' + 
               "}";
    }
}