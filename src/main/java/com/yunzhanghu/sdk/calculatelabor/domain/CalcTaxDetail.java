package com.yunzhanghu.sdk.calculatelabor.domain;

// 税费明细
public class CalcTaxDetail {
    
    // 应纳个税
    private String personalTax;
    
    // 应纳增值税
    private String valueAddedTax;
    
    // 应纳附加税费
    private String additionalTax;

    public void setPersonalTax(String personalTax) {
        this.personalTax = personalTax;
    }

    public String getPersonalTax() {
        return personalTax;
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

    @Override
    public String toString() {
        return "CalcTaxDetail{" +
                " personalTax='" + personalTax + '\'' + 
                ", valueAddedTax='" + valueAddedTax + '\'' + 
                ", additionalTax='" + additionalTax + '\'' + 
               "}";
    }
}