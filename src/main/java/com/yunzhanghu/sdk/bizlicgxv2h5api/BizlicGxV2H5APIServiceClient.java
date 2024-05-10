package com.yunzhanghu.sdk.bizlicgxv2h5api;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;   

public class BizlicGxV2H5APIServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizlicGxV2H5APIServiceClient.class);

    public BizlicGxV2H5APIServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 工商实名信息录入
    public YzhResponse<GxV2H5APIPreCollectBizlicMsgResponse> gxV2H5APIPreCollectBizlicMsg(YzhRequest<GxV2H5APIPreCollectBizlicMsgRequest> req) throws YzhException {
        try {
            return post(req, "/api/aic/sharing-economy/api-h5/v1/collect", new TypeToken<YzhResponse<GxV2H5APIPreCollectBizlicMsgResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 预启动
    public YzhResponse<GxV2H5APIGetStartUrlResponse> gxV2H5APIGetStartUrl(YzhRequest<GxV2H5APIGetStartUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/api-h5/v1/h5url", false, new TypeToken<YzhResponse<GxV2H5APIGetStartUrlResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 查询个体工商户状态
    public YzhResponse<GxV2H5APIGetAicStatusResponse> gxV2H5APIGetAicStatus(YzhRequest<GxV2H5APIGetAicStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/aic/sharing-economy/api-h5/v1/status", false, new TypeToken<YzhResponse<GxV2H5APIGetAicStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}