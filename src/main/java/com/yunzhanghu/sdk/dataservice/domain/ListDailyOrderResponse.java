package com.yunzhanghu.sdk.dataservice.domain;




// 查询日订单响应
public class ListDailyOrderResponse {
    
    // 总数目
    private int totalNum;
    
    // 条目信息
    private DealerOrderInfo[] list;
    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getTotalNum() {
        return totalNum;
    }
    public void setList(DealerOrderInfo[] list) {
        this.list = list;
    }

    public DealerOrderInfo[] getList() {
        return list;
    }


    @Override
    public String toString() {
        return "ListDailyOrderResponse{" +
                ", totalNum='" + totalNum + '\'' +
                ", list='" + list + '\'' +
                '}';
    }
}