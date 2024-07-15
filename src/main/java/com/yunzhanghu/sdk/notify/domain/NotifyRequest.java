package com.yunzhanghu.sdk.notify.domain;

public class NotifyRequest {

    private String data;
	
	private String mess;
	
	private String timestamp;
		
	private String sign;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "NotifyRequest{" +
                " data='" + data + '\'' + 
                ", mess='" + mess + '\'' + 
                ", timestamp='" + timestamp + '\'' + 
                ", sign='" + sign + '\'' + 
               "}";
	}
	
	
}
