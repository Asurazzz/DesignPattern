package com.ymj.pattern.code09_decorator.battercake.v1;

/**
 * @Classname BattercakeWithEggAndSausage
 * @Description TODO
 * @Date 2021/6/17 10:48
 * @Created by yemingjie
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "再加1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
