package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.bizlicgxv2h5.BizlicGxV2H5ServiceClient;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.GxV2H5GetAicStatusRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.GxV2H5GetAicStatusResponse;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.GxV2H5GetStartUrlRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.GxV2H5GetStartUrlResponse;

// 个体工商户注册（云账户共享大额 H5）
public class BizlicGxV2H5 {

    private static YzhConfig config = Config.getYzhConfig();
    private static BizlicGxV2H5ServiceClient client = new BizlicGxV2H5ServiceClient(config);

    public static void main(String[] args) {
        // 预启动
        gxV2H5GetStartUrl();
        // 查询个体工商户状态
        gxV2H5GetAicStatus();
    }

    // 预启动
    private static void gxV2H5GetStartUrl() {
        GxV2H5GetStartUrlRequest request = new GxV2H5GetStartUrlRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setDealerUserId("userId1234567890");
        request.setClientType(1);
        request.setNotifyUrl("https://www.example.com");
        request.setColor("#007AFF");
        request.setReturnUrl("https://www.example.com");
        request.setCustomerTitle(1);
        YzhResponse<GxV2H5GetStartUrlResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.gxV2H5GetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GxV2H5GetStartUrlResponse data = response.getData();
                System.out.println("操作成功：" + data);
            } else {
                // 失败返回
                System.out.println("HTTP Status Code：" + response.getHttpCode());
                System.out.println("失败返回：" + response.getCode() + response.getMessage());
            }
        } catch (Exception e) {
            // 发生异常
            e.printStackTrace();
        }
    }

    // 查询个体工商户状态
    private static void gxV2H5GetAicStatus() {
        GxV2H5GetAicStatusRequest request = new GxV2H5GetAicStatusRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setOpenId("openId1234567890");
        request.setRealName("张三");
        request.setIdCard("11010519491231002X");
        request.setDealerUserId("userId1234567890");
        YzhResponse<GxV2H5GetAicStatusResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.gxV2H5GetAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GxV2H5GetAicStatusResponse data = response.getData();
                System.out.println("操作成功：" + data);
            } else {
                // 失败返回
                System.out.println("HTTP Status Code：" + response.getHttpCode());
                System.out.println("失败返回：" + response.getCode() + response.getMessage());
            }
        } catch (Exception e) {
            // 发生异常
            e.printStackTrace();
        }
    }
}
