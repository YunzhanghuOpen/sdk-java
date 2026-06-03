package com.yunzhanghu.sdk.h5usersign.domain;

// 申请解约请求
public class H5UserReleaseApplyRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 证件号码
    private String idCard;
    
    // 主题颜色
    private String color;
    
    // 回调 URL
    private String url;
    
    // 跳转 URL
    private String redirectUrl;

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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    @Override
    public String toString() {
        return "H5UserReleaseApplyRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", color='" + color + '\'' + 
                ", url='" + url + '\'' + 
                ", redirectUrl='" + redirectUrl + '\'' + 
               "}";
    }
}