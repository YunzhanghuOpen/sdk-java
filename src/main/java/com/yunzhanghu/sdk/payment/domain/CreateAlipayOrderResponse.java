package com.yunzhanghu.sdk.payment.domain;





public class CreateAlipayOrderResponse {
    
    // 商户订单号，原值返回
    private String orderId;
    
    // 综合服务平台流水号，唯一
    private String ref;
    
    // 单位：元，支持小数点后两位
    private String pay;
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }


    @Override
    public String toString() {
        return "CreateAlipayOrderResponse{" +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }
}