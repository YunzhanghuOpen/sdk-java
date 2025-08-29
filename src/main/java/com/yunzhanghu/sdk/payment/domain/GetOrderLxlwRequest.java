package com.yunzhanghu.sdk.payment.domain;

// 查询劳务模式单笔订单信息请求
public class GetOrderLxlwRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 支付路径
    private String channel;
    
    // 数据类型
    private String dataType;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
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
        return "GetOrderLxlwRequest{" +
                " orderId='" + orderId + '\'' + 
                ", channel='" + channel + '\'' + 
                ", dataType='" + dataType + '\'' + 
               "}";
    }
}