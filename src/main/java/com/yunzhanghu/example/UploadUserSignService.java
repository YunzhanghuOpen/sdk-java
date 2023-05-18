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
public class UploadUserSignService {
	
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
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		request.setPhone("");
		request.setIsAbroad(false);
		request.setNotifyUrl("");
		YzhResponse<UploadUserSignResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.uploadUserSign(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				UploadUserSignResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + "-" + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 获取用户签约状态
	private static void getUploadUserSignStatus() {
		GetUploadUserSignStatusRequest request = new GetUploadUserSignStatusRequest();
		request.setDealerId("");
		request.setBrokerId("");
		request.setRealName("");
		request.setIdCard("");
		YzhResponse<GetUploadUserSignStatusResponse> response = null;
		try {
			// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
			response = client.getUploadUserSignStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetUploadUserSignStatusResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + "-" + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
