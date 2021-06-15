package com.ymj.pattern.code06_Strategy;

/**
 * @Classname EmptyStrategy
 * @Description 无促销活动
 * @Date 2021/6/11 15:48
 * @Created by yemingjie
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
