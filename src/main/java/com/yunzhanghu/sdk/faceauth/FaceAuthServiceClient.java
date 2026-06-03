package com.yunzhanghu.sdk.faceauth;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.faceauth.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

public class FaceAuthServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(FaceAuthServiceClient.class);

    public FaceAuthServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 申请人脸识别实名核验
    public YzhResponse<ApplyFaceAuthResponse> applyFaceAuth(YzhRequest<ApplyFaceAuthRequest> req) throws YzhException {
        try {
            return post(req, "/api/user/v1/face/auth", new TypeToken<YzhResponse<ApplyFaceAuthResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询人脸识别实名核验结果
    public YzhResponse<GetFaceAuthResultResponse> getFaceAuthResult(YzhRequest<GetFaceAuthResultRequest> req) throws YzhException {
        try {
            return get(req, "/api/user/v1/face/auth_result", false, new TypeToken<YzhResponse<GetFaceAuthResultResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}