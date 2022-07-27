package com.yunzhanghu.sdk.invoice.domain;

import com.google.gson.annotations.SerializedName;


// 系统支持的货物或应税劳务、服务名称
public class GoodsServicesName {
    
    // 货物或应税劳务、服务名称
    private String item;
    // 是否为默认值
    @SerializedName("default")
    private boolean _default;
    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
    public void setDefault(boolean _default) {
        this._default = _default;
    }

    public boolean getDefault() {
        return _default;
    }


    @Override
    public String toString() {
        return "GoodsServicesName{" +
                ", item='" + item + '\'' +
                ", _default='" + _default + '\'' +
                '}';
    }
}