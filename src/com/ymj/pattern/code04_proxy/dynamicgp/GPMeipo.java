package com.ymj.pattern.code04_proxy.dynamicgp;

import java.lang.reflect.Method;

/**
 * @Classname GPMeipo
 * @Description TODO
 * @Date 2021/6/10 13:56
 * @Created by yemingjie
 */
public class GPMeipo implements GPInvocationHandler{

    // 被代理的对象，把引用保存下来
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
