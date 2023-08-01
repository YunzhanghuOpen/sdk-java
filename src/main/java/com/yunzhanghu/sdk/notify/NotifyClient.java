package com.yunzhanghu.sdk.notify;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yunzhanghu.sdk.base.YzhClient;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.notify.domain.NotifyRequest;
import com.yunzhanghu.sdk.notify.domain.NotifyResponse;
import com.yunzhanghu.sdk.utils.DESUtil;
import com.yunzhanghu.sdk.utils.JsonUtil;
import com.yunzhanghu.sdk.utils.RSAUtil;
import com.yunzhanghu.sdk.utils.Sha256Util;

public class NotifyClient extends YzhClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotifyClient.class);
	private static Charset charset = StandardCharsets.UTF_8;

	public NotifyClient(YzhConfig yzhConfig) {
		super(yzhConfig);
	}

	// 异步回调验签和解密
	public <T> NotifyResponse<T> notifyDecoder(NotifyRequest request, Class<?> clazz) {
		NotifyResponse<T> response = new NotifyResponse<T>();
		if (YzhConfig.SignType.RSA.equals(getYzhConfig().getSignType())) {
			response = verifyAndDescryptRSA(request, clazz);
		} else if (YzhConfig.SignType.SHA256.equals(getYzhConfig().getSignType())) {
			response = verifyAndDescryptSha256(request, clazz);
		} else {
			throw new RuntimeException("signType error! signType must be rsa or sha256!");
		}
		return response;
	}

	// 异步回调验签和解密（RSA 签名算法）
	private <T> NotifyResponse<T> verifyAndDescryptRSA(NotifyRequest request, Class<?> clazz) {
		NotifyResponse<T> response = new NotifyResponse<T>();
		if (!verifyRSA(request)) {
			response.setSignRes(false);
			return response;
		}
		response.setSignRes(true);
		String descryptRes = descrypt3DES(request.getData());
		if (descryptRes == null) {
			response.setDescryptRes(false);
			return response;
		}
		response.setDescryptRes(true);
		response.setData(JsonUtil.fromLowerCasesWithUnderScoresJson(descryptRes, clazz));
		return response;
	}

	// 异步回调验签和解密（HMAC 签名算法）
	private <T> NotifyResponse<T> verifyAndDescryptSha256(NotifyRequest request, Class<?> clazz) {
		NotifyResponse<T> response = new NotifyResponse<T>();
		if (!verifySha256(request)) {
			response.setSignRes(false);
			return response;
		}
		response.setSignRes(true);
		String descryptRes = descrypt3DES(request.getData());
		if (descryptRes == null) {
			response.setDescryptRes(false);
			return response;
		}
		response.setDescryptRes(true);
		response.setData(JsonUtil.fromLowerCasesWithUnderScoresJson(descryptRes, clazz));
		return response;
	}

	private Boolean verifySha256(NotifyRequest request) {
		Boolean res = false;
		try {
			String content = getPain(request);
			res = Sha256Util.verify(content, request.getSign(), getYzhConfig().getYzhAppKey(), charset);
		} catch (Exception e) {
			LOGGER.error("Sha256 verify error, errorMsg: {}", e.getMessage(), e);
		}
		return res;
	}

	private Boolean verifyRSA(NotifyRequest request) {
		Boolean res = false;
		try {
			String content = getPain(request);
			res = RSAUtil.verify(content, request.getSign(), getYzhConfig().getYzhRsaPublicKey(), charset);
		} catch (Exception e) {
			LOGGER.error("RSA verify error, errorMsg: {}", e.getMessage(), e);
		}
		return res;
	}

	private String descrypt3DES(String data) {
		String res = null;
		try {
			res = DESUtil.decode(getYzhConfig().getYzh3DesKey(), data, charset);
		} catch (Exception e) {
			LOGGER.error("3DES descrypt error, errorMsg: {}", e.getMessage(), e);
		}
		return res;
	}

	private String getPain(NotifyRequest request) {
		String plain = new StringBuilder("data=").append(request.getData()).append("&mess=").append(request.getMess())
				.append("&timestamp=").append(request.getTimestamp()).append("&key=")
				.append(this.getYzhConfig().getYzhAppKey()).toString();
		return plain;
	}
}
