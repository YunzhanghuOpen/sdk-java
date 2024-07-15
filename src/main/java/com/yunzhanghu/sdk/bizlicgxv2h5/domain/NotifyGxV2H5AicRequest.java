package com.yunzhanghu.sdk.bizlicgxv2h5.domain;

// 个体工商户注册/注销结果回调通知
public class NotifyGxV2H5AicRequest {
    
    // 用户唯一标识
    private String openId;
    
    // 平台企业端的用户 ID
    private String dealerUserId;
    
    // 注册/注销提交时间
    private String submitAt;
    
    // 注册/注销完成时间
    private String registedAt;
    
    // 用户注册/注销状态
    private int status;
    
    // 注册/注销状态描述
    private String statusMessage;
    
    // 注册/注销详情状态码
    private int statusDetail;
    
    // 注册/注销详情状态码描述
    private String statusDetailMessage;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 统一社会信用代码
    private String uscc;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 回调类型
    private int type;

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    public void setSubmitAt(String submitAt) {
        this.submitAt = submitAt;
    }

    public String getSubmitAt() {
        return submitAt;
    }

    public void setRegistedAt(String registedAt) {
        this.registedAt = registedAt;
    }

    public String getRegistedAt() {
        return registedAt;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusDetail(int statusDetail) {
        this.statusDetail = statusDetail;
    }

    public int getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetailMessage(String statusDetailMessage) {
        this.statusDetailMessage = statusDetailMessage;
    }

    public String getStatusDetailMessage() {
        return statusDetailMessage;
    }

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

    public void setUscc(String uscc) {
        this.uscc = uscc;
    }

    public String getUscc() {
        return uscc;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NotifyGxV2H5AicRequest{" +
                " openId='" + openId + '\'' + 
                ", dealerUserId='" + dealerUserId + '\'' + 
                ", submitAt='" + submitAt + '\'' + 
                ", registedAt='" + registedAt + '\'' + 
                ", status='" + status + '\'' + 
                ", statusMessage='" + statusMessage + '\'' + 
                ", statusDetail='" + statusDetail + '\'' + 
                ", statusDetailMessage='" + statusDetailMessage + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", uscc='" + uscc + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", realName='" + realName + '\'' + 
                ", type='" + type + '\'' + 
               "}";
    }
}