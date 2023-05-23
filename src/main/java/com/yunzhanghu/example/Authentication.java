package com.yunzhanghu.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.authentication.AuthenticationClient;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthConfirmRequest;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthConfirmResponse;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthVerifyRequest;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourAuthVerifyResponse;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourVerifyRequest;
import com.yunzhanghu.sdk.authentication.domain.BankCardFourVerifyResponse;
import com.yunzhanghu.sdk.authentication.domain.BankCardThreeVerifyRequest;
import com.yunzhanghu.sdk.authentication.domain.BankCardThreeVerifyResponse;
import com.yunzhanghu.sdk.authentication.domain.GetBankCardInfoRequest;
import com.yunzhanghu.sdk.authentication.domain.GetBankCardInfoResponse;
import com.yunzhanghu.sdk.authentication.domain.IDCardVerifyRequest;
import com.yunzhanghu.sdk.authentication.domain.IDCardVerifyResponse;
import com.yunzhanghu.sdk.authentication.domain.UserExemptedInfoRequest;
import com.yunzhanghu.sdk.authentication.domain.UserExemptedInfoResponse;
import com.yunzhanghu.sdk.authentication.domain.UserWhiteCheckRequest;
import com.yunzhanghu.sdk.authentication.domain.UserWhiteCheckResponse;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;

// 用户信息验证
public class Authentication {

	private static YzhConfig config = Config.getYzhConfig();
	private static AuthenticationClient client = new AuthenticationClient(config);

	public static void main(String[] args) {
		// 银行卡四要素鉴权请求（下发短信验证码）
		bankCardFourAuthVerify();
		// 银行卡四要素确认请求（上传短信验证码）
		bankCardFourAuthConfirm();
		// 银行卡四要素验证
		bankCardFourVerify();
		// 银行卡三要素验证
		bankCardThreeVerify();
		// 身份证实名验证
		iDCardVerify();
		// 上传用户免验证名单信息
		userExemptedInfo();
		// 查看用户免验证名单是否存在
		userWhiteCheck();
		// 银行卡信息查询
		getBankCardInfo();
	}

	// 银行卡四要素鉴权请求（下发短信验证码）
	private static void bankCardFourAuthVerify() {
		BankCardFourAuthVerifyRequest request = new BankCardFourAuthVerifyRequest();
		request.setCardNo("");
		request.setIdCard("");
		request.setRealName("");
		request.setMobile("");
		YzhResponse<BankCardFourAuthVerifyResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.bankCardFourAuthVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				BankCardFourAuthVerifyResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 银行卡四要素确认请求（上传短信验证码）
	private static void bankCardFourAuthConfirm() {
		BankCardFourAuthConfirmRequest request = new BankCardFourAuthConfirmRequest();
		request.setCardNo("");
		request.setIdCard("");
		request.setRealName("");
		request.setMobile("");
		request.setCaptcha("");
		request.setRef("");
		YzhResponse<BankCardFourAuthConfirmResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.bankCardFourAuthConfirm(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				BankCardFourAuthConfirmResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 银行卡四要素验证
	private static void bankCardFourVerify() {
		BankCardFourVerifyRequest request = new BankCardFourVerifyRequest();
		request.setCardNo("");
		request.setIdCard("");
		request.setRealName("");
		request.setMobile("");
		YzhResponse<BankCardFourVerifyResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.bankCardFourVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				BankCardFourVerifyResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 银行卡三要素验证
	private static void bankCardThreeVerify() {
		BankCardThreeVerifyRequest request = new BankCardThreeVerifyRequest();
		request.setCardNo("");
		request.setIdCard("");
		request.setRealName("");
		YzhResponse<BankCardThreeVerifyResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.bankCardThreeVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				BankCardThreeVerifyResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 身份证实名验证
	private static void iDCardVerify() {
		IDCardVerifyRequest request = new IDCardVerifyRequest();
		request.setIdCard("");
		request.setRealName("");
		YzhResponse<IDCardVerifyResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.iDCardVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				IDCardVerifyResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 上传用户免验证名单信息
	private static void userExemptedInfo() {
		String imgFile = "xxxxx/xxx.jpeg";
		String[] imgarr = new String[1];
		imgarr[0] = getImgStr(imgFile);
		
		UserExemptedInfoRequest request = new UserExemptedInfoRequest();
		request.setIdCard("");
		request.setCardType("");
		request.setRealName("");
		request.setCommentApply("");
		request.setBrokerId("");
		request.setDealerId("");
		request.setUserImages(imgarr);
		request.setCountry("");
		request.setBirthday("");
		request.setGender("");
		request.setNotifyUrl("");
		request.setRef("");
		YzhResponse<UserExemptedInfoResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.userExemptedInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				UserExemptedInfoResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查看用户免验证名单是否存在
	private static void userWhiteCheck() {
		UserWhiteCheckRequest request = new UserWhiteCheckRequest();
		request.setRealName("");
		request.setIdCard("");
		YzhResponse<UserWhiteCheckResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
		    // 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
		    // 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.userWhiteCheck(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				UserWhiteCheckResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 银行卡信息查询
	private static void getBankCardInfo() {
		GetBankCardInfoRequest request = new GetBankCardInfoRequest();
		request.setCardNo("");
		request.setBankName("");
		YzhResponse<GetBankCardInfoResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
			// 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.getBankCardInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetBankCardInfoResponse data = response.getData();
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
	 * 将图片文件转化为字节数组字符串，并对其进行 Base64 编码处理
	 * 
	 * @param imgFile 图片路径
	 * @return 转化结果
	 */
	private static String getImgStr(String imgFile) {
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = new FileInputStream(imgFile);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(Base64.encodeBase64(data));
	}
}
