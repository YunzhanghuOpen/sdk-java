package com.yunzhanghu.sdk.payment.domain;

// 劳动者退款订单回调通知数据
public class NotifyLaborRefundOrderData {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 综合服务平台流水号
    private String ref;

    // 退款流水号
    private String refundRef;

    // 平台企业订单号
    private String orderId;

    // 姓名
    private String realName;

    // 账号
    private String cardNo;

    // 身份证号码
    private String idCard;

    // 手机号
    private String phoneNo;

    // 退款类型
    private String refundType;

    // 退款总金额
    private String refundTotalAmount;

    // 退回劳动者实收金额
    private String refundUserRealAmount;

    // 是否退加成服务费
    private String isRefundFee;

    // 退回劳动者加成服务费金额
    private String refundUserFee;

    // 退回平台企业加成服务费金额
    private String refundBrokerFee;

    // 退回平台企业服务费实收金额
    private String refundRealFee;

    // 退回平台企业服务费抵扣金额
    private String refundDeductFee;

    // 是否退税费
    private String isRefundTax;

    // 退回税费总额
    private String refundTaxAmount;

    // 退回个税金额
    private String refundPersonalTax;

    // 退回增值税金额
    private String refundValueAddedTax;

    // 退回附加税金额
    private String refundAdditionalTax;

    // 退回已追缴个税
    private String refundLaborRecoveryPersonalTax;

    // 退回已追缴增附税
    private String refundLaborRecoveryAddedTax;

    // 退回劳动者个税金额
    private String refundUserPersonalTax;

    // 退回劳动者增值税金额
    private String refundUserValueAddedTax;

    // 退回劳动者附加税金额
    private String refundUserAdditionalTax;

    // 退回平台企业个税金额
    private String refundDealerPersonalTax;

    // 退回平台企业增值税金额
    private String refundDealerValueAddedTax;

    // 退回平台企业附加税金额
    private String refundDealerAdditionalTax;

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRefundRef(String refundRef) {
        this.refundRef = refundRef;
    }

