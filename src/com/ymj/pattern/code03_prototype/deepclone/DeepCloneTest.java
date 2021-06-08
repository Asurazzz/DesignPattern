package com.ymj.pattern.code03_prototype.deepclone;

/**
 * @Classname DeepCloneTest
 * @Description TODO
 * 可以参考：https://blog.csdn.net/z1790424577/article/details/105650895
 * @Date 2021/6/8 18:07
 * @Created by yemingjie
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng == clone);
            System.out.println("深克隆： " + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆： " + (q.jinGuBang == n.jinGuBang));

    }
}
