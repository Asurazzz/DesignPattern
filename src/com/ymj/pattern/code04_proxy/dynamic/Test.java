package com.ymj.pattern.code04_proxy.dynamic;

import com.ymj.pattern.code04_proxy.staticproxy.Person;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/6/9 11:04
 * @Created by yemingjie
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        Person instance = (Person) new JDKMeipo().getInstance(customer);
        instance.findLove();
    }
}
