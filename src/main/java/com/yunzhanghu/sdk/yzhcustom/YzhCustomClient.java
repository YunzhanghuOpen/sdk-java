package com.yunzhanghu.sdk.yzhcustom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.YzhClient;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.utils.JsonUtil;

public class YzhCustomClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(YzhCustomClient.class);

    public YzhCustomClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    /**
     * 通用请求函数
     * 
     * @param <K>    请求结构体
     * @param <T>    返回结构体
     * @param req    请求参数
     * @param url    请求地址
     * @param method 请求方式 GET/POST
     * @param clazz  返回结构体类型
     * @return
     * @throws YzhException
     */
    public <K, T> YzhResponse<T> doRequest(YzhRequest<K> req, String url, String method, Class<T> clazz)
            throws YzhException {
        try {
            YzhResponse<T> response = new YzhResponse<>();
            if (ClientMethodType.GET.getValue().equals(method.toUpperCase())) {
                response = get(req, url, false, new TypeToken<YzhResponse<T>>(){});
            } else {
                response = post(req, url, new TypeToken<YzhResponse<T>>(){});
            }
            response.setData(linkTreeMapToEntry(response.getData(), clazz));
            return response;
        } catch (Exception e) {
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    private <K, T> T linkTreeMapToEntry(K data, Class<T> clazz) {
        String json = JsonUtil.toJson(data);
        return JsonUtil.fromLowerCasesWithUnderScoresJson(json, clazz);
    }

    public enum ClientMethodType {

        // POST
        POST("POST"),

        // GET
        GET("GET");

        private final String value;

        ClientMethodType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}