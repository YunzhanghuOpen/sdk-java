package com.yunzhanghu.sdk.payment.domain;




// 订单回调消息
public class NotifyOrderRequest {
    
    // 平台企业订单号
    private String orderId;
    
    // 订单金额
    private String pay;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 姓名
    private String realName;
    
    // 收款人账号
    private String cardNo;
    
    // 身份证号码
    private String idCard;
    
    // 手机号
    private String phoneNo;
    
    // 订单状态码
    private String status;
    
    // 订单详细状态码
    private String statusDetail;
    
    // 订单状态码描述
    private String statusMessage;
    
    // 订单详细状态码描述
    private String statusDetailMessage;
    
    // 综合服务主体支付金额
    private String brokerAmount;
    
    // 综合服务平台流水号
    private String ref;
    
    // 支付交易流水号
    private String brokerBankBill;
    
    // 支付路径
    private String withdrawPlatform;
    
    // 订单接收时间，精确到秒
    private String createdAt;
    
    // 订单完成时间，精确到秒
    private String finishedTime;
    
    // 综合服务主体加成服务费
    private String brokerFee;
    
    // 余额账户支出加成服务费
    private String brokerRealFee;
    
    // 抵扣账户支出加成服务费
    private String brokerDeductFee;
    
    // 订单备注
    private String payRemark;
    
    // 用户加成服务费
    private String userFee;
    
    // 银行名称
    private String bankName;
    
    // 项目标识
    private String projectId;
    
    // 主播 ID，该字段已废弃
    private String anchorId;
    
    // 描述信息，该字段已废弃
    private String notes;
    
    // 系统支付金额，该字段已废弃
    private String sysAmount;
    
    // 税费，该字段已废弃
    private String tax;
    
    // 系统支付费用，该字段已废弃
    private String sysFee;
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
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
    public void setBrokerAmount(String brokerAmount) {
        this.brokerAmount = brokerAmount;
    }

    public String getBrokerAmount() {
        return brokerAmount;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
    public void setBrokerBankBill(String brokerBankBill) {
        this.brokerBankBill = brokerBankBill;
    }

    public String getBrokerBankBill() {
        return brokerBankBill;
    }
    public void setWithdrawPlatform(String withdrawPlatform) {
        this.withdrawPlatform = withdrawPlatform;
    }

    public String getWithdrawPlatform() {
        return withdrawPlatform;
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
    public void setBrokerDeductFee(String brokerDeductFee) {
        this.brokerDeductFee = brokerDeductFee;
    }

    public String getBrokerDeductFee() {
        return brokerDeductFee;
    }
    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public String getPayRemark() {
        return payRemark;
    }
    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    public String getUserFee() {
        return userFee;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setAnchorId(String anchorId) {
        this.anchorId = anchorId;
    }

    public String getAnchorId() {
        return anchorId;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }
    public void setSysAmount(String sysAmount) {
        this.sysAmount = sysAmount;
    }

    public String getSysAmount() {
        return sysAmount;
    }
    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTax() {
        return tax;
    }
    public void setSysFee(String sysFee) {
        this.sysFee = sysFee;
    }

    public String getSysFee() {
        return sysFee;
    }


    @Override
    public String toString() {
        return "NotifyOrderRequest{" +
                ", orderId='" + orderId + '\'' +
                ", pay='" + pay + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", realName='" + realName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", status='" + status + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusDetailMessage='" + statusDetailMessage + '\'' +
                ", brokerAmount='" + brokerAmount + '\'' +
                ", ref='" + ref + '\'' +
                ", brokerBankBill='" + brokerBankBill + '\'' +
                ", withdrawPlatform='" + withdrawPlatform + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", finishedTime='" + finishedTime + '\'' +
                ", brokerFee='" + brokerFee + '\'' +
                ", brokerRealFee='" + brokerRealFee + '\'' +
                ", brokerDeductFee='" + brokerDeductFee + '\'' +
                ", payRemark='" + payRemark + '\'' +
                ", userFee='" + userFee + '\'' +
                ", bankName='" + bankName + '\'' +
                ", projectId='" + projectId + '\'' +
                ", anchorId='" + anchorId + '\'' +
                ", notes='" + notes + '\'' +
                ", sysAmount='" + sysAmount + '\'' +
                ", tax='" + tax + '\'' +
                ", sysFee='" + sysFee + '\'' +
                '}';
    }
}