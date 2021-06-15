package com.ymj.pattern.code06_Strategy;

/**
 * @Classname CouponStrategy
 * @Description 优惠券
 * @Date 2021/6/11 14:45
 * @Created by yemingjie
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
