package com.yunzhanghu.sdk.taxclearrefund.domain;

// 查询税费清缴完成结果返回
public class GetClearTaxInfoResponse {
    
    // 清缴批次列表
    private ClearTaxData[] batchList;

    public void setBatchList(ClearTaxData[] batchList) {
        this.batchList = batchList;
    }

    public ClearTaxData[] getBatchList() {
        return batchList;
    }

    @Override
    public String toString() {
        return "GetClearTaxInfoResponse{" +
                " batchList='" + batchList + '\'' + 
               "}";
    }
}