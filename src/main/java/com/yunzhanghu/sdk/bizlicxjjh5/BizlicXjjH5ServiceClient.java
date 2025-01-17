package com.yunzhanghu.sdk.bizlicxjjh5;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizlicXjjH5ServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicXjjH5ServiceClient.class);

    public BizlicXjjH5ServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 预启动
    public YzhResponse<H5GetStartUrlResponse> h5GetStartUrl(YzhRequest<H5GetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/new-economy/h5/v1/h5url", false, new TypeToken<YzhResponse<H5GetStartUrlResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<H5EcoCityAicStatusResponse> h5EcoCityAicStatus(YzhRequest<H5EcoCityAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/new-economy/h5/v1/status", false, new TypeToken<YzhResponse<H5EcoCityAicStatusResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}