package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.utils.StringUtils;

public class YzhRequest<T> {

    private String requestId;

    private T request;

    public YzhRequest() {
    }

    public YzhRequest(String requestId) {
        this.requestId = requestId;
    }

    public YzhRequest(String requestId, T request) {
        this.requestId = requestId;
        this.request = request;
    }

    public static <T> YzhRequest<T> build(String requestId, T request) {
        return new YzhRequest<>(requestId, request);
    }

    public static <T> YzhRequest<T> build(T request) {
        return new YzhRequest<>(StringUtils.getRequestId(), request);
    }

    public String getRequestId() {
        return requestId;
    }

    public YzhRequest<T> setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public T getRequest() {
        return request;
    }

    public void setRequest(T request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "YzhRequest{" +
                "requestId='" + requestId + '\'' +
                ", request=" + request +
               "}";
    }
}
