package com.ymj.pattern.code06_Strategy.pay;

/**
 * @Classname PayStrategyTest
 * @Description TODO
 * @Date 2021/6/15 20:30
 * @Created by yemingjie
 */
public class PayStrategyTest {

    //省略把商品添加到购物车，再从购物车下单
    // 直接从点单开始
    public static void main(String[] args) {
        Order order = new Order("1", "20180311001000009", 324.45);
        //开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
        // 每个渠道它支付的具体算法是不一样的
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
