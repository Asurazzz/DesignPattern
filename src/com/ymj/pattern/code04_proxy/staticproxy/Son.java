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
        //��û��ʱ�� //����æ
        System.out.println("����Ҫ�󣺷���ò������");
    }
}
