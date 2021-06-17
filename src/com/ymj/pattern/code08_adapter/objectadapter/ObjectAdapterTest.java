package com.ymj.pattern.code08_adapter.objectadapter;

/**
 * @Classname ObjectAdapterTest
 * @Description
 * 优点：
 *      1、能提高类的透明性和复用，现有的类复用但不需要改变。
 *      2、目标类和适配器类解耦，提高程序的扩展性。
 *      3、在很多业务场景中符合开闭原则。
 * 缺点：
 *      1、适配器编写过程需要全面考虑，可能会增加系统的复杂性。
 *      2、增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。
 * @Date 2021/6/17 10:33
 * @Created by yemingjie
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
