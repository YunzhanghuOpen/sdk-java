package com.yunzhanghu.sdk.payment.domain;

// 查询平台企业余额返回
public class ListAccountResponse {
    
    
    private AccountInfo[] dealerInfos;

    public void setDealerInfos(AccountInfo[] dealerInfos) {
        this.dealerInfos = dealerInfos;
    }

    public AccountInfo[] getDealerInfos() {
        return dealerInfos;
    }

    @Override
    public String toString() {
        return "ListAccountResponse{" +
             " dealerInfos='" + dealerInfos + '\'' + 
           '}';
    }
}