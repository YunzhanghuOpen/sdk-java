package com.yunzhanghu.sdk.dataservice.domain;




// 查询日流水数据请求
public class ListDailyBillRequest {
    
    // 流水查询日期
    private String billDate;
    
    // 偏移量
    private int offset;
    
    // 长度
    private int length;
    
    // 如果为encryption，则对返回的data进行加密
    private String dataType;
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillDate() {
        return billDate;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }


    @Override
    public String toString() {
        return "ListDailyBillRequest{" +
                ", billDate='" + billDate + '\'' +
                ", offset='" + offset + '\'' +
                ", length='" + length + '\'' +
                ", dataType='" + dataType + '\'' +
                '}';
    }
}