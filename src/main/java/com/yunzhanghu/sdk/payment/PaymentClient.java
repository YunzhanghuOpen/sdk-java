package com.yunzhanghu.sdk.payment;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.payment.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentClient.class);

    public PaymentClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 银行卡实时支付
    public YzhResponse<CreateBankpayOrderResponse> createBankpayOrder(YzhRequest<CreateBankpayOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order-bankpay", new TypeToken<YzhResponse<CreateBankpayOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 支付宝实时支付
    public YzhResponse<CreateAlipayOrderResponse> createAlipayOrder(YzhRequest<CreateAlipayOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order-alipay", new TypeToken<YzhResponse<CreateAlipayOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 微信实时支付
    public YzhResponse<CreateWxpayOrderResponse> createWxpayOrder(YzhRequest<CreateWxpayOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order-wxpay", new TypeToken<YzhResponse<CreateWxpayOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询单笔订单信息
    public YzhResponse<GetOrderResponse> getOrder(YzhRequest<GetOrderRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-order", "encryption".equals(req.getRequest().getDataType()), new TypeToken<YzhResponse<GetOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询平台企业汇款信息
    public YzhResponse<GetDealerVARechargeAccountResponse> getDealerVARechargeAccount(YzhRequest<GetDealerVARechargeAccountRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/va-account", false, new TypeToken<YzhResponse<GetDealerVARechargeAccountResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询平台企业余额
    public YzhResponse<ListAccountResponse> listAccount(YzhRequest<ListAccountRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-accounts", false, new TypeToken<YzhResponse<ListAccountResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询电子回单
    public YzhResponse<GetEleReceiptFileResponse> getEleReceiptFile(YzhRequest<GetEleReceiptFileRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/receipt/file", false, new TypeToken<YzhResponse<GetEleReceiptFileResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 取消待支付订单
    public YzhResponse<CancelOrderResponse> cancelOrder(YzhRequest<CancelOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order/fail", new TypeToken<YzhResponse<CancelOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 重试挂起状态订单
    public YzhResponse<RetryOrderResponse> retryOrder(YzhRequest<RetryOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order/retry", new TypeToken<YzhResponse<RetryOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 批次下单
    public YzhResponse<CreateBatchOrderResponse> createBatchOrder(YzhRequest<CreateBatchOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/order-batch", new TypeToken<YzhResponse<CreateBatchOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 批次确认
    public YzhResponse<ConfirmBatchOrderResponse> confirmBatchOrder(YzhRequest<ConfirmBatchOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/confirm-batch", new TypeToken<YzhResponse<ConfirmBatchOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询批次订单信息
    public YzhResponse<QueryBatchOrderResponse> queryBatchOrder(YzhRequest<QueryBatchOrderRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-batch", false, new TypeToken<YzhResponse<QueryBatchOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 批次撤销
    public YzhResponse<CancelBatchOrderResponse> cancelBatchOrder(YzhRequest<CancelBatchOrderRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/cancel-batch", new TypeToken<YzhResponse<CancelBatchOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 用户结算金额校验
    public YzhResponse<CheckUserAmountResponse> CheckUserAmount(YzhRequest<CheckUserAmountRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/risk-check/amount", new TypeToken<YzhResponse<CheckUserAmountResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}