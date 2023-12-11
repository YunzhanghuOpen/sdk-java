package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.apiusersign.ApiUserSignServiceClient;
import com.yunzhanghu.sdk.apiusersign.domain.*;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;

// 用户签约（API 签约）
public class ApiUserSign {

	private static YzhConfig config = Config.getYzhConfig();
	private static ApiUserSignServiceClient client = new ApiUserSignServiceClient(config);

	public static void main(String[] args) {
		// 获取协议预览 URL
		apiUserSignContract();
		// 用户签约
		apiUserSign();
		// 获取用户签约状态
		getApiUserSignStatus();
		// 用户解约（测试账号专用接口）
		apiUserSignRelease();
	}

	// 获取协议预览 URL
	private static void apiUserSignContract() {
		ApiUserSignContractRequest request = new ApiUserSignContractRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		YzhResponse<ApiUserSignContractResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.apiUserSignContract(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ApiUserSignContractResponse data = response.getData();
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

	// 用户签约
	private static void apiUserSign() {
		ApiUserSignRequest request = new ApiUserSignRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		request.setCardType("idcard");
		YzhResponse<ApiUserSignResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.apiUserSign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ApiUserSignResponse data = response.getData();
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

	// 获取用户签约状态
	private static void getApiUserSignStatus() {
		GetApiUserSignStatusRequest request = new GetApiUserSignStatusRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		YzhResponse<GetApiUserSignStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getApiUserSignStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetApiUserSignStatusResponse data = response.getData();
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

	// 用户解约（测试账号专用接口）
	private static void apiUserSignRelease() {
		ApiUserSignReleaseRequest request = new ApiUserSignReleaseRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		request.setCardType("idcard");
		YzhResponse<ApiUserSignReleaseResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.apiUserSignRelease(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ApiUserSignReleaseResponse data = response.getData();
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
