package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单数据请求
public class ListDailyOrderRequest {
    
    // 订单查询日期, 格式：yyyy-MM-dd格式：yyyy-MM-dd
    private String orderDate;
    
    // 偏移量
    private int offset;
    
    // 长度
    private int length;
    
    // 支付路径名，银行卡（默认）、支付宝、微信
    private String channel;
    
    // 如果为 encryption，则对返回的 data 进行加密
    private String dataType;

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }

    @Override
    public String toString() {
        return "ListDailyOrderRequest{" +
             " orderDate='" + orderDate + '\'' + 
             ", offset='" + offset + '\'' + 
             ", length='" + length + '\'' + 
             ", channel='" + channel + '\'' + 
             ", dataType='" + dataType + '\'' + 
           '}';
    }
}