package com.yunzhanghu.sdk.authentication.domain;




// 上传用户免验证名单信息请求
public class UserExemptedInfoRequest {
    
    // 证件类型码
    private String cardType;
    
    // 身份证号
    private String idCard;
    
    // 姓名
    private String realName;
    
    // 申请备注
    private String commentApply;
    
    // 综合服务主体 ID
    private String brokerId;
    
    // 商户 ID
    private String dealerId;
    
    // 人员信息图片
    private String[] userImages;
    
    // 国别（地区）代码
    private String country;
    
    // 出生日期
    private String birthday;
    
    // 性别
    private String gender;
    
    // 回调地址
    private String notifyUrl;
    
    // 请求流水号
    private String ref;
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
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
    public void setCommentApply(String commentApply) {
        this.commentApply = commentApply;
    }

    public String getCommentApply() {
        return commentApply;
    }
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
    public void setUserImages(String[] userImages) {
        this.userImages = userImages;
    }

    public String[] getUserImages() {
        return userImages;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }


    @Override
    public String toString() {
        return "UserExemptedInfoRequest{" +
                ", cardType='" + cardType + '\'' +
                ", idCard='" + idCard + '\'' +
                ", realName='" + realName + '\'' +
                ", commentApply='" + commentApply + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", userImages='" + userImages + '\'' +
                ", country='" + country + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}