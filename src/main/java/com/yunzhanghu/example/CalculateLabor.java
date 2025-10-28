package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.calculatelabor.domain.*;
import com.yunzhanghu.sdk.calculatelabor.CalculateLaborServiceClient;

//  连续劳务税费试算
public class CalculateLabor {

    private static YzhConfig config = Config.getYzhConfig();
    private static CalculateLaborServiceClient client = new CalculateLaborServiceClient(config);

    public static void main(String[] args) {
        // 连续劳务税费试算（计算器）
        laborCaculator();
        // 订单税费试算
        calcTax();
        // 连续劳务年度税费测算-H5
        calculationYearH5Url();
        // 连续劳务单笔结算税费测算-H5
        calculationH5Url();
    }

    // 连续劳务税费试算（计算器）
    private static void laborCaculator() {
        LaborCaculatorRequest request = new LaborCaculatorRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setMonthSettlementList(getMonthSettlementList());

        YzhResponse<LaborCaculatorResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.laborCaculator(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                LaborCaculatorResponse data = response.getData();
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

    private static MonthSettlement[] getMonthSettlementList() {
        MonthSettlement info1 = new MonthSettlement();
        info1.setMonth(1);
        info1.setMonthPreTaxAmount("10.00");

        MonthSettlement info2 = new MonthSettlement();
        info2.setMonth(2);
        info2.setMonthPreTaxAmount("10.00");

        MonthSettlement[] infoArry = new MonthSettlement[2];
        infoArry[0] = info1;
        infoArry[1] = info2;
        return infoArry;
    }

    // 订单税费试算
    private static void calcTax() {
        CalcTaxRequest request = new CalcTaxRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("11010519491231002X");
        request.setPay("99");
        request.setTaxType("after_tax");
        YzhResponse<CalcTaxResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.calcTax(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CalcTaxResponse data = response.getData();
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

    // 连续劳务年度税费测算-H5
    private static void calculationYearH5Url() {
        CalculationYearH5UrlRequest request = new CalculationYearH5UrlRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setColor("#FF3D3D");
        request.setNavbarHide(0);
        request.setTitle("云账户");
        YzhResponse<CalculationYearH5UrlResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.calculationYearH5Url(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CalculationYearH5UrlResponse data = response.getData();
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

    // 连续劳务单笔结算税费测算-H5
    private static void calculationH5Url() {
        CalculationH5UrlRequest request = new CalculationH5UrlRequest();
        request.setDealerId(config.getDealerId());
        request.setBrokerId(config.getBrokerId());
        request.setColor("#FF3D3D");
        request.setRealName("张三");
        request.setIdCard("11010519491231002X");
        request.setNavbarHide(0);
        request.setTitle("云账户");
        YzhResponse<CalculationH5UrlResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.calculationH5Url(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CalculationH5UrlResponse data = response.getData();
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
