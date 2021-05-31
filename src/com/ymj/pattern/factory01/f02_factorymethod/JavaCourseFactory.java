package com.ymj.pattern.factory01.f02_factorymethod;

import com.ymj.pattern.factory01.ICourse;
import com.ymj.pattern.factory01.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
