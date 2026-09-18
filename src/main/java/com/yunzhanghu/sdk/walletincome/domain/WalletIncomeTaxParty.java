package com.yunzhanghu.sdk.walletincome.domain;

// 税费承担方明细
public class WalletIncomeTaxParty {

    // 税费总额
    private String totalTax;

    // 个人所得税
    private String personalTax;

    // 增值税
    private String valueAddedTax;

    // 附加税
    private String additionalTax;

    // 城市维护建设税
    private String additionalUrbanTax;

    // 教育费附加
    private String additionalTuitionTax;

    // 地方教育附加
    private String additionalLocalTuitionTax;

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getTotalTax() {
        return totalTax;
    }

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

    public void setAdditionalUrbanTax(String additionalUrbanTax) {
        this.additionalUrbanTax = additionalUrbanTax;
    }

    public String getAdditionalUrbanTax() {
        return additionalUrbanTax;
    }

    public void setAdditionalTuitionTax(String additionalTuitionTax) {
        this.additionalTuitionTax = additionalTuitionTax;
    }

    public String getAdditionalTuitionTax() {
        return additionalTuitionTax;
    }

    public void setAdditionalLocalTuitionTax(String additionalLocalTuitionTax) {
        this.additionalLocalTuitionTax = additionalLocalTuitionTax;
    }

    public String getAdditionalLocalTuitionTax() {
        return additionalLocalTuitionTax;
    }

    @Override
    public String toString() {
        return "WalletIncomeTaxParty{" +
                " totalTax='" + totalTax + '\'' +
                ", personalTax='" + personalTax + '\'' +
                ", valueAddedTax='" + valueAddedTax + '\'' +
                ", additionalTax='" + additionalTax + '\'' +
                ", additionalUrbanTax='" + additionalUrbanTax + '\'' +
                ", additionalTuitionTax='" + additionalTuitionTax + '\'' +
                ", additionalLocalTuitionTax='" + additionalLocalTuitionTax + '\'' +
               "}";
    }
}
