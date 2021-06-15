package com.ymj.pattern.code06_Strategy.promotion;

/**
 * @Classname StrategyFactoryTest
 * @Description TODO
 * @Date 2021/6/15 18:11
 * @Created by yemingjie
 */
public class StrategyFactoryTest {
    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
