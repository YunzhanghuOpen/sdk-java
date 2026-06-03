package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.faceauth.FaceAuthServiceClient;
import com.yunzhanghu.sdk.faceauth.domain.*;

// 人脸识别实名核验
public class FaceAuth {

	private static YzhConfig config = Config.getYzhConfig();
	private static FaceAuthServiceClient client = new FaceAuthServiceClient(config);

	public static void main(String[] args) {
		// 申请人脸识别实名核验
		applyFaceAuth();
		// 查询人脸识别实名核验结果
		getFaceAuthResult();
	}

	// 申请人脸识别实名核验
	private static void applyFaceAuth() {
		ApplyFaceAuthRequest request = new ApplyFaceAuthRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setVerificationId("verificationId123456");
		request.setRealName("张三");
		request.setIdCard("11010519491231002X");
		request.setCallbackUrl("https://www.example.com/callback");
		request.setRedirectUrl("https://www.example.com/redirect");
		request.setColor("#8171ff");
		YzhResponse<ApplyFaceAuthResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.applyFaceAuth(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ApplyFaceAuthResponse data = response.getData();
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

	// 查询人脸识别实名核验结果
	private static void getFaceAuthResult() {
		GetFaceAuthResultRequest request = new GetFaceAuthResultRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setRecordId("recordIdExample123456");
		request.setVerificationId("verificationIdExample123456");
		YzhResponse<GetFaceAuthResultResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getFaceAuthResult(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetFaceAuthResultResponse data = response.getData();
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
