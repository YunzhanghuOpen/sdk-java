package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.yzhcustom.YzhCustomClient;
import lombok.Data;

// 通用请求函数
public class YzhCustom {

    private static YzhConfig config = Config.getYzhConfig();
    private static YzhCustomClient client = new YzhCustomClient(config);

    public static void main(String[] args) {
        // 通用请求函数
        customMethod();
    }

    /**
     * 通用请求函数
     * 适用于 SDK 暂未支持的接口
     * 以“银行卡实时支付”接口为例
     */
    private static void customMethod() {
        // 接口请求地址
        String url = "/api/payment/v1/order-bankpay";

        // 接口请求方式
        String method = "POST";

        // 构建业务请求参数
        // request-id：请求ID，请求的唯一标识
        // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
        // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
        String requestId = BaseUtil.getRandomStr("requestId");
        CustomRequest yzhCustomRequest = getCustomRequest();
        YzhRequest<CustomRequest> yzhRequest = YzhRequest.build(requestId, yzhCustomRequest);

        // 发起请求
        YzhResponse<CustomResponse> response = null;
        try {
            response = client.doRequest(yzhRequest, url, method, CustomResponse.class);
            if (response.isSuccess()) {
                // 操作成功
                CustomResponse data = response.getData();
                System.out.println("操作成功：" + data);
            } else {
                // 失败返回
                System.out.println("HTTP Status Code：" + response.getHttpCode());
                System.out.println("失败返回：" + response.getCode() + "-" + response.getMessage());
            }
        } catch (Exception e) {
            // 发生异常
            e.printStackTrace();
        }
    }

    private static CustomRequest getCustomRequest() {
        CustomRequest request = new CustomRequest();
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
        return request;
    }
}

// 自定义请求结构体
@Data
class CustomRequest {

    // 平台企业订单号
    private String orderId;

    // 平台企业 ID
    private String dealerId;

    // 综合服务主体 ID
    private String brokerId;

    // 姓名
    private String realName;

    // 银行卡号
    private String cardNo;

    // 身份证号码
    private String idCard;

    // 手机号
    private String phoneNo;

    // 订单金额
    private String pay;

    // 订单备注
    private String payRemark;

    // 回调地址
    private String notifyUrl;
}

// 自定义返回结构体
@Data
class CustomResponse {

    // 平台企业订单号
    private String orderId;

    // 综合服务平台流水号
    private String ref;

    // 订单金额
    private String pay;
}