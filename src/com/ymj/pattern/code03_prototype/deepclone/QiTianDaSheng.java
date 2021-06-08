package com.ymj.pattern.code03_prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @Classname QiTianDaSheng
 * @Description TODO
 * @Date 2021/6/8 17:44
 * @Created by yemingjie
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return this.deepClone();
    }

    /**
     * Éî¿ËÂ¡
     * @return
     */
    public Object deepClone() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    /**
     * Ç³¿½±´
     * @param target
     * @return
     */
    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }
}
