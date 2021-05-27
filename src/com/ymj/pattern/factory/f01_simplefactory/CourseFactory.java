package com.ymj.pattern.factory.f01_simplefactory;

import com.ymj.pattern.factory.ICourse;
import com.ymj.pattern.factory.JavaCourse;

public class CourseFactory {

    /**
     * ·½°¸Ò»
     * @param name
     * @return
     */
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }

    public ICourse create(Class clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


}
