package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname WechatPay
 * @Description TODO
 * @Date 2021/6/15 20:16
 * @Created by yemingjie
 */
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
