package com.yunzhanghu.sdk.calculatelabor;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.calculatelabor.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

public class CalculateLaborServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculateLaborServiceClient.class);

    public CalculateLaborServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 连续劳务税费试算（计算器）
    public YzhResponse<LaborCaculatorResponse> laborCaculator(YzhRequest<LaborCaculatorRequest> req) throws YzhException {
        try {
            return post(req, "/api/tax/v1/labor-caculator", new TypeToken<YzhResponse<LaborCaculatorResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 订单税费试算
    public YzhResponse<CalcTaxResponse> calcTax(YzhRequest<CalcTaxRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/calc-tax", new TypeToken<YzhResponse<CalcTaxResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}