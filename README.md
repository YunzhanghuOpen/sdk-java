# 云账户 SDK for Java

欢迎使用云账户 SDK for Java。  
云账户是一家专注为平台企业和新就业形态劳动者提供高质量灵活就业服务的新时代企业。云账户 SDK 对云账户综合服务平台 API 接口进行封装，让您不必担心过多参数请求，帮助您快速接入到云账户综合服务平台。云账户 SDK for Java 为您提供签约、下单、回调、数据查询等功能，帮助您完成与云账户综合服务平台的接口对接及业务开发。  
如果您在使用过程中遇到任何问题，请在当前 GitHub 提交 Issues，或发送邮件至技术支持组 [technicalsupport@yunzhanghu.com](mailto:technicalsupport@yunzhanghu.com)。

### 环境要求

云账户 SDK for Java 支持 Java JDK 1.8 及以上版本。

### 配置密钥

#### 1、获取配置

使用云账户 SDK for Java 前，您需先获取 dealer_id、broker_id、3DES Key、App Key、云账户公钥。  
获取方式：使用开户邮件中的账号登录【[云账户综合服务平台](https://service.yunzhanghu.com)】，选择“业务中心 > 业务管理 > 对接信息”，查看并获取以上配置信息。  
![获取配置信息](https://yos.yunzhanghu.com/getobject/2025-02-10-duijiexinxi.png?isAttachment=false&fileID=aed58af41aedcc178a160094cf57bea52b5ead65&signature=FGeLvvOykgSldgmDzR%2F%2FxLDH%2FDL049Bz5OWR8XnyohE%3D)

#### 2、生成密钥

- 方式一：使用 OpenSSL 生成 RSA 公私钥

```
① ⽣成私钥 private_key.pem

OpenSSL-> genrsa -out private_key.pem 2048   // 建议密钥⻓度⾄少为 2048 位

OpenSSL-> pkcs8 -topk8 -inform PEM -in private_key.pem -outform PEM -nocrypt -out private_key_pkcs8.pem  // 将私钥转为 PKCS8 格式 

② ⽣成公钥⽂件 pubkey.pem

OpenSSL-> rsa -in private_key.pem -pubout -out pubkey.pem

```

- 方式二：使用工具生成

登录【[云账户开放平台](https://open.yunzhanghu.com/)】，选择“开发工具下载 > 开发助手 > 工具下载”，下载安装“云账户开放平台开发助手”

#### 3、配置密钥

登录【[云账户综合服务平台](https://service.yunzhanghu.com)】，选择“业务中心 > 业务管理 > 对接信息”，单击页面右上角的“编辑”，配置平台企业公钥。
![配置平台企业公钥信息](https://yos.yunzhanghu.com/getobject/2025-02-11-dealerpublickey.png?isAttachment=false&fileID=6359c3b70c1a93aad5d230c76095a8baa61f4627&signature=pDmxtJYTn9Rghn1POO3XAWHXo1wIBenFXAu9ABEyGbk%3D)

## 安装Java SDK

### maven 依赖：

```
<dependency>
    <groupId>com.yunzhanghu.openapi</groupId>
    <artifactId>sdk</artifactId>
    <version>1.4.38-RELEASE</version>
</dependency>
```

### 快速使用

#### 示例功能列表

- [用户信息验证](src/main/java/com/yunzhanghu/example/Authentication.java) 
- 用户签约
   - [H5 签约](src/main/java/com/yunzhanghu/example/H5UserSign.java)
   - [API 签约](src/main/java/com/yunzhanghu/example/ApiUserSign.java)
   - [签约信息上传](src/main/java/com/yunzhanghu/example/UploadUserSign.java)
- 个体工商户注册
   - [云账户新经济 H5](src/main/java/com/yunzhanghu/example/BizLicXjjH5.java)
   - [云账户新经济 H5+API](src/main/java/com/yunzhanghu/example/BizLicXjjH5Api.java) 
- [实时支付](src/main/java/com/yunzhanghu/example/Payment.java)
- [异步回调](src/main/java/com/yunzhanghu/example/Notify.java) 
- [对账文件获取](src/main/java/com/yunzhanghu/example/DataService.java)
- [发票开具](src/main/java/com/yunzhanghu/example/Invoice.java)
- [个人所得税申报明细表](src/main/java/com/yunzhanghu/example/Tax.java)

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
            // 设置连接超时时间，默认 30S
            client.setSocketTimeout(30*1000);// 单位：毫秒

            CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
            request.setOrderId("202009010016562012987");
            request.setDealerId(config.getDealerId());
            request.setBrokerId(config.getBrokerId());
            request.setRealName("张三");
            request.setCardNo("6228888888888888888");
            request.setPhoneNo("188****8888");
            request.setIdCard("11010519491231002X");
            request.setPay("100.00");
            request.setPayRemark("");
            request.setNotifyUrl("https://www.example.com");

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
        // config = YzhConfig.loadConfig("yzh.properties");

        // 方式二：自定义配置
        config.setDealerId("");
        config.setBrokerId("");
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
