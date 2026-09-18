package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.walletdeduct.WalletDeductClient;
import com.yunzhanghu.sdk.walletdeduct.domain.*;

// 钱包余额扣减
public class WalletDeduct {

    private static YzhConfig config = Config.getYzhConfig();
    private static WalletDeductClient client = new WalletDeductClient(config);

    public static void main(String[] args) {
        // 申请钱包余额扣减
        createWalletDeduct();
        // 查询钱包余额扣减申请结果
        queryWalletDeduct();
        // 提交钱包余额扣减结果
        completeWalletDeduct();
    }

    // 申请钱包余额扣减
    private static void createWalletDeduct() {
        CreateWalletDeductRequest request = new CreateWalletDeductRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        WalletDeductUserInfo userInfo = new WalletDeductUserInfo();
        userInfo.setRealName("张三");
        userInfo.setIdCard("11010519491231002X");
        userInfo.setCardType("idcard");
        request.setUserInfo(userInfo);
        request.setWalletId("wallet_123456");
        request.setOrderId("20200903001656212987");
        request.setScene("3");
        request.setAmount("300.00");
        request.setRemark("根据平台企业规则扣减");
        request.setNotifyUrl("https://www.example.com/realtime/notify");
        YzhResponse<CreateWalletDeductResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.createWalletDeduct(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CreateWalletDeductResponse data = response.getData();
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

    // 查询钱包余额扣减申请结果
    private static void queryWalletDeduct() {
        QueryWalletDeductRequest request = new QueryWalletDeductRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        YzhResponse<QueryWalletDeductResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.queryWalletDeduct(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                QueryWalletDeductResponse data = response.getData();
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

    // 提交钱包余额扣减结果
    private static void completeWalletDeduct() {
        CompleteWalletDeductRequest request = new CompleteWalletDeductRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        request.setStatus("1");
        request.setTradeNo("202010150030000001");
        request.setFinishedAt("2020-10-15 00:30:00");
        YzhResponse<CompleteWalletDeductResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.completeWalletDeduct(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CompleteWalletDeductResponse data = response.getData();
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
