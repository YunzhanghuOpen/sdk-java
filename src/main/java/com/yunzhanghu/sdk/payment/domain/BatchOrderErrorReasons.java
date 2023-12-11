package com.yunzhanghu.sdk.payment.domain;




// 下单失败原因信息
public class BatchOrderErrorReasons {
    
    // 不允许下单原因码
    private String errorCode;
    
    // 不允许下单原因描述
    private String errorMessage;

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "BatchOrderErrorReasons{" +
                   " errorCode='" + errorCode + '\'' + 
                   ", errorMessage='" + errorMessage + '\'' + 
                 '}';
    }
}