package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.bizlicgxh5api.BizlicGxH5APIServiceClient;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIEcoCityAicStatusRequest;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIEcoCityAicStatusResponse;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIGetStartUrlRequest;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIGetStartUrlResponse;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIPreCollectBizlicMsgRequest;
import com.yunzhanghu.sdk.bizlicgxh5api.domain.GxH5APIPreCollectBizlicMsgResponse;

// 个体工商户注册（云账户共享大额 H5+API）
public class BizlicGxH5Api {

	private static YzhConfig config = Config.getYzhConfig();
	private static BizlicGxH5APIServiceClient client = new BizlicGxH5APIServiceClient(config);

	public static void main(String[] args) {
		// 工商实名信息录入
		gxH5ApiPreCollectBizlicMsg();
		// 预启动
		gxH5ApiGetStartUrl();
		// 查询个体工商户状态
		gxH5ApiEcoCityAicStatus();
	}

	// 工商实名信息录入
	private static void gxH5ApiPreCollectBizlicMsg() {
		GxH5APIPreCollectBizlicMsgRequest request = new GxH5APIPreCollectBizlicMsgRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setDealerUserId("user1234567890");
		request.setPhoneNo("+86-188****8888");
		request.setIdCard("110121202202222222");
		request.setRealName("张三");
		request.setIdCardAddress("省级行政区名称区县级行政区名称具体住宿地址");
		request.setIdCardAgency("区县公安局名称");
		request.setIdCardNation("20");
		request.setIdCardValidityStart("2022-02-22");
		request.setIdCardValidityEnd("2042-01-01");
		YzhResponse<GxH5APIPreCollectBizlicMsgResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxH5APIPreCollectBizlicMsg(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GxH5APIPreCollectBizlicMsgResponse data = response.getData();
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

	// 预启动
	private static void gxH5ApiGetStartUrl() {
		GxH5APIGetStartUrlRequest request = new GxH5APIGetStartUrlRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setDealerUserId("user1234567890");
		request.setClientType(2);
		request.setNotifyUrl("https://www.example.com");
		request.setColor("#007AFF");
		request.setReturnUrl("https://www.example.com");
		request.setCustomerTitle(1);
		YzhResponse<GxH5APIGetStartUrlResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxH5APIGetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GxH5APIGetStartUrlResponse data = response.getData();
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
	private static void gxH5ApiEcoCityAicStatus() {
		GxH5APIEcoCityAicStatusRequest request = new GxH5APIEcoCityAicStatusRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setOpenId("open1234567890");
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		request.setDealerUserId("user1234567890");
		YzhResponse<GxH5APIEcoCityAicStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxH5APIEcoCityAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GxH5APIEcoCityAicStatusResponse data = response.getData();
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
