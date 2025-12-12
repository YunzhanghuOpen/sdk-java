package com.yunzhanghu.sdk.authentication.domain;


public class GetUserWhiteApproveInfoResponse {
    
    // 审核状态 pass：通过 reviewing：审核中 reject：拒绝
    private String status;
    
    // 审核信息
    private String comment;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "GetUserWhiteApproveInfoResponse{" +
                " status='" + status + '\'' + 
                ", comment='" + comment + '\'' + 
               "}";
    }
}