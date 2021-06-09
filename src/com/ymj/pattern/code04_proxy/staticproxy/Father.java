package com.ymj.pattern.code04_proxy.staticproxy;

/**
 * @Classname Father
 * @Description TODO
 * @Date 2021/6/9 10:51
 * @Created by yemingjie
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("��ĸ��ɫ����");
        son.findLove();
        System.out.println("�ɹ�");
    }
}
