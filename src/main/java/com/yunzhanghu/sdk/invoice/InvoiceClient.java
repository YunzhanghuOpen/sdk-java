package com.yunzhanghu.sdk.invoice;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.invoice.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InvoiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceClient.class);

    public InvoiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }
    
    // 查询平台企业已开具和待开具发票金额
    public YzhResponse<GetInvoiceStatResponse> getInvoiceStat(YzhRequest<GetInvoiceStatRequest> req) throws YzhException {
        try {
            return get(req, "/api/payment/v1/invoice-stat", false, new TypeToken<YzhResponse<GetInvoiceStatResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 查询可开票额度和开票信息
    public YzhResponse<GetInvoiceAmountResponse> getInvoiceAmount(YzhRequest<GetInvoiceAmountRequest> req) throws YzhException {
        try {
            return post(req, "/api/invoice/v2/invoice-amount", new TypeToken<YzhResponse<GetInvoiceAmountResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 开票申请
    public YzhResponse<ApplyInvoiceResponse> applyInvoice(YzhRequest<ApplyInvoiceRequest> req) throws YzhException {
        try {
            return post(req, "/api/invoice/v2/apply", new TypeToken<YzhResponse<ApplyInvoiceResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 查询开票申请状态
    public YzhResponse<GetInvoiceStatusResponse> getInvoiceStatus(YzhRequest<GetInvoiceStatusRequest> req) throws YzhException {
        try {
            return post(req, "/api/invoice/v2/invoice/invoice-status", new TypeToken<YzhResponse<GetInvoiceStatusResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 下载 PDF 版发票
    public YzhResponse<GetInvoiceFileResponse> getInvoiceFile(YzhRequest<GetInvoiceFileRequest> req) throws YzhException {
        try {
            return post(req, "/api/invoice/v2/invoice/invoice-pdf", new TypeToken<YzhResponse<GetInvoiceFileResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
    
    // 发送发票扫描件压缩包下载链接邮件
    public YzhResponse<SendReminderEmailResponse> sendReminderEmail(YzhRequest<SendReminderEmailRequest> req) throws YzhException {
        try {
            return post(req, "/api/invoice/v2/invoice/reminder/email", new TypeToken<YzhResponse<SendReminderEmailResponse>>(){});
        } catch (Exception e){
            LOGGER.error("request: {}, errorMsg: {}", req, e.getMessage(), e);
            throw new YzhException("msg", e);
        }
    }
}