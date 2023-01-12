package com.yunzhanghu.sdk.authentication.domain;



import java.util.List;

// 上传免验证用户名单信息审核结果通知请求
public class UserExemptedInfoNotifyRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 姓名
    private String realName;
    
    // 证件号
    private String idCard;
    
    // 审核状态
    private String status;
    
    // 流水号
    private String ref;
    
    // 审核信息
    private String comment;
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
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
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "UserExemptedInfoNotifyRequest{" +
             " brokerId='" + brokerId + '\'' + 
             ", dealerId='" + dealerId + '\'' + 
             ", realName='" + realName + '\'' + 
             ", idCard='" + idCard + '\'' + 
             ", status='" + status + '\'' + 
             ", ref='" + ref + '\'' + 
             ", comment='" + comment + '\'' + 
           '}';
    }
}