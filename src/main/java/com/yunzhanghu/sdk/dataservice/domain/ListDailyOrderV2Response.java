package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单数据（支付和退款订单）返回
public class ListDailyOrderV2Response {
    
    // 总条数
    private int totalNum;
    
    // 条目明细
    private DealerOrderInfoV2[] list;

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setList(DealerOrderInfoV2[] list) {
        this.list = list;
    }

    public DealerOrderInfoV2[] getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ListDailyOrderV2Response{" +
                " totalNum='" + totalNum + '\'' + 
                ", list='" + list + '\'' + 
               "}";
    }
}