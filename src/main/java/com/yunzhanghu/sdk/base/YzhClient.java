package com.yunzhanghu.sdk.base;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.constants.DataDict;
import com.yunzhanghu.sdk.constants.XmlData;
import com.yunzhanghu.sdk.utils.JsonUtil;
import com.yunzhanghu.sdk.utils.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(YzhClient.class);

    private YzhSign yzhSign;
    private YzhConfig yzhConfig;
    private int socketTimeout;

    public YzhClient(YzhConfig yzhConfig) {
        setYzhConfig(yzhConfig);

        if (YzhConfig.SignType.RSA.equals(yzhConfig.getSignType())) {
            setYzhSign(new YzhRsaSign(yzhConfig));
        }

        if (YzhConfig.SignType.SHA256.equals(yzhConfig.getSignType())) {
            setYzhSign(new YzhSha256Sign(yzhConfig));
        }
    }

    private static <T> YzhResponse<T> fromJsonResult(String data, Type t) {
        return JsonUtil.fromLowerCasesWithUnderScoresJson(data, t);
    }

    protected YzhSign.SignedData sign(Object request) throws Exception {
        return yzhSign.sign(request);
    }

    public YzhSign getYzhSign() {
        return yzhSign;
    }

    public void setYzhSign(YzhSign yzhSign) {
        this.yzhSign = yzhSign;
    }

    public YzhConfig getYzhConfig() {
        return yzhConfig;
    }

    public void setYzhConfig(YzhConfig yzhConfig) {
        this.yzhConfig = yzhConfig;
    }

    public int getSocketTimeout() {
		return socketTimeout == 0 ? DataDict.SOCKET_TIMEOUT : socketTimeout;
	}

	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	/**
     * post 请求
     *
     * @param yzhRequest 请求内容
     * @param url        接口地址
     * @param typeToken  反序列化返回类型
     * @return YzhResponse
     */
    public <K, T> YzhResponse<T> post(YzhRequest<K> yzhRequest, String url, TypeToken<YzhResponse<T>> typeToken) throws Exception {
        return postMethod(yzhRequest, getYzhConfig().getYzhUrl() + url, typeToken);
    }

    /**
     * post请求
     *
     * @param yzhRequest 请求内容
     * @param url        host + 接口地址
     * @param typeToken  反序列化返回类型
     * @return YzhResponse
     */
    private <K, T> YzhResponse<T> postMethod(YzhRequest<K> yzhRequest, String url, TypeToken<YzhResponse<T>> typeToken) throws Exception {
        YzhSign.SignedData signedData = sign(yzhRequest.getRequest());

        RequestConfig config = RequestConfig.custom().setConnectTimeout(DataDict.CONNECT_TIMEOUT)
                .setSocketTimeout(this.getSocketTimeout()).build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(SSLContexts.custom()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .build(), NoopHostnameVerifier.INSTANCE);
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setSSLSocketFactory(sslConnectionSocketFactory).setDefaultRequestConfig(config)
                .build();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader(HTTP.CONTENT_TYPE, XmlData.CONTENT_TYPE_JSON);
        httpPost.setHeader(XmlData.DEALER_ID, yzhConfig.getDealerId());
        httpPost.setHeader(XmlData.REQUEST_ID, yzhRequest.getRequestId());
        httpPost.setHeader(HttpHeaders.USER_AGENT,StringUtils.getUA());

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair(XmlData.MESS, signedData.getMess()));
        params.add(new BasicNameValuePair(XmlData.TIMESTAMP, String.valueOf(signedData.getTimestamp())));
        params.add(new BasicNameValuePair(XmlData.SIGN_TYPE, signedData.getSignType()));
        params.add(new BasicNameValuePair(XmlData.DATA, signedData.getData()));
        params.add(new BasicNameValuePair(XmlData.SIGN, signedData.getSign()));

        CloseableHttpResponse httpResponse = null;

        YzhResponse<T> response;
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            httpResponse = httpClient.execute(httpPost);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            String result = getResponse(httpPost, httpResponse, statusCode);
            response = JsonUtil.fromLowerCasesWithUnderScoresJson(result, YzhResponse.class);
            response = fromJsonResult(result, typeToken.getType());
            response.setHttpCode(statusCode);
        } catch (Exception e) {
            LOGGER.error("postMethod exception", e);
            throw e;
        } finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException io) {
                    LOGGER.error("httpResponse.close error", io);
                }
            }
        }
        return response;
    }

    /**
     * GET请求
     *
     * @param yzhRequest 请求内容
     * @param url        接口地址
     * @param isEncrypt  接口返回内容是否进行加密
     * @param typeToken  反序列化返回类型
     * @return YzhResponse
     */
    public <K, T> YzhResponse<T> get(YzhRequest<K> yzhRequest, String url, boolean isEncrypt, TypeToken<YzhResponse<T>> typeToken) throws Exception {
        YzhSign.SignedData signedData = sign(yzhRequest.getRequest());
        return getMethod(getYzhConfig().getYzhUrl() + url + "?" + signedData.getPlainEncode(), yzhRequest, isEncrypt, typeToken);
    }

    /**
     * get请求
     *
     * @param url        host + 接口地址 + 拼接请求参数
     * @param yzhRequest 请求内容
     * @param isEncrypt  接口返回内容是否进行加密
     * @return YzhResponse
     */
    private <K, T> YzhResponse<T> getMethod(String url, YzhRequest<K> yzhRequest, boolean isEncrypt, TypeToken<YzhResponse<T>> typeToken) throws Exception {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(DataDict.CONNECT_TIMEOUT)
                .setSocketTimeout(this.getSocketTimeout()).build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(SSLContexts.custom()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .build(), NoopHostnameVerifier.INSTANCE);
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setSSLSocketFactory(sslConnectionSocketFactory).setDefaultRequestConfig(config)
                .build();
        HttpGet httpget = new HttpGet(url);

        httpget.setHeader(HTTP.CONTENT_TYPE, XmlData.CONTENT_TYPE_JSON);
        httpget.setHeader(XmlData.DEALER_ID, yzhConfig.getDealerId());
        httpget.setHeader(XmlData.REQUEST_ID, yzhRequest.getRequestId());
        CloseableHttpResponse httpResponse = null;

        YzhResponse<T> response;
        try {            // 执行get请求.
            httpResponse = httpClient.execute(httpget);

            int statusCode = httpResponse.getStatusLine().getStatusCode();
            String result = getResponse(httpget, httpResponse, statusCode);
            // 优先判定返回code，如果非成功code，则直接返回
            response = JsonUtil.fromLowerCasesWithUnderScoresJson(result, YzhResponse.class);
            if (!DataDict.SUCCESS_CODE.equals(response.getCode())) {
                response.setHttpCode(statusCode);
                response.setData(null);
                return response;
            }
            // 解密
            if (isEncrypt) {
                Map<String, String> map = JsonUtil.fromLowerCasesWithUnderScoresJson(result, new TypeToken<Map<String, String>>() {
                }.getType());
                Object data = map.get("data");
                if (null != data) {
                    String dataStr = getYzhSign().decrypt(data.toString());
                    response = new YzhResponse<>();
                    T bizData = JsonUtil.fromLowerCasesWithUnderScoresJson(dataStr, getResponseType(typeToken));
                    response.setData(bizData);
                    response.setCode(StringUtils.trim(map.get("code")));
                    response.setMessage(StringUtils.trim(map.get("message")));
                    response.setRequestId(StringUtils.trim(map.get("requestId")));
                    // 兼容
                    if (StringUtils.isNull(response.getRequestId())) {
                        response.setRequestId(StringUtils.trim(map.get("requestID")));
                    }
                    response.setHttpCode(statusCode);
                    return response;
                }
            }

            response = fromJsonResult(result, typeToken.getType());
            response.setHttpCode(statusCode);
        } catch (Exception e) {
            LOGGER.error("getMethod exception", e);
            throw e;
        } finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException io) {
                    LOGGER.error("httpResponse.close error", io);
                }
            }
        }
        return response;
    }

    /**
     * 获取TypeToken对应 T 的type
     *
     * @param typeToken 类型
     * @param <T>       T
     * @return Type
     */
    public <T> Type getResponseType(TypeToken<YzhResponse<T>> typeToken) {
        ParameterizedType parameterizedType = (ParameterizedType) typeToken.getType();
        return parameterizedType.getActualTypeArguments()[0];
    }

    /**
     * 获取通用response
     *
     * @param httpRequest  请求 request
     * @param httpResponse 通用 response
     * @param statusCode   状态码
     * @return string
     * @throws IOException 通用异常
     */
    private String getResponse(HttpRequestBase httpRequest, CloseableHttpResponse httpResponse, int statusCode) throws IOException {
        String result = "";
        if (statusCode != DataDict.STATUS_200) {
            if (statusCode == DataDict.STATUS_302) {
                result = httpResponse.getHeaders("location")[0].getValue();
            } else {
                httpRequest.abort();
                throw new RuntimeException("HttpClient,error status code :" + statusCode);
            }
        } else {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity, XmlData.CHARSET);
            }
            EntityUtils.consume(entity);
        }
        return result;
    }

    // 处理错误的方法
    public void handleError(YzhRequest<?> req, Exception e) {
        if (yzhConfig.isDebug()) {
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
        }
    }
}
