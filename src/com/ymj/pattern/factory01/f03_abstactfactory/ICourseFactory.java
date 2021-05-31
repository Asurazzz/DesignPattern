package com.ymj.pattern.factory01.f03_abstactfactory;

import com.ymj.pattern.factory01.ICourse;

/**
 * 所有子工厂都实现这个工厂
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
