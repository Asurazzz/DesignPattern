package com.ymj.pattern.factory.f02_factorymethod;

import com.ymj.pattern.factory.ICourse;
import com.ymj.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
