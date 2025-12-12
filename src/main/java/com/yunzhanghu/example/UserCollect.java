package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.usercollect.UserCollectServiceClient;
import com.yunzhanghu.sdk.usercollect.domain.*;

// 用户信息收集
public class UserCollect {

    private static YzhConfig config = Config.getYzhConfig();
    private static UserCollectServiceClient client = new UserCollectServiceClient(config);

    public static void main(String[] args) {
        // 查询手机号码绑定状态
        getUserCollectPhoneStatus();
        // 获取收集手机号码页面
        getUserCollectPhoneUrl();
    }

    // 查询手机号码绑定状态
    private static void getUserCollectPhoneStatus() {
        GetUserCollectPhoneStatusRequest request = new GetUserCollectPhoneStatusRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setDealerUserId("userId1234567890");
        request.setRealName("张三");
        request.setIdCard("11010519491231002X");
        request.setCertificateType(0);
        YzhResponse<GetUserCollectPhoneStatusResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getUserCollectPhoneStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetUserCollectPhoneStatusResponse data = response.getData();
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

    // 获取收集手机号码页面
    private static void getUserCollectPhoneUrl() {
        GetUserCollectPhoneUrlRequest request = new GetUserCollectPhoneUrlRequest();
        request.setToken("testToken");
        request.setColor("");
        request.setUrl("https://www.example.com");
        request.setRedirectUrl("");
        YzhResponse<GetUserCollectPhoneUrlResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getUserCollectPhoneUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetUserCollectPhoneUrlResponse data = response.getData();
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

}
