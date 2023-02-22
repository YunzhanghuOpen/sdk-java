package com.yunzhanghu.sdk.payment.domain;



// 查询电子回单请求
public class GetEleReceiptFileRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;

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

    @Override
    public String toString() {
        return "GetEleReceiptFileRequest{" +
             " orderId='" + orderId + '\'' + 
             ", ref='" + ref + '\'' + 
           '}';
    }
}