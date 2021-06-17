package com.ymj.pattern.code09_decorator.battercake.v2;

/**
 * @Classname BattercakeDecorator
 * @Description 创建一个扩展套餐的抽象装饰者
 * @Date 2021/6/17 10:55
 * @Created by yemingjie
 */
public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
