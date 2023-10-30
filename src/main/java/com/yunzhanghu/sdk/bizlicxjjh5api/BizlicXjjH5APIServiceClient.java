package com.yunzhanghu.sdk.bizlicxjjh5api;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizlicXjjH5APIServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicXjjH5APIServiceClient.class);

    public BizlicXjjH5APIServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 工商实名信息录入
    public YzhResponse<H5PreCollectBizlicMsgResponse> h5PreCollectBizlicMsg(YzhRequest<H5PreCollectBizlicMsgRequest> req) throws YzhException {
        try {
            return post(req, "/api/aic/new-economy/api-h5/v1/collect", new TypeToken<YzhResponse<H5PreCollectBizlicMsgResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 预启动
    public YzhResponse<H5APIGetStartUrlResponse> h5APIGetStartUrl(YzhRequest<H5APIGetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/new-economy/api-h5/v1/h5url", false, new TypeToken<YzhResponse<H5APIGetStartUrlResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<H5APIEcoCityAicStatusResponse> h5APIEcoCityAicStatus(YzhRequest<H5APIEcoCityAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/new-economy/api-h5/v1/status", false, new TypeToken<YzhResponse<H5APIEcoCityAicStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}