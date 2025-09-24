package com.yunzhanghu.sdk.realname;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.realname.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

public class RealNameServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(RealNameServiceClient.class);

    public RealNameServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 用户实名认证信息收集
    public YzhResponse<CollectRealNameInfoResponse> collectRealNameInfo(YzhRequest<CollectRealNameInfoRequest> req) throws YzhException {
        try {
            return post(req, "/api/user/v1/collect/realname/info", new TypeToken<YzhResponse<CollectRealNameInfoResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 用户实名认证信息查询
    public YzhResponse<QueryRealNameInfoResponse> queryRealNameInfo(YzhRequest<QueryRealNameInfoRequest> req) throws YzhException {
        try {
            return get(req, "/api/user/v1/query/realname/info", false, new TypeToken<YzhResponse<QueryRealNameInfoResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}