package com.ymj.pattern.factory.f03_abstactfactory;

import com.ymj.pattern.factory.ICourse;

/**
 * �����ӹ�����ʵ���������
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
