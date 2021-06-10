package com.ymj.pattern.code04_proxy.cglibtest;

import com.ymj.pattern.code04_proxy.cglib.CglibMeipo;
import com.ymj.pattern.code04_proxy.cglib.Customer;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Classname CglibTest
 * @Description
 * CGLib 的实现原理又是怎样的呢？我们可以在测试代码中加上一句代码，
 * 将 CGLib 代理 后的 class 写入到磁盘，然后，我们再反编译一探究竟
 * @Date 2021/6/10 14:35
 * @Created by yemingjie
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            //利用 cglib 的代理类可以将内存中的 class 文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cglib_proxy_class/");
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
