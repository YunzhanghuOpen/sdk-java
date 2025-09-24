package com.yunzhanghu.sdk.realname.domain;


public class QueryRealNameInfoResponse {
    
    // 实名认证结果
    private int realnameResult;
    
    // 实名认证通过时间
    private String realnameTime;
    
    // 实名认证方式
    private int realnameType;
    
    // 实名认证唯一可追溯编码
    private String realnameTraceId;
    
    // 认证平台
    private String realnamePlatform;
    
    // 是否存在人脸照片
    private String faceImage;
    
    // 人脸识别验证分数
    private String faceVerifyScore;
    
    // 银行卡号
    private String bankNo;
    
    // 银行预留手机号
    private String bankPhone;
    
    // 平台企业审核人
    private String reviewer;

    public void setRealnameResult(int realnameResult) {
        this.realnameResult = realnameResult;
    }

    public int getRealnameResult() {
        return realnameResult;
    }

    public void setRealnameTime(String realnameTime) {
        this.realnameTime = realnameTime;
    }

    public String getRealnameTime() {
        return realnameTime;
    }

    public void setRealnameType(int realnameType) {
        this.realnameType = realnameType;
    }

    public int getRealnameType() {
        return realnameType;
    }

    public void setRealnameTraceId(String realnameTraceId) {
        this.realnameTraceId = realnameTraceId;
    }

    public String getRealnameTraceId() {
        return realnameTraceId;
    }

    public void setRealnamePlatform(String realnamePlatform) {
        this.realnamePlatform = realnamePlatform;
    }

    public String getRealnamePlatform() {
        return realnamePlatform;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceVerifyScore(String faceVerifyScore) {
        this.faceVerifyScore = faceVerifyScore;
    }

    public String getFaceVerifyScore() {
        return faceVerifyScore;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewer() {
        return reviewer;
    }

    @Override
    public String toString() {
        return "QueryRealNameInfoResponse{" +
                " realnameResult='" + realnameResult + '\'' + 
                ", realnameTime='" + realnameTime + '\'' + 
                ", realnameType='" + realnameType + '\'' + 
                ", realnameTraceId='" + realnameTraceId + '\'' + 
                ", realnamePlatform='" + realnamePlatform + '\'' + 
                ", faceImage='" + faceImage + '\'' + 
                ", faceVerifyScore='" + faceVerifyScore + '\'' + 
                ", bankNo='" + bankNo + '\'' + 
                ", bankPhone='" + bankPhone + '\'' + 
                ", reviewer='" + reviewer + '\'' + 
               "}";
    }
}