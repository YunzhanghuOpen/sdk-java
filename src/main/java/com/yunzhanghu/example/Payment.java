package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.payment.PaymentClient;
import com.yunzhanghu.sdk.payment.domain.AccountInfo;
import com.yunzhanghu.sdk.payment.domain.BatchOrderInfo;
import com.yunzhanghu.sdk.payment.domain.BatchOrderResult;
import com.yunzhanghu.sdk.payment.domain.CancelOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CancelOrderResponse;
import com.yunzhanghu.sdk.payment.domain.ConfirmBatchOrderRequest;
import com.yunzhanghu.sdk.payment.domain.ConfirmBatchOrderResponse;
import com.yunzhanghu.sdk.payment.domain.CreateAlipayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateAlipayOrderResponse;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateBankpayOrderResponse;
import com.yunzhanghu.sdk.payment.domain.CreateBatchOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateBatchOrderResponse;
import com.yunzhanghu.sdk.payment.domain.CreateWxpayOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CreateWxpayOrderResponse;
import com.yunzhanghu.sdk.payment.domain.GetDealerVARechargeAccountRequest;
import com.yunzhanghu.sdk.payment.domain.GetDealerVARechargeAccountResponse;
import com.yunzhanghu.sdk.payment.domain.GetEleReceiptFileRequest;
import com.yunzhanghu.sdk.payment.domain.GetEleReceiptFileResponse;
import com.yunzhanghu.sdk.payment.domain.GetOrderRequest;
import com.yunzhanghu.sdk.payment.domain.GetOrderResponse;
import com.yunzhanghu.sdk.payment.domain.ListAccountRequest;
import com.yunzhanghu.sdk.payment.domain.ListAccountResponse;

// 实时支付
public class Payment {

	private static YzhConfig config = Config.getYzhConfig();
	private static PaymentClient client = new PaymentClient(config);
	
	public static void main(String[] args) {
		// 银行卡实时支付
		createBankpayOrder();
		// 支付宝实时支付
		createAlipayOrder();
		// 微信实时支付
		createWxpayOrder();
		// 批次下单
		createBatchOrder();
		// 批次确认
		confirmBatchOrder();
		// 查询单笔订单信息
		getOrder();
		// 查询平台企业余额
		listAccount();
		// 查询电子回单
		getEleReceiptFile();
		// 取消待支付订单
		cancelOrder();
		// 查询平台企业汇款信息
		getDealerVARechargeAccount();
	}

	// 银行卡实时支付
	private static void createBankpayOrder() {
		CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
		request.setOrderId("");
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setCardNo("");
		request.setPhoneNo("");
		request.setIdCard("");
		request.setPay("");
		request.setPayRemark("");
		request.setNotifyUrl("");
		YzhResponse<CreateBankpayOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.createBankpayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				CreateBankpayOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + "-" + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 支付宝实时支付
	private static void createAlipayOrder() {
		CreateAlipayOrderRequest request = new CreateAlipayOrderRequest();
		request.setOrderId("");
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setCardNo("");
		request.setPhoneNo("");
		request.setIdCard("");
		request.setPay("");
		request.setPayRemark("");
		request.setNotifyUrl("");
		request.setCheckName("Check");
		YzhResponse<CreateAlipayOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.createAlipayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				CreateAlipayOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 微信实时支付
	private static void createWxpayOrder() {
		CreateWxpayOrderRequest request = new CreateWxpayOrderRequest();
		request.setOrderId("");
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setOpenid("");
		request.setPhoneNo("");
		request.setIdCard("");
		request.setPay("");
		request.setPayRemark("");
		request.setNotifyUrl("");
		request.setWxAppId("");
		request.setWxpayMode("transfer");
		YzhResponse<CreateWxpayOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.createWxpayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				CreateWxpayOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 批次下单
	private static void createBatchOrder() {
		CreateBatchOrderRequest request = new CreateBatchOrderRequest();
		request.setBatchId("batchaId-1");
		request.setDealerId("");
		request.setBrokerId("");
		request.setChannel("");
		request.setWxAppId("");
		request.setTotalPay("");
		request.setTotalCount("2");
		request.setOrderList(getBatchOrderInfoList());

		YzhResponse<CreateBatchOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.createBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				CreateBatchOrderResponse data = response.getData();
				System.out.println("请求成功返回批次号：" + data.getBatchId());
				for (BatchOrderResult res : data.getResultList()) {
					System.out.println("订单详情");
					System.out.println(res);
					System.out.println("-------------------");
				}
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + "-" + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 批次确认
	private static void confirmBatchOrder() {
		ConfirmBatchOrderRequest request = new ConfirmBatchOrderRequest();
		request.setBatchId("");
		request.setDealerId("");
		request.setBrokerId("");
		request.setChannel("");

		YzhResponse<ConfirmBatchOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.confirmBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ConfirmBatchOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + "-" + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询单笔订单信息
	private static void getOrder() {
		GetOrderRequest request = new GetOrderRequest();
		request.setOrderId("");
		request.setChannel("");
		request.setDataType("");
		YzhResponse<GetOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.getOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询平台企业余额
	private static void listAccount() {
		ListAccountRequest request = new ListAccountRequest();
		request.setDealerId("");
		YzhResponse<ListAccountResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.listAccount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ListAccountResponse data = response.getData();
				for (AccountInfo info : data.getDealerInfos()) {
					System.out.println("请求成功：" + info);
				}
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询电子回单
	private static void getEleReceiptFile() {
		GetEleReceiptFileRequest request = new GetEleReceiptFileRequest();
		request.setOrderId("");
		request.setRef("");
		YzhResponse<GetEleReceiptFileResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.getEleReceiptFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetEleReceiptFileResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 取消待支付订单
	private static void cancelOrder() {
		CancelOrderRequest request = new CancelOrderRequest();
		request.setDealerId("");
		request.setOrderId("");
		request.setRef("");
		request.setChannel("");
		YzhResponse<CancelOrderResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.cancelOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				CancelOrderResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询平台企业汇款信息
	private static void getDealerVARechargeAccount() {
		GetDealerVARechargeAccountRequest request = new GetDealerVARechargeAccountRequest();
		request.setDealerId("");
		request.setBrokerId("");
		YzhResponse<GetDealerVARechargeAccountResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.getDealerVARechargeAccount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetDealerVARechargeAccountResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static BatchOrderInfo[] getBatchOrderInfoList() {
		BatchOrderInfo info1 = new BatchOrderInfo();
		info1.setOrderId("order-1");
		info1.setRealName("");
		info1.setIdCard("");
		info1.setCardNo("");
		info1.setOpenid("");
		info1.setPhoneNo("");
		info1.setProjectId("");
		info1.setPay("");
		info1.setPayRemark("");
		info1.setNotifyUrl("");

		BatchOrderInfo info2 = new BatchOrderInfo();
		info2.setOrderId("order-2");
		info2.setRealName("");
		info2.setIdCard("");
		info2.setCardNo("");
		info2.setOpenid("");
		info2.setPhoneNo("");
		info2.setProjectId("");
		info2.setPay("");
		info2.setPayRemark("");
		info2.setNotifyUrl("");

		BatchOrderInfo[] infoArry = new BatchOrderInfo[2];
		infoArry[0] = info1;
		infoArry[1] = info2;
		return infoArry;
	}

}
