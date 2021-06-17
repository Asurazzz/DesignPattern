package com.ymj.pattern.code09_decorator.battercake.v2;

/**
 * @Classname BattercakeTest
 * @Description
 * 优点：
 *      1、装饰者是继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象 扩展功能，即插即用。
 *      2、通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果。
 *      3、装饰者完全遵守开闭原则。
 * 缺点：
 *      1、会出现更多的代码，更多的类，增加程序复杂性。
 *      2、动态装饰时，多层装饰时会更复杂。 那么装饰者模式我们就讲解到这里，希望小伙伴们认真体会，加深理解
 * @Date 2021/6/17 11:05
 * @Created by yemingjie
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        // 买一个煎饼
        battercake = new BaseBattercake();
        // 加鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加鸡蛋
        battercake = new EggDecorator(battercake);
        // 加香肠
        battercake = new SausageDecorator(battercake);
        //跟静态代理最大区别就是职责不同
        // 静态代理不一定要满足 is-a 的关系
        // 静态代理会做功能增强，同一个职责变得不一样
        // 装饰器更多考虑是扩展
        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());
    }
}
