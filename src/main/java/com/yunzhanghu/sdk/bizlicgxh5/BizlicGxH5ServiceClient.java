package com.yunzhanghu.sdk.bizlicgxh5;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicgxh5.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

public class BizlicGxH5ServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicGxH5ServiceClient.class);

    public BizlicGxH5ServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 预启动
    public YzhResponse<GxH5GetStartUrlResponse> gxH5GetStartUrl(YzhRequest<GxH5GetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/h5/v1/h5url", false, new TypeToken<YzhResponse<GxH5GetStartUrlResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<GxH5EcoCityAicStatusResponse> gxH5EcoCityAicStatus(YzhRequest<GxH5EcoCityAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/h5/v1/status", false, new TypeToken<YzhResponse<GxH5EcoCityAicStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}