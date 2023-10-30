package com.yunzhanghu.sdk.h5usersign;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.h5usersign.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class H5UserSignServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(H5UserSignServiceClient.class);

    public H5UserSignServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 预申请签约
    public YzhResponse<H5UserPresignResponse> h5UserPresign(YzhRequest<H5UserPresignRequest> req) throws YzhException {
        try {
            return post(req, "/api/sdk/v1/presign", new TypeToken<YzhResponse<H5UserPresignResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 申请签约
    public YzhResponse<H5UserSignResponse> h5UserSign(YzhRequest<H5UserSignRequest> req) throws YzhException {
        try {
            return get(req, "/api/sdk/v1/sign/h5", false, new TypeToken<YzhResponse<H5UserSignResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 获取用户签约状态
    public YzhResponse<GetH5UserSignStatusResponse> getH5UserSignStatus(YzhRequest<GetH5UserSignStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/sdk/v1/sign/user/status", false, new TypeToken<YzhResponse<GetH5UserSignStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 用户解约（测试账号专用接口）
    public YzhResponse<H5UserReleaseResponse> h5UserRelease(YzhRequest<H5UserReleaseRequest> req) throws YzhException {
        try {
            return post(req, "/api/sdk/v1/sign/release", new TypeToken<YzhResponse<H5UserReleaseResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}