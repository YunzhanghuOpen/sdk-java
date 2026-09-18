package com.yunzhanghu.sdk.walletbalancequery;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.walletbalancequery.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalletBalanceQueryClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalletBalanceQueryClient.class);

    public WalletBalanceQueryClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 查询钱包余额
    public YzhResponse<QueryWalletBalanceResponse> queryWalletBalance(YzhRequest<QueryWalletBalanceRequest> req) throws YzhException {
        try {
            return post(req, "/api/wallet/v1/balance", new TypeToken<YzhResponse<QueryWalletBalanceResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}
