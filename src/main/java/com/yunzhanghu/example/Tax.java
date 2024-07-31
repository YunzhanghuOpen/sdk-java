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

// 个人所得税申报明细表
public class Tax {

	private static YzhConfig config = Config.getYzhConfig();
	private static TaxClient client = new TaxClient(config);

	public static void main(String[] args) {
		// 下载个人所得税申报明细表
		getTaxFile();
		// 查询纳税人是否为跨集团用户
		getUserCross();
	}

	// 下载个人所得税申报明细表
	private static void getTaxFile() {
		GetTaxFileRequest request = new GetTaxFileRequest();
		request.setDealerId(config.getDealerId());
		request.setEntId("accumulus_tj");
		request.setYearMonth("2020-01");
		YzhResponse<GetTaxFileResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getTaxFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetTaxFileResponse data = response.getData();
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

	// 查询纳税人是否为跨集团用户
	private static void getUserCross() {
		GetUserCrossRequest request = new GetUserCrossRequest();
		request.setDealerId(config.getDealerId());
		request.setYear("2020");
		request.setIdCard("11010519491231002X");
		request.setEntId("accumulus_tj");
		YzhResponse<GetUserCrossResponse> response = null;
		try {
			// request-id：请求 ID，请求的唯一标识
			// 建议平台企业自定义 request-id，并记录在日志中，便于问题发现及排查
			// 如未自定义 request-id，将使用 SDK 中的 UUID 方法自动生成。注意：UUID 方法生成的 request-id 不能保证全局唯一，推荐自定义 request-id
			response = client.getUserCross(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
			if (response.isSuccess()) {
				// 操作成功
				GetUserCrossResponse data = response.getData();
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
