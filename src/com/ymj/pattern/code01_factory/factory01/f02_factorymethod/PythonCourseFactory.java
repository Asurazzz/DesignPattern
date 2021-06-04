package com.ymj.pattern.code01_factory.factory01.f02_factorymethod;

import com.ymj.pattern.code01_factory.ICourse;
import com.ymj.pattern.code01_factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
