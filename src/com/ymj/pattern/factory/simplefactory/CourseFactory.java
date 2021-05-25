package com.ymj.pattern.factory.simplefactory;

public class CourseFactory {
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }


}
