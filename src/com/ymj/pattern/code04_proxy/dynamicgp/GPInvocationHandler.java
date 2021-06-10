package com.ymj.pattern.code04_proxy.dynamicgp;

import java.lang.reflect.Method;

/**
 * @Classname GPInvocationHandler
 * @Description TODO
 * @Date 2021/6/10 11:13
 * @Created by yemingjie
 */
public interface GPInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Exception;
}
