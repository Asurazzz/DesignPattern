package com.ymj.pattern.code04_proxy.cglib;


/**
 * @Classname CglibTest
 * @Description CGLib 代理的目标对象不需要实现任何接口，它是通过动态继承目标对象 实现的动态代理。
 * @Date 2021/6/10 14:29
 * @Created by yemingjie
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
