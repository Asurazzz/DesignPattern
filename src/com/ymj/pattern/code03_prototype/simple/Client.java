package com.ymj.pattern.code03_prototype.simple;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2021/6/8 16:15
 * @Created by yemingjie
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretPrototype) {
        return (Prototype) concretPrototype.clone();
    }
}
