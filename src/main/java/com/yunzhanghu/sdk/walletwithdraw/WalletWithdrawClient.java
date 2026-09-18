package com.yunzhanghu.sdk.walletwithdraw;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.walletwithdraw.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalletWithdrawClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalletWithdrawClient.class);

    public WalletWithdrawClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 发起钱包余额提现
    public YzhResponse<CreateWalletWithdrawResponse> createWalletWithdraw(YzhRequest<CreateWalletWithdrawRequest> req) throws YzhException {
        try {
            return post(req, "/api/payout/v1/create", new TypeToken<YzhResponse<CreateWalletWithdrawResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询钱包余额提现结果
    public YzhResponse<QueryWalletWithdrawResponse> queryWalletWithdraw(YzhRequest<QueryWalletWithdrawRequest> req) throws YzhException {
        try {
            return get(req, "/api/payout/v1/query", false, new TypeToken<YzhResponse<QueryWalletWithdrawResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 取消挂起的钱包余额提现订单
    public YzhResponse<CancelWalletWithdrawResponse> cancelWalletWithdraw(YzhRequest<CancelWalletWithdrawRequest> req) throws YzhException {
        try {
            return post(req, "/api/payout/v1/cancel-order", new TypeToken<YzhResponse<CancelWalletWithdrawResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 重试挂起的钱包余额提现订单
    public YzhResponse<RetryWalletWithdrawResponse> retryWalletWithdraw(YzhRequest<RetryWalletWithdrawRequest> req) throws YzhException {
        try {
            return post(req, "/api/payout/v1/retry-order", new TypeToken<YzhResponse<RetryWalletWithdrawResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询钱包余额提现电子回单
    public YzhResponse<GetWalletWithdrawReceiptFileResponse> getWalletWithdrawReceiptFile(YzhRequest<GetWalletWithdrawReceiptFileRequest> req) throws YzhException {
        try {
            return get(req, "/api/payout/v1/receipt-file", false, new TypeToken<YzhResponse<GetWalletWithdrawReceiptFileResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}
