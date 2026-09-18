package com.yunzhanghu.sdk.walletincome.domain;

// 税费信息
public class WalletIncomeTaxInfo {

    // 下单计税信息
    private WalletIncomeTaxDetail original;

    // 当前计税信息
    private WalletIncomeTaxDetail current;

    public void setOriginal(WalletIncomeTaxDetail original) {
        this.original = original;
    }

    public WalletIncomeTaxDetail getOriginal() {
        return original;
    }

    public void setCurrent(WalletIncomeTaxDetail current) {
        this.current = current;
    }

    public WalletIncomeTaxDetail getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return "WalletIncomeTaxInfo{" +
                " original='" + original + '\'' +
                ", current='" + current + '\'' +
               "}";
    }
}
