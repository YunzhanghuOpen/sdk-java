package com.yunzhanghu.sdk.calculatelabor.domain;

// 月度收入
public class MonthSettlement {
    
    // 月份
    private int month;
    
    // 月度收入
    private String monthPreTaxAmount;

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonthPreTaxAmount(String monthPreTaxAmount) {
        this.monthPreTaxAmount = monthPreTaxAmount;
    }

    public String getMonthPreTaxAmount() {
        return monthPreTaxAmount;
    }

    @Override
    public String toString() {
        return "MonthSettlement{" +
                " month='" + month + '\'' + 
                ", monthPreTaxAmount='" + monthPreTaxAmount + '\'' + 
               "}";
    }
}