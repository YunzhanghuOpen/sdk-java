package com.yunzhanghu.sdk.dataservice.domain;




// 查询余额日账单数据返回
public class ListBalanceDailyStatementResponse {
    
    // 条目信息
    private StatementDetail[] list;
    public void setList(StatementDetail[] list) {
        this.list = list;
    }

    public StatementDetail[] getList() {
        return list;
    }


    @Override
    public String toString() {
        return "ListBalanceDailyStatementResponse{" +
                ", list='" + list + '\'' +
                '}';
    }
}