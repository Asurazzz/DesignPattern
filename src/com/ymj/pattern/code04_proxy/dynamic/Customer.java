package com.ymj.pattern.code04_proxy.dynamic;

import com.ymj.pattern.code04_proxy.staticproxy.Person;

/**
 * @Classname Customer
 * @Description TODO
 * @Date 2021/6/9 11:03
 * @Created by yemingjie
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("�߸�˧");
        System.out.println("��� 180cm");
        System.out.println("�ش�6 �鸹��");
    }
}
