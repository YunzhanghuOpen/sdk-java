package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.taxclearrefund.TaxClearRefundClient;
import com.yunzhanghu.sdk.taxclearrefund.domain.*;

// 连续劳务税费退补
public class TaxClearRefund {

    private static YzhConfig config = Config.getYzhConfig();
    private static TaxClearRefundClient client = new TaxClearRefundClient(config);

    public static void main(String[] args) {
        // 查询税费清缴完成结果
        getClearTaxInfo();
        // 查询税费清缴明细文件
        getClearTaxFile();
        // 查询税费退补完成结果
        getRefundTaxInfo();
        // 查询税费退补涉及劳动者
        getRefundTaxLaborInfo();

    }

    // 查询税费清缴完成结果
    private static void getClearTaxInfo() {
        GetClearTaxInfoRequest request = new GetClearTaxInfoRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setTaxMonth("2025-10");
        YzhResponse<GetClearTaxInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getClearTaxInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetClearTaxInfoResponse data = response.getData();
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

    // 查询税费清缴明细文件
    private static void getClearTaxFile() {
        GetClearTaxFileRequest request = new GetClearTaxFileRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setTaxMonth("2025-10");
        request.setBatchId("10313232135454132");
        YzhResponse<GetClearTaxFileResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getClearTaxFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetClearTaxFileResponse data = response.getData();
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

    // 查询税费退补完成结果
    private static void getRefundTaxInfo() {
        GetRefundTaxInfoRequest request = new GetRefundTaxInfoRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setTaxMonth("2025-10");
        request.setBatchId("10313232135454132");
        YzhResponse<RefundTaxData> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getRefundTaxInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                RefundTaxData data = response.getData();
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

    // 查询税费退补涉及劳动者
    private static void getRefundTaxLaborInfo() {
        GetRefundTaxLaborInfoRequest request = new GetRefundTaxLaborInfoRequest();
        request.setBrokerId(config.getBrokerId());
        request.setDealerId(config.getDealerId());
        request.setTaxMonth("2025-10");
        request.setBatchId("10313232135454132");
        request.setOffset(0);
        request.setLength(500);
        YzhResponse<GetRefundTaxLaborInfoResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.getRefundTaxLaborInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                GetRefundTaxLaborInfoResponse data = response.getData();
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