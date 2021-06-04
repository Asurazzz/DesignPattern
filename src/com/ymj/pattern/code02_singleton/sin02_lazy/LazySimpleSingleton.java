package com.ymj.pattern.code02_singleton.sin02_lazy;

/**
 * @Classname LazySimpleSingleton
 * @Description TODO
 * @Date 2021/6/3 19:51
 * @Created by yemingjie
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {}

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
