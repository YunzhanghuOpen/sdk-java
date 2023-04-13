package com.yunzhanghu.sdk.notify.domain;

public class NotifyResponse<T> {
	
	// 验签结果
	private Boolean signRes;
	
	// 解密结果
	private Boolean descryptRes;
	
	// 解密后的内容
	private T data;
	
	public Boolean getSignRes() {
		return signRes;
	}

	public void setSignRes(Boolean signRes) {
		this.signRes = signRes;
	}

	public Boolean getDescryptRes() {
		return descryptRes;
	}

	public void setDescryptRes(Boolean descryptRes) {
		this.descryptRes = descryptRes;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "NotifyResponse{" +
              " signRes='" + signRes + '\'' + 
              ", descryptRes='" + descryptRes + '\'' + 
              ", data='" + data + '\'' + 
               '}';
	}

}
