package com.ymj.pattern.code01_factory.factory01.f03_abstactfactory;


import com.ymj.pattern.code01_factory.ICourse;

/**
 * 所有子工厂都实现这个工厂
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
