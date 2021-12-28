package com.chen.factory.abstractfacoty;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/25 下午4:53
 */
public abstract class AbstractCourseFactory {
    public void init() {
        System.out.println("init.....");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
