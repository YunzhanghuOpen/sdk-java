package com.yunzhanghu.sdk.authentication.domain;




// 查看用户免验证名单是否存在请求
public class UserWhiteCheckRequest {
    
    // 身份证号
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
                ", idCard='" + idCard + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}