package com.ymj.pattern.code03_prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ProtoTypeTest
 * @Description TODO
 * @Date 2021/6/8 16:26
 * @Created by yemingjie
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        // 创建一个具体clone的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        // 填充属性
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");
        List hobbies = new ArrayList();
        hobbies.add(1);
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);

        // 创建Client克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA)client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getHobbies());
        System.out.println("对象地址比较："+(concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));

        /**
         * hobbies的引用地址是相同的，意味着复制的不是值，而是引用的地址。
         * 这样的话修改任意一个对象的属性值，concretePrototype 和 concretePrototypeCone 的 hobbies 值都会改变。
         * 这就是浅拷贝。
         * 只是完整的复制了值的类型数据，没有复制引用对象，换言之，就是引用对象仍然指向原来的对象
         */
    }
}
