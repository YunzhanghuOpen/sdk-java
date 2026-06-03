package com.yunzhanghu.sdk.faceauth.domain;

// 查询人脸识别实名核验结果返回
public class GetFaceAuthResultResponse {
    
    // 姓名
    private String realName;
    
    // 身份证号码
    private String idCard;
    
    // 人脸识别实名核验唯一 ID
    private String recordId;
    
    // 平台企业实名核验 ID
    private String verificationId;
    
    // 实名核验状态
    private String status;
    
    // 实名核验完成时间
    private String verifyTime;
    
    // 实名核验失败详情
    private FaceAuthDetail detail;

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyTime() {
        return verifyTime;
    }

    public void setDetail(FaceAuthDetail detail) {
        this.detail = detail;
    }

    public FaceAuthDetail getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return "GetFaceAuthResultResponse{" +
                " realName='" + realName + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", recordId='" + recordId + '\'' + 
                ", verificationId='" + verificationId + '\'' + 
                ", status='" + status + '\'' + 
                ", verifyTime='" + verifyTime + '\'' + 
                ", detail='" + detail + '\'' + 
               "}";
    }
}