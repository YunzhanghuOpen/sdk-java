package com.yunzhanghu.sdk.usercollect;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.usercollect.domain.*;
import com.yunzhanghu.sdk.usercollect.domain.GetUserCollectPhoneUrlRequest;
import com.yunzhanghu.sdk.usercollect.domain.GetUserCollectPhoneUrlResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserCollectServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCollectServiceClient.class);

    public UserCollectServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 查询手机号码绑定状态
    public YzhResponse<GetUserCollectPhoneStatusResponse> getUserCollectPhoneStatus(YzhRequest<GetUserCollectPhoneStatusRequest> req) throws YzhException {
        try {
            return get(req, "/api/user/v1/collect/phone/status", false, new TypeToken<YzhResponse<GetUserCollectPhoneStatusResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 获取收集手机号码页面
    public YzhResponse<GetUserCollectPhoneUrlResponse> getUserCollectPhoneUrl(YzhRequest<GetUserCollectPhoneUrlRequest> req) throws YzhException {
        try {
            return get(req, "/api/user/v1/collect/phone/url", false, new TypeToken<YzhResponse<GetUserCollectPhoneUrlResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}