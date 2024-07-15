package com.yunzhanghu.sdk.dataservice.domain;

// 余额账单信息详情
public class StatementDetail {
    
    // 账单 ID
    private String statementId;
    
    // 账单日期
    private String statementDate;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 综合服务主体名称
    private String brokerProductName;
    
    // 平台企业名称
    private String dealerProductName;
    
    // 业务类型
    private String bizType;
    
    // 账单金额
    private String totalMoney;
    
    // 订单金额
    private String amount;
    
    // 退汇金额
    private String reexAmount;
    
    // 加成服务费金额
    private String feeAmount;
    
    // 加成服务费抵扣金额
    private String deductRebateFeeAmount;
    
    // 冲补金额
    private String moneyAdjust;
    
    // 账单状态
    private String status;
    
    // 开票状态
    private String invoiceStatus;
    
    // 项目 ID
    private String projectId;
    
    // 项目名称
    private String projectName;

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getStatementId() {
        return statementId;
    }

    public void setStatementDate(String statementDate) {
        this.statementDate = statementDate;
    }

    public String getStatementDate() {
        return statementDate;
    }

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

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getBizType() {
        return bizType;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setReexAmount(String reexAmount) {
        this.reexAmount = reexAmount;
    }

    public String getReexAmount() {
        return reexAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setDeductRebateFeeAmount(String deductRebateFeeAmount) {
        this.deductRebateFeeAmount = deductRebateFeeAmount;
    }

    public String getDeductRebateFeeAmount() {
        return deductRebateFeeAmount;
    }

    public void setMoneyAdjust(String moneyAdjust) {
        this.moneyAdjust = moneyAdjust;
    }

    public String getMoneyAdjust() {
        return moneyAdjust;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public String toString() {
        return "StatementDetail{" +
                " statementId='" + statementId + '\'' + 
                ", statementDate='" + statementDate + '\'' + 
                ", brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", brokerProductName='" + brokerProductName + '\'' + 
                ", dealerProductName='" + dealerProductName + '\'' + 
                ", bizType='" + bizType + '\'' + 
                ", totalMoney='" + totalMoney + '\'' + 
                ", amount='" + amount + '\'' + 
                ", reexAmount='" + reexAmount + '\'' + 
                ", feeAmount='" + feeAmount + '\'' + 
                ", deductRebateFeeAmount='" + deductRebateFeeAmount + '\'' + 
                ", moneyAdjust='" + moneyAdjust + '\'' + 
                ", status='" + status + '\'' + 
                ", invoiceStatus='" + invoiceStatus + '\'' + 
                ", projectId='" + projectId + '\'' + 
                ", projectName='" + projectName + '\'' + 
               "}";
    }
}