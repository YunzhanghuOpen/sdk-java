package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.bizlicxjjh5api.BizlicXjjH5APIServiceClient;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5APIEcoCityAicStatusRequest;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5APIEcoCityAicStatusResponse;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5APIGetStartUrlRequest;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5APIGetStartUrlResponse;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5PreCollectBizlicMsgRequest;
import com.yunzhanghu.sdk.bizlicxjjh5api.domain.H5PreCollectBizlicMsgResponse;

// 个体工商户注册（云账户新经济 H5+API）
public class BizLicXjjH5Api {

	private static YzhConfig config = Config.getYzhConfig();
	private static BizlicXjjH5APIServiceClient client = new BizlicXjjH5APIServiceClient(config);

	public static void main(String[] args) {
		String userId = "";
		// 工商实名信息录入
		h5PreCollectBizlicMsg(userId);
		// 预启动
		h5GetStartUrl(userId);
		// 查询个体工商户状态
		h5EcoCityAicStatus(userId);
	}

	/**
	 * 工商实名信息录入
	 * 
	 * @param dealerUserId 平台企业端的用户 ID
	 */
	private static void h5PreCollectBizlicMsg(String dealerUserId) {
		H5PreCollectBizlicMsgRequest request = new H5PreCollectBizlicMsgRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setDealerUserId(dealerUserId);
		request.setPhoneNo("");
		request.setIdCard("");
		request.setRealName("");
		request.setIdCardAddress("");
		request.setIdCardAgency("");
		request.setIdCardNation("");
		request.setIdCardValidityStart("");
		request.setIdCardValidityEnd("");
		YzhResponse<H5PreCollectBizlicMsgResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5PreCollectBizlicMsg(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5PreCollectBizlicMsgResponse data = response.getData();
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
	 * 预启动
	 * 
	 * @param dealerUserId 平台企业端的用户 ID
	 */
	private static void h5GetStartUrl(String dealerUserId) {
		H5APIGetStartUrlRequest request = new H5APIGetStartUrlRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setDealerUserId(dealerUserId);
		request.setClientType(2);
		request.setNotifyUrl("");
		request.setColor("");
		request.setReturnUrl("");
		request.setCustomerTitle(1);
		YzhResponse<H5APIGetStartUrlResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5APIGetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5APIGetStartUrlResponse data = response.getData();
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
		H5APIEcoCityAicStatusRequest request = new H5APIEcoCityAicStatusRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setOpenId("");
		request.setRealName("");
		request.setIdCard("");
		request.setDealerUserId(dealerUserId);
		YzhResponse<H5APIEcoCityAicStatusResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5APIEcoCityAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5APIEcoCityAicStatusResponse data = response.getData();
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
