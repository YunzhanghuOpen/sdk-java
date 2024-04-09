package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.uploadusersign.UploadUserSignServiceClient;
import com.yunzhanghu.sdk.uploadusersign.domain.GetUploadUserSignStatusRequest;
import com.yunzhanghu.sdk.uploadusersign.domain.GetUploadUserSignStatusResponse;
import com.yunzhanghu.sdk.uploadusersign.domain.UploadUserSignRequest;
import com.yunzhanghu.sdk.uploadusersign.domain.UploadUserSignResponse;

// 用户签约（签约信息上传）
public class UploadUserSign {

	private static YzhConfig config = Config.getYzhConfig();
	private static UploadUserSignServiceClient client = new UploadUserSignServiceClient(config);

	public static void main(String[] args) {
		// 用户签约信息上传
		uploadUserSign();
		// 获取用户签约状态
		getUploadUserSignStatus();
	}

	// 用户签约信息上传
	private static void uploadUserSign() {
		UploadUserSignRequest request = new UploadUserSignRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("11010519491231002X");
		request.setPhone("188****8888");
		request.setIsAbroad(false);
		request.setNotifyUrl("https://www.example.com");
		YzhResponse<UploadUserSignResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.uploadUserSign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				UploadUserSignResponse data = response.getData();
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

	// 获取用户签约状态
	private static void getUploadUserSignStatus() {
		GetUploadUserSignStatusRequest request = new GetUploadUserSignStatusRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRealName("张三");
		request.setIdCard("11010519491231002X");
		YzhResponse<GetUploadUserSignStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getUploadUserSignStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetUploadUserSignStatusResponse data = response.getData();
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

}
