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
import com.yunzhanghu.sdk.payment.domain.CancelBatchOrderRequest;
import com.yunzhanghu.sdk.payment.domain.CancelBatchOrderResponse;
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
import com.yunzhanghu.sdk.payment.domain.QueryBatchOrderRequest;
import com.yunzhanghu.sdk.payment.domain.QueryBatchOrderResponse;
import com.yunzhanghu.sdk.payment.domain.RetryOrderRequest;
import com.yunzhanghu.sdk.payment.domain.RetryOrderResponse;
import com.yunzhanghu.sdk.payment.domain.CheckUserAmountRequest;
import com.yunzhanghu.sdk.payment.domain.CheckUserAmountResponse;
import com.yunzhanghu.sdk.payment.domain.GetOrderLxlwRequest;
import com.yunzhanghu.sdk.payment.domain.GetOrderLxlwResponse;
import com.yunzhanghu.sdk.utils.JsonUtil;

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
		// 查询批次订单信息
		queryBatchOrder();
		// 批次撤销
		cancelBatchOrder();
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
		// 重试挂起状态订单
		retryOrder();
		// 用户结算金额校验
		checkUserAmount();
		// 查询劳务模式单笔订单信息
		getOrderLxlw();

	}

	// 银行卡实时支付
	private static void createBankpayOrder() {
		CreateBankpayOrderRequest request = new CreateBankpayOrderRequest();
		request.setOrderId("202009010016562012987");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setCardNo("6228888888888888888");
		request.setPhoneNo("188****8888");
		request.setIdCard("11010519491231002X");
		request.setPay("100.00");
		request.setPayRemark("");
		request.setNotifyUrl("https://www.example.com");
		request.setProjectId("");
		YzhResponse<CreateBankpayOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.createBankpayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CreateBankpayOrderResponse data = response.getData();
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

	// 支付宝实时支付
	private static void createAlipayOrder() {
		CreateAlipayOrderRequest request = new CreateAlipayOrderRequest();
		request.setOrderId("20200901001656212987");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setCardNo("188****8888");
		request.setIdCard("11010519491231002X");
		request.setPhoneNo("188****8888");
		request.setPay("1.00");
		request.setPayRemark("");
		request.setCheckName("Check");
		request.setNotifyUrl("https://www.example.com");
		request.setProjectId("");
		YzhResponse<CreateAlipayOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.createAlipayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CreateAlipayOrderResponse data = response.getData();
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

	// 微信实时支付
	private static void createWxpayOrder() {
		CreateWxpayOrderRequest request = new CreateWxpayOrderRequest();
		request.setOrderId("202009010016562012987");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("11010519491231002X");
		request.setOpenid("o4GgauInH_RCEdvrrNGrntXDuXXX");
		request.setPhoneNo("188****8888");
		request.setPay("1.00");
		request.setPayRemark("");
		request.setNotifyUrl("https://www.example.com");
		request.setWxAppId("");
		request.setWxpayMode("transfer");
		request.setProjectId("");
		YzhResponse<CreateWxpayOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.createWxpayOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CreateWxpayOrderResponse data = response.getData();
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

	// 批次下单
	private static void createBatchOrder() {
		CreateBatchOrderRequest request = new CreateBatchOrderRequest();
		request.setBatchId("batch2032934858483");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setChannel("微信");
		request.setWxAppId("");
		request.setTotalPay("3.30");
		request.setTotalCount("2");
		request.setOrderList(getBatchOrderInfoList());

		YzhResponse<CreateBatchOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.createBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CreateBatchOrderResponse data = response.getData();
				System.out.println("操作成功返回批次号：" + data.getBatchId());
				for (BatchOrderResult res : data.getResultList()) {
					System.out.println("订单详情");
					System.out.println(res);
					System.out.println("-------------------");
				}
			} else {
				// 失败返回
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("失败返回：" + response.getCode() + "-" + response.getMessage() + "-" + JsonUtil.toJson(response.getData()));
			}
		} catch (Exception e) {
			// 发生异常
			e.printStackTrace();
		}
	}

	// 批次确认
	private static void confirmBatchOrder() {
		ConfirmBatchOrderRequest request = new ConfirmBatchOrderRequest();
		request.setBatchId("batch2032934858483");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setChannel("微信");

		YzhResponse<ConfirmBatchOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.confirmBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ConfirmBatchOrderResponse data = response.getData();
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

	// 查询批次订单信息
	private static void queryBatchOrder() {
		QueryBatchOrderRequest request = new QueryBatchOrderRequest();
		request.setBatchId("batch2032934858483");
		request.setDealerId(config.getDealerId());
		YzhResponse<QueryBatchOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.queryBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				QueryBatchOrderResponse data = response.getData();
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

	// 批次撤销
	public static void cancelBatchOrder() {
		CancelBatchOrderRequest request = new CancelBatchOrderRequest();
		request.setBatchId("batch2032934858483");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		YzhResponse<CancelBatchOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.cancelBatchOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CancelBatchOrderResponse data = response.getData();
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

	// 查询单笔订单信息
	private static void getOrder() {
		GetOrderRequest request = new GetOrderRequest();
		request.setOrderId("202009010016562012987");
		request.setChannel("支付宝");
		request.setDataType("encryption");
		YzhResponse<GetOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetOrderResponse data = response.getData();
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

	// 查询平台企业余额
	private static void listAccount() {
		ListAccountRequest request = new ListAccountRequest();
		request.setDealerId(config.getDealerId());
		YzhResponse<ListAccountResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.listAccount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ListAccountResponse data = response.getData();
				for (AccountInfo info : data.getDealerInfos()) {
					System.out.println("操作成功：" + info);
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

	// 查询电子回单
	private static void getEleReceiptFile() {
		GetEleReceiptFileRequest request = new GetEleReceiptFileRequest();
		request.setOrderId("123412323123");
		request.setRef("ref123412323123");
		YzhResponse<GetEleReceiptFileResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getEleReceiptFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetEleReceiptFileResponse data = response.getData();
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

	// 取消待支付订单
	private static void cancelOrder() {
		CancelOrderRequest request = new CancelOrderRequest();
		request.setDealerId(config.getDealerId());
		request.setOrderId("202009010016562012987");
		request.setRef("176826728298982");
		request.setChannel("银行卡");
		YzhResponse<CancelOrderResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.cancelOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				CancelOrderResponse data = response.getData();
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
	
	// 重试挂起状态订单
    private static void retryOrder() {
        RetryOrderRequest request = new RetryOrderRequest();
        request.setDealerId(config.getDealerId());
        request.setOrderId("202009010016562012987");
        request.setRef("176826728298982");
        request.setChannel("bankpay");
        YzhResponse<RetryOrderResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.retryOrder(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            System.out.println(response);
            if (response.isSuccess()) {
                // 操作成功
                RetryOrderResponse data = response.getData();
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

	// 查询平台企业汇款信息
	private static void getDealerVARechargeAccount() {
		GetDealerVARechargeAccountRequest request = new GetDealerVARechargeAccountRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		YzhResponse<GetDealerVARechargeAccountResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getDealerVARechargeAccount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetDealerVARechargeAccountResponse data = response.getData();
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

	// 用户结算金额校验
    private static void checkUserAmount() {
        CheckUserAmountRequest request = new CheckUserAmountRequest();
        request.setBrokerId(config.getBrokerId());
        request.setRealName("张三");
        request.setIdCard("11010519491231002X");
        request.setAmount("10000.00");
        YzhResponse<CheckUserAmountResponse> response = null;
        try {
            // request-id：请求 ID，请求的唯一标识
            // 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
            // 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
            response = client.CheckUserAmount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
            if (response.isSuccess()) {
                // 操作成功
                CheckUserAmountResponse data = response.getData();
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

	private static BatchOrderInfo[] getBatchOrderInfoList() {
		BatchOrderInfo info1 = new BatchOrderInfo();
		info1.setOrderId("202009010016562012987");
		info1.setRealName("张三");
		info1.setIdCard("440524188001010014");
		info1.setOpenid("o4GgauInH_RCEdvrrNGrntXDuXXX1");
		info1.setPhoneNo("188****8888");
		info1.setProjectId("");
		info1.setPay("1.00");
		info1.setPayRemark("");
		info1.setNotifyUrl("https://www.example.com");

		BatchOrderInfo info2 = new BatchOrderInfo();
		info2.setOrderId("202009010016562012988");
		info2.setRealName("李四");
		info2.setIdCard("11010519491231002X");
		info2.setOpenid("o4GgauInH_RCEdvrrNGrntXDuXXX2");
		info2.setPhoneNo("188****8888");
		info2.setProjectId("");
		info2.setPay("2.30");
		info2.setPayRemark("");
		info2.setNotifyUrl("https://www.example.com");

		BatchOrderInfo[] infoArry = new BatchOrderInfo[2];
		infoArry[0] = info1;
		infoArry[1] = info2;
		return infoArry;
	}

	// 查询劳务模式单笔订单信息
	private static void getOrderLxlw() {
		GetOrderLxlwRequest request = new GetOrderLxlwRequest();
		request.setOrderId("180490818101749");
		request.setChannel("银行卡");
		request.setDataType("");
		YzhResponse<GetOrderLxlwResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getOrderLxlw(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetOrderLxlwResponse data = response.getData();
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
