package com.ymj.pattern.code05_delegate;

/**
 * @Classname IEmployeeA
 * @Description TODO
 * @Date 2021/6/11 14:16
 * @Created by yemingjie
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("����Ա�� A�������ڿ�ʼ��" + command + "����");
    }
}
