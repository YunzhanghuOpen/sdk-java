package com.yunzhanghu.sdk.dataservice.domain;




// 平台企业预付业务服务费记录请求
public class ListDealerRechargeRecordV2Request {
    
    // 开始时间，格式：yyyy-MM-dd
    private String beginAt;
    
    // 结束时间，格式：yyyy-MM-dd
    private String endAt;
    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    public String getBeginAt() {
        return beginAt;
    }
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getEndAt() {
        return endAt;
    }


    @Override
    public String toString() {
        return "ListDealerRechargeRecordV2Request{" +
                ", beginAt='" + beginAt + '\'' +
                ", endAt='" + endAt + '\'' +
                '}';
    }
}