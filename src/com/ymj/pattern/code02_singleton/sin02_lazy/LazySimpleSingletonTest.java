package com.ymj.pattern.code02_singleton.sin02_lazy;

/**
 * @Classname LazySimpleSingletonTest
 * @Description TODO
 * @Date 2021/6/3 19:58
 * @Created by yemingjie
 *
 * �����߳��п��ܳ���������ͬ��ʵ����
 *  Υ���˵���ģʽֻ�ܴ���һ��ʵ���ĳ���
 *
 *   debug�л����߳�ģʽ֮�������߳�1���������߳�2 �ͻ���ֲ�ͬʵ��
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        new Thread(() -> {
            LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + singleton);
        }).start();
        new Thread(() -> {
            LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + singleton);
        }).start();

        System.out.println("Exctor End");
    }
}
