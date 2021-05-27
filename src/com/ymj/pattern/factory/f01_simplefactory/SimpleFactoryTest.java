package com.ymj.pattern.factory.f01_simplefactory;

import com.ymj.pattern.factory.ICourse;
import com.ymj.pattern.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        //ICourse course = factory.create("java");
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
