package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.example.utils.BaseUtil;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.base.YzhRequest;
import com.yunzhanghu.sdk.base.YzhResponse;
import com.yunzhanghu.sdk.tax.TaxClient;
import com.yunzhanghu.sdk.tax.domain.GetTaxFileRequest;
import com.yunzhanghu.sdk.tax.domain.GetTaxFileResponse;
import com.yunzhanghu.sdk.tax.domain.GetUserCrossRequest;
import com.yunzhanghu.sdk.tax.domain.GetUserCrossResponse;

// 个人所得税扣缴明细表
public class Tax {

	private static YzhConfig config = Config.getYzhConfig();
	private static TaxClient client = new TaxClient(config);

	public static void main(String[] args) {
		// 下载个人所得税扣缴明细表
		getTaxFile();
		// 查询纳税人是否为跨集团用户
		getUserCross();
	}

	// 下载个人所得税扣缴明细表
	private static void getTaxFile() {
		GetTaxFileRequest request = new GetTaxFileRequest();
		request.setDealerId("");
		request.setEntId("");
		request.setYearMonth("2022-04");
		YzhResponse<GetTaxFileResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
			// 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.getTaxFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetTaxFileResponse data = response.getData();
				System.out.println("请求成功：" + data);
			} else {
				System.out.println("HTTP Status Code：" + response.getHttpCode());
				System.out.println("发生异常：" + response.getCode() + response.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查询纳税人是否为跨集团用户
	private static void getUserCross() {
		GetUserCrossRequest request = new GetUserCrossRequest();
		request.setDealerId("");
		request.setYear("2022");
		request.setIdCard("");
		request.setEntId("");
		YzhResponse<GetUserCrossResponse> response = null;
		try {
			// request-id：每次请求的唯一标识
			// 强烈建议平台企业自定义 request-id 并记录在日志中，如遇异常请求，便于使用 request-id 追踪问题
			// 如未自定义则使用 SDK 中的 UUID 方法自动生成，注意：UUID 方法不能保证全局唯一，可能会出现 ID 重复，推荐自行实现全局唯一 ID
			response = client.getUserCross(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {// 请求成功
				GetUserCrossResponse data = response.getData();
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
