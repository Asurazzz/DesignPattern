package com.ymj.pattern.code04_proxy.dynamicgp;

import com.ymj.pattern.code04_proxy.dynamic.Customer;
import com.ymj.pattern.code04_proxy.staticproxy.Person;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2021/6/10 14:04
 * @Created by yemingjie
 */
public class Client {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
