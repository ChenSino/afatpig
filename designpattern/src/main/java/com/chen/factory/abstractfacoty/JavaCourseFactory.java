package com.chen.factory.abstractfacoty;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/25 下午4:56
 */
public class JavaCourseFactory extends AbstractCourseFactory {
    @Override
    protected INote createNote() {
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        return new JavaVideo();
    }
}
