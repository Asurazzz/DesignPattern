package com.ymj.pattern.code06_Strategy;

/**
 * @Classname GroupbuyStrategy
 * @Description 拼团优惠
 * @Date 2021/6/11 15:47
 * @Created by yemingjie
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
