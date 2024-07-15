package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单文件（支付和退款订单）请求
public class GetDailyOrderFileV2Request {
    
    // 订单查询日期, 格式：yyyy-MM-dd
    private String orderDate;

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "GetDailyOrderFileV2Request{" +
                " orderDate='" + orderDate + '\'' + 
               "}";
    }
}