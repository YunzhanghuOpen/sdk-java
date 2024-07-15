package com.yunzhanghu.sdk.payment.domain;

// 批次下单返回
public class CreateBatchOrderResponse {
    
    // 平台企业批次号
    private String batchId;
    
    // 订单结果列表
    private BatchOrderResult[] resultList;

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setResultList(BatchOrderResult[] resultList) {
        this.resultList = resultList;
    }

    public BatchOrderResult[] getResultList() {
        return resultList;
    }

    @Override
    public String toString() {
        return "CreateBatchOrderResponse{" +
             " batchId='" + batchId + '\'' + 
             ", resultList='" + resultList + '\'' + 
           '}';
    }
}