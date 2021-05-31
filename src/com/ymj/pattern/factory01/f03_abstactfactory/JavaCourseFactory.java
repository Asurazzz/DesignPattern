package com.ymj.pattern.factory01.f03_abstactfactory;

import com.ymj.pattern.factory01.ICourse;
import com.ymj.pattern.factory01.JavaCourse;

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
