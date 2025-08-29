package com.yunzhanghu.sdk.calculatelabor.domain;

// 综合所得汇算清缴信息
public class YearTaxInfo {
    
    // 连续劳务年度个税
    private String continuousMonthPersonalTax;
    
    // 综合所得汇算清缴年度个税
    private String personalTax;
    
    // 年度扣除费用
    private String deductCost;
    
    // 个税税率
    private String personalTaxRate;
    
    // 速算扣除数
    private String deductTax;
    
    // 税负率
    private String totalTaxRate;

    public void setContinuousMonthPersonalTax(String continuousMonthPersonalTax) {
        this.continuousMonthPersonalTax = continuousMonthPersonalTax;
    }

    public String getContinuousMonthPersonalTax() {
        return continuousMonthPersonalTax;
    }

    public void setPersonalTax(String personalTax) {
        this.personalTax = personalTax;
    }

    public String getPersonalTax() {
        return personalTax;
    }

    public void setDeductCost(String deductCost) {
        this.deductCost = deductCost;
    }

    public String getDeductCost() {
        return deductCost;
    }

    public void setPersonalTaxRate(String personalTaxRate) {
        this.personalTaxRate = personalTaxRate;
    }

    public String getPersonalTaxRate() {
        return personalTaxRate;
    }

    public void setDeductTax(String deductTax) {
        this.deductTax = deductTax;
    }

    public String getDeductTax() {
        return deductTax;
    }

    public void setTotalTaxRate(String totalTaxRate) {
        this.totalTaxRate = totalTaxRate;
    }

    public String getTotalTaxRate() {
        return totalTaxRate;
    }

    @Override
    public String toString() {
        return "YearTaxInfo{" +
                " continuousMonthPersonalTax='" + continuousMonthPersonalTax + '\'' + 
                ", personalTax='" + personalTax + '\'' + 
                ", deductCost='" + deductCost + '\'' + 
                ", personalTaxRate='" + personalTaxRate + '\'' + 
                ", deductTax='" + deductTax + '\'' + 
                ", totalTaxRate='" + totalTaxRate + '\'' + 
               "}";
    }
}