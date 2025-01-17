package com.yunzhanghu.sdk.bizlicgxv2h5;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

public class BizlicGxV2H5ServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicGxV2H5ServiceClient.class);

    public BizlicGxV2H5ServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 预启动
    public YzhResponse<GxV2H5GetStartUrlResponse> gxV2H5GetStartUrl(YzhRequest<GxV2H5GetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/h5/v1/h5url", false, new TypeToken<YzhResponse<GxV2H5GetStartUrlResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<GxV2H5GetAicStatusResponse> gxV2H5GetAicStatus(YzhRequest<GxV2H5GetAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/h5/v1/status", false, new TypeToken<YzhResponse<GxV2H5GetAicStatusResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}