package com.yunzhanghu.sdk.uploadusersign;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.uploadusersign.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UploadUserSignServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadUserSignServiceClient.class);

    public UploadUserSignServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 用户签约信息上传
    public YzhResponse<UploadUserSignResponse> uploadUserSign(YzhRequest<UploadUserSignRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/sign/user", new TypeToken<YzhResponse<UploadUserSignResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 获取用户签约状态
    public YzhResponse<GetUploadUserSignStatusResponse> getUploadUserSignStatus(YzhRequest<GetUploadUserSignStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/sign/user/status", false, new TypeToken<YzhResponse<GetUploadUserSignStatusResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}