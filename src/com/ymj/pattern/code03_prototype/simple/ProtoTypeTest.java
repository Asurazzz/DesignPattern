package com.ymj.pattern.code03_prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ProtoTypeTest
 * @Description TODO
 * @Date 2021/6/8 16:26
 * @Created by yemingjie
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        // ����һ������clone�Ķ���
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        // �������
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");
        List hobbies = new ArrayList();
        hobbies.add(1);
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);

        // ����Client��¡
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA)client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("��¡�����е��������͵�ֵַ��" + concretePrototypeClone.getHobbies());
        System.out.println("ԭ�����е��������͵�ֵַ��" + concretePrototype.getHobbies());
        System.out.println("�����ַ�Ƚϣ�"+(concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));

        /**
         * hobbies�����õ�ַ����ͬ�ģ���ζ�Ÿ��ƵĲ���ֵ���������õĵ�ַ��
         * �����Ļ��޸�����һ�����������ֵ��concretePrototype �� concretePrototypeCone �� hobbies ֵ����ı䡣
         * �����ǳ������
         * ֻ�������ĸ�����ֵ���������ݣ�û�и������ö��󣬻���֮���������ö�����Ȼָ��ԭ���Ķ���
         */
    }
}
