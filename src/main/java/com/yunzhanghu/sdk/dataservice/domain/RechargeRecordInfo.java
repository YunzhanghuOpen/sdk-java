package com.yunzhanghu.sdk.dataservice.domain;




// 充值记录信息
public class RechargeRecordInfo {
    
    // 商户ID
    private String dealerId;
    
    // 综合服务主体ID
    private String brokerId;
    
    // 充值记录ID
    private String rechargeId;
    
    // 充值金额
    private String amount;
    
    // 实际到账金额
    private String actualAmount;
    
    // 创建时间
    private String createdAt;
    
    // 资金用途
    private String rechargeChannel;
    
    // 充值备注
    private String remark;
    
    // 商户付款银行账号
    private String rechargeAccountNo;
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
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getRechargeId() {
        return rechargeId;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getActualAmount() {
        return actualAmount;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setRechargeChannel(String rechargeChannel) {
        this.rechargeChannel = rechargeChannel;
    }

    public String getRechargeChannel() {
        return rechargeChannel;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }
    public void setRechargeAccountNo(String rechargeAccountNo) {
        this.rechargeAccountNo = rechargeAccountNo;
    }

    public String getRechargeAccountNo() {
        return rechargeAccountNo;
    }


    @Override
    public String toString() {
        return "RechargeRecordInfo{" +
                ", dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", rechargeId='" + rechargeId + '\'' +
                ", amount='" + amount + '\'' +
                ", actualAmount='" + actualAmount + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", rechargeChannel='" + rechargeChannel + '\'' +
                ", remark='" + remark + '\'' +
                ", rechargeAccountNo='" + rechargeAccountNo + '\'' +
                '}';
    }
}