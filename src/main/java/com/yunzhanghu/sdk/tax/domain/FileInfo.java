package com.yunzhanghu.sdk.tax.domain;

// 报税文件详情
public class FileInfo {
    
    // 文件名称
    private String name;
    
    // 下载文件临时 URL
    private String url;
    
    // 文件解压缩密码
    private String pwd;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
             " name='" + name + '\'' + 
             ", url='" + url + '\'' + 
             ", pwd='" + pwd + '\'' + 
           '}';
    }
}