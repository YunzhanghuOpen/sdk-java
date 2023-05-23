package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.bizlicxjjh5.BizlicXjjH5ServiceClient;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.H5EcoCityAicStatusRequest;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.H5EcoCityAicStatusResponse;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.H5GetStartUrlRequest;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.H5GetStartUrlResponse;

// 个体工商户注册（云账户新经济 H5）
public class BizLicXjjH5 {

	private static YzhConfig config = Config.getYzhConfig();
	private static BizlicXjjH5ServiceClient client = new BizlicXjjH5ServiceClient(config);

	public static void main(String[] args) {
		String userId = "";
		// 预启动
		h5GetStartUrl(userId);
		// 查询个体工商户状态
		h5EcoCityAicStatus(userId);
	}

	/**
	 * 预启动
	 * 
	 * @param dealerUserId 平台企业端的用户 ID
	 */
	private static void h5GetStartUrl(String dealerUserId) {
		H5GetStartUrlRequest request = new H5GetStartUrlRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId("");
		request.setDealerUserId(dealerUserId);
		request.setClientType(1);
		request.setNotifyUrl("");
		request.setColor("red");
		request.setReturnUrl("");
		request.setCustomerTitle(1);
		YzhResponse<H5GetStartUrlResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
			// 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.h5GetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5GetStartUrlResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询个体工商户状态
	 * 
	 * @param dealerUserId 平台企业端的用户 ID
	 */
	private static void h5EcoCityAicStatus(String dealerUserId) {
		H5EcoCityAicStatusRequest request = new H5EcoCityAicStatusRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setOpenId("");
		request.setRealName("");
		request.setIdCard("");
		request.setDealerUserId(dealerUserId);
		YzhResponse<H5EcoCityAicStatusResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
			// 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.h5EcoCityAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5EcoCityAicStatusResponse data = response.getData();
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
