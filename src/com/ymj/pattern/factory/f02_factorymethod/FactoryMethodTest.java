package com.ymj.pattern.factory.f02_factorymethod;

import com.ymj.pattern.factory.ICourse;

/**
 * 工厂方法模式适用场景
 *      创建对象需要大量重复的代码
 *      客户端不依赖产品类实力如何被创建、实现等细节
 *      一个类通过其子类来指定创建哪个对象
 * 工厂方法模式的优点：
 *      用户只需要关心所需产品对应的工厂，无须关心创建细节
 *      加入新产品符合开闭原则，提高了系统的可扩展性
 * 工厂方法模式的缺点：
 *      类的个数过多，增加了代码结构的复杂度
 *      增加了系统的抽象性和理解程度
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonCourseFactory.create();
        pythonCourse.record();
    }
}
