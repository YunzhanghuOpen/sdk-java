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
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getTaxFile(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetTaxFileResponse data = response.getData();
        		System.out.println("请求成功：" + data);
			}else {
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
        	// 强烈建议平台企业自定义 requestId 并记录在日志中，如遇异常请求，方便定位异常原因。如未自定义则使用 SDK 中的 GUID 方法自动生成
        	response = client.getUserCross(YzhRequest.build(BaseUtil.getRandomStr("requestId"), request));
        	if (response.isSuccess()) {// 请求成功
        		GetUserCrossResponse data = response.getData();
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
