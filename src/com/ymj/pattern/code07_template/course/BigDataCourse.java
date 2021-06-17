package com.ymj.pattern.code07_template.course;

/**
 * @Classname BigDataCourse
 * @Description TODO
 * @Date 2021/6/16 20:09
 * @Created by yemingjie
 */
public class BigDataCourse extends NetworkCourse{

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
