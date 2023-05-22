package com.yunzhanghu.example;

import java.util.List;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.dataservice.DataServiceClient;
import com.yunzhanghu.sdk.dataservice.domain.DealerBillInfo;
import com.yunzhanghu.sdk.dataservice.domain.DealerOrderInfo;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyBillFileV2Request;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyBillFileV2Response;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyOrderFileRequest;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyOrderFileResponse;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyOrderFileV2Request;
import com.yunzhanghu.sdk.dataservice.domain.GetDailyOrderFileV2Response;
import com.yunzhanghu.sdk.dataservice.domain.ListBalanceDailyStatementRequest;
import com.yunzhanghu.sdk.dataservice.domain.ListBalanceDailyStatementResponse;
import com.yunzhanghu.sdk.dataservice.domain.ListDailyBillRequest;
import com.yunzhanghu.sdk.dataservice.domain.ListDailyBillResponse;
import com.yunzhanghu.sdk.dataservice.domain.ListDailyOrderRequest;
import com.yunzhanghu.sdk.dataservice.domain.ListDailyOrderResponse;
import com.yunzhanghu.sdk.dataservice.domain.ListDealerRechargeRecordV2Request;
import com.yunzhanghu.sdk.dataservice.domain.RechargeRecordInfo;
import com.yunzhanghu.sdk.dataservice.domain.StatementDetail;

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
		// 查询日订单文件（支付和退款订单）
		getDailyOrderFileV2();
		// 查询日流水数据
		listDailyBill();
		// 查询余额日账单数据
		listBalanceDailyStatement();
	}

	// 查询日订单文件
	private static void getDailyOrderFile() {
		GetDailyOrderFileRequest request = new GetDailyOrderFileRequest();
		request.setOrderDate("2022-04-15");
		YzhResponse<GetDailyOrderFileResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.getDailyOrderFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetDailyOrderFileResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询日流水文件
	private static void getDailyBillFileV2() {
		GetDailyBillFileV2Request request = new GetDailyBillFileV2Request();
		request.setBillDate("2022-04-17");
		YzhResponse<GetDailyBillFileV2Response> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.getDailyBillFileV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetDailyBillFileV2Response data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询平台企业预付业务服务费记录
	private static void listDealerRechargeRecordV2() {
		ListDealerRechargeRecordV2Request request = new ListDealerRechargeRecordV2Request();
		request.setBeginAt("2022-04-01");
		request.setEndAt("2022-04-11");
		YzhResponse<List<RechargeRecordInfo>> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.listDealerRechargeRecordV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				List<RechargeRecordInfo> data = response.getData();
				System.out.println("请求成功返回条数 ：" + data.size());
				data.forEach(info -> {
					System.out.println("---------");
					System.out.println("请求成功：" + info);
				});
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 查询日订单数据
	private static void listDailyOrder() {
		ListDailyOrderRequest request = new ListDailyOrderRequest();
		request.setOrderDate("2022-04-17");
		request.setOffset(0);
		request.setLength(20);
		request.setChannel("");
        request.setDataType("");
		YzhResponse<ListDailyOrderResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.listDailyOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ListDailyOrderResponse data = response.getData();
				System.out.println("请求成功返回条数：" + data.getTotalNum());
				for (DealerOrderInfo info : data.getList()) {
					System.out.println("---------");
					System.out.println(info);
				}
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// 查询日订单文件（支付和退款订单）
	private static void getDailyOrderFileV2() {
		GetDailyOrderFileV2Request request = new GetDailyOrderFileV2Request();
		request.setOrderDate("2022-04-17");
		YzhResponse<GetDailyOrderFileV2Response> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.getDailyOrderFileV2(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetDailyOrderFileV2Response data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询日流水数据
	private static void listDailyBill() {
		ListDailyBillRequest request = new ListDailyBillRequest();
		request.setBillDate("2022-04-17");
		request.setOffset(0);
		request.setLength(20);
        request.setDataType("encryption");
		YzhResponse<ListDailyBillResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.listDailyBill(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ListDailyBillResponse data = response.getData();
				System.out.println("请求成功返回条数：" + data.getTotalNum());
				for (DealerBillInfo bill : data.getList()) {
					System.out.println("---------");
					System.out.println(bill);
				}
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询余额日账单数据
	private static void listBalanceDailyStatement() {
		ListBalanceDailyStatementRequest request = new ListBalanceDailyStatementRequest();
		request.setStatementDate("2022-04-17");
		YzhResponse<ListBalanceDailyStatementResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成
			response = client.listBalanceDailyStatement(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ListBalanceDailyStatementResponse data = response.getData();
				System.out.println("请求成功返回条数：" + data.getList().length);
				for (StatementDetail info : data.getList()) {
					System.out.println("---------");
					System.out.println(info);
				}
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
