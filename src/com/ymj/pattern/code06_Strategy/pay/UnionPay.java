package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname UnionPay
 * @Description TODO
 * @Date 2021/6/15 20:17
 * @Created by yemingjie
 */
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
