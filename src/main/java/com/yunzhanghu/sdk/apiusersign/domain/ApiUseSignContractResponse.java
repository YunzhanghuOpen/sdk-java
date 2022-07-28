package com.yunzhanghu.sdk.apiusersign.domain;




// 获取协议预览 URL 返回
public class ApiUseSignContractResponse {
    
    // 预览跳转 URL
    private String url;
    
    // 协议名称
    private String title;
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "ApiUseSignContractResponse{" +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}