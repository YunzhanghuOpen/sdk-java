package com.yunzhanghu.sdk.taxclearrefund.domain;

// 连续劳务税费退补完成数据
public class RefundTaxData {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 清缴次数
    private String taxClearNum;
    
    // 报税属期
    private String taxMonth;
    
    // 退补税用户数量
    private String refundTaxLaborNum;
    
    // 退补税订单数量
    private String refundTaxOrderNum;
    
    // 订单总金额
    private String totalAmount;
    
    // 本批次退补税费总额
    private String curTotalRefundTax;
    
    // 退补税费总额
    private String totalRefundTax;
    
    // 历史已退补税费总额
    private String historyRefundTax;
    
    // 本批次预扣税费总额
    private String totalTax;
    
    // 本批次实缴税费总额
    private String receiveTotalTax;
    
    // 本批次退补给用户税费总额
    private String curTotalRefundLaborTax;
    
    // 本批次退补给平台企业税费总额
    private String curTotalRefundDealerTax;
    
    // 本批次退补给云账户税费总额
    private String curTotalRefundBrokerTax;
    
    // 批次号
    private String batchId;
    
    // 批次退补税状态
    private String batchRefundTaxStatus;
    
    // 批次生成时间
    private String batchCreateTime;
    
    // 批次退补税成功时间
    private String batchRefundTaxFinishedTime;
    
    // 已完成税费退补的用户数量
    private String refundTaxFinishedLaborNum;
    
    // 已完成的税费退补总额
    private String refundTaxFinishedAmount;

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

    public void setTaxClearNum(String taxClearNum) {
        this.taxClearNum = taxClearNum;
    }

    public String getTaxClearNum() {
        return taxClearNum;
    }

    public void setTaxMonth(String taxMonth) {
        this.taxMonth = taxMonth;
    }

    public String getTaxMonth() {
        return taxMonth;
    }

    public void setRefundTaxLaborNum(String refundTaxLaborNum) {
        this.refundTaxLaborNum = refundTaxLaborNum;
    }

    public String getRefundTaxLaborNum() {
        return refundTaxLaborNum;
    }

    public void setRefundTaxOrderNum(String refundTaxOrderNum) {
        this.refundTaxOrderNum = refundTaxOrderNum;
    }

    public String getRefundTaxOrderNum() {
        return refundTaxOrderNum;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setCurTotalRefundTax(String curTotalRefundTax) {
        this.curTotalRefundTax = curTotalRefundTax;
    }

    public String getCurTotalRefundTax() {
        return curTotalRefundTax;
    }

    public void setTotalRefundTax(String totalRefundTax) {
        this.totalRefundTax = totalRefundTax;
    }

    public String getTotalRefundTax() {
        return totalRefundTax;
    }

    public void setHistoryRefundTax(String historyRefundTax) {
        this.historyRefundTax = historyRefundTax;
    }

    public String getHistoryRefundTax() {
        return historyRefundTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setReceiveTotalTax(String receiveTotalTax) {
        this.receiveTotalTax = receiveTotalTax;
    }

    public String getReceiveTotalTax() {
        return receiveTotalTax;
    }

    public void setCurTotalRefundLaborTax(String curTotalRefundLaborTax) {
        this.curTotalRefundLaborTax = curTotalRefundLaborTax;
    }

    public String getCurTotalRefundLaborTax() {
        return curTotalRefundLaborTax;
    }

    public void setCurTotalRefundDealerTax(String curTotalRefundDealerTax) {
        this.curTotalRefundDealerTax = curTotalRefundDealerTax;
    }

    public String getCurTotalRefundDealerTax() {
        return curTotalRefundDealerTax;
    }

    public void setCurTotalRefundBrokerTax(String curTotalRefundBrokerTax) {
        this.curTotalRefundBrokerTax = curTotalRefundBrokerTax;
    }

    public String getCurTotalRefundBrokerTax() {
        return curTotalRefundBrokerTax;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchRefundTaxStatus(String batchRefundTaxStatus) {
        this.batchRefundTaxStatus = batchRefundTaxStatus;
    }

    public String getBatchRefundTaxStatus() {
        return batchRefundTaxStatus;
    }

    public void setBatchCreateTime(String batchCreateTime) {
        this.batchCreateTime = batchCreateTime;
    }

    public String getBatchCreateTime() {
        return batchCreateTime;
    }

    public void setBatchRefundTaxFinishedTime(String batchRefundTaxFinishedTime) {
        this.batchRefundTaxFinishedTime = batchRefundTaxFinishedTime;
    }

    public String getBatchRefundTaxFinishedTime() {
        return batchRefundTaxFinishedTime;
    }

    public void setRefundTaxFinishedLaborNum(String refundTaxFinishedLaborNum) {
        this.refundTaxFinishedLaborNum = refundTaxFinishedLaborNum;
    }

    public String getRefundTaxFinishedLaborNum() {
        return refundTaxFinishedLaborNum;
    }

    public void setRefundTaxFinishedAmount(String refundTaxFinishedAmount) {
        this.refundTaxFinishedAmount = refundTaxFinishedAmount;
    }

    public String getRefundTaxFinishedAmount() {
        return refundTaxFinishedAmount;
    }

    @Override
    public String toString() {
        return "RefundTaxData{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", taxClearNum='" + taxClearNum + '\'' + 
                ", taxMonth='" + taxMonth + '\'' + 
                ", refundTaxLaborNum='" + refundTaxLaborNum + '\'' + 
                ", refundTaxOrderNum='" + refundTaxOrderNum + '\'' + 
                ", totalAmount='" + totalAmount + '\'' + 
                ", curTotalRefundTax='" + curTotalRefundTax + '\'' + 
                ", totalRefundTax='" + totalRefundTax + '\'' + 
                ", historyRefundTax='" + historyRefundTax + '\'' + 
                ", totalTax='" + totalTax + '\'' + 
                ", receiveTotalTax='" + receiveTotalTax + '\'' + 
                ", curTotalRefundLaborTax='" + curTotalRefundLaborTax + '\'' + 
                ", curTotalRefundDealerTax='" + curTotalRefundDealerTax + '\'' + 
                ", curTotalRefundBrokerTax='" + curTotalRefundBrokerTax + '\'' + 
                ", batchId='" + batchId + '\'' + 
                ", batchRefundTaxStatus='" + batchRefundTaxStatus + '\'' + 
                ", batchCreateTime='" + batchCreateTime + '\'' + 
                ", batchRefundTaxFinishedTime='" + batchRefundTaxFinishedTime + '\'' + 
                ", refundTaxFinishedLaborNum='" + refundTaxFinishedLaborNum + '\'' + 
                ", refundTaxFinishedAmount='" + refundTaxFinishedAmount + '\'' + 
               "}";
    }
}