package com.yunzhanghu.sdk.dataservice.domain;




// 流水详情
public class DealerBillInfo {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业订单号
    private String orderId;
    
    // 资金流水号
    private String ref;
    
    // 综合服务主体名称
    private String brokerProductName;
    
    // 平台企业名称
    private String dealerProductName;
    
    // 业务订单流水号
    private String bizRef;
    
    // 账户类型
    private String acctType;
    
    // 入账金额
    private String amount;
    
    // 账户余额
    private String balance;
    
    // 业务分类
    private String businessCategory;
    
    // 业务类型
    private String businessType;
    
    // 收支类型
    private String consumptionType;
    
    // 入账时间
    private String createdAt;
    
    // 备注
    private String remark;
    
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
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
    
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
    
    public void setBrokerProductName(String brokerProductName) {
        this.brokerProductName = brokerProductName;
    }

    public String getBrokerProductName() {
        return brokerProductName;
    }
    
    public void setDealerProductName(String dealerProductName) {
        this.dealerProductName = dealerProductName;
    }

    public String getDealerProductName() {
        return dealerProductName;
    }
    
    public void setBizRef(String bizRef) {
        this.bizRef = bizRef;
    }

    public String getBizRef() {
        return bizRef;
    }
    
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctType() {
        return acctType;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
    
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return balance;
    }
    
    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }
    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }
    
    public void setConsumptionType(String consumptionType) {
        this.consumptionType = consumptionType;
    }

    public String getConsumptionType() {
        return consumptionType;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }
    
    @Override
    public String toString() {
        return "DealerBillInfo{" +
             " brokerId='" + brokerId + '\'' + 
             ", dealerId='" + dealerId + '\'' + 
             ", orderId='" + orderId + '\'' + 
             ", ref='" + ref + '\'' + 
             ", brokerProductName='" + brokerProductName + '\'' + 
             ", dealerProductName='" + dealerProductName + '\'' + 
             ", bizRef='" + bizRef + '\'' + 
             ", acctType='" + acctType + '\'' + 
             ", amount='" + amount + '\'' + 
             ", balance='" + balance + '\'' + 
             ", businessCategory='" + businessCategory + '\'' + 
             ", businessType='" + businessType + '\'' + 
             ", consumptionType='" + consumptionType + '\'' + 
             ", createdAt='" + createdAt + '\'' + 
             ", remark='" + remark + '\'' + 
              '}';
    }
}