package com.yunzhanghu.sdk.tax.domain;




// 查询纳税人是否为跨集团用户请求
public class GetUserCrossRequest {
    
    // 平台企业 ID
    private String dealerId;
    
    // 年份
    private String year;
    
    // 身份证号码
    private String idCard;
    
    // 平台企业签约主体
    private String entId;
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }
    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getEntId() {
        return entId;
    }


    @Override
    public String toString() {
        return "GetUserCrossRequest{" +
                ", dealerId='" + dealerId + '\'' +
                ", year='" + year + '\'' +
                ", idCard='" + idCard + '\'' +
                ", entId='" + entId + '\'' +
                '}';
    }
}