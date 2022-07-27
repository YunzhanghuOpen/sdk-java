package com.yunzhanghu.sdk.payment.domain;




// 银行卡实时下单返回
public class CreateBankpayOrderResponse {
    
    
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;
    
    // 支付金额
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
        return "CreateBankpayOrderResponse{" +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }
}