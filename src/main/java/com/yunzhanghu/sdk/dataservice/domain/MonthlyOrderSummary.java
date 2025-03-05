package com.yunzhanghu.sdk.dataservice.domain;

// 月订单汇总详情
public class MonthlyOrderSummary {
    
    // 订单数量
    private int orderNum;
    
    // 订单金额
    private String pay;
    
    // 加成服务费金额
    private String brokerFee;
    
    // 加成服务费实收金额
    private String brokerRealFee;
    
    // 已抵扣加成服务费金额
    private String brokerRebateFee;
    
    // 用户加成服务费金额
    private String userFee;

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }

    public void setBrokerFee(String brokerFee) {
        this.brokerFee = brokerFee;
    }

    public String getBrokerFee() {
        return brokerFee;
    }

    public void setBrokerRealFee(String brokerRealFee) {
        this.brokerRealFee = brokerRealFee;
    }

    public String getBrokerRealFee() {
        return brokerRealFee;
    }

    public void setBrokerRebateFee(String brokerRebateFee) {
        this.brokerRebateFee = brokerRebateFee;
    }

    public String getBrokerRebateFee() {
        return brokerRebateFee;
    }

    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    public String getUserFee() {
        return userFee;
    }

    @Override
    public String toString() {
        return "MonthlyOrderSummary{" +
                " orderNum='" + orderNum + '\'' + 
                ", pay='" + pay + '\'' + 
                ", brokerFee='" + brokerFee + '\'' + 
                ", brokerRealFee='" + brokerRealFee + '\'' + 
                ", brokerRebateFee='" + brokerRebateFee + '\'' + 
                ", userFee='" + userFee + '\'' + 
               "}";
    }
}