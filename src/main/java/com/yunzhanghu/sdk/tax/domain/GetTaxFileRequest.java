package com.yunzhanghu.sdk.tax.domain;

// 下载个人所得税申报明细表请求
public class GetTaxFileRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 平台企业签约主体
    private String entId;
    
    // 所属期
    private String yearMonth;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getEntId() {
        return entId;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    @Override
    public String toString() {
        return "GetTaxFileRequest{" +
                " dealerId='" + dealerId + '\'' + 
                ", entId='" + entId + '\'' + 
                ", yearMonth='" + yearMonth + '\'' + 
               "}";
    }
}