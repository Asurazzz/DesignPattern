package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname AliPay
 * @Description TODO
 * @Date 2021/6/15 20:15
 * @Created by yemingjie
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
