package com.ymj.pattern.code04_proxy.dynamicgp;

import java.lang.reflect.Method;

/**
 * @Classname GPMeipo
 * @Description TODO
 * @Date 2021/6/10 13:56
 * @Created by yemingjie
 */
public class GPMeipo implements GPInvocationHandler{

    // ������Ķ��󣬰����ñ�������
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
        System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ��õ��������");
        System.out.println("��ʼ��ɫ");
    }

    private void after(){
        System.out.println("������ʵĻ�����׼������");
    }
}
