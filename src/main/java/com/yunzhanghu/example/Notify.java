package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.sdk.authentication.domain.NotifyUserExemptedInfoRequest;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.bizlicgxv2h5.domain.NotifyGxV2H5AicRequest;
import com.yunzhanghu.sdk.bizlicgxv2h5api.domain.NotifyGxV2H5APIAicRequest;
import com.yunzhanghu.sdk.bizlicxjjh5.domain.NotifyH5EcoCityAicRequest;
import com.yunzhanghu.sdk.h5usersign.domain.NotifyH5UserSignRequest;
import com.yunzhanghu.sdk.invoice.domain.NotifyInvoiceDoneRequest;
import com.yunzhanghu.sdk.notify.*;
import com.yunzhanghu.sdk.notify.domain.NotifyRequest;
import com.yunzhanghu.sdk.notify.domain.NotifyResponse;
import com.yunzhanghu.sdk.payment.domain.NotifyOrderData;
import com.yunzhanghu.sdk.payment.domain.NotifyOrderRequest;
import com.yunzhanghu.sdk.uploadusersign.domain.NotifyUploadUserSignRequest;

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
			// 订单支付状态回调通知
			NotifyResponse<NotifyOrderRequest> response = client.notifyDecoder(request, NotifyOrderRequest.class);
			NotifyOrderRequest notifyRequest = response.getData();
			NotifyOrderData data = notifyRequest.getData();

			// H5 签约回调
//			NotifyResponse<NotifyH5UserSignRequest> response = client.notifyDecoder(request, NotifyH5UserSignRequest.class);
//			NotifyH5UserSignRequest notifyRequest = response.getData();

			// 免验证名单审核结果回调通知
//			NotifyResponse<NotifyUserExemptedInfoRequest> response = client.notifyDecoder(request, NotifyUserExemptedInfoRequest.class);
//			NotifyUserExemptedInfoRequest notifyRequest = response.getData();

			// 新经济个体工商户注册结果回调
//			NotifyResponse<NotifyH5EcoCityAicRequest> response = client.notifyDecoder(request, NotifyH5EcoCityAicRequest.class);
//			NotifyH5EcoCityAicRequest notifyRequest = response.getData();
			
			// 共享大额（H5）个体工商户注册/注销结果回调
//			NotifyResponse<NotifyGxV2H5AicRequest> response = client.notifyDecoder(request, NotifyGxV2H5AicRequest.class);
//			NotifyGxV2H5AicRequest notifyRequest = response.getData();
			
			// 共享大额（H5+API）个体工商户注册/注销结果回调
//			NotifyResponse<NotifyGxV2H5APIAicRequest> response = client.notifyDecoder(request, NotifyGxV2H5APIAicRequest.class);
//			NotifyGxV2H5APIAicRequest notifyRequest = response.getData();

			// 发票开具完成通知
//			NotifyResponse<NotifyInvoiceDoneRequest> response = client.notifyDecoder(request, NotifyInvoiceDoneRequest.class);
//			NotifyInvoiceDoneRequest notifyRequest = response.getData();

			// 签约成功状态回调通知
//			NotifyResponse<NotifyUploadUserSignRequest> response = client.notifyDecoder(request, NotifyOrderRequest.class);
//			NotifyUploadUserSignRequest notifyRequest = response.getData();

			System.out.println("签名验证结果：" + response.getSignRes());
			System.out.println("数据解密结果：" + response.getDescryptRes());
			System.out.println("数据解密明文：" + notifyRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
