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

    @Override
    public String toString() {
        return "NotifyH5UserSignRequest{" +
             " dealerId='" + dealerId + '\'' + 
             ", brokerId='" + brokerId + '\'' + 
             ", realName='" + realName + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", phone='" + phone + '\'' + 
           '}';
    }
}