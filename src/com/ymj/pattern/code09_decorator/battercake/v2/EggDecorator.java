package com.ymj.pattern.code09_decorator.battercake.v2;

/**
 * @Classname EggDecorator
 * @Description 鸡蛋装饰者
 * @Date 2021/6/17 10:57
 * @Created by yemingjie
 */
public class EggDecorator extends BattercakeDecorator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
