package com.ymj.pattern.factory.f02_factorymethod;

import com.ymj.pattern.factory.ICourse;
import com.ymj.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
