package com.ymj.pattern.code02_singleton.sin01_hungry;

/**
 * @Classname HungrySingleton
 * @Description TODO
 * @Date 2021/6/3 19:43
 * @Created by yemingjie
 */
public class HungrySingleton02 {

    private static final HungrySingleton02 instance;

    static {
        instance = new HungrySingleton02();
    }

    private HungrySingleton02(){}

    public static HungrySingleton02 getInstance() {
        return instance;
    }
}
