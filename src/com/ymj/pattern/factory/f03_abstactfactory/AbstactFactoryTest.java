package com.ymj.pattern.factory.f03_abstactfactory;


/**
 *  抽象工厂模式的优点：
 *      具体产品在应用层代码隔离，无须关心创建细节
 *      将一个系列的产品族统一到一起创建
 *  抽象工厂模式的缺点：
 *      规定了所有可能被创建的产品集合，增加新的产品困难，需要修改接口
 *      增加了系统的抽象性和理解难度
 */
public class AbstactFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createVideo();
        factory.createNote();
    }
}
