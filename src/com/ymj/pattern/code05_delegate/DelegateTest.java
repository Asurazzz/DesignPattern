package com.ymj.pattern.code05_delegate;

/**
 * @Classname DelegateTest
 * @Description TODO
 * @Date 2021/6/11 14:27
 * @Created by yemingjie
 */
public class DelegateTest {

    /**
     * �ͻ�����Boss����ί���ߣ�Leader��������ί���ߣ�Target��
     * ί����Ҫ���б�ί���ߵ�����
     * ����ģʽע�ص��ǹ��̣� ί��ģʽע�ص��ǽ��
     * ����ģʽע���ǿ���չ���ⲿ��չ����ί��ģʽע���ڲ������͸���
     * ί�ɵĺ��ģ����Ƿַ������ȡ���ǲ
     * ί��ģʽ�����Ǿ�̬����Ͳ���ģʽһ����������
     * @param args
     */
    public static void main(String[] args) {
        new Boss().command("��¼", new Leader());
    }
}
