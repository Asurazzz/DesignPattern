package com.ymj.pattern.code04_proxy.cglib;


/**
 * @Classname CglibTest
 * @Description CGLib �����Ŀ�������Ҫʵ���κνӿڣ�����ͨ����̬�̳�Ŀ����� ʵ�ֵĶ�̬����
 * @Date 2021/6/10 14:29
 * @Created by yemingjie
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
