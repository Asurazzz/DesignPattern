package com.ymj.pattern.code06_Strategy.promotion;

/**
 * @Classname PromotionStrategy
 * @Description
 * 领取优惠券抵扣、返现促销、拼团优惠。
 * 下面我们用代码来模拟，首先我们创建一 个促销策略的抽象 PromotionStrategy
 * @Date 2021/6/11 14:37
 * @Created by yemingjie
 */
public interface PromotionStrategy {
    void doPromotion();
}
