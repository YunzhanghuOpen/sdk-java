package com.yunzhanghu.sdk.walletincome.domain;

// 取消计税退还税费信息
public class WalletIncomeCancelTaxInfo {

    // 税费总额及明细
    private WalletIncomeTaxParty total;

    // 劳动者承担税费
    private WalletIncomeTaxParty user;

    // 平台企业承担税费
    private WalletIncomeTaxParty dealer;

    // 云账户承担税费
    private WalletIncomeTaxParty broker;

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
        return "WalletIncomeCancelTaxInfo{" +
                " total='" + total + '\'' +
                ", user='" + user + '\'' +
                ", dealer='" + dealer + '\'' +
                ", broker='" + broker + '\'' +
               "}";
    }
}
