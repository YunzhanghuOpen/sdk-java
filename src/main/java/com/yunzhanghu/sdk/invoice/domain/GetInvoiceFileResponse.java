package com.yunzhanghu.sdk.invoice.domain;




// 下载 PDF 版发票返回
public class GetInvoiceFileResponse {
    
    // 下载地址
    private String url;
    
    // 文件名称
    private String name;
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "GetInvoiceFileResponse{" +
             " url='" + url + '\'' + 
             ", name='" + name + '\'' + 
              '}';
    }
}