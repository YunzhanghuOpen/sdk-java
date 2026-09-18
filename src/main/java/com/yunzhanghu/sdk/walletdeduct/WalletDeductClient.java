package com.yunzhanghu.sdk.walletdeduct;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.walletdeduct.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalletDeductClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalletDeductClient.class);

    public WalletDeductClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 申请钱包余额扣减
    public YzhResponse<CreateWalletDeductResponse> createWalletDeduct(YzhRequest<CreateWalletDeductRequest> req) throws YzhException {
        try {
            return post(req, "/api/payout/v1/direct/create", new TypeToken<YzhResponse<CreateWalletDeductResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询钱包余额扣减申请结果
    public YzhResponse<QueryWalletDeductResponse> queryWalletDeduct(YzhRequest<QueryWalletDeductRequest> req) throws YzhException {
        try {
            return get(req, "/api/payout/v1/direct/query", false, new TypeToken<YzhResponse<QueryWalletDeductResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 提交钱包余额扣减结果
    public YzhResponse<CompleteWalletDeductResponse> completeWalletDeduct(YzhRequest<CompleteWalletDeductRequest> req) throws YzhException {
        try {
            return post(req, "/api/payout/v1/direct/complete", new TypeToken<YzhResponse<CompleteWalletDeductResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}
