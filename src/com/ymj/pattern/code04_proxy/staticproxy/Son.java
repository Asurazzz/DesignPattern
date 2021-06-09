package com.ymj.pattern.code04_proxy.staticproxy;

/**
 * @Classname Son
 * @Description TODO
 * @Date 2021/6/9 10:39
 * @Created by yemingjie
 */
public class Son implements Person{
    @Override
    public void findLove() {
        //我没有时间 //工作忙
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
