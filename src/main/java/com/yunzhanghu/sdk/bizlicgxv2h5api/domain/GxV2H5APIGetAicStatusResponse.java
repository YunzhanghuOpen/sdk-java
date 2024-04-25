package com.yunzhanghu.sdk.bizlicgxv2h5api.domain;




// 查询个体工商户状态返回
public class GxV2H5APIGetAicStatusResponse {
    
    // 用户签约状态
    private int status;
    
    // 注册状态描述
    private String statusMessage;
    
    // 注册详情状态码
    private int statusDetail;
    
    // 注册详情状态码描述
    private String statusDetailMessage;
    
    // 注册发起时间
    private String applyedAt;
    
    // 注册完成时间
    private String registedAt;
    
    // 统一社会信用代码
    private String uscc;
    
    // 身份证号码
    private String idCard;
    
    // 姓名
    private String realName;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusDetail(int statusDetail) {
        this.statusDetail = statusDetail;
    }

    public int getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetailMessage(String statusDetailMessage) {
        this.statusDetailMessage = statusDetailMessage;
    }

    public String getStatusDetailMessage() {
        return statusDetailMessage;
    }

    public void setApplyedAt(String applyedAt) {
        this.applyedAt = applyedAt;
    }

    public String getApplyedAt() {
        return applyedAt;
    }

    public void setRegistedAt(String registedAt) {
        this.registedAt = registedAt;
    }

    public String getRegistedAt() {
        return registedAt;
    }

    public void setUscc(String uscc) {
        this.uscc = uscc;
    }

    public String getUscc() {
        return uscc;
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

    @Override
    public String toString() {
        return "GxV2H5APIGetAicStatusResponse{" +
                " status='" + status + '\'' + 
                ", statusMessage='" + statusMessage + '\'' + 
                ", statusDetail='" + statusDetail + '\'' + 
                ", statusDetailMessage='" + statusDetailMessage + '\'' + 
                ", applyedAt='" + applyedAt + '\'' + 
                ", registedAt='" + registedAt + '\'' + 
                ", uscc='" + uscc + '\'' + 
                ", idCard='" + idCard + '\'' + 
                ", realName='" + realName + '\'' + 
               '}';
    }
}