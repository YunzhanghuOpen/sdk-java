package com.yunzhanghu.sdk.payment.domain;




// 查询电子回单返回
public class GetEleReceiptFileResponse {
    
    // 链接失效时间
    private String expireTime;
    
    // 回单名
    private String fileName;
    
    // 下载链接
    private String url;
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getExpireTime() {
        return expireTime;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        return "GetEleReceiptFileResponse{" +
                ", expireTime='" + expireTime + '\'' +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}