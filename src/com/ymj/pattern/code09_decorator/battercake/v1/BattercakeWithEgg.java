package com.ymj.pattern.code09_decorator.battercake.v1;

/**
 * @Classname BattercakeWithEgg
 * @Description TODO
 * @Date 2021/6/17 10:47
 * @Created by yemingjie
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
