package com.ymj.pattern.factory.f03_abstactfactory;

import com.ymj.pattern.factory.ICourse;

/**
 * 所有子工厂都实现这个工厂
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
