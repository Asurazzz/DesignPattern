package com.ymj.pattern.code06_Strategy;

/**
 * @Classname EmptyStrategy
 * @Description �޴����
 * @Date 2021/6/11 15:48
 * @Created by yemingjie
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("�޴����");
    }
}
