package com.ymj.pattern.code06_Strategy.promotion;

/**
 * @Classname StrategyTest
 * @Description TODO
 * @Date 2021/6/11 15:50
 * @Created by yemingjie
 */
public class StrategyTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
        activity618.execute();
        activity1111.execute();
    }
}
