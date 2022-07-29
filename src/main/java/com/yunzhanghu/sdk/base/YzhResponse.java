package com.yunzhanghu.sdk.base;

import com.google.gson.annotations.SerializedName;
import com.yunzhanghu.sdk.constants.DataDict;

import java.io.Serializable;

public class YzhResponse<T> implements Serializable {

    private static final long serialVersionUID = 6552432864952557996L;


    // http 返回码
    private int httpCode;

    // 返回码
    private String code;

     // 返回描述
    private String message;

     // 返回码
    @SerializedName(value = "request_id", alternate = "requestID")
    private String requestId;

     // 业务数据
    private T data;

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return DataDict.STATUS_200 == httpCode && DataDict.SUCCESS_CODE.equals(code);
    }

    @Override
    public String toString() {
        return "YzhResponse{" +
                "httpCode=" + httpCode +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", requestId='" + requestId + '\'' +
                ", data=" + data +
                '}';
    }
}
