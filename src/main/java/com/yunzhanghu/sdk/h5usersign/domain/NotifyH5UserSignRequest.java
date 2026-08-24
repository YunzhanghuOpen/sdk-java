package com.yunzhanghu.sdk.h5usersign.domain;

// 签约回调
public class NotifyH5UserSignRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 预签约手机号
    private String phone;

    // 签约状态 0：未签约 1：已签约 2：已解约
    private Integer status;

    // 签约事件类型
    private String eventType;

    // 签约事件状态
    private String eventStatus;

    // 签约事件状态详情
    private String eventStatusDetail;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatusDetail(String eventStatusDetail) {
        this.eventStatusDetail = eventStatusDetail;
    }

    public String getEventStatusDetail() {
        return eventStatusDetail;
    }

    @Override
    public String toString() {
        return "NotifyH5UserSignRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventStatus='" + eventStatus + '\'' +
                ", eventStatusDetail='" + eventStatusDetail + '\'' +
               "}";
    }
}