package com.ymj.pattern.code02_singleton.sin01_hungry;

/**
 * @Classname HungrySingleton
 * @Description TODO
 * @Date 2021/6/3 19:43
 * @Created by yemingjie
 */
public class HungrySingleton01 {

    private static final HungrySingleton01 instance = new HungrySingleton01();

    private HungrySingleton01(){}

    public static HungrySingleton01 getInstance() {
        return instance;
    }
}
