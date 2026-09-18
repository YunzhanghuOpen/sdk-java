package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.walletbalancequery.WalletBalanceQueryClient;
import com.yunzhanghu.sdk.walletbalancequery.domain.*;

// 钱包余额查询
public class WalletBalanceQuery {

    private static YzhConfig config = Config.getYzhConfig();
    private static WalletBalanceQueryClient client = new WalletBalanceQueryClient(config);

    public static void main(String[] args) {
        // 查询钱包余额
        queryWalletBalance();
    }

    // 查询钱包余额
    private static void queryWalletBalance() {
        QueryWalletBalanceRequest request = new QueryWalletBalanceRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        WalletBalanceQueryUserInfo userInfo = new WalletBalanceQueryUserInfo();
        userInfo.setRealName("张三");
        userInfo.setIdCard("11010519491231002X");
        userInfo.setCardType("idcard");
        request.setUserInfo(userInfo);
        request.setWalletId("wallet_123456");
        YzhResponse<QueryWalletBalanceResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.queryWalletBalance(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                QueryWalletBalanceResponse data = response.getData();
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
