package com.yunzhanghu.sdk.faceauth.domain;

// 人脸识别实名核验失败详情
public class FaceAuthDetail {
    
    // 实名核验失败原因
    private String failReason;

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getFailReason() {
        return failReason;
    }

    @Override
    public String toString() {
        return "FaceAuthDetail{" +
                " failReason='" + failReason + '\'' + 
               "}";
    }
}