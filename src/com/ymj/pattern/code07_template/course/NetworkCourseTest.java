package com.ymj.pattern.code07_template.course;

/**
 * @Classname NetworkCourseTest
 * @Description TODO
 * @Date 2021/6/16 20:13
 * @Created by yemingjie
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("==================Java  架构师课程=====================");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("==================大数据 架构师课程=====================");
        BigDataCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }

}
