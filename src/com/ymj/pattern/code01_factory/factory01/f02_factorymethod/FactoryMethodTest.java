package com.ymj.pattern.code01_factory.factory01.f02_factorymethod;


import com.ymj.pattern.code01_factory.ICourse;

/**
 * ��������ģʽ���ó���
 *      ����������Ҫ�����ظ��Ĵ���
 *      �ͻ��˲�������Ʒ��ʵ����α�������ʵ�ֵ�ϸ��
 *      һ����ͨ����������ָ�������ĸ�����
 * ��������ģʽ���ŵ㣺
 *      �û�ֻ��Ҫ���������Ʒ��Ӧ�Ĺ�����������Ĵ���ϸ��
 *      �����²�Ʒ���Ͽ���ԭ�������ϵͳ�Ŀ���չ��
 * ��������ģʽ��ȱ�㣺
 *      ��ĸ������࣬�����˴���ṹ�ĸ��Ӷ�
 *      ������ϵͳ�ĳ����Ժ����̶�
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonCourseFactory.create();
        pythonCourse.record();
    }
}
