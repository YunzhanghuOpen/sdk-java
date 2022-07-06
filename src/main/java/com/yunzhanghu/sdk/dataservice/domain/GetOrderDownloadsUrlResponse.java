package com.yunzhanghu.sdk.dataservice.domain;




// 查询日订单文件响应
public class GetOrderDownloadsUrlResponse {
    
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
        return "GetOrderDownloadsUrlResponse{" +
                ", orderDownloadUrl='" + orderDownloadUrl + '\'' +
                '}';
    }
}