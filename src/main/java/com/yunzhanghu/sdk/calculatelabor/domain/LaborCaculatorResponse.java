package com.yunzhanghu.sdk.calculatelabor.domain;

// 连续劳务税费试算（计算器）返回
public class LaborCaculatorResponse {
    
    // 综合所得汇算清缴
    private YearTaxInfo yearTaxInfo;
    
    // 月度税务信息列表
    private MonthTax[] monthTaxList;

    public void setYearTaxInfo(YearTaxInfo yearTaxInfo) {
        this.yearTaxInfo = yearTaxInfo;
    }

    public YearTaxInfo getYearTaxInfo() {
        return yearTaxInfo;
    }

    public void setMonthTaxList(MonthTax[] monthTaxList) {
        this.monthTaxList = monthTaxList;
    }

    public MonthTax[] getMonthTaxList() {
        return monthTaxList;
    }

    @Override
    public String toString() {
        return "LaborCaculatorResponse{" +
                " yearTaxInfo='" + yearTaxInfo + '\'' + 
                ", monthTaxList='" + monthTaxList + '\'' + 
               "}";
    }
}