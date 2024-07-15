package com.yunzhanghu.sdk.payment.domain;

// 取消待支付订单返回
public class CancelOrderResponse {
    
    private String ok;

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getOk() {
        return ok;
    }

    @Override
    public String toString() {
        return "CancelOrderResponse{" +
                " ok='" + ok + '\'' + 
               "}";
    }
}