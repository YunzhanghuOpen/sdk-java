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
		// 预启动
		h5GetStartUrl();
		// 查询个体工商户状态
		h5EcoCityAicStatus();
	}

	// 预启动
	private static void h5GetStartUrl() {
		H5GetStartUrlRequest request = new H5GetStartUrlRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setDealerUserId("user1234567890");
		request.setClientType(1);
		request.setNotifyUrl("https://www.example.com");
		request.setColor("#007AFF");
		request.setReturnUrl("https://www.example.com");
		request.setCustomerTitle(1);
		YzhResponse<H5GetStartUrlResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.h5GetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				H5GetStartUrlResponse data = response.getData();
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

	// 查询个体工商户状态
	private static void h5EcoCityAicStatus() {
		H5EcoCityAicStatusRequest request = new H5EcoCityAicStatusRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setOpenId("open1234567890");
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		request.setDealerUserId("user1234567890");
		YzhResponse<H5EcoCityAicStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.h5EcoCityAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				H5EcoCityAicStatusResponse data = response.getData();
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
