package com.ymj.pattern.code03_prototype.simple;

import java.util.List;

/**
 * @Classname ConcretePrototypeA
 * @Description TODO
 * @Date 2021/6/7 19:55
 * @Created by yemingjie
 */
public class ConcretePrototypeA implements Prototype{

    /**
     * ƒÍ¡‰
     */
    private int age;

    /**
     * –’√˚
     * @return
     */
    private String name;

    /**
     * hobbies
     * @return
     */
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setHobbies(this.hobbies);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
