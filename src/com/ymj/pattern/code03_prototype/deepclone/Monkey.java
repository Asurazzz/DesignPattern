package com.ymj.pattern.code03_prototype.deepclone;

import java.util.Date;

/**
 * @Classname Monkey
 * @Description TODO
 * @Date 2021/6/8 17:41
 * @Created by yemingjie
 */
public class Monkey {
    public int height;
    public int weight;
    public Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
