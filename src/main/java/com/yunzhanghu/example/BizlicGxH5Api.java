package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.bizlicgxv2h5api.BizlicGxV2H5APIServiceClient;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIGetAicStatusRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIGetAicStatusResponse;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIGetStartUrlRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIGetStartUrlResponse;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIPreCollectBizlicMsgRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.GxV2H5APIPreCollectBizlicMsgResponse;

// 个体工商户注册（云账户共享大额 H5+API）
public class BizlicGxH5Api {

	private static YzhConfig config = Config.getYzhConfig();
	private static BizlicGxV2H5APIServiceClient client = new BizlicGxV2H5APIServiceClient(config);

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
		GxV2H5APIPreCollectBizlicMsgRequest request = new GxV2H5APIPreCollectBizlicMsgRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setDealerUserId("userId1234567890");
		request.setPhoneNo("+86-188****8888");
		request.setIdCard("11010519491231002X");
		request.setRealName("张三");
		request.setIdCardAddress("省级行政区名称区县级行政区名称具体住宿地址");
		request.setIdCardAgency("区县公安局名称");
		request.setIdCardNation("20");
		request.setIdCardValidityStart("2022-02-22");
		request.setIdCardValidityEnd("2042-01-01");
		YzhResponse<GxV2H5APIPreCollectBizlicMsgResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxV2H5APIPreCollectBizlicMsg(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
			    GxV2H5APIPreCollectBizlicMsgResponse data = response.getData();
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
		GxV2H5APIGetStartUrlRequest request = new GxV2H5APIGetStartUrlRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setDealerUserId("userId1234567890");
		request.setClientType(2);
		request.setNotifyUrl("https://www.example.com");
		request.setColor("#007AFF");
		request.setReturnUrl("https://www.example.com");
		request.setCustomerTitle(1);
		YzhResponse<GxV2H5APIGetStartUrlResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxV2H5APIGetStartUrl(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
			    GxV2H5APIGetStartUrlResponse data = response.getData();
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
		GxV2H5APIGetAicStatusRequest request = new GxV2H5APIGetAicStatusRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setOpenId("openId1234567890");
		request.setRealName("张三");
		request.setIdCard("110121202202222222");
		request.setDealerUserId("userId1234567890");
		YzhResponse<GxV2H5APIGetAicStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.gxV2H5APIGetAicStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
			    GxV2H5APIGetAicStatusResponse data = response.getData();
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
