package com.ymj.pattern.factory01.f03_abstactfactory;

import com.ymj.pattern.factory01.ICourse;

/**
 * �����ӹ�����ʵ���������
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
