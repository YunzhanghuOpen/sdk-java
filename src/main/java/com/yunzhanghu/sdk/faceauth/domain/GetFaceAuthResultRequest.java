package com.yunzhanghu.sdk.faceauth.domain;

// 查询人脸识别实名核验结果请求
public class GetFaceAuthResultRequest {
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 平台企业 ID
    private String dealerId;
    
    // 人脸识别实名核验唯一 ID
    private String recordId;
    
    // 平台企业实名核验 ID
    private String verificationId;

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

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

    @Override
    public String toString() {
        return "GetFaceAuthResultRequest{" +
                " brokerId='" + brokerId + '\'' + 
                ", dealerId='" + dealerId + '\'' + 
                ", recordId='" + recordId + '\'' + 
                ", verificationId='" + verificationId + '\'' + 
               "}";
    }
}