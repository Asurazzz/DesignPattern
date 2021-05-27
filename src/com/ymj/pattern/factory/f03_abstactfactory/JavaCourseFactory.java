package com.ymj.pattern.factory.f03_abstactfactory;

import com.ymj.pattern.factory.ICourse;
import com.ymj.pattern.factory.JavaCourse;

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
