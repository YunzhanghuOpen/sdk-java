package com.yunzhanghu.sdk.taxclearrefund.domain;

// 连续劳务税费清缴完成通知
public class NotifyClearTaxDoneRequest {
    
    // 通知 ID
    private String notifyId;
    
    // 通知时间
    private String notifyTime;
    
    // 返回数据
    private ClearTaxData data;

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

    public void setData(ClearTaxData data) {
        this.data = data;
    }

    public ClearTaxData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NotifyClearTaxDoneRequest{" +
                " notifyId='" + notifyId + '\'' + 
                ", notifyTime='" + notifyTime + '\'' + 
                ", data='" + data + '\'' + 
               "}";
    }
}