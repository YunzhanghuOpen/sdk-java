package com.yunzhanghu.sdk.dataservice.domain;




// 平台企业预付业务服务费记录返回
public class ListDealerRechargeRecordV2Response {
    
    // 预付业务服务费记录
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