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
        request.setDealerId("");
        request.setBrokerId("");
        request.setYear(2022);
        YzhResponse<GetInvoiceStatResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getInvoiceStat(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetInvoiceStatResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// 查询可开具发票额度和发票开具信息
	private static void getInvoiceAmount() {
		GetInvoiceAmountRequest request = new GetInvoiceAmountRequest();
        request.setDealerId("");
        request.setBrokerId("");
        YzhResponse<GetInvoiceAmountResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getInvoiceAmount(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetInvoiceAmountResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 发票开具申请
	private static void applyInvoice() {
		ApplyInvoiceRequest request = new ApplyInvoiceRequest();
		request.setInvoiceApplyId("");
        request.setDealerId("");
        request.setBrokerId("");
        request.setAmount("");
        request.setInvoiceType("1");
        request.setBankNameAccount("");
        request.setGoodsServicesName("");
        request.setRemark(null);
        YzhResponse<ApplyInvoiceResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.applyInvoice(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		ApplyInvoiceResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 查询发票开具申请状态
	private static void getInvoiceStatus() {
		GetInvoiceStatusRequest request = new GetInvoiceStatusRequest();
		request.setInvoiceApplyId("");
        request.setApplicationId("");
        YzhResponse<GetInvoiceStatusResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getInvoiceStatus(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetInvoiceStatusResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 查询发票信息
	private static void getInvoiceInformation() {
		GetInvoiceInformationRequest request = new GetInvoiceInformationRequest();
		request.setInvoiceApplyId("");
		request.setApplicationId("");
		YzhResponse<GetInvoiceInformationResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getInvoiceInformation(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetInvoiceInformationResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 下载 PDF 版发票
	private static void getInvoiceFile() {
		GetInvoiceFileRequest request = new GetInvoiceFileRequest();
		request.setInvoiceApplyId("");
        request.setApplicationId("");
        YzhResponse<GetInvoiceFileResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getInvoiceFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetInvoiceFileResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 发送发票扫描件压缩包下载链接邮件
	private static void sendReminderEmail() {
		SendReminderEmailRequest request = new SendReminderEmailRequest();
		request.setInvoiceApplyId("");
        request.setApplicationId("");
        YzhResponse<SendReminderEmailResponse> response = null;
        try {
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.sendReminderEmail(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		SendReminderEmailResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
