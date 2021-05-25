package com.ymj.pattern.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        ICourse course = factory.create("java");
        course.record();
    }
}
