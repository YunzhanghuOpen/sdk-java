package com.yunzhanghu.sdk.dataservice.domain;

// 平台企业支付订单信息
public class DealerOrderInfo {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业订单号
    private String orderId;
    
    // 订单流水号
    private String ref;
    
    // 批次ID
    private String batchId;
    
    // 姓名
    private String realName;
    
    // 收款账号
    private String cardNo;
    
    // 综合服务主体订单金额
    private String brokerAmount;
    
    // 应收综合服务主体加成服务费金额
    private String brokerFee;
    
    // 实收综合服务主体加成服务费金额
    private String receivedBrokerFee;
    
    // 支付路径流水号
    private String bill;
    
    // 订单状态
    private String status;
    
    // 订单状态码描述
    private String statusMessage;
    
    // 订单详情
    private String statusDetail;
    
    // 订单详细状态码描述
    private String statusDetailMessage;
    
    // 订单状态补充信息
    private String supplementalDetailMessage;
    
    // 短周期授信账单号
    private String statementId;
    
    // 服务费账单号
    private String feeStatementId;
    
    // 余额账单号
    private String balStatementId;
    
    // 支付路径
    private String channel;
    
    // 创建时间
    private String createdAt;
    
    // 完成时间
    private String finishedTime;

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

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
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

    public void setBrokerAmount(String brokerAmount) {
        this.brokerAmount = brokerAmount;
    }

    public String getBrokerAmount() {
        return brokerAmount;
    }

    public void setBrokerFee(String brokerFee) {
        this.brokerFee = brokerFee;
    }

    public String getBrokerFee() {
        return brokerFee;
    }

    public void setReceivedBrokerFee(String receivedBrokerFee) {
        this.receivedBrokerFee = receivedBrokerFee;
    }

    public String getReceivedBrokerFee() {
        return receivedBrokerFee;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getBill() {
        return bill;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetailMessage(String statusDetailMessage) {
        this.statusDetailMessage = statusDetailMessage;
    }

    public String getStatusDetailMessage() {
        return statusDetailMessage;
    }

    public void setSupplementalDetailMessage(String supplementalDetailMessage) {
        this.supplementalDetailMessage = supplementalDetailMessage;
    }

    public String getSupplementalDetailMessage() {
        return supplementalDetailMessage;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getStatementId() {
        return statementId;
    }

    public void setFeeStatementId(String feeStatementId) {
        this.feeStatementId = feeStatementId;
    }

    public String getFeeStatementId() {
        return feeStatementId;
    }

    public void setBalStatementId(String balStatementId) {
        this.balStatementId = balStatementId;
    }

    public String getBalStatementId() {
        return balStatementId;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    @Override
    public String toString() {
        return "DealerOrderInfo{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", orderId='" + orderId + '\'' + 
                ", ref='" + ref + '\'' + 
                ", batchId='" + batchId + '\'' + 
                ", realName='" + realName + '\'' + 
                ", cardNo='" + cardNo + '\'' + 
                ", brokerAmount='" + brokerAmount + '\'' + 
                ", brokerFee='" + brokerFee + '\'' + 
                ", receivedBrokerFee='" + receivedBrokerFee + '\'' + 
                ", bill='" + bill + '\'' + 
                ", status='" + status + '\'' + 
                ", statusMessage='" + statusMessage + '\'' + 
                ", statusDetail='" + statusDetail + '\'' + 
                ", statusDetailMessage='" + statusDetailMessage + '\'' + 
                ", supplementalDetailMessage='" + supplementalDetailMessage + '\'' + 
                ", statementId='" + statementId + '\'' + 
                ", feeStatementId='" + feeStatementId + '\'' + 
                ", balStatementId='" + balStatementId + '\'' + 
                ", channel='" + channel + '\'' + 
                ", createdAt='" + createdAt + '\'' + 
                ", finishedTime='" + finishedTime + '\'' + 
               "}";
    }
}