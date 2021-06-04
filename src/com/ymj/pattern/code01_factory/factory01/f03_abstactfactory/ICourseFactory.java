package com.ymj.pattern.code01_factory.factory01.f03_abstactfactory;


import com.ymj.pattern.code01_factory.ICourse;

/**
 * �����ӹ�����ʵ���������
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
