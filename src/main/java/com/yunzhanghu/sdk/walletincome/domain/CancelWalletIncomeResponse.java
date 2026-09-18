package com.yunzhanghu.sdk.walletincome.domain;

// 取消钱包收入计税订单返回
public class CancelWalletIncomeResponse {

    // 综合服务主体 ID
    private String brokerId;

    // 平台企业 ID
    private String dealerId;

    // 平台企业订单号
    private String orderId;

    // 云账户钱包入账订单号
    private String ref;

    // 取消钱包收入计税订单号
    private String cancelOrderId;

    // 取消结果类型
    private String cancelResultType;

    // 取消明细
    private WalletIncomeCancelDetail cancelDetail;

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

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setCancelOrderId(String cancelOrderId) {
        this.cancelOrderId = cancelOrderId;
    }

    public String getCancelOrderId() {
        return cancelOrderId;
    }

    public void setCancelResultType(String cancelResultType) {
        this.cancelResultType = cancelResultType;
    }

    public String getCancelResultType() {
        return cancelResultType;
    }

    public void setCancelDetail(WalletIncomeCancelDetail cancelDetail) {
        this.cancelDetail = cancelDetail;
    }

    public WalletIncomeCancelDetail getCancelDetail() {
        return cancelDetail;
    }

    @Override
    public String toString() {
        return "CancelWalletIncomeResponse{" +
                " brokerId='" + brokerId + '\'' +
                ", dealerId='" + dealerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", ref='" + ref + '\'' +
                ", cancelOrderId='" + cancelOrderId + '\'' +
                ", cancelResultType='" + cancelResultType + '\'' +
                ", cancelDetail='" + cancelDetail + '\'' +
               "}";
    }
}
