package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.h5usersign.H5UserSignServiceClient;
import com.yunzhanghu.sdk.h5usersign.domain.*;

// 用户签约（H5 签约）
public class H5UserSign {

	private static YzhConfig config = Config.getYzhConfig();
	private static H5UserSignServiceClient client = new H5UserSignServiceClient(config);

	public static void main(String[] args) {
		// 预申请签约
		h5UserPresign();
		// 申请签约
		h5UserSign();
		// 获取用户签约状态
		geH5UserSignStatus();
		// 用户解约（测试账号专用接口）
		h5UserRelease();
	}

	// 预申请签约
	private static void h5UserPresign() {
		H5UserPresignRequest request = new H5UserPresignRequest();
		request.setDealerId("25331815");
		request.setBrokerId("27532644");
		request.setRealName("吴克润");
		request.setIdCard("500224199312203335");
		request.setCertificateType(0);
		YzhResponse<H5UserPresignResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5UserPresign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5UserPresignResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 申请签约
	private static void h5UserSign() {
		H5UserSignRequest request = new H5UserSignRequest();
		request.setToken("");
		request.setColor("");
		request.setUrl("");
		request.setRedirectUrl("");
		YzhResponse<H5UserSignResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5UserSign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5UserSignResponse data = response.getData();
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
	private static void geH5UserSignStatus() {
		GetH5UserSignStatusRequest request = new GetH5UserSignStatusRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		YzhResponse<GetH5UserSignStatusResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.getH5UserSignStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetH5UserSignStatusResponse data = response.getData();
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
	private static void h5UserRelease() {
		H5UserReleaseRequest request = new H5UserReleaseRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		request.setCertificateType(0);
		YzhResponse<H5UserReleaseResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.h5UserRelease(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				H5UserReleaseResponse data = response.getData();
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
