package com.yunzhanghu.sdk.dataservice.domain;




// 查询日流水数据返回
public class ListDailyBillResponse {
    
    // 总条数
    private int totalNum;
    
    // 条目信息
    private DealerBillInfo[] bills;
    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getTotalNum() {
        return totalNum;
    }
    public void setBills(DealerBillInfo[] bills) {
        this.bills = bills;
    }

    public DealerBillInfo[] getBills() {
        return bills;
    }


    @Override
    public String toString() {
        return "ListDailyBillResponse{" +
                ", totalNum='" + totalNum + '\'' +
                ", bills='" + bills + '\'' +
                '}';
    }
}