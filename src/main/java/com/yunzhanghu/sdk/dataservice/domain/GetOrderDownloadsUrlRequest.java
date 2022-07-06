package com.yunzhanghu.sdk.dataservice.domain;




// 查询日订单文件请求
public class GetOrderDownloadsUrlRequest {
    
    // 订单查询日期
    private String orderDate;
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }


    @Override
    public String toString() {
        return "GetOrderDownloadsUrlRequest{" +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}