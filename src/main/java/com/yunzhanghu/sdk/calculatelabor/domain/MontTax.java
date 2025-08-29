package com.yunzhanghu.sdk.calculatelabor.domain;

// 月度税务信息
public class MontTax {
    
    // 月份
    private int month;
    
    // 含增值税收入
    private String preTaxAmount;
    
    // 不含增值税收入
    private String excludingVatAmount;
    
    // 增值税
    private String valueAddedTax;
    
    // 附加税
    private String additionalTax;
    
    // 个税
    private String personalTax;
    
    // 个税税率
    private String personalTaxRate;
    
    // 速算扣除数
    private String deductTax;
    
    // 税后金额
    private String postTaxAmount;
    
    // 税负率
    private String totalTaxRate;

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setPreTaxAmount(String preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
    }

    public String getPreTaxAmount() {
        return preTaxAmount;
    }

    public void setExcludingVatAmount(String excludingVatAmount) {
        this.excludingVatAmount = excludingVatAmount;
    }

    public String getExcludingVatAmount() {
        return excludingVatAmount;
    }

    public void setValueAddedTax(String valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    public String getValueAddedTax() {
        return valueAddedTax;
    }

    public void setAdditionalTax(String additionalTax) {
        this.additionalTax = additionalTax;
    }

    public String getAdditionalTax() {
        return additionalTax;
    }

    public void setPersonalTax(String personalTax) {
        this.personalTax = personalTax;
    }

    public String getPersonalTax() {
        return personalTax;
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

    public void setPostTaxAmount(String postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
    }

    public String getPostTaxAmount() {
        return postTaxAmount;
    }

    public void setTotalTaxRate(String totalTaxRate) {
        this.totalTaxRate = totalTaxRate;
    }

    public String getTotalTaxRate() {
        return totalTaxRate;
    }

    @Override
    public String toString() {
        return "MontTax{" +
                " month='" + month + '\'' + 
                ", preTaxAmount='" + preTaxAmount + '\'' + 
                ", excludingVatAmount='" + excludingVatAmount + '\'' + 
                ", valueAddedTax='" + valueAddedTax + '\'' + 
                ", additionalTax='" + additionalTax + '\'' + 
                ", personalTax='" + personalTax + '\'' + 
                ", personalTaxRate='" + personalTaxRate + '\'' + 
                ", deductTax='" + deductTax + '\'' + 
                ", postTaxAmount='" + postTaxAmount + '\'' + 
                ", totalTaxRate='" + totalTaxRate + '\'' + 
               "}";
    }
}