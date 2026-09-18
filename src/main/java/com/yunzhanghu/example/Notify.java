package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.sdk.authentication.domain.NotifyUserExemptedInfoRequest;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.faceauth.domain.NotifyFaceAuthRequest;
import com.yunzhanghu.sdk.h5usersign.domain.NotifyH5UserSignRequest;
import com.yunzhanghu.sdk.invoice.domain.NotifyInvoiceDoneRequest;
import com.yunzhanghu.sdk.notify.*;
import com.yunzhanghu.sdk.notify.domain.NotifyRequest;
import com.yunzhanghu.sdk.notify.domain.NotifyResponse;
import com.yunzhanghu.sdk.payment.domain.*;
import com.yunzhanghu.sdk.taxclearrefund.domain.NotifyClearTaxDoneRequest;
import com.yunzhanghu.sdk.taxclearrefund.domain.NotifyRefundTaxDoneRequest;
import com.yunzhanghu.sdk.uploadusersign.domain.NotifyUploadUserSignRequest;
import com.yunzhanghu.sdk.usercollect.domain.NotifyUserCollectPhoneRequest;
import com.yunzhanghu.sdk.walletbalancechange.domain.NotifyWalletBalanceChangeRequest;
import com.yunzhanghu.sdk.walletdeduct.domain.NotifyWalletDeductRequest;
import com.yunzhanghu.sdk.walletincome.domain.NotifyWalletIncomeRequest;
import com.yunzhanghu.sdk.walletwithdraw.domain.NotifyWalletWithdrawRequest;

// 异步通知
public class Notify {

	private static YzhConfig config = Config.getYzhConfig();

	private static NotifyClient client = new NotifyClient(config);

	public static void main(String[] args) {
		doNotify();
	}

	private static void doNotify() {
		NotifyRequest request = new NotifyRequest();
		request.setData("");
		request.setMess("");
		request.setSign("");
		request.setTimestamp("");
		try {
			// 劳务模式订单支付状态回调通知
            NotifyResponse<NotifyOrderLxlwRequest> response = client.notifyDecoder(request, NotifyOrderLxlwRequest.class);
            NotifyOrderLxlwRequest notifyRequest = response.getData();
            NotifyOrderLxlwData data = notifyRequest.getData();

			// H5 签约回调
//			NotifyResponse<NotifyH5UserSignRequest> response = client.notifyDecoder(request, NotifyH5UserSignRequest.class);
//			NotifyH5UserSignRequest notifyRequest = response.getData();

			// 非居民身份证验证名单审核结果回调通知
//			NotifyResponse<NotifyUserExemptedInfoRequest> response = client.notifyDecoder(request, NotifyUserExemptedInfoRequest.class);
//			NotifyUserExemptedInfoRequest notifyRequest = response.getData();

			// 发票开具完成通知
//			NotifyResponse<NotifyInvoiceDoneRequest> response = client.notifyDecoder(request, NotifyInvoiceDoneRequest.class);
//			NotifyInvoiceDoneRequest notifyRequest = response.getData();

			// 签约成功状态回调通知
//			NotifyResponse<NotifyUploadUserSignRequest> response = client.notifyDecoder(request, NotifyUploadUserSignRequest.class);
//			NotifyUploadUserSignRequest notifyRequest = response.getData();
			
			// 收集手机号码结果回调通知
//			NotifyResponse<NotifyUserCollectPhoneRequest> response = client.notifyDecoder(request, NotifyUserCollectPhoneRequest.class);
//			NotifyUserCollectPhoneRequest notifyRequest = response.getData();

			// 劳动者退款订单回调通知
//			NotifyResponse<NotifyLaborRefundOrderRequest> response = client.notifyDecoder(request, NotifyLaborRefundOrderRequest.class);
//			NotifyLaborRefundOrderRequest notifyRequest = response.getData();

            // 税费清缴完成通知
//			NotifyResponse<NotifyClearTaxDoneRequest> response = client.notifyDecoder(request, NotifyClearTaxDoneRequest.class);
//          NotifyClearTaxDoneRequest notifyRequest = response.getData();

            // 税费退补完成通知
//          NotifyResponse<NotifyRefundTaxDoneRequest> response = client.notifyDecoder(request, NotifyRefundTaxDoneRequest.class);
//          NotifyRefundTaxDoneRequest notifyRequest = response.getData();

			// 人脸识别实名核验结果回调通知
//			NotifyResponse<NotifyFaceAuthRequest> response = client.notifyDecoder(request, NotifyFaceAuthRequest.class);
//			NotifyFaceAuthRequest notifyRequest = response.getData();

			// 钱包余额入账结果回调通知
//			NotifyResponse<NotifyWalletIncomeRequest> response = client.notifyDecoder(request, NotifyWalletIncomeRequest.class);
//			NotifyWalletIncomeRequest notifyRequest = response.getData();

			// 钱包余额变更结果回调通知
//			NotifyResponse<NotifyWalletBalanceChangeRequest> response = client.notifyDecoder(request, NotifyWalletBalanceChangeRequest.class);
//			NotifyWalletBalanceChangeRequest notifyRequest = response.getData();

			// 钱包余额扣减申请结果回调通知
//			NotifyResponse<NotifyWalletDeductRequest> response = client.notifyDecoder(request, NotifyWalletDeductRequest.class);
//			NotifyWalletDeductRequest notifyRequest = response.getData();

			// 钱包余额提现结果回调通知
//			NotifyResponse<NotifyWalletWithdrawRequest> response = client.notifyDecoder(request, NotifyWalletWithdrawRequest.class);
//			NotifyWalletWithdrawRequest notifyRequest = response.getData();

			System.out.println("签名验证结果：" + response.getSignRes());
			System.out.println("数据解密结果：" + response.getDescryptRes());
			System.out.println("数据解密明文：" + notifyRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
