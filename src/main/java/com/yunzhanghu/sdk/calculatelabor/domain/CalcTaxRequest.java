package com.yunzhanghu.sdk.calculatelabor.domain;

// 订单税费试算请求
public class CalcTaxRequest {

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

    // 姓名
    private String realName;

    // 证件号
    private String idCard;

    // 测算金额
    private String pay;

    // 测算类型
    private String taxType;

    // 税前订单金额返回值类型
    private String beforeTaxAmountType;

    // 将追缴税费纳入测算
    private int includeRecoveryAmount;

    // 将劳动者服务费纳入测算
    private int includeUserServiceFee;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setBeforeTaxAmountType(String beforeTaxAmountType) {
        this.beforeTaxAmountType = beforeTaxAmountType;
    }

    public String getBeforeTaxAmountType() {
        return beforeTaxAmountType;
    }

    public void setIncludeRecoveryAmount(int includeRecoveryAmount) {
        this.includeRecoveryAmount = includeRecoveryAmount;
    }

    public int getIncludeRecoveryAmount() {
        return includeRecoveryAmount;
    }

    public void setIncludeUserServiceFee(int includeUserServiceFee) {
        this.includeUserServiceFee = includeUserServiceFee;
    }

    public int getIncludeUserServiceFee() {
        return includeUserServiceFee;
    }

    @Override
    public String toString() {
        return "CalcTaxRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", pay='" + pay + '\'' +
                ", taxType='" + taxType + '\'' +
                ", beforeTaxAmountType='" + beforeTaxAmountType + '\'' +
                ", includeRecoveryAmount='" + includeRecoveryAmount + '\'' +
                ", includeUserServiceFee='" + includeUserServiceFee + '\'' +
                "}";
    }
}