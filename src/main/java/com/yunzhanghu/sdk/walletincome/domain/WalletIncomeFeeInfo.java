package com.yunzhanghu.sdk.walletincome.domain;

// 服务费信息
public class WalletIncomeFeeInfo {

    // 总服务费
    private String totalFee;

    // 总服务费率
    private String totalFeeRate;

    // 平台企业加成服务费
    private String dealerFee;

    // 平台企业加成服务费率
    private String dealerFeeRate;

    // 抵扣账户支付的加成服务费
    private String dealerDeductFee;

    // 抵扣后应支付的加成服务费
    private String dealerPayableFee;

    // 劳动者加成服务费
    private String userFee;

    // 劳动者加成服务费率
    private String userFeeRate;

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFeeRate(String totalFeeRate) {
        this.totalFeeRate = totalFeeRate;
    }

    public String getTotalFeeRate() {
        return totalFeeRate;
    }

    public void setDealerFee(String dealerFee) {
        this.dealerFee = dealerFee;
    }

    public String getDealerFee() {
        return dealerFee;
    }

    public void setDealerFeeRate(String dealerFeeRate) {
        this.dealerFeeRate = dealerFeeRate;
    }

    public String getDealerFeeRate() {
        return dealerFeeRate;
    }

    public void setDealerDeductFee(String dealerDeductFee) {
        this.dealerDeductFee = dealerDeductFee;
    }

    public String getDealerDeductFee() {
        return dealerDeductFee;
    }

    public void setDealerPayableFee(String dealerPayableFee) {
        this.dealerPayableFee = dealerPayableFee;
    }

    public String getDealerPayableFee() {
        return dealerPayableFee;
    }

    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    public String getUserFee() {
        return userFee;
    }

    public void setUserFeeRate(String userFeeRate) {
        this.userFeeRate = userFeeRate;
    }

    public String getUserFeeRate() {
        return userFeeRate;
    }

    @Override
    public String toString() {
        return "WalletIncomeFeeInfo{" +
                " totalFee='" + totalFee + '\'' +
                ", totalFeeRate='" + totalFeeRate + '\'' +
                ", dealerFee='" + dealerFee + '\'' +
                ", dealerFeeRate='" + dealerFeeRate + '\'' +
                ", dealerDeductFee='" + dealerDeductFee + '\'' +
                ", dealerPayableFee='" + dealerPayableFee + '\'' +
                ", userFee='" + userFee + '\'' +
                ", userFeeRate='" + userFeeRate + '\'' +
               "}";
    }
}
