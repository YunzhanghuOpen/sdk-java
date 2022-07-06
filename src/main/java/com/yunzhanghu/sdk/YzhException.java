package com.yunzhanghu.sdk;

public class YzhException extends Exception {

    private static final long serialVersionUID = -672638255707132178L;

    private String errMsg;

    public YzhException() {
        super();
    }

    public YzhException(String errMsg) {
        super(errMsg);
        this.errMsg = errMsg;
    }

    public YzhException(String errMsg, Throwable cause) {
        super(errMsg, cause);
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
