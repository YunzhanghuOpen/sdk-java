package com.yunzhanghu.sdk.dataservice.domain;

// 查询余额日账单数据请求
public class ListBalanceDailyStatementRequest {
    
    // 账单查询日期 格式：yyyy-MM-dd
    private String statementDate;

    public void setStatementDate(String statementDate) {
        this.statementDate = statementDate;
    }

    public String getStatementDate() {
        return statementDate;
    }

    @Override
    public String toString() {
        return "ListBalanceDailyStatementRequest{" +
                " statementDate='" + statementDate + '\'' + 
               "}";
    }
}