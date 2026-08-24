package com.yunzhanghu.sdk.payment.domain;

// 劳动者退款订单回调通知
public class NotifyLaborRefundOrderRequest {

    // 通知 ID
    private String notifyId;

    // 通知时间
    private String notifyTime;

    // 返回数据
    private NotifyLaborRefundOrderData data;

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

    public void setData(NotifyLaborRefundOrderData data) {
        this.data = data;
    }

    public NotifyLaborRefundOrderData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NotifyLaborRefundOrderRequest{" +
                " notifyId='" + notifyId + '\'' +
                ", notifyTime='" + notifyTime + '\'' +
                ", data='" + data + '\'' +
               "}";
    }
}
