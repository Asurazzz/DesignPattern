package com.ymj.pattern.code09_decorator.battercake.v2;

/**
 * @Classname SausageDecorator
 * @Description TODO
 * @Date 2021/6/17 11:03
 * @Created by yemingjie
 */
public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
