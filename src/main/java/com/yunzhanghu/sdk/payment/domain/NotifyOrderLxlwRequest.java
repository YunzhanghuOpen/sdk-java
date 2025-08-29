package com.yunzhanghu.sdk.payment.domain;

// 劳务模式订单支付状态回调通知
public class NotifyOrderLxlwRequest {
    
    // 通知 ID
    private String notifyId;
    
    // 通知时间
    private String notifyTime;
    
    // 返回数据
    private NotifyOrderLxlwData data;

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

    public void setData(NotifyOrderLxlwData data) {
        this.data = data;
    }

    public NotifyOrderLxlwData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NotifyOrderLxlwRequest{" +
                " notifyId='" + notifyId + '\'' + 
                ", notifyTime='" + notifyTime + '\'' + 
                ", data='" + data + '\'' + 
               "}";
    }
}