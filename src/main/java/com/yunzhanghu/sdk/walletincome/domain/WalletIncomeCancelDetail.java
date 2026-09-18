package com.yunzhanghu.sdk.walletincome.domain;

// 取消计税处理明细
public class WalletIncomeCancelDetail {

    // 服务费信息
    private WalletIncomeCancelFeeInfo feeInfo;

    // 税费信息
    private WalletIncomeCancelTaxInfo taxInfo;

    // 劳动者钱包扣减金额
    private String walletOutflowAmount;

    // 历史订单补缴税费退回金额
    private String userDebtRepaymentAmount;

    // 钱包余额信息
    private WalletIncomeWalletBalance walletBalance;

    public void setFeeInfo(WalletIncomeCancelFeeInfo feeInfo) {
        this.feeInfo = feeInfo;
    }

    public WalletIncomeCancelFeeInfo getFeeInfo() {
        return feeInfo;
    }

    public void setTaxInfo(WalletIncomeCancelTaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    public WalletIncomeCancelTaxInfo getTaxInfo() {
        return taxInfo;
    }

    public void setWalletOutflowAmount(String walletOutflowAmount) {
        this.walletOutflowAmount = walletOutflowAmount;
    }

    public String getWalletOutflowAmount() {
        return walletOutflowAmount;
    }

    public void setUserDebtRepaymentAmount(String userDebtRepaymentAmount) {
        this.userDebtRepaymentAmount = userDebtRepaymentAmount;
    }

    public String getUserDebtRepaymentAmount() {
        return userDebtRepaymentAmount;
    }

    public void setWalletBalance(WalletIncomeWalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public WalletIncomeWalletBalance getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "WalletIncomeCancelDetail{" +
                " feeInfo='" + feeInfo + '\'' +
                ", taxInfo='" + taxInfo + '\'' +
                ", walletOutflowAmount='" + walletOutflowAmount + '\'' +
                ", userDebtRepaymentAmount='" + userDebtRepaymentAmount + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
               "}";
    }
}
