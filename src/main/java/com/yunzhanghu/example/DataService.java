package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.dataservice.DataServiceClient;
import com.yunzhanghu.sdk.dataservice.domain.*;
import java.util.List;


// 对账文件获取
public class DataService {

	private static YzhConfig config = Config.getYzhConfig();
	private static DataServiceClient client = new DataServiceClient(config);

	public static void main(String[] args) {
		// 查询日订单文件
		getDailyOrderFile();
		// 查询日流水文件
		getDailyBillFileV2();
		// 查询平台企业预付业务服务费记录
		listDealerRechargeRecordV2();
		// 查询日订单数据
		listDailyOrder();
		// 查询日订单数据（支付和退款订单）
		listDailyOrderV2();
		// 查询日订单文件（支付和退款订单）
		getDailyOrderFileV2();
		// 查询日流水数据
		listDailyBill();
		// 查询余额日账单数据
		listBalanceDailyStatement();
		// 查询日订单汇总数据
		listDailyOrderSummary();
		// 查询月订单汇总数据
		listMonthlyOrderSummary();
	}

	// 查询日订单文件
	private static void getDailyOrderFile() {
		GetDailyOrderFileRequest request = new GetDailyOrderFileRequest();
		request.setOrderDate("2020-11-11");
		YzhResponse<GetDailyOrderFileResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getDailyOrderFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetDailyOrderFileResponse data = response.getData();
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

	// 查询日流水文件
	private static void getDailyBillFileV2() {
		GetDailyBillFileV2Request request = new GetDailyBillFileV2Request();
		request.setBillDate("2020-11-11");
		YzhResponse<GetDailyBillFileV2Response> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getDailyBillFileV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetDailyBillFileV2Response data = response.getData();
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

	// 查询平台企业预付业务服务费记录
	private static void listDealerRechargeRecordV2() {
		ListDealerRechargeRecordV2Request request = new ListDealerRechargeRecordV2Request();
		request.setBeginAt("2020-01-02");
		request.setEndAt("2020-01-31");
		YzhResponse<List<RechargeRecordInfo>> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listDealerRechargeRecordV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				List<RechargeRecordInfo> data = response.getData();
				System.out.println("操作成功返回条数 ：" + data.size());
				data.forEach(info -> {
					System.out.println("---------");
					System.out.println("操作成功：" + info);
				});
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

	// 查询日订单数据
	private static void listDailyOrder() {
		ListDailyOrderRequest request = new ListDailyOrderRequest();
		request.setOrderDate("2020-03-25");
		request.setOffset(0);
		request.setLength(200);
		request.setChannel("支付宝");
		request.setDataType("encryption");
		YzhResponse<ListDailyOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listDailyOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListDailyOrderResponse data = response.getData();
				System.out.println("操作成功返回条数：" + data.getTotalNum());
				for (DealerOrderInfo info : data.getList()) {
					System.out.println("---------");
					System.out.println(info);
				}
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

    // 查询日订单数据（支付和退款订单）
	private static void listDailyOrderV2() {
		ListDailyOrderV2Request request = new ListDailyOrderV2Request();
		request.setOrderDate("2024-09-05");
		request.setOffset(0);
		request.setLength(100);
		request.setChannel("alipay");
		request.setDataType("");
		YzhResponse<ListDailyOrderV2Response> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listDailyOrderV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListDailyOrderV2Response data = response.getData();
				System.out.println("操作成功返回条数：" + data.getTotalNum());
				for (DealerOrderInfoV2 info : data.getList()) {
					System.out.println("---------");
					System.out.println(info);
				}
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

	// 查询日订单文件（支付和退款订单）
	private static void getDailyOrderFileV2() {
		GetDailyOrderFileV2Request request = new GetDailyOrderFileV2Request();
		request.setOrderDate("2020-11-11");
		YzhResponse<GetDailyOrderFileV2Response> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getDailyOrderFileV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetDailyOrderFileV2Response data = response.getData();
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

	// 查询日流水数据
	private static void listDailyBill() {
		ListDailyBillRequest request = new ListDailyBillRequest();
		request.setBillDate("2020-03-25");
		request.setOffset(0);
		request.setLength(200);
		request.setDataType("encryption");
		YzhResponse<ListDailyBillResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listDailyBill(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListDailyBillResponse data = response.getData();
				System.out.println("操作成功返回条数：" + data.getTotalNum());
				for (DealerBillInfo bill : data.getList()) {
					System.out.println("---------");
					System.out.println(bill);
				}
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

	// 查询余额日账单数据
	private static void listBalanceDailyStatement() {
		ListBalanceDailyStatementRequest request = new ListBalanceDailyStatementRequest();
		request.setStatementDate("2021-03-25");
		YzhResponse<ListBalanceDailyStatementResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listBalanceDailyStatement(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListBalanceDailyStatementResponse data = response.getData();
				System.out.println("操作成功返回条数：" + data.getList().length);
				for (StatementDetail info : data.getList()) {
					System.out.println("---------");
					System.out.println(info);
				}
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

	// 查询日订单汇总数据
	private static void listDailyOrderSummary() {
		ListDailyOrderSummaryRequest request = new ListDailyOrderSummaryRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setChannel("支付宝");
		request.setBeginAt("2025-02-01");
		request.setEndAt("2025-02-07");
		request.setFilterType("apply");
		YzhResponse<ListDailyOrderSummaryResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listDailyOrderSummary(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListDailyOrderSummaryResponse data = response.getData();
				System.out.println("操作成功返回条数：" + data.getSummaryList().length);
				for (ListDailyOrderSummary info : data.getSummaryList()) {
					System.out.println(info);
				}
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

	// 查询月订单汇总数据
	private static void listMonthlyOrderSummary() {
		ListMonthlyOrderSummaryRequest request = new ListMonthlyOrderSummaryRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setChannel("银行卡");
		request.setMonth("2025-01");
		request.setFilterType("apply");
		YzhResponse<ListMonthlyOrderSummaryResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listMonthlyOrderSummary(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListMonthlyOrderSummaryResponse data = response.getData();
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
