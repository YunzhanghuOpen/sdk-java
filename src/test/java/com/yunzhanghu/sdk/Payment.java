package com.yunzhanghu.sdk;

import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhConfig.SignType;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.payment.PaymentClient;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderResponse;
import com.yunzhanghu.sdk.utils.BaseUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * 接口调用示例
 */
public class Payment {

    /**
     * 获取基础配置
     *
     * @return
     */
    private static YzhConfig getYzhConfig() {
        YzhConfig config = new YzhConfig();
        // 方式一：从配置文件获取
        // 签名方式：sha256
		// config = YzhConfig.loadYaml("yzh-sha256.yaml");
        // 签名方式：rsa
		// config = YzhConfig.loadConfig("yzh.properties");

        // 方式二：自定义配置
        config.setDealerId("");
        config.setSignType(SignType.RSA);
        config.setYzh3DesKey("");
        config.setYzhAppKey("");
        config.setYzhRsaPrivateKey("");
        config.setYzhRsaPublicKey("");
        config.setYzhUrl("https://api-service.yunzhanghu.com");
        return config;
    }

    /**
     * 银行卡实时下单接口
     */
    @Test
    public void bankCardOrder() {
        try {
            YzhConfig config = getYzhConfig();

            PaymentClient client = new PaymentClient(config);

            CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
            request.setOrderId(BaseUtil.getOrderId("bank"));
            request.setDealerId("");
            request.setBrokerId("");
            request.setRealName("");
            request.setCardNo("");
            request.setPhoneNo("");
            request.setIdCard("");
            request.setPay("");
            request.setPayRemark("");
            request.setNotifyUrl("");

            // 调用银行卡实时下单接口
            YzhResponse<CreateBankpayOrderResponse> response = client.createBankpayOrder(YzhRequest.build(request));
            System.out.println(response);

            Assert.assertTrue(response.isSuccess());

            CreateBankpayOrderResponse data = response.getData();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
