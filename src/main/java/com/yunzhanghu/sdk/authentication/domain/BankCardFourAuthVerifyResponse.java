package com.yunzhanghu.sdk.authentication.domain;




// 银行卡四要素鉴权响应
public class BankCardFourAuthVerifyResponse {
    
    // 交易凭证
    private String ref;
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }


    @Override
    public String toString() {
        return "BankCardFourAuthVerifyResponse{" +
                ", ref='" + ref + '\'' +
                '}';
    }
}