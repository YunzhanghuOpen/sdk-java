package com.yunzhanghu.sdk.dataservice.domain;

// 缴税明细
public class OrderTaxDetail {
    
    // 预扣个税
    private String personalTax;
    
    // 预扣增值税
    private String valueAddedTax;
    
    // 预扣附加税费
    private String additionalTax;
    
    // 实缴个税
    private String receivedPersonalTax;
    
    // 实缴增值税
    private String receivedValueAddedTax;
    
    // 实缴附加税费
    private String receivedAdditionalTax;
    
    // 用户预扣个税
    private String userPersonalTax;
    
    // 平台企业预扣个税
    private String dealerPersonalTax;
    
    // 用户预扣增值税
    private String userValueAddedTax;
    
    // 平台企业预扣增值税
    private String dealerValueAddedTax;
    
    // 用户预扣附加税费
    private String userAdditionalTax;
    
    // 平台企业预扣附加税费
    private String dealerAdditionalTax;
    
    // 用户实缴个税
    private String userReceivedPersonalTax;
    
    // 平台企业实缴个税
    private String dealerReceivedPersonalTax;
    
    // 用户实缴增值税
    private String userReceivedValueAddedTax;
    
    // 平台企业实缴增值税
    private String dealerReceivedValueAddedTax;
    
    // 用户实缴附加税费
    private String userReceivedAdditionalTax;
    
    // 平台企业实缴附加税费
    private String dealerReceivedAdditionalTax;

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

    public void setUserReceivedPersonalTax(String userReceivedPersonalTax) {
        this.userReceivedPersonalTax = userReceivedPersonalTax;
    }

    public String getUserReceivedPersonalTax() {
        return userReceivedPersonalTax;
    }

    public void setDealerReceivedPersonalTax(String dealerReceivedPersonalTax) {
        this.dealerReceivedPersonalTax = dealerReceivedPersonalTax;
    }

    public String getDealerReceivedPersonalTax() {
        return dealerReceivedPersonalTax;
    }

    public void setUserReceivedValueAddedTax(String userReceivedValueAddedTax) {
        this.userReceivedValueAddedTax = userReceivedValueAddedTax;
    }

    public String getUserReceivedValueAddedTax() {
        return userReceivedValueAddedTax;
    }

    public void setDealerReceivedValueAddedTax(String dealerReceivedValueAddedTax) {
        this.dealerReceivedValueAddedTax = dealerReceivedValueAddedTax;
    }

    public String getDealerReceivedValueAddedTax() {
        return dealerReceivedValueAddedTax;
    }

    public void setUserReceivedAdditionalTax(String userReceivedAdditionalTax) {
        this.userReceivedAdditionalTax = userReceivedAdditionalTax;
    }

    public String getUserReceivedAdditionalTax() {
        return userReceivedAdditionalTax;
    }

    public void setDealerReceivedAdditionalTax(String dealerReceivedAdditionalTax) {
        this.dealerReceivedAdditionalTax = dealerReceivedAdditionalTax;
    }

    public String getDealerReceivedAdditionalTax() {
        return dealerReceivedAdditionalTax;
    }

    @Override
    public String toString() {
        return "OrderTaxDetail{" +
                " personalTax='" + personalTax + '\'' + 
                ", valueAddedTax='" + valueAddedTax + '\'' + 
                ", additionalTax='" + additionalTax + '\'' + 
                ", receivedPersonalTax='" + receivedPersonalTax + '\'' + 
                ", receivedValueAddedTax='" + receivedValueAddedTax + '\'' + 
                ", receivedAdditionalTax='" + receivedAdditionalTax + '\'' + 
                ", userPersonalTax='" + userPersonalTax + '\'' + 
                ", dealerPersonalTax='" + dealerPersonalTax + '\'' + 
                ", userValueAddedTax='" + userValueAddedTax + '\'' + 
                ", dealerValueAddedTax='" + dealerValueAddedTax + '\'' + 
                ", userAdditionalTax='" + userAdditionalTax + '\'' + 
                ", dealerAdditionalTax='" + dealerAdditionalTax + '\'' + 
                ", userReceivedPersonalTax='" + userReceivedPersonalTax + '\'' + 
                ", dealerReceivedPersonalTax='" + dealerReceivedPersonalTax + '\'' + 
                ", userReceivedValueAddedTax='" + userReceivedValueAddedTax + '\'' + 
                ", dealerReceivedValueAddedTax='" + dealerReceivedValueAddedTax + '\'' + 
                ", userReceivedAdditionalTax='" + userReceivedAdditionalTax + '\'' + 
                ", dealerReceivedAdditionalTax='" + dealerReceivedAdditionalTax + '\'' + 
               "}";
    }
}