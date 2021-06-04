package com.ymj.pattern.code02_singleton.sin02_lazy;

/**
 * @Classname LazySimpleSingletonTest
 * @Description TODO
 * @Date 2021/6/3 19:58
 * @Created by yemingjie
 *
 * 两个线程有可能出现两个不同的实例！
 *  违背了单例模式只能创建一个实例的初衷
 *
 *   debug切换到线程模式之后，先让线程1跑完再跑线程2 就会出现不同实例
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
