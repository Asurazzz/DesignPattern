package com.ymj.pattern.code01_factory.factory01.f01_simplefactory;

import com.ymj.pattern.code01_factory.ICourse;
import com.ymj.pattern.code01_factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        //ICourse course = factory.create("java");
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
