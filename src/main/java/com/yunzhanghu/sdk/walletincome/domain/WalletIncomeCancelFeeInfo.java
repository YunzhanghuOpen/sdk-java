package com.yunzhanghu.sdk.walletincome.domain;

// 取消计税退还服务费信息
public class WalletIncomeCancelFeeInfo {

    // 总服务费
    private String totalFee;

    // 平台企业加成服务费
    private String dealerFee;

    // 抵扣账户支付的加成服务费
    private String dealerDeductFee;

    // 抵扣后应支付的加成服务费
    private String dealerPayableFee;

    // 劳动者加成服务费
    private String userFee;

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setDealerFee(String dealerFee) {
        this.dealerFee = dealerFee;
    }

    public String getDealerFee() {
        return dealerFee;
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

    @Override
    public String toString() {
        return "WalletIncomeCancelFeeInfo{" +
                " totalFee='" + totalFee + '\'' +
                ", dealerFee='" + dealerFee + '\'' +
                ", dealerDeductFee='" + dealerDeductFee + '\'' +
                ", dealerPayableFee='" + dealerPayableFee + '\'' +
                ", userFee='" + userFee + '\'' +
               "}";
    }
}
