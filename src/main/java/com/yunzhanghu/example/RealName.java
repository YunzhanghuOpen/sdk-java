package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.calculatelabor.domain.*;
import com.yunzhanghu.sdk.realname.RealNameServiceClient;
import com.yunzhanghu.sdk.realname.domain.CollectRealNameInfoRequest;
import com.yunzhanghu.sdk.realname.domain.CollectRealNameInfoResponse;
import com.yunzhanghu.sdk.realname.domain.QueryRealNameInfoRequest;
import com.yunzhanghu.sdk.realname.domain.QueryRealNameInfoResponse;

// 用户实名认证信息收集
public class RealName {
    private static YzhConfig config = Config.getYzhConfig();
    private static RealNameServiceClient client = new RealNameServiceClient(config);

    public static void main(String[] args) {
        // 用户实名认证信息收集-人脸认证方式
        collectRealNameInfoFace();
        // 用户实名认证信息收集-银行卡四要素认证方式
        collectRealNameInfoBank();
        // 用户实名认证信息收集-人工审核
        collectRealNameInfoReviewer();
        // 用户实名认证信息查询
        queryRealNameInfo();
    }

    // 用户实名认证信息收集-人脸认证方式
    private static void collectRealNameInfoFace() {
        CollectRealNameInfoRequest request = new CollectRealNameInfoRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("110xxxxxxxxxxxxx16");
        request.setRealnameResult(1);
        request.setRealnameTime("2025-09-09 19:19:19");
        request.setRealnameType(1);
        request.setRealnameTraceId("1413536187796566016");
        request.setRealnamePlatform("xxxxxxx公司");
        request.setFaceImageCollectType(1);
        request.setFaceImage("https://www.example.com/file_name.png");
        request.setFaceVerifyScore("89.12");

        YzhResponse<CollectRealNameInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.collectRealNameInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CollectRealNameInfoResponse data = response.getData();
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

    // 用户实名认证信息收集-银行卡四要素认证方式
    private static void collectRealNameInfoBank() {
        CollectRealNameInfoRequest request = new CollectRealNameInfoRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("110xxxxxxxxxxxxx16");
        request.setRealnameResult(1);
        request.setRealnameTime("2025-09-09 19:19:19");
        request.setRealnameType(2);
        request.setRealnameTraceId("1413536187796566016");
        request.setRealnamePlatform("xxxxxxx公司");
        request.setBankNo("6127000xxxxxxx16");
        request.setBankPhone("188xxx8888");

        YzhResponse<CollectRealNameInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.collectRealNameInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CollectRealNameInfoResponse data = response.getData();
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

    // 用户实名认证信息收集-人工审核
    private static void collectRealNameInfoReviewer() {
        CollectRealNameInfoRequest request = new CollectRealNameInfoRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("110xxxxxxxxxxxxx16");
        request.setRealnameResult(1);
        request.setRealnameTime("2025-09-09 19:19:19");
        request.setRealnameType(3);
        request.setRealnameTraceId("1413536187796566016");
        request.setRealnamePlatform("xxxxxxx公司");
        request.setFaceImageCollectType(1);
        request.setFaceImage("https://www.example.com/file_name.png");
        request.setFaceVerifyScore("89.12");
        request.setBankNo("6127000xxxxxxx16");
        request.setBankPhone("188xxx8888");
        request.setReviewer("908xxx8888");

        YzhResponse<CollectRealNameInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.collectRealNameInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CollectRealNameInfoResponse data = response.getData();
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

    // 用户实名认证信息查询
    private static void queryRealNameInfo() {
        QueryRealNameInfoRequest request = new QueryRealNameInfoRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("110xxxxxxxxxxxxx16");

        YzhResponse<QueryRealNameInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.queryRealNameInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                QueryRealNameInfoResponse data = response.getData();
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