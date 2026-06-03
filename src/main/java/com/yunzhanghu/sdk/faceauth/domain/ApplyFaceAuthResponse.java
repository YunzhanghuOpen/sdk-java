package com.yunzhanghu.sdk.faceauth.domain;

// 申请人脸识别实名核验返回
public class ApplyFaceAuthResponse {
    
    // 人脸识别实名核验唯一 ID
    private String recordId;
    
    // 平台企业实名核验 ID
    private String verificationId;
    
    // 人脸识别实名核验 H5 页面地址
    private String verificationUrl;

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationUrl(String verificationUrl) {
        this.verificationUrl = verificationUrl;
    }

    public String getVerificationUrl() {
        return verificationUrl;
    }

    @Override
    public String toString() {
        return "ApplyFaceAuthResponse{" +
                " recordId='" + recordId + '\'' + 
                ", verificationId='" + verificationId + '\'' + 
                ", verificationUrl='" + verificationUrl + '\'' + 
               "}";
    }
}