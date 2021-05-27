package com.ymj.pattern.factory.f03_abstactfactory;


/**
 *  ���󹤳�ģʽ���ŵ㣺
 *      �����Ʒ��Ӧ�ò������룬������Ĵ���ϸ��
 *      ��һ��ϵ�еĲ�Ʒ��ͳһ��һ�𴴽�
 *  ���󹤳�ģʽ��ȱ�㣺
 *      �涨�����п��ܱ������Ĳ�Ʒ���ϣ������µĲ�Ʒ���ѣ���Ҫ�޸Ľӿ�
 *      ������ϵͳ�ĳ����Ժ�����Ѷ�
 */
public class AbstactFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createVideo();
        factory.createNote();
    }
}
