package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务单笔结算税费测算-H5 请求
public class CalculationH5UrlRequest {

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

    // 姓名
    private String realName;

    // 证件号
    private String idCard;

    // 主题颜色
    private String color;

    // 是否隐藏导航栏 0：展示导航栏（默认） 1：隐藏导航栏
    private int navbarHide;

    // 页面标题
    private String title;

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

    public void setNavbarHide(int navbarHide) {
        this.navbarHide = navbarHide;
    }

    public int getNavbarHide() {
        return navbarHide;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "CalculationH5UrlRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", color='" + color + '\'' +
                ", navbarHide='" + navbarHide + '\'' +
                ", title='" + title + '\'' +
                "}";
    }
}