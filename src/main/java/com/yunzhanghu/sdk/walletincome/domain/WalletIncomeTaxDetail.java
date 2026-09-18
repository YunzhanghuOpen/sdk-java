package com.yunzhanghu.sdk.walletincome.domain;

// 计税信息
public class WalletIncomeTaxDetail {

    // 个税税率
    private String personalTaxRate;

    // 个税速算扣除数
    private String deductTax;

    // 基本减除费用扣除
    private String basicDeducted;

    // 税费总额及明细
    private WalletIncomeTaxParty total;

    // 劳动者承担税费
    private WalletIncomeTaxParty user;

    // 平台企业承担税费
    private WalletIncomeTaxParty dealer;

    // 云账户承担税费
    private WalletIncomeTaxParty broker;

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

    public void setBasicDeducted(String basicDeducted) {
        this.basicDeducted = basicDeducted;
    }

    public String getBasicDeducted() {
        return basicDeducted;
    }

    public void setTotal(WalletIncomeTaxParty total) {
        this.total = total;
    }

    public WalletIncomeTaxParty getTotal() {
        return total;
    }

    public void setUser(WalletIncomeTaxParty user) {
        this.user = user;
    }

    public WalletIncomeTaxParty getUser() {
        return user;
    }

    public void setDealer(WalletIncomeTaxParty dealer) {
        this.dealer = dealer;
    }

    public WalletIncomeTaxParty getDealer() {
        return dealer;
    }

    public void setBroker(WalletIncomeTaxParty broker) {
        this.broker = broker;
    }

    public WalletIncomeTaxParty getBroker() {
        return broker;
    }

    @Override
    public String toString() {
        return "WalletIncomeTaxDetail{" +
                " personalTaxRate='" + personalTaxRate + '\'' +
                ", deductTax='" + deductTax + '\'' +
                ", basicDeducted='" + basicDeducted + '\'' +
                ", total='" + total + '\'' +
                ", user='" + user + '\'' +
                ", dealer='" + dealer + '\'' +
                ", broker='" + broker + '\'' +
               "}";
    }
}
