package com.yunzhanghu.sdk.payment;

import com.yunzhanghu.sdk.BaseTest;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderResponse;
import com.yunzhanghu.sdk.payment.domain.GetOrderRequest;
import com.yunzhanghu.sdk.payment.domain.GetOrderResponse;
import com.yunzhanghu.sdk.utils.JsonUtil;
import org.junit.Assert;
import org.junit.Test;


public class Payment extends BaseTest {

    @Test
    public void bankCardOrderHmac() throws Exception {
        YzhConfig config = YzhConfig.loadYaml("yzh-sha256.yaml");

        PaymentClient client = new PaymentClient(config);

        CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
        request.setOrderId(getOrderId("bank"));
        request.setDealerId("");
        request.setBrokerId("");
        request.setRealName("");
        request.setCardNo("");
        request.setPhoneNo("");
        request.setIdCard("");
        request.setPay("");
        request.setPayRemark("");
        request.setNotifyUrl("");

        // 调用银行卡打款
        YzhResponse<CreateBankpayOrderResponse> response = client.createBankpayOrder(YzhRequest.build(request));

        System.out.println(response);
        Assert.assertTrue(response.isSuccess());

        CreateBankpayOrderResponse data = response.getData();
        System.out.println(data);
    }

    @Test
    public void bankCardOrderRsa() throws Exception {
        YzhConfig config = YzhConfig.loadConfig("yzh.properties");

        PaymentClient client = new PaymentClient(config);

        CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
        request.setOrderId(getOrderId(""));
        request.setDealerId("");
        request.setBrokerId("");
        request.setRealName("");
        request.setCardNo("");
        request.setPhoneNo("");
        request.setIdCard("");
        request.setPay("");
        request.setPayRemark("");
        request.setNotifyUrl("");

        // 调用银行卡打款
        YzhResponse<CreateBankpayOrderResponse> response = client.createBankpayOrder(YzhRequest.build(request));

        System.out.println(response);
        Assert.assertTrue(response.isSuccess());

        CreateBankpayOrderResponse data = response.getData();
        System.out.println(data);
    }

    //
    @Test
    public void getOrder() throws Exception {
        YzhConfig config = YzhConfig.loadConfig("yzh-sha256.properties");
        PaymentClient client = new PaymentClient(config);

        GetOrderRequest request = new GetOrderRequest();
        request.setOrderId("");
        request.setChannel("");

        // 调用银行卡打款
        YzhResponse<GetOrderResponse> response = client.getOrder(YzhRequest.build(request));
        System.out.println(response);
        Assert.assertTrue(response.isSuccess());

        GetOrderResponse data = response.getData();
        System.out.println(JsonUtil.toJson(data));
    }

}
