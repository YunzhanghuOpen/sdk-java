package com.yunzhanghu.sdk.payment.domain;

// 用户结算金额校验请求
public class CheckUserAmountRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 姓名
    private String realName;
    
    // 身份证号码
    private String idCard;
    
    // 校验金额
    private String amount;

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

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "CheckUserAmountRequest{" +
                " brokerId='" + brokerId + '\'' + 
                ", realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", amount='" + amount + '\'' + 
               "}";
    }
}