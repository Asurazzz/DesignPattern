package com.ymj.pattern.code03_prototype.deepclone;

/**
 * @Classname DeepCloneTest
 * @Description TODO
 * ���Բο���https://blog.csdn.net/z1790424577/article/details/105650895
 * @Date 2021/6/8 18:07
 * @Created by yemingjie
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng == clone);
            System.out.println("���¡�� " + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("ǳ��¡�� " + (q.jinGuBang == n.jinGuBang));

    }
}
