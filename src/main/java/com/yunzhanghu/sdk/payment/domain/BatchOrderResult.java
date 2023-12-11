package com.yunzhanghu.sdk.payment.domain;



// 批次下单返回订单信息
public class BatchOrderResult {
    
    // 平台企业订单号
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;
    
    // 订单金额
    private String pay;
    
    // 下单状态
    private String status;
    
    // 下单失败原因
    private BatchOrderErrorReasons[] errorReasons;

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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setErrorReasons(BatchOrderErrorReasons[] errorReasons) {
        this.errorReasons = errorReasons;
    }

    public BatchOrderErrorReasons[] getErrorReasons() {
        return errorReasons;
    }

    @Override
    public String toString() {
        return "BatchOrderResult{" +
                   " orderId='" + orderId + '\'' + 
                   ", ref='" + ref + '\'' + 
                   ", pay='" + pay + '\'' + 
                   ", status='" + status + '\'' + 
                   ", errorReasons='" + errorReasons + '\'' + 
                 '}';
    }
}