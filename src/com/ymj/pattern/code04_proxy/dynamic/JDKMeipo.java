package com.ymj.pattern.code04_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JDKMeipo
 * @Description TODO
 * @Date 2021/6/9 10:59
 * @Created by yemingjie
 */
public class JDKMeipo implements InvocationHandler {
    /**
     * ������Ķ��󣬰����ø���������
     */
    private Object target;
    public Object getInstance(Object target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ��õ��������");
        System.out.println("��ʼ��ɫ");
    }

    private void after(){ System.out.println("������ʵĻ�����׼������"); }
}
