package com.yunzhanghu.sdk.dataservice.domain;

// 月订单汇总详情
public class MonthlyOrderSummary {
    
    // 订单数量
    private int orderNum;
    
    // 订单金额
    private String pay;
    
    // 应收综合服务主体加成服务费金额
    private String brokerFee;
    
    // 应收余额账户支出加成服务费金额
    private String brokerRealFee;
    
    // 应收加成服务费抵扣金额
    private String brokerRebateFee;
    
    // 应收用户加成服务费金额
    private String userFee;
    
    // 实收综合服务主体加成服务费金额
    private String receivedBrokerFee;
    
    // 实收余额账户支出加成服务费金额
    private String receivedBrokerRealFee;
    
    // 实收加成服务费抵扣金额
    private String receivedBrokerDeductFee;
    
    // 实收用户加成服务费金额
    private String receivedUserFee;

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

    public void setReceivedBrokerFee(String receivedBrokerFee) {
        this.receivedBrokerFee = receivedBrokerFee;
    }

    public String getReceivedBrokerFee() {
        return receivedBrokerFee;
    }

    public void setReceivedBrokerRealFee(String receivedBrokerRealFee) {
        this.receivedBrokerRealFee = receivedBrokerRealFee;
    }

    public String getReceivedBrokerRealFee() {
        return receivedBrokerRealFee;
    }

    public void setReceivedBrokerDeductFee(String receivedBrokerDeductFee) {
        this.receivedBrokerDeductFee = receivedBrokerDeductFee;
    }

    public String getReceivedBrokerDeductFee() {
        return receivedBrokerDeductFee;
    }

    public void setReceivedUserFee(String receivedUserFee) {
        this.receivedUserFee = receivedUserFee;
    }

    public String getReceivedUserFee() {
        return receivedUserFee;
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
                ", receivedBrokerFee='" + receivedBrokerFee + '\'' + 
                ", receivedBrokerRealFee='" + receivedBrokerRealFee + '\'' + 
                ", receivedBrokerDeductFee='" + receivedBrokerDeductFee + '\'' + 
                ", receivedUserFee='" + receivedUserFee + '\'' + 
               "}";
    }
}