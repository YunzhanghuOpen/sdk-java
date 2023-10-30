package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.invoice.InvoiceClient;
import com.yunzhanghu.sdk.invoice.domain.ApplyInvoiceRequest;
import com.yunzhanghu.sdk.invoice.domain.ApplyInvoiceResponse;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceAmountRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceAmountResponse;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceFileRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceFileResponse;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceInformationRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceInformationResponse;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatResponse;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatusRequest;
import com.yunzhanghu.sdk.invoice.domain.GetInvoiceStatusResponse;
import com.yunzhanghu.sdk.invoice.domain.SendReminderEmailRequest;
import com.yunzhanghu.sdk.invoice.domain.SendReminderEmailResponse;

// 发票开具
public class Invoice {

	private static YzhConfig config = Config.getYzhConfig();
	private static InvoiceClient client = new InvoiceClient(config);

	public static void main(String[] args) {
		// 查询平台企业已开具和待开具发票金额
		getInvoiceStat();
		// 查询可开具发票额度和发票开具信息
		getInvoiceAmount();
		// 发票开具申请
		applyInvoice();
		// 查询发票开具申请状态
		getInvoiceStatus();
		// 查询发票信息
		getInvoiceInformation();
		// 下载 PDF 版发票
		getInvoiceFile();
		// 发送发票扫描件压缩包下载链接邮件
		sendReminderEmail();
	}

	// 查询平台企业已开具和待开具发票金额
	private static void getInvoiceStat() {
		GetInvoiceStatRequest request = new GetInvoiceStatRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setYear(2023);
		YzhResponse<GetInvoiceStatResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.getInvoiceStat(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetInvoiceStatResponse data = response.getData();
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

	// 查询可开具发票额度和发票开具信息
	private static void getInvoiceAmount() {
		GetInvoiceAmountRequest request = new GetInvoiceAmountRequest();
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		YzhResponse<GetInvoiceAmountResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.getInvoiceAmount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetInvoiceAmountResponse data = response.getData();
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

	// 发票开具申请
	private static void applyInvoice() {
		ApplyInvoiceRequest request = new ApplyInvoiceRequest();
		request.setInvoiceApplyId("test1234567890");
		request.setDealerId(config.getDealerId());
		request.setBrokerId(config.getBrokerId());
		request.setAmount("1000000.00");
		request.setInvoiceType("1");
		request.setBankNameAccount("交通银行北京东大桥支行 12343456654321");
		request.setGoodsServicesName("信息技术服务*信息技术服务费");
		request.setRemark("测试备注");
		YzhResponse<ApplyInvoiceResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.applyInvoice(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				ApplyInvoiceResponse data = response.getData();
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

	// 查询发票开具申请状态
	private static void getInvoiceStatus() {
		GetInvoiceStatusRequest request = new GetInvoiceStatusRequest();
		request.setInvoiceApplyId("test1234567890");
		request.setApplicationId("a123b1110");
		YzhResponse<GetInvoiceStatusResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.getInvoiceStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetInvoiceStatusResponse data = response.getData();
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

	// 查询发票信息
	private static void getInvoiceInformation() {
		GetInvoiceInformationRequest request = new GetInvoiceInformationRequest();
		request.setInvoiceApplyId("test1234567890");
		request.setApplicationId("a123b1110");
		YzhResponse<GetInvoiceInformationResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.getInvoiceInformation(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetInvoiceInformationResponse data = response.getData();
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

	// 下载 PDF 版发票
	private static void getInvoiceFile() {
		GetInvoiceFileRequest request = new GetInvoiceFileRequest();
		request.setInvoiceApplyId("test1234567890");
		request.setApplicationId("a123b1110");
		YzhResponse<GetInvoiceFileResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.getInvoiceFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetInvoiceFileResponse data = response.getData();
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

	// 发送发票扫描件压缩包下载链接邮件
	private static void sendReminderEmail() {
		SendReminderEmailRequest request = new SendReminderEmailRequest();
		request.setInvoiceApplyId("test1234567890");
		request.setApplicationId("a123b1110");
		YzhResponse<SendReminderEmailResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如平台企业未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义
			response = client.sendReminderEmail(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				SendReminderEmailResponse data = response.getData();
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
