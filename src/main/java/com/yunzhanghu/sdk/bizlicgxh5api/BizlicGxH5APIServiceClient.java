package com.yunzhanghu.sdk.bizlicgxh5api;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;   

public class BizlicGxH5APIServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicGxH5APIServiceClient.class);

    public BizlicGxH5APIServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 工商实名信息录入
    public YzhResponse<GxH5APIPreCollectBizlicMsgResponse> gxH5APIPreCollectBizlicMsg(YzhRequest<GxH5APIPreCollectBizlicMsgRequest> req) throws YzhException {
        try {
            return post(req, "/api/aic/sharing-economy/api-h5/v1/collect", new TypeToken<YzhResponse<GxH5APIPreCollectBizlicMsgResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 预启动
    public YzhResponse<GxH5APIGetStartUrlResponse> gxH5APIGetStartUrl(YzhRequest<GxH5APIGetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/api-h5/v1/h5url", false, new TypeToken<YzhResponse<GxH5APIGetStartUrlResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<GxH5APIEcoCityAicStatusResponse> gxH5APIEcoCityAicStatus(YzhRequest<GxH5APIEcoCityAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/api-h5/v1/status", false, new TypeToken<YzhResponse<GxH5APIEcoCityAicStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}