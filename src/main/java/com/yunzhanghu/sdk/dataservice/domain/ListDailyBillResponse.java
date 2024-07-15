package com.yunzhanghu.sdk.dataservice.domain;

// 查询日流水数据返回
public class ListDailyBillResponse {
    
    // 总条数
    private int totalNum;
    
    // 条目信息
    private DealerBillInfo[] list;

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setList(DealerBillInfo[] list) {
        this.list = list;
    }

    public DealerBillInfo[] getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ListDailyBillResponse{" +
                " totalNum='" + totalNum + '\'' + 
                ", list='" + list + '\'' + 
               "}";
    }
}