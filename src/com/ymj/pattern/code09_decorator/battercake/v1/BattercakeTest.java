package com.ymj.pattern.code09_decorator.battercake.v1;

/**
 * @Classname BattercakeTest
 * @Description
 * 但是，如果用户需要一个加 2 个鸡蛋加 1 根香肠的煎饼，
 * 那么用我 们现在的类结构是创建不出来的，也无法自动计算出价格，除非再创建一个类做定制。
 * 如果需求再变，一直加定制显然是不科学的。那么下面我们就用装饰者模式来解决上面 的问题。
 * @Date 2021/6/17 10:49
 * @Created by yemingjie
 */
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.getPrice());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格：" + battercakeWithEggAndSausage.getPrice());
    }
}
