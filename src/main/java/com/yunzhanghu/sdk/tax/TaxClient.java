package com.yunzhanghu.sdk.tax;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.tax.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TaxClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaxClient.class);

    public TaxClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }
    // 下载个税扣缴明细表
    public YzhResponse<GetTaxFileResponse> getTaxFile(YzhRequest<GetTaxFileRequest> req) throws YzhException {
        try {
            return post(req, "/api/tax/v1/taxfile/download", new TypeToken<YzhResponse<GetTaxFileResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    // GetUserCross 查询纳税人是否为跨集团用户
    public YzhResponse<GetUserCrossResponse> getUserCross(YzhRequest<GetUserCrossRequest> req) throws YzhException {
        try {
            return post(req, "/api/tax/v1/user/cross", new TypeToken<YzhResponse<GetUserCrossResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}