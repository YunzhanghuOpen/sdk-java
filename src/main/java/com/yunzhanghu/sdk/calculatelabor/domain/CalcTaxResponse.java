package com.yunzhanghu.sdk.calculatelabor.domain;

// 订单税费试算返回
public class CalcTaxResponse {
    
    // 订单金额
    private String pay;
    
    // 税费总额
    private String tax;
    
    // 税后金额
    private String afterTaxAmount;
    
    // 税费明细
    private CalcTaxDetail taxDetail;

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

    @Override
    public String toString() {
        return "CalcTaxResponse{" +
                " pay='" + pay + '\'' + 
                ", tax='" + tax + '\'' + 
                ", afterTaxAmount='" + afterTaxAmount + '\'' + 
                ", taxDetail='" + taxDetail + '\'' + 
               "}";
    }
}