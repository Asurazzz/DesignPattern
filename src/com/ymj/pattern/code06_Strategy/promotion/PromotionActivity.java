package com.ymj.pattern.code06_Strategy.promotion;

/**
 * @Classname PromotionActivity
 * @Description TODO
 * @Date 2021/6/11 15:49
 * @Created by yemingjie
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }
}
