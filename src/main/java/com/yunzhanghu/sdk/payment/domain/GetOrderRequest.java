package com.yunzhanghu.sdk.payment.domain;




// 查询单笔订单信息请求
public class GetOrderRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 支付路径名，银行卡（默认）、支付宝、微信
    private String channel;
    
    // 数据类型，如果为 encryption，则对返回的 data 进行加密
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
        return "GetOrderRequest{" +
             " orderId='" + orderId + '\'' + 
             ", channel='" + channel + '\'' + 
             ", dataType='" + dataType + '\'' + 
              '}';
    }
}