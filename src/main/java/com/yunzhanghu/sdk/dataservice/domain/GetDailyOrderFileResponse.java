package com.yunzhanghu.sdk.dataservice.domain;




// 查询日订单文件返回
public class GetDailyOrderFileResponse {
    
    // 下载地址
    private String orderDownloadUrl;
    public void setOrderDownloadUrl(String orderDownloadUrl) {
        this.orderDownloadUrl = orderDownloadUrl;
    }

    public String getOrderDownloadUrl() {
        return orderDownloadUrl;
    }


    @Override
    public String toString() {
        return "GetDailyOrderFileResponse{" +
                ", orderDownloadUrl='" + orderDownloadUrl + '\'' +
                '}';
    }
}