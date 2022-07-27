package com.yunzhanghu.sdk.tax.domain;




// 下载个税扣缴明细表返回
public class GetTaxFileResponse {
    
    // 文件详情
    private FileInfo[] fileInfo;
    public void setFileInfo(FileInfo[] fileInfo) {
        this.fileInfo = fileInfo;
    }

    public FileInfo[] getFileInfo() {
        return fileInfo;
    }


    @Override
    public String toString() {
        return "GetTaxFileResponse{" +
                ", fileInfo='" + fileInfo + '\'' +
                '}';
    }
}