package com.ymj.pattern.code03_prototype.deepclone;

import java.io.Serializable;

/**
 * @Classname JinGuBang
 * @Description TODO
 * @Date 2021/6/8 17:42
 * @Created by yemingjie
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 120;
    public void big() {
        this.h *= 2;
        this.d *= 2;
    }
    
    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
