package com.ymj.pattern.code06_Strategy;

/**
 * @Classname CashbackStrategy
 * @Description ���ֻ
 * @Date 2021/6/11 14:46
 * @Created by yemingjie
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("���ִ���,���صĽ��ת��֧�����˺�");
    }
}
