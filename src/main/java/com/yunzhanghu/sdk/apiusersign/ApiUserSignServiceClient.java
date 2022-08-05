package com.yunzhanghu.sdk.apiusersign;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.apiusersign.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiUserSignServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiUserSignServiceClient.class);

    public ApiUserSignServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 获取协议预览 URL
    public YzhResponse<ApiUseSignContractResponse> apiUseSignContract(YzhRequest<ApiUseSignContractRequest> req) throws YzhException {
        try {
            return get(req, "/api/sign/v1/user/contract", false, new TypeToken<YzhResponse<ApiUseSignContractResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 用户签约
    public YzhResponse<ApiUserSignResponse> apiUserSign(YzhRequest<ApiUserSignRequest> req) throws YzhException {
        try {
            return post(req, "/api/sign/v1/user/sign", new TypeToken<YzhResponse<ApiUserSignResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 获取用户签约状态
    public YzhResponse<GetApiUserSignStatusResponse> getApiUserSignStatus(YzhRequest<GetApiUserSignStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/sign/v1/user/status", false, new TypeToken<YzhResponse<GetApiUserSignStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 用户解约（测试账号专用接口）
    public YzhResponse<ApiUserSignReleaseResponse> apiUserSignRelease(YzhRequest<ApiUserSignReleaseRequest> req) throws YzhException {
        try {
            return post(req, "/api/sign/v1/user/release", new TypeToken<YzhResponse<ApiUserSignReleaseResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}