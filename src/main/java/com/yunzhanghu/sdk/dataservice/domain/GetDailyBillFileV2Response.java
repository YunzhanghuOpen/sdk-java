package com.yunzhanghu.sdk.dataservice.domain;



// 查询日流水文件返回
public class GetDailyBillFileV2Response {
    
    // 下载地址
    private String billDownloadUrl;

    public void setBillDownloadUrl(String billDownloadUrl) {
        this.billDownloadUrl = billDownloadUrl;
    }

    public String getBillDownloadUrl() {
        return billDownloadUrl;
    }

    @Override
    public String toString() {
        return "GetDailyBillFileV2Response{" +
             " billDownloadUrl='" + billDownloadUrl + '\'' + 
           '}';
    }
}