package com.ymj.pattern.code09_decorator.battercake.v2;

/**
 * @Classname BaseBattercake
 * @Description 基本的煎饼（或者叫基础套餐）
 * @Date 2021/6/17 10:54
 * @Created by yemingjie
 */
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg(){
        return "煎饼";
    }

    @Override
    public int getPrice(){
        return 5;
    }
}
