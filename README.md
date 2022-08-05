# 云账户 SDK for Java

欢迎使用云账户 SDK for Java。  
云账户是一家专注为平台企业和新就业形态劳动者提供高质量灵活就业服务的新时代企业。云账户 SDK 对云账户综合服务平台 API 接口进行封装，让您不必关心过多参数请求，帮助您快速接入到云账户综合服务平台。云账户 SDK for Java 为您提供签约、下单、回调、数据查询等功能，帮助您完成与云账户综合服务平台的接口对接及业务开发。  
如果您在使用过程中遇到任何问题，欢迎在当前 GitHub 提交 Issues，或发送邮件至技术支持组 [techsupport@yunzhanghu.com](mailto:techsupport@yunzhanghu.com)。

### 环境要求

云账户 SDK for Java 支持 Java JDK 1.8 及其以上版本。

### 配置密钥

#### 1、获取配置

使用云账户 SDK for Java 前，您需先获取 dealer_id、broker_id、3DES Key、App Key 信息。    
获取方式：使用开户邮件中的账号登录【[云账户综合服务平台](https://service.yunzhanghu.com/user/login)】，选择“业务中心 > 业务管理 > 对接信息”，查看并获取以上配置信息。  
![获取配置信息](src/main/resources/img/keyconfig.png)

#### 2、生成密钥

- 方式一：使用 OpenSSL 生成 RSA 公私钥

```
① ⽣成私钥 private_key.pem

Openssl-> genrsa -out private_key.pem 2048 位  // 建议密钥⻓度⾄少为 2048

OpenSSL-> pkcs8 -topk8 -inform PEM -in private_key.pem -outform PEM -nocrypt -out private_key_pkcs8.pem  // 将私钥转为 PKCS8 格式 

② ⽣成公钥⽂件 pubkey.pem

Openssl-> rsa -in private_key.pem -pubout -out pubkey.pem

```

- 方式二：使用工具生成

请联系云账户技术支持获取 RSA 密钥生成工具

#### 3、配置密钥

登录【云账户综合服务平台】，选择“业务中心 > 业务管理 > 对接信息”，单击页面右上角的“编辑”，配置平台企业公钥。
![配置平台企业公钥信息](src/main/resources/img/publickeyconfig.png)

### 安装Java SDK

1、maven 依赖请参考 https://search.maven.org/artifact/com.yunzhanghu.openapi/sdk/  
如有特殊需求需要源码，请联系云账户技术支持。

### 快速使用

#### 示例

```

import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhConfig.SignType;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.payment.PaymentClient;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderResponse;
import org.junit.Assert;
import org.junit.Test;

// 接口调用示例
public class Payment {

    // 银行卡实时下单接口
    @Test
    public void bankCardOrder() {
        try {
            YzhConfig config = getYzhConfig();
            PaymentClient client = new PaymentClient(config);

            CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
            request.setOrderId("");
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

    // 获取基础配置
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
}

```
