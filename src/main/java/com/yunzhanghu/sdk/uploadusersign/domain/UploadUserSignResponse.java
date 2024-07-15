package com.yunzhanghu.sdk.uploadusersign.domain;

// 用户签约信息上传返回
public class UploadUserSignResponse {
    
    // 上传状态
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "UploadUserSignResponse{" +
                " status='" + status + '\'' +
               "}";
    }
}