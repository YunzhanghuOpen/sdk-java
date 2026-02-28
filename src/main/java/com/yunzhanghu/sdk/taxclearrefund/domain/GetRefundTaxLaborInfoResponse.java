package com.yunzhanghu.sdk.taxclearrefund.domain;

// 查询税费退补涉及劳动者返回
public class GetRefundTaxLaborInfoResponse {
    
    // 税款所属期
    private String taxMonth;
    
    // 批次号
    private String batchId;
    
    // 批次生成时间
    private String batchCreateTime;
    
    // 退补税劳动者数量
    private String laborNum;
    
    // 退补税订单数量
    private String orderNum;
    
    // 总数据条数
    private String totalNum;
    
    // 退补税劳动者明细
    private LaborRefundInfo[] laborRefundInfo;

    public void setTaxMonth(String taxMonth) {
        this.taxMonth = taxMonth;
    }

    public String getTaxMonth() {
        return taxMonth;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchCreateTime(String batchCreateTime) {
        this.batchCreateTime = batchCreateTime;
    }

    public String getBatchCreateTime() {
        return batchCreateTime;
    }

    public void setLaborNum(String laborNum) {
        this.laborNum = laborNum;
    }

    public String getLaborNum() {
        return laborNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setLaborRefundInfo(LaborRefundInfo[] laborRefundInfo) {
        this.laborRefundInfo = laborRefundInfo;
    }

    public LaborRefundInfo[] getLaborRefundInfo() {
        return laborRefundInfo;
    }

    @Override
    public String toString() {
        return "GetRefundTaxLaborInfoResponse{" +
                " taxMonth='" + taxMonth + '\'' + 
                ", batchId='" + batchId + '\'' + 
                ", batchCreateTime='" + batchCreateTime + '\'' + 
                ", laborNum='" + laborNum + '\'' + 
                ", orderNum='" + orderNum + '\'' + 
                ", totalNum='" + totalNum + '\'' + 
                ", laborRefundInfo='" + laborRefundInfo + '\'' + 
               "}";
    }
}