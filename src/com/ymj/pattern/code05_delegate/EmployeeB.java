package com.ymj.pattern.code05_delegate;

/**
 * @Classname IEmployeeB
 * @Description TODO
 * @Date 2021/6/11 14:17
 * @Created by yemingjie
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工 B，我现在开始干" + command + "工作");
    }
}
