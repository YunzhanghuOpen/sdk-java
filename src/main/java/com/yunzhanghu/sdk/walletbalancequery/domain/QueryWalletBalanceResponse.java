package com.yunzhanghu.sdk.walletbalancequery.domain;

// 查询钱包余额返回
public class QueryWalletBalanceResponse {

    // 钱包总余额
    private String totalBalance;

    // 可用余额
    private String availableBalance;

    // 冻结余额
    private String frozenBalance;

    // 版本号
    private String version;

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setFrozenBalance(String frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public String getFrozenBalance() {
        return frozenBalance;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "QueryWalletBalanceResponse{" +
                " totalBalance='" + totalBalance + '\'' +
                ", availableBalance='" + availableBalance + '\'' +
                ", frozenBalance='" + frozenBalance + '\'' +
                ", version='" + version + '\'' +
               "}";
    }
}
