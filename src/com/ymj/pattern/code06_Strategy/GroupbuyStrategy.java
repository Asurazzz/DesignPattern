package com.ymj.pattern.code06_Strategy;

/**
 * @Classname GroupbuyStrategy
 * @Description ƴ���Ż�
 * @Date 2021/6/11 15:47
 * @Created by yemingjie
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("ƴ�ţ��� 20 �˳��ţ�ȫ�������Ź���");
    }
}
