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
		request.setCardNo("6228888888888888888");
		request.setIdCard("11010519491231002X");
		request.setRealName("张三");
		request.setMobile("188****8888");
		YzhResponse<BankCardFourAuthVerifyResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.bankCardFourAuthVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				BankCardFourAuthVerifyResponse data = response.getData();
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

	// 银行卡四要素确认请求（上传短信验证码）
	private static void bankCardFourAuthConfirm() {
		BankCardFourAuthConfirmRequest request = new BankCardFourAuthConfirmRequest();
		request.setCardNo("6228888888888888888");
		request.setIdCard("11010519491231002X");
		request.setRealName("张三");
		request.setMobile("188****8888");
		request.setCaptcha("861134");
		request.setRef("rx0g4iiLWoWA==");
		YzhResponse<BankCardFourAuthConfirmResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.bankCardFourAuthConfirm(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				BankCardFourAuthConfirmResponse data = response.getData();
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

	// 银行卡四要素验证
	private static void bankCardFourVerify() {
		BankCardFourVerifyRequest request = new BankCardFourVerifyRequest();
		request.setCardNo("6228888888888888888");
		request.setIdCard("11010519491231002X");
		request.setRealName("张三");
		request.setMobile("188****8888");
		YzhResponse<BankCardFourVerifyResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.bankCardFourVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				BankCardFourVerifyResponse data = response.getData();
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

	// 银行卡三要素验证
	private static void bankCardThreeVerify() {
		BankCardThreeVerifyRequest request = new BankCardThreeVerifyRequest();
		request.setCardNo("6228888888888888888");
		request.setIdCard("11010519491231002X");
		request.setRealName("张三");
		YzhResponse<BankCardThreeVerifyResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.bankCardThreeVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				BankCardThreeVerifyResponse data = response.getData();
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

	// 身份证实名验证
	private static void iDCardVerify() {
		IDCardVerifyRequest request = new IDCardVerifyRequest();
		request.setRealName("张三");
		request.setIdCard("11010519491231002X");
		YzhResponse<IDCardVerifyResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.iDCardVerify(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				IDCardVerifyResponse data = response.getData();
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

	// 上传用户免验证名单信息
	private static void userExemptedInfo() {
		String imgFile = "xxxxx/xxx.jpeg";
		String[] imgarr = new String[1];
		imgarr[0] = getImgStr(imgFile);

		UserExemptedInfoRequest request = new UserExemptedInfoRequest();
		request.setIdCard("EA3456789");
		request.setCardType("passport");
		request.setRealName("张三");
		request.setCommentApply("一条记录");
		request.setBrokerId(config.getBrokerId());
		request.setDealerId(config.getDealerId());
		request.setUserImages(imgarr);
		request.setCountry("CHN");
		request.setBirthday("20010809");
		request.setGender("男");
		request.setNotifyUrl("https://www.example.com");
		request.setRef("1234qwer");
		YzhResponse<UserExemptedInfoResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.userExemptedInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				UserExemptedInfoResponse data = response.getData();
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

	// 查看用户免验证名单是否存在
	private static void userWhiteCheck() {
		UserWhiteCheckRequest request = new UserWhiteCheckRequest();
		request.setRealName("张三");
		request.setIdCard("EA3456789");
		YzhResponse<UserWhiteCheckResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.userWhiteCheck(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				UserWhiteCheckResponse data = response.getData();
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

	// 银行卡信息查询
	private static void getBankCardInfo() {
		GetBankCardInfoRequest request = new GetBankCardInfoRequest();
		request.setCardNo("6228888888888888888");
		request.setBankName("中国邮政储蓄银行");
		YzhResponse<GetBankCardInfoResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getBankCardInfo(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetBankCardInfoResponse data = response.getData();
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
