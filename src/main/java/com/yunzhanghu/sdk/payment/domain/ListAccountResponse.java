package com.yunzhanghu.sdk.payment.domain;





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
                ", dealerInfos='" + dealerInfos + '\'' +
                '}';
    }
}