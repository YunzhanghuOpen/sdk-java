package com.yunzhanghu.sdk.dataservice;

import com.google.gson.reflect.TypeToken;
import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.base.*;
import com.yunzhanghu.sdk.dataservice.domain.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataServiceClient extends YzhClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceClient.class);

    public DataServiceClient(YzhConfig yzhConfig) {
        super(yzhConfig);
    }

    // 查询日订单数据
    public YzhResponse<ListDailyOrderResponse> listDailyOrder(YzhRequest<ListDailyOrderRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v1/orders", "encryption".equals(req.getRequest().getDataType()), new TypeToken<YzhResponse<ListDailyOrderResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询日订单数据（支付和退款订单）
    public YzhResponse<ListDailyOrderV2Response> listDailyOrderV2(YzhRequest<ListDailyOrderV2Request> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v2/orders", "encryption".equals(req.getRequest().getDataType()), new TypeToken<YzhResponse<ListDailyOrderV2Response>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询日订单文件
    public YzhResponse<GetDailyOrderFileResponse> getDailyOrderFile(YzhRequest<GetDailyOrderFileRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v1/order/downloadurl", false, new TypeToken<YzhResponse<GetDailyOrderFileResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询日订单文件（支付和退款订单）
    public YzhResponse<GetDailyOrderFileV2Response> getDailyOrderFileV2(YzhRequest<GetDailyOrderFileV2Request> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v1/order/day/url", false, new TypeToken<YzhResponse<GetDailyOrderFileV2Response>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询日流水数据
    public YzhResponse<ListDailyBillResponse> listDailyBill(YzhRequest<ListDailyBillRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v1/bills", "encryption".equals(req.getRequest().getDataType()), new TypeToken<YzhResponse<ListDailyBillResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询日流水文件
    public YzhResponse<GetDailyBillFileV2Response> getDailyBillFileV2(YzhRequest<GetDailyBillFileV2Request> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v2/bill/downloadurl", false, new TypeToken<YzhResponse<GetDailyBillFileV2Response>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询平台企业预付业务服务费记录
    public YzhResponse<List<RechargeRecordInfo>> listDealerRechargeRecordV2(YzhRequest<ListDealerRechargeRecordV2Request> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v2/recharge-record", false, new TypeToken<YzhResponse<List<RechargeRecordInfo>>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询余额日账单数据
    public YzhResponse<ListBalanceDailyStatementResponse> listBalanceDailyStatement(YzhRequest<ListBalanceDailyStatementRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v1/statements-daily", false, new TypeToken<YzhResponse<ListBalanceDailyStatementResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
    
    // 查询日订单汇总数据
    public YzhResponse<ListDailyOrderSummaryResponse> listDailyOrderSummary(YzhRequest<ListDailyOrderSummaryRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v2/order/daily-summary", false, new TypeToken<YzhResponse<ListDailyOrderSummaryResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }

    // 查询月订单汇总数据
    public YzhResponse<ListMonthlyOrderSummaryResponse> listMonthlyOrderSummary(YzhRequest<ListMonthlyOrderSummaryRequest> req) throws YzhException {
        try {
            return get(req, "/api/dataservice/v2/order/monthly-summary", false, new TypeToken<YzhResponse<ListMonthlyOrderSummaryResponse>>(){});
        } catch (Exception e){
            handleError(req, e);
            throw new YzhException("msg", e);
        }
    }
}