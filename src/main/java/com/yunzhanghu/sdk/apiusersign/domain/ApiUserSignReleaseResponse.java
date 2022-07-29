package com.yunzhanghu.sdk.apiusersign.domain;




// 用户解约返回
public class ApiUserSignReleaseResponse {
    
    // 是否解约成功
    private String status;
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "ApiUserSignReleaseResponse{" +
             " status='" + status + '\'' + 
              '}';
    }
}