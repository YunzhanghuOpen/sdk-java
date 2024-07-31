package com.yunzhanghu.sdk.payment.domain;

// 用户结算金额校验返回
public class CheckUserAmountResponse {
    
    // 是否超过月限额
    private boolean isOverWholeUserMonthQuota;
    
    // 是否超过年限额
    private boolean isOverWholeUserYearQuota;

    public void setIsOverWholeUserMonthQuota(boolean isOverWholeUserMonthQuota) {
        this.isOverWholeUserMonthQuota = isOverWholeUserMonthQuota;
    }

    public boolean getIsOverWholeUserMonthQuota() {
        return isOverWholeUserMonthQuota;
    }

    public void setIsOverWholeUserYearQuota(boolean isOverWholeUserYearQuota) {
        this.isOverWholeUserYearQuota = isOverWholeUserYearQuota;
    }

    public boolean getIsOverWholeUserYearQuota() {
        return isOverWholeUserYearQuota;
    }

    @Override
    public String toString() {
        return "CheckUserAmountResponse{" +
                " isOverWholeUserMonthQuota='" + isOverWholeUserMonthQuota + '\'' + 
                ", isOverWholeUserYearQuota='" + isOverWholeUserYearQuota + '\'' + 
               "}";
    }
}