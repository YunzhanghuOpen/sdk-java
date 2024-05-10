package com.yunzhanghu.sdk.bizlicgxv2h5.domain;

// 预启动请求
public class GxV2H5GetStartUrlRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业端的用户 ID
    private String dealerUserId;
    
    // 客户端类型
    private int clientType;
    
    // 异步通知 URL
    private String notifyUrl;
    
    // H5 页面主题颜色
    private String color;
    
    // 跳转 URL
    private String returnUrl;
    
    // H5 页面 Title
    private int customerTitle;

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

    public void setDealerUserId(String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }

    public String getDealerUserId() {
        return dealerUserId;
    }

    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    public int getClientType() {
        return clientType;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setCustomerTitle(int customerTitle) {
        this.customerTitle = customerTitle;
    }

    public int getCustomerTitle() {
        return customerTitle;
    }

    @Override
    public String toString() {
        return "GxV2H5GetStartUrlRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", dealerUserId='" + dealerUserId + '\'' + 
                ", clientType='" + clientType + '\'' + 
                ", notifyUrl='" + notifyUrl + '\'' + 
                ", color='" + color + '\'' + 
                ", returnUrl='" + returnUrl + '\'' + 
                ", customerTitle='" + customerTitle + '\'' + 
               '}';
    }
}