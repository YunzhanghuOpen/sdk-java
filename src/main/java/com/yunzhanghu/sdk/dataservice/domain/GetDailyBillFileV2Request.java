package com.yunzhanghu.sdk.dataservice.domain;




// 查询日流水文件请求
public class GetDailyBillFileV2Request {
    
    // 所需获取的日流水日期，格式：yyyy-MM-dd
    private String billDate;
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillDate() {
        return billDate;
    }


    @Override
    public String toString() {
        return "GetDailyBillFileV2Request{" +
                ", billDate='" + billDate + '\'' +
                '}';
    }
}