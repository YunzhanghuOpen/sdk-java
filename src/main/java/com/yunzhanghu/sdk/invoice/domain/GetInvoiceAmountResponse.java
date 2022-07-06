package com.yunzhanghu.sdk.invoice.domain;




// 查询可开票额度和开票信息响应
public class GetInvoiceAmountResponse {
    
    // 可开票额度
    private String amount;
    
    // 系统支持的开户行及账号
    private BankNameAccount[] bankNameAccount;
    
    // 系统支持的货物或应税劳务、服务名称
    private GoodsServicesName[] goodsServicesName;
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
    public void setBankNameAccount(BankNameAccount[] bankNameAccount) {
        this.bankNameAccount = bankNameAccount;
    }

    public BankNameAccount[] getBankNameAccount() {
        return bankNameAccount;
    }
    public void setGoodsServicesName(GoodsServicesName[] goodsServicesName) {
        this.goodsServicesName = goodsServicesName;
    }

    public GoodsServicesName[] getGoodsServicesName() {
        return goodsServicesName;
    }


    @Override
    public String toString() {
        return "GetInvoiceAmountResponse{" +
                ", amount='" + amount + '\'' +
                ", bankNameAccount='" + bankNameAccount + '\'' +
                ", goodsServicesName='" + goodsServicesName + '\'' +
                '}';
    }
}