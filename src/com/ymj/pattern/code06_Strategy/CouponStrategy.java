package com.ymj.pattern.code06_Strategy;

/**
 * @Classname CouponStrategy
 * @Description �Ż�ȯ
 * @Date 2021/6/11 14:45
 * @Created by yemingjie
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("��ȡ�Ż�ȯ,�γ̵ļ۸�ֱ�Ӽ��Ż�ȯ��ֵ�ֿ�");
    }
}
