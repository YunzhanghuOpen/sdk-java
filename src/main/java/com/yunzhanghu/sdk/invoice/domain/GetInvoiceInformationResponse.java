package com.yunzhanghu.sdk.invoice.domain;

// 查询发票信息返回
public class GetInvoiceInformationResponse {
    
    // 发票信息
    private InformationDataInfo[] information;

    public void setInformation(InformationDataInfo[] information) {
        this.information = information;
    }

    public InformationDataInfo[] getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return "GetInvoiceInformationResponse{" +
                " information='" + information + '\'' + 
               "}";
    }
}