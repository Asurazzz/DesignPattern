package com.ymj.pattern.code04_proxy.cglibtest;

import com.ymj.pattern.code04_proxy.cglib.CglibMeipo;
import com.ymj.pattern.code04_proxy.cglib.Customer;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Classname CglibTest
 * @Description
 * CGLib ��ʵ��ԭ�������������أ����ǿ����ڲ��Դ����м���һ����룬
 * �� CGLib ���� ��� class д�뵽���̣�Ȼ�������ٷ�����һ̽����
 * @Date 2021/6/10 14:35
 * @Created by yemingjie
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            //���� cglib �Ĵ�������Խ��ڴ��е� class �ļ�д�뱾�ش���
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cglib_proxy_class/");
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
