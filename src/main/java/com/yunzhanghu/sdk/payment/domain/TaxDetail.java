package com.yunzhanghu.sdk.payment.domain;

// 缴税明细
public class TaxDetail {
    
    // 应纳个税
    private String personalTax;
    
    // 应纳增值税
    private String valueAddedTax;
    
    // 应纳附加税费
    private String additionalTax;
    
    // 实纳个税
    private String receivedPersonalTax;
    
    // 实纳增值税
    private String receivedValueAddedTax;
    
    // 实纳附加税费
    private String receivedAdditionalTax;

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

    public void setReceivedPersonalTax(String receivedPersonalTax) {
        this.receivedPersonalTax = receivedPersonalTax;
    }

    public String getReceivedPersonalTax() {
        return receivedPersonalTax;
    }

    public void setReceivedValueAddedTax(String receivedValueAddedTax) {
        this.receivedValueAddedTax = receivedValueAddedTax;
    }

    public String getReceivedValueAddedTax() {
        return receivedValueAddedTax;
    }

    public void setReceivedAdditionalTax(String receivedAdditionalTax) {
        this.receivedAdditionalTax = receivedAdditionalTax;
    }

    public String getReceivedAdditionalTax() {
        return receivedAdditionalTax;
    }

    @Override
    public String toString() {
        return "TaxDetail{" +
                " personalTax='" + personalTax + '\'' + 
                ", valueAddedTax='" + valueAddedTax + '\'' + 
                ", additionalTax='" + additionalTax + '\'' + 
                ", receivedPersonalTax='" + receivedPersonalTax + '\'' + 
                ", receivedValueAddedTax='" + receivedValueAddedTax + '\'' + 
                ", receivedAdditionalTax='" + receivedAdditionalTax + '\'' + 
               "}";
    }
}