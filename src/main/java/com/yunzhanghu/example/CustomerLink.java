package com.yunzhanghu.example;

import com.yunzhanghu.example.config.Config;
import com.yunzhanghu.sdk.base.YzhConfig;
import com.yunzhanghu.sdk.utils.CustomerLinkUtil;

// 专属客服链接管理
public class CustomerLink {

    private static YzhConfig config = Config.getYzhConfig();

    public static void main(String[] args) {
        // 生成专属客服链接
        getLinkUrl();
    }

    // 生成专属客服链接
    private static void getLinkUrl() {
        String baseurl = "https://www.example.com";
        String memberId = "Test123456";
        String linkUrl = CustomerLinkUtil.getCustomerLink(config, baseurl, memberId);
        System.out.println(linkUrl);
    }
}
