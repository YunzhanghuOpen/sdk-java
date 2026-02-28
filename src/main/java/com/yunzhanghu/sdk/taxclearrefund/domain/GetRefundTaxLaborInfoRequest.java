package com.yunzhanghu.sdk.taxclearrefund.domain;

// 查询税费退补涉及劳动者请求
public class GetRefundTaxLaborInfoRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 批次号
    private String batchId;
    
    // 税款所属期
    private String taxMonth;
    
    // 偏移量
    private int offset;
    
    // 每页返回条数
    private int length;

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

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setTaxMonth(String taxMonth) {
        this.taxMonth = taxMonth;
    }

    public String getTaxMonth() {
        return taxMonth;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "GetRefundTaxLaborInfoRequest{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", batchId='" + batchId + '\'' + 
                ", taxMonth='" + taxMonth + '\'' + 
                ", offset='" + offset + '\'' + 
                ", length='" + length + '\'' + 
               "}";
    }
}