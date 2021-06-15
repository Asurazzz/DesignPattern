package com.ymj.pattern.code06_Strategy;

/**
 * @Classname CashbackStrategy
 * @Description 返现活动
 * @Date 2021/6/11 14:46
 * @Created by yemingjie
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
