package com.yunzhanghu.sdk.calculatelabor.domain;

// 税费明细
public class CalcTaxDetail {
    
    // 预扣个税
    private String personalTax;
    
    // 预扣增值税
    private String valueAddedTax;
    
    // 预扣附加税费
    private String additionalTax;
    
    // 用户预扣个税
    private String userPersonalTax;
    
    // 平台企业预扣个税
    private String dealerPersonalTax;
    
    // 云账户预扣个税
    private String brokerPersonalTax;
    
    // 用户预扣增值税
    private String userValueAddedTax;
    
    // 平台企业预扣增值税
    private String dealerValueAddedTax;
    
    // 云账户预扣增值税
    private String brokerValueAddedTax;
    
    // 用户预扣附加税费
    private String userAdditionalTax;
    
    // 平台企业预扣附加税费
    private String dealerAdditionalTax;
    
    // 云账户预扣附加税费
    private String brokerAdditionalTax;
    
    // 预扣个税税率
    private String personalTaxRate;
    
    // 预扣个税速算扣除数
    private String deductTax;

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

    public void setUserPersonalTax(String userPersonalTax) {
        this.userPersonalTax = userPersonalTax;
    }

    public String getUserPersonalTax() {
        return userPersonalTax;
    }

    public void setDealerPersonalTax(String dealerPersonalTax) {
        this.dealerPersonalTax = dealerPersonalTax;
    }

    public String getDealerPersonalTax() {
        return dealerPersonalTax;
    }

    public void setBrokerPersonalTax(String brokerPersonalTax) {
        this.brokerPersonalTax = brokerPersonalTax;
    }

    public String getBrokerPersonalTax() {
        return brokerPersonalTax;
    }

    public void setUserValueAddedTax(String userValueAddedTax) {
        this.userValueAddedTax = userValueAddedTax;
    }

    public String getUserValueAddedTax() {
        return userValueAddedTax;
    }

    public void setDealerValueAddedTax(String dealerValueAddedTax) {
        this.dealerValueAddedTax = dealerValueAddedTax;
    }

    public String getDealerValueAddedTax() {
        return dealerValueAddedTax;
    }

    public void setBrokerValueAddedTax(String brokerValueAddedTax) {
        this.brokerValueAddedTax = brokerValueAddedTax;
    }

    public String getBrokerValueAddedTax() {
        return brokerValueAddedTax;
    }

    public void setUserAdditionalTax(String userAdditionalTax) {
        this.userAdditionalTax = userAdditionalTax;
    }

    public String getUserAdditionalTax() {
        return userAdditionalTax;
    }

    public void setDealerAdditionalTax(String dealerAdditionalTax) {
        this.dealerAdditionalTax = dealerAdditionalTax;
    }

    public String getDealerAdditionalTax() {
        return dealerAdditionalTax;
    }

    public void setBrokerAdditionalTax(String brokerAdditionalTax) {
        this.brokerAdditionalTax = brokerAdditionalTax;
    }

    public String getBrokerAdditionalTax() {
        return brokerAdditionalTax;
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

    @Override
    public String toString() {
        return "CalcTaxDetail{" +
                " personalTax='" + personalTax + '\'' + 
                ", valueAddedTax='" + valueAddedTax + '\'' + 
                ", additionalTax='" + additionalTax + '\'' + 
                ", userPersonalTax='" + userPersonalTax + '\'' + 
                ", dealerPersonalTax='" + dealerPersonalTax + '\'' + 
                ", brokerPersonalTax='" + brokerPersonalTax + '\'' + 
                ", userValueAddedTax='" + userValueAddedTax + '\'' + 
                ", dealerValueAddedTax='" + dealerValueAddedTax + '\'' + 
                ", brokerValueAddedTax='" + brokerValueAddedTax + '\'' + 
                ", userAdditionalTax='" + userAdditionalTax + '\'' + 
                ", dealerAdditionalTax='" + dealerAdditionalTax + '\'' + 
                ", brokerAdditionalTax='" + brokerAdditionalTax + '\'' + 
                ", personalTaxRate='" + personalTaxRate + '\'' + 
                ", deductTax='" + deductTax + '\'' + 
               "}";
    }
}