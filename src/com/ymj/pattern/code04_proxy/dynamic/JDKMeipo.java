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
     * 被代理的对象，把引用给保存下来
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
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after(){ System.out.println("如果合适的话，就准备办事"); }
}
