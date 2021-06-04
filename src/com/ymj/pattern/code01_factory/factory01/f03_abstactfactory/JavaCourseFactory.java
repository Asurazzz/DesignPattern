package com.ymj.pattern.code01_factory.factory01.f03_abstactfactory;

import com.ymj.pattern.code01_factory.ICourse;
import com.ymj.pattern.code01_factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
