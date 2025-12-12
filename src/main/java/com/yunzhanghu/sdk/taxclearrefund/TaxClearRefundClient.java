package com.yunzhanghu.sdk.taxclearrefund;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.taxclearrefund.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;   

// 连续劳务税费退补
public class TaxClearRefundClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaxClearRefundClient.class);

    public TaxClearRefundClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 查询税费清缴完成结果
    public YzhResponse<GetClearTaxInfoResponse> getClearTaxInfo(YzhRequest<GetClearTaxInfoRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-clear-tax", false, new TypeToken<YzhResponse<GetClearTaxInfoResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询税费清缴明细文件
    public YzhResponse<GetClearTaxFileResponse> getClearTaxFile(YzhRequest<GetClearTaxFileRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-clear-tax/file", false, new TypeToken<YzhResponse<GetClearTaxFileResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询税费退补完成结果
    public YzhResponse<RefundTaxData> getRefundTaxInfo(YzhRequest<GetRefundTaxInfoRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/query-clear-status", false, new TypeToken<YzhResponse<RefundTaxData>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}