package com.yunzhanghu.sdk.calculatelabor.domain;

// 订单税费试算返回
public class CalcTaxResponse {

    // 测算金额
    private String pay;

    // 税费总额
    private String tax;

    // 税后结算金额
    private String afterTaxAmount;

    // 缴税明细
    private CalcTaxDetail taxDetail;

    // 税前订单金额
    private String beforeTaxAmount;

    // 用户税费总额
    private String userTax;

    // 平台企业税费总额
    private String dealerTax;

    // 云账户税费总额
    private String brokerTax;

    // 用户服务费
    private String userFee;

    // 结果
    private String status;

    // 结果详细状态码
    private String statusDetail;

    // 结果说明
    private String statusMessage;

    // 结果详细状态码描述
    private String statusDetailMessage;

    // 用户实收金额（未扣除追缴的增附税）
    private String userRealExcludingVatAmount;

    // 用户还未缴清的增附税
    private String userRemainingRepaymentAmount;

    // 已追缴增附税（本笔订单）
    private String userRecoverTaxAmount;

    // 待追缴增附税总金额
    private String userTotalRecoverTaxAmount;

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTax() {
        return tax;
    }

    public void setAfterTaxAmount(String afterTaxAmount) {
        this.afterTaxAmount = afterTaxAmount;
    }

    public String getAfterTaxAmount() {
        return afterTaxAmount;
    }

    public void setTaxDetail(CalcTaxDetail taxDetail) {
        this.taxDetail = taxDetail;
    }

    public CalcTaxDetail getTaxDetail() {
        return taxDetail;
    }

    public void setBeforeTaxAmount(String beforeTaxAmount) {
        this.beforeTaxAmount = beforeTaxAmount;
    }

    public String getBeforeTaxAmount() {
        return beforeTaxAmount;
    }

    public void setUserTax(String userTax) {
        this.userTax = userTax;
    }

    public String getUserTax() {
        return userTax;
    }

    public void setDealerTax(String dealerTax) {
        this.dealerTax = dealerTax;
    }

    public String getDealerTax() {
        return dealerTax;
    }

    public void setBrokerTax(String brokerTax) {
        this.brokerTax = brokerTax;
    }

    public String getBrokerTax() {
        return brokerTax;
    }

    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    public String getUserFee() {
        return userFee;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusDetailMessage(String statusDetailMessage) {
        this.statusDetailMessage = statusDetailMessage;
    }

    public String getStatusDetailMessage() {
        return statusDetailMessage;
    }

    public void setUserRealExcludingVatAmount(String userRealExcludingVatAmount) {
        this.userRealExcludingVatAmount = userRealExcludingVatAmount;
    }

    public String getUserRealExcludingVatAmount() {
        return userRealExcludingVatAmount;
    }

    public void setUserRemainingRepaymentAmount(String userRemainingRepaymentAmount) {
        this.userRemainingRepaymentAmount = userRemainingRepaymentAmount;
    }

    public String getUserRemainingRepaymentAmount() {
        return userRemainingRepaymentAmount;
    }

    public void setUserRecoverTaxAmount(String userRecoverTaxAmount) {
        this.userRecoverTaxAmount = userRecoverTaxAmount;
    }

    public String getUserRecoverTaxAmount() {
        return userRecoverTaxAmount;
    }

    public void setUserTotalRecoverTaxAmount(String userTotalRecoverTaxAmount) {
        this.userTotalRecoverTaxAmount = userTotalRecoverTaxAmount;
    }

    public String getUserTotalRecoverTaxAmount() {
        return userTotalRecoverTaxAmount;
    }

    @Override
    public String toString() {
        return "CalcTaxResponse{" +
                " pay='" + pay + '\'' +
                ", tax='" + tax + '\'' +
                ", afterTaxAmount='" + afterTaxAmount + '\'' +
                ", taxDetail='" + taxDetail + '\'' +
                ", beforeTaxAmount='" + beforeTaxAmount + '\'' +
                ", userTax='" + userTax + '\'' +
                ", dealerTax='" + dealerTax + '\'' +
                ", brokerTax='" + brokerTax + '\'' +
                ", userFee='" + userFee + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", userRealExcludingVatAmount='" + userRealExcludingVatAmount + '\'' +
                ", userRemainingRepaymentAmount='" + userRemainingRepaymentAmount + '\'' +
                ", userRecoverTaxAmount='" + userRecoverTaxAmount + '\'' +
                ", userTotalRecoverTaxAmount='" + userTotalRecoverTaxAmount + '\'' +
                "}";
    }
}