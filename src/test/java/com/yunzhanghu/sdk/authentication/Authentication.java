package com.yunzhanghu.sdk.authentication;

import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthVerifyRequest;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthVerifyResponse;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.invoice.InvoiceClient;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatResponse;

public class Authentication {
    public static void main(String[] args) throws Exception {
        YzhConfig yzhConfig = new YzhConfig();
        yzhConfig.setDealerId("");
        yzhConfig.setSignType(YzhConfig.SignType.SHA256);
        yzhConfig.setYzh3DesKey("");
        yzhConfig.setYzhAppKey("");
        yzhConfig.setYzhRsaPrivateKey("");
        yzhConfig.setYzhRsaPublicKey("");
        yzhConfig.setYzhUrl("");

        AuthenticationClient authenticationClient = new AuthenticationClient(yzhConfig);
        BankCardFourAuthVerifyRequest bankCardFourAuthVerifyRequest = new BankCardFourAuthVerifyRequest();

        bankCardFourAuthVerifyRequest.setCardNo("");
        bankCardFourAuthVerifyRequest.setIdCard("");
        bankCardFourAuthVerifyRequest.setMobile("");
        bankCardFourAuthVerifyRequest.setRealName("");

        YzhRequest<BankCardFourAuthVerifyRequest> request = new YzhRequest<>();
        request.setRequestId("");
        request.setRequest(bankCardFourAuthVerifyRequest);
        YzhResponse<BankCardFourAuthVerifyResponse> response = authenticationClient.bankCardFourAuthVerify(request);
        System.out.println(response);



    }
}
