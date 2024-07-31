package com.yunzhanghu.sdk.authentication.domain;

// 查看用户是否在非居民身份证验证名单中请求
public class UserWhiteCheckRequest {
    
    // 证件号码
    private String idCard;
    
    // 姓名
    private String realName;

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "UserWhiteCheckRequest{" +
                " idCard='" + idCard + '\'' + 
                ", realName='" + realName + '\'' + 
               "}";
    }
}