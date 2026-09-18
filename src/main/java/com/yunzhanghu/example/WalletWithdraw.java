package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.walletwithdraw.WalletWithdrawClient;
import com.yunzhanghu.sdk.walletwithdraw.domain.*;

// 钱包余额提现
public class WalletWithdraw {

    private static YzhConfig config = Config.getYzhConfig();
    private static WalletWithdrawClient client = new WalletWithdrawClient(config);

    public static void main(String[] args) {
        // 发起钱包余额提现
        createWalletWithdraw();
        // 查询钱包余额提现结果
        queryWalletWithdraw();
        // 取消挂起的钱包余额提现订单
        cancelWalletWithdraw();
        // 重试挂起的钱包余额提现订单
        retryWalletWithdraw();
        // 查询钱包余额提现电子回单
        getWalletWithdrawReceiptFile();
    }

    // 发起钱包余额提现
    private static void createWalletWithdraw() {
        CreateWalletWithdrawRequest request = new CreateWalletWithdrawRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        WalletWithdrawUserInfo userInfo = new WalletWithdrawUserInfo();
        userInfo.setRealName("张三");
        userInfo.setIdCard("11010519491231002X");
        userInfo.setCardType("idcard");
        request.setUserInfo(userInfo);
        request.setWalletId("wallet_123456");
        request.setOrderId("20200903001656212987");
        request.setWxAppId("wx1234567890abcdef");
        request.setAmount("300.00");
        request.setChannel("bankpay");
        request.setAccount("6222021234567890123");
        request.setRemark("10月直播提现");
        request.setNotifyUrl("https://www.example.com/realtime/notify");
        YzhResponse<CreateWalletWithdrawResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.createWalletWithdraw(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CreateWalletWithdrawResponse data = response.getData();
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

    // 查询钱包余额提现结果
    private static void queryWalletWithdraw() {
        QueryWalletWithdrawRequest request = new QueryWalletWithdrawRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setChannel("bankpay");
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        YzhResponse<QueryWalletWithdrawResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.queryWalletWithdraw(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                QueryWalletWithdrawResponse data = response.getData();
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

    // 取消挂起的钱包余额提现订单
    private static void cancelWalletWithdraw() {
        CancelWalletWithdrawRequest request = new CancelWalletWithdrawRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        YzhResponse<CancelWalletWithdrawResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.cancelWalletWithdraw(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CancelWalletWithdrawResponse data = response.getData();
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

    // 重试挂起的钱包余额提现订单
    private static void retryWalletWithdraw() {
        RetryWalletWithdrawRequest request = new RetryWalletWithdrawRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        YzhResponse<RetryWalletWithdrawResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.retryWalletWithdraw(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                RetryWalletWithdrawResponse data = response.getData();
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

    // 查询钱包余额提现电子回单
    private static void getWalletWithdrawReceiptFile() {
        GetWalletWithdrawReceiptFileRequest request = new GetWalletWithdrawReceiptFileRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setOrderId("20200903001656212987");
        request.setRef("176826728300002");
        request.setReceiptType("付款回单");
        YzhResponse<GetWalletWithdrawReceiptFileResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getWalletWithdrawReceiptFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetWalletWithdrawReceiptFileResponse data = response.getData();
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
