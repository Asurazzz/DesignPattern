package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname JDPay
 * @Description TODO
 * @Date 2021/6/15 20:16
 * @Created by yemingjie
 */
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
