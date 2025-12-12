package com.yunzhanghu.sdk.taxclearrefund.domain;

// 查询税费清缴明细文件返回
public class GetClearTaxFileResponse {
    
    // 下载地址
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "GetClearTaxFileResponse{" +
                " url='" + url + '\'' + 
               "}";
    }
}