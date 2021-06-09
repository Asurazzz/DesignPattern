package com.ymj.pattern.code04_proxy.staticproxy;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/6/9 10:53
 * @Created by yemingjie
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
