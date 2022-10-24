package com.yunzhanghu.sdk.payment.domain;



import java.util.List;

// 批量下单返回
public class CreateBatchOrderResponse {
    
    // 平台企业批次号
    private String batchId;
    
    // 订单结果列表
    private List<BatchOrderResult> resultList;
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }
    public void setResultList(List<BatchOrderResult> resultList) {
        this.resultList = resultList;
    }

    public List<BatchOrderResult> getResultList() {
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