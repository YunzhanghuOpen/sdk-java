package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.walletincome.WalletIncomeClient;
import com.yunzhanghu.sdk.walletincome.domain.*;

// 钱包余额入账
public class WalletIncome {

    private static YzhConfig config = Config.getYzhConfig();
    private static WalletIncomeClient client = new WalletIncomeClient(config);

    public static void main(String[] args) {
        // 发起钱包余额入账
        createWalletIncome();
        // 查询钱包余额入账结果
        queryWalletIncome();
        // 取消钱包收入计税订单
        cancelWalletIncome();
        // 重试挂起的计税订单
        retryWalletIncome();
    }

    // 发起钱包余额入账
    private static void createWalletIncome() {
        CreateWalletIncomeRequest request = new CreateWalletIncomeRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        WalletIncomeUserInfo userInfo = new WalletIncomeUserInfo();
        userInfo.setRealName("张三");
        userInfo.setIdCard("11010519491231002X");
        userInfo.setCardType("idcard");
        userInfo.setPhoneNo("13800000000");
        request.setUserInfo(userInfo);
        request.setWalletId("wallet_123456");
        WalletIncomePlatformInfo platformInfo = new WalletIncomePlatformInfo();
        platformInfo.setPlatformName("xxx平台");
        platformInfo.setUserId("123456");
        platformInfo.setUserNickname("张三");
        request.setPlatformInfo(platformInfo);
        request.setOrderId("20200903001656212987");
        request.setAmount("300.00");
        request.setEarnedAt("2020-09-01 10:00:00");
        request.setRemark("9月直播收入");
        request.setNotifyUrl("https://www.example.com/income/notify");
        YzhResponse<CreateWalletIncomeResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.createWalletIncome(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CreateWalletIncomeResponse data = response.getData();
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

    // 查询钱包余额入账结果
    private static void queryWalletIncome() {
        QueryWalletIncomeRequest request = new QueryWalletIncomeRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300001");
        YzhResponse<QueryWalletIncomeResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.queryWalletIncome(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                QueryWalletIncomeResponse data = response.getData();
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

    // 取消钱包收入计税订单
    private static void cancelWalletIncome() {
        CancelWalletIncomeRequest request = new CancelWalletIncomeRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300001");
        request.setCancelOrderId("20200903001656212988");
        YzhResponse<CancelWalletIncomeResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.cancelWalletIncome(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CancelWalletIncomeResponse data = response.getData();
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

    // 重试挂起的计税订单
    private static void retryWalletIncome() {
        RetryWalletIncomeRequest request = new RetryWalletIncomeRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300001");
        YzhResponse<RetryWalletIncomeResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.retryWalletIncome(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                RetryWalletIncomeResponse data = response.getData();
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
