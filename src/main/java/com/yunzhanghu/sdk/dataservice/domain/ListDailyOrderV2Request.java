package com.yunzhanghu.sdk.dataservice.domain;

// 查询日订单数据（支付和退款订单）请求
public class ListDailyOrderV2Request {
    
    // 订单查询日期, yyyy-MM-dd 格式
    private String orderDate;
    
    // 偏移量
    private int offset;
    
    // 每页返回条数
    private int length;
    
    // 支付路径名，bankpay：银行卡 alipay：支付宝 wxpay：微信
    private String channel;
    
    // 当且仅当参数值为 encryption 时，对返回的 data 进行加密
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
        return "ListDailyOrderV2Request{" +
                " orderDate='" + orderDate + '\'' + 
                ", offset='" + offset + '\'' + 
                ", length='" + length + '\'' + 
                ", channel='" + channel + '\'' + 
                ", dataType='" + dataType + '\'' + 
               "}";
    }
}