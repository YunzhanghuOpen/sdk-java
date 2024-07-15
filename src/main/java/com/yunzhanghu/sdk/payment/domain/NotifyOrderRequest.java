package com.yunzhanghu.sdk.payment.domain;

// 订单支付状态回调通知
public class NotifyOrderRequest {
    
    // 通知 ID
    private String notifyId;
    
    // 通知时间
    private String notifyTime;
    
    // 返回数据
    private NotifyOrderData data;

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getNotifyTime() {
        return notifyTime;
    }

    public void setData(NotifyOrderData data) {
        this.data = data;
    }

    public NotifyOrderData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NotifyOrderRequest{" +
                " notifyId='" + notifyId + '\'' + 
                ", notifyTime='" + notifyTime + '\'' + 
                ", data='" + data + '\'' + 
               "}";
    }
}