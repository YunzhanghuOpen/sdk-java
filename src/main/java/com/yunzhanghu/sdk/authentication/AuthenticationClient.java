package com.yunzhanghu.sdk.authentication;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.authentication.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationClient.class);

    public AuthenticationClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 银行卡四要素鉴权请求（下发短信验证码）
    public YzhResponse<BankCardFourAuthVerifyResponse> bankCardFourAuthVerify(YzhRequest<BankCardFourAuthVerifyRequest> req) throws YzhException {
        try {
            return post(req, "/authentication/verify-request", new TypeToken<YzhResponse<BankCardFourAuthVerifyResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 银行卡四要素确认请求（上传短信验证码）
    public YzhResponse<BankCardFourAuthConfirmResponse> bankCardFourAuthConfirm(YzhRequest<BankCardFourAuthConfirmRequest> req) throws YzhException {
        try {
            return post(req, "/authentication/verify-confirm", new TypeToken<YzhResponse<BankCardFourAuthConfirmResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 银行卡四要素验证
    public YzhResponse<BankCardFourVerifyResponse> bankCardFourVerify(YzhRequest<BankCardFourVerifyRequest> req) throws YzhException {
        try {
            return post(req, "/authentication/verify-bankcard-four-factor", new TypeToken<YzhResponse<BankCardFourVerifyResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 银行卡三要素验证
    public YzhResponse<BankCardThreeVerifyResponse> bankCardThreeVerify(YzhRequest<BankCardThreeVerifyRequest> req) throws YzhException {
        try {
            return post(req, "/authentication/verify-bankcard-three-factor", new TypeToken<YzhResponse<BankCardThreeVerifyResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 身份证实名验证
    public YzhResponse<IDCardVerifyResponse> iDCardVerify(YzhRequest<IDCardVerifyRequest> req) throws YzhException {
        try {
            return post(req, "/authentication/verify-id", new TypeToken<YzhResponse<IDCardVerifyResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 上传免验证用户名单信息
    public YzhResponse<UserExemptedInfoResponse> userExemptedInfo(YzhRequest<UserExemptedInfoRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/user/exempted/info", new TypeToken<YzhResponse<UserExemptedInfoResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 查看免验证用户名单是否存在
    public YzhResponse<UserWhiteCheckResponse> userWhiteCheck(YzhRequest<UserWhiteCheckRequest> req) throws YzhException {
        try {
            return post(req, "/api/payment/v1/user/white/check", new TypeToken<YzhResponse<UserWhiteCheckResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }

    // 银行卡信息查询接口
    public YzhResponse<GetBankCardInfoResponse> getBankCardInfo(YzhRequest<GetBankCardInfoRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/card", false, new TypeToken<YzhResponse<GetBankCardInfoResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}