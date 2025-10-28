package com.yunzhanghu.sdk.h5usersign.domain;

// 预申请签约请求
public class H5UserPresignRequest {

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

    // 姓名
    private String realName;

    // 证件号码
    private String idCard;

    // 证件类型  0：身份证 2：港澳居民来往内地通行证 3：护照 5：台湾居民来往大陆通行证 9：港澳居民居住证 10：台湾居民居住证 11：外国人永久居留身份证（外国人永久居留证） 15：中华人民共和国外国人工作许可证（A类） 16：中华人民共和国外国人工作许可证（B类） 17：中华人民共和国外国人工作许可证（C类） 18：港澳居民来往内地通行证（非中国国籍）
    private int certificateType;

    // 是否收集手机号码 0：不收集（默认） 1：收集手机号码
    private int collectPhoneNo;

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerId() {
        return brokerId;
    }

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

    public void setCertificateType(int certificateType) {
        this.certificateType = certificateType;
    }

    public int getCertificateType() {
        return certificateType;
    }

    public void setCollectPhoneNo(int collectPhoneNo) {
        this.collectPhoneNo = collectPhoneNo;
    }

    public int getCollectPhoneNo() {
        return collectPhoneNo;
    }

    @Override
    public String toString() {
        return "H5UserPresignRequest{" +
                " dealerId='" + dealerId + '\'' +
                ", brokerId='" + brokerId + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", certificateType='" + certificateType + '\'' +
                ", collectPhoneNo='" + collectPhoneNo + '\'' +
                "}";
    }
}