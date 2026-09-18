package com.yunzhanghu.sdk.walletincome;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.walletincome.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalletIncomeClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalletIncomeClient.class);

    public WalletIncomeClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 发起钱包余额入账
    public YzhResponse<CreateWalletIncomeResponse> createWalletIncome(YzhRequest<CreateWalletIncomeRequest> req) throws YzhException {
        try {
            return post(req, "/api/income/v1/create", new TypeToken<YzhResponse<CreateWalletIncomeResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询钱包余额入账结果
    public YzhResponse<QueryWalletIncomeResponse> queryWalletIncome(YzhRequest<QueryWalletIncomeRequest> req) throws YzhException {
        try {
            return get(req, "/api/income/v1/query", false, new TypeToken<YzhResponse<QueryWalletIncomeResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 取消钱包收入计税订单
    public YzhResponse<CancelWalletIncomeResponse> cancelWalletIncome(YzhRequest<CancelWalletIncomeRequest> req) throws YzhException {
        try {
            return post(req, "/api/income/v1/cancel-order", new TypeToken<YzhResponse<CancelWalletIncomeResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 重试挂起的计税订单
    public YzhResponse<RetryWalletIncomeResponse> retryWalletIncome(YzhRequest<RetryWalletIncomeRequest> req) throws YzhException {
        try {
            return post(req, "/api/income/v1/retry-order", new TypeToken<YzhResponse<RetryWalletIncomeResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}
