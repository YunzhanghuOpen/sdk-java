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
		request.setDealerId("");
		request.setBrokerId("");
		YzhResponse<ApiUserSignContractResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.apiUserSignContract(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ApiUserSignContractResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 用户签约
	private static void apiUserSign() {
		ApiUserSignRequest request = new ApiUserSignRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		request.setCardType("");
		YzhResponse<ApiUserSignResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.apiUserSign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ApiUserSignResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 获取用户签约状态
	private static void getApiUserSignStatus() {
		GetApiUserSignStatusRequest request = new GetApiUserSignStatusRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		YzhResponse<GetApiUserSignStatusResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.getApiUserSignStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetApiUserSignStatusResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 用户解约（测试账号专用接口）
	private static void apiUserSignRelease() {
		ApiUserSignReleaseRequest request = new ApiUserSignReleaseRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		request.setCardType("");
		YzhResponse<ApiUserSignReleaseResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.apiUserSignRelease(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				ApiUserSignReleaseResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
