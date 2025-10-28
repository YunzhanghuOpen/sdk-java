package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务年度税费测算-H5 请求
public class CalculationYearH5UrlRequest {

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

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
        return "CalculationYearH5UrlRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", color='" + color + '\'' +
                ", navbarHide='" + navbarHide + '\'' +
                ", title='" + title + '\'' +
                "}";
    }
}