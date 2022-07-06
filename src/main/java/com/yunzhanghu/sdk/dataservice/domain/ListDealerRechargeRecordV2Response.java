package com.yunzhanghu.sdk.dataservice.domain;




// 商户充值记录响应
public class ListDealerRechargeRecordV2Response {
    
    // 充值记录
    private RechargeRecordInfo[] data;
    public void setData(RechargeRecordInfo[] data) {
        this.data = data;
    }

    public RechargeRecordInfo[] getData() {
        return data;
    }


    @Override
    public String toString() {
        return "ListDealerRechargeRecordV2Response{" +
                ", data='" + data + '\'' +
                '}';
    }
}