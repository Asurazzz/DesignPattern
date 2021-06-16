package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname PayState
 * @Description 支付完成以后的状态
 * @Date 2021/6/15 19:50
 * @Created by yemingjie
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
