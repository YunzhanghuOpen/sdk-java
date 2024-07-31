package com.yunzhanghu.sdk.payment.domain;

// 重试挂起状态订单返回
public class RetryOrderResponse {
    
    // 请求标识
    private String ok;

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getOk() {
        return ok;
    }

    @Override
    public String toString() {
        return "RetryOrderResponse{" +
                " ok='" + ok + '\'' + 
               "}";
    }
}