    public String getRefundRef() {
        return refundRef;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundTotalAmount(String refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }

    public String getRefundTotalAmount() {
        return refundTotalAmount;
    }

    public void setRefundUserRealAmount(String refundUserRealAmount) {
        this.refundUserRealAmount = refundUserRealAmount;
    }

    public String getRefundUserRealAmount() {
        return refundUserRealAmount;
    }

    public void setIsRefundFee(String isRefundFee) {
        this.isRefundFee = isRefundFee;
    }

    public String getIsRefundFee() {
        return isRefundFee;
    }

    public void setRefundUserFee(String refundUserFee) {
        this.refundUserFee = refundUserFee;
    }

    public String getRefundUserFee() {
        return refundUserFee;
    }

    public void setRefundBrokerFee(String refundBrokerFee) {
        this.refundBrokerFee = refundBrokerFee;
    }

    public String getRefundBrokerFee() {
        return refundBrokerFee;
    }

    public void setRefundRealFee(String refundRealFee) {
        this.refundRealFee = refundRealFee;
    }

    public String getRefundRealFee() {
        return refundRealFee;
    }

    public void setRefundDeductFee(String refundDeductFee) {
        this.refundDeductFee = refundDeductFee;
    }

    public String getRefundDeductFee() {
        return refundDeductFee;
    }

    public void setIsRefundTax(String isRefundTax) {
        this.isRefundTax = isRefundTax;
    }

    public String getIsRefundTax() {
        return isRefundTax;
    }

    public void setRefundTaxAmount(String refundTaxAmount) {
        this.refundTaxAmount = refundTaxAmount;
    }

    public String getRefundTaxAmount() {
        return refundTaxAmount;
    }

    public void setRefundPersonalTax(String refundPersonalTax) {
        this.refundPersonalTax = refundPersonalTax;
    }

    public String getRefundPersonalTax() {
        return refundPersonalTax;
    }

    public void setRefundValueAddedTax(String refundValueAddedTax) {
        this.refundValueAddedTax = refundValueAddedTax;
    }

    public String getRefundValueAddedTax() {
        return refundValueAddedTax;
    }

    public void setRefundAdditionalTax(String refundAdditionalTax) {
        this.refundAdditionalTax = refundAdditionalTax;
    }

    public String getRefundAdditionalTax() {
        return refundAdditionalTax;
    }

    public void setRefundLaborRecoveryPersonalTax(String refundLaborRecoveryPersonalTax) {
        this.refundLaborRecoveryPersonalTax = refundLaborRecoveryPersonalTax;
    }

    public String getRefundLaborRecoveryPersonalTax() {
        return refundLaborRecoveryPersonalTax;
    }

    public void setRefundLaborRecoveryAddedTax(String refundLaborRecoveryAddedTax) {
        this.refundLaborRecoveryAddedTax = refundLaborRecoveryAddedTax;
    }

    public String getRefundLaborRecoveryAddedTax() {
        return refundLaborRecoveryAddedTax;
    }

    public void setRefundUserPersonalTax(String refundUserPersonalTax) {
        this.refundUserPersonalTax = refundUserPersonalTax;
    }

    public String getRefundUserPersonalTax() {
        return refundUserPersonalTax;
    }

    public void setRefundUserValueAddedTax(String refundUserValueAddedTax) {
        this.refundUserValueAddedTax = refundUserValueAddedTax;
    }

    public String getRefundUserValueAddedTax() {
        return refundUserValueAddedTax;
    }

    public void setRefundUserAdditionalTax(String refundUserAdditionalTax) {
        this.refundUserAdditionalTax = refundUserAdditionalTax;
    }

    public String getRefundUserAdditionalTax() {
        return refundUserAdditionalTax;
    }

    public void setRefundDealerPersonalTax(String refundDealerPersonalTax) {
        this.refundDealerPersonalTax = refundDealerPersonalTax;
    }

    public String getRefundDealerPersonalTax() {
        return refundDealerPersonalTax;
    }

    public void setRefundDealerValueAddedTax(String refundDealerValueAddedTax) {
        this.refundDealerValueAddedTax = refundDealerValueAddedTax;
    }

    public String getRefundDealerValueAddedTax() {
        return refundDealerValueAddedTax;
    }

    public void setRefundDealerAdditionalTax(String refundDealerAdditionalTax) {
        this.refundDealerAdditionalTax = refundDealerAdditionalTax;
    }

    public String getRefundDealerAdditionalTax() {
        return refundDealerAdditionalTax;
    }

    @Override
    public String toString() {
        return "NotifyLaborRefundOrderData{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", ref='" + ref + '\'' +
                ", refundRef='" + refundRef + '\'' +
                ", orderId='" + orderId + '\'' +
                ", realName='" + realName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", refundType='" + refundType + '\'' +
                ", refundTotalAmount='" + refundTotalAmount + '\'' +
                ", refundUserRealAmount='" + refundUserRealAmount + '\'' +
                ", isRefundFee='" + isRefundFee + '\'' +
                ", refundUserFee='" + refundUserFee + '\'' +
                ", refundBrokerFee='" + refundBrokerFee + '\'' +
                ", refundRealFee='" + refundRealFee + '\'' +
                ", refundDeductFee='" + refundDeductFee + '\'' +
                ", isRefundTax='" + isRefundTax + '\'' +
                ", refundTaxAmount='" + refundTaxAmount + '\'' +
                ", refundPersonalTax='" + refundPersonalTax + '\'' +
                ", refundValueAddedTax='" + refundValueAddedTax + '\'' +
                ", refundAdditionalTax='" + refundAdditionalTax + '\'' +
                ", refundLaborRecoveryPersonalTax='" + refundLaborRecoveryPersonalTax + '\'' +
                ", refundLaborRecoveryAddedTax='" + refundLaborRecoveryAddedTax + '\'' +
                ", refundUserPersonalTax='" + refundUserPersonalTax + '\'' +
                ", refundUserValueAddedTax='" + refundUserValueAddedTax + '\'' +
                ", refundUserAdditionalTax='" + refundUserAdditionalTax + '\'' +
                ", refundDealerPersonalTax='" + refundDealerPersonalTax + '\'' +
                ", refundDealerValueAddedTax='" + refundDealerValueAddedTax + '\'' +
                ", refundDealerAdditionalTax='" + refundDealerAdditionalTax + '\'' +
               "}";
    }
}
