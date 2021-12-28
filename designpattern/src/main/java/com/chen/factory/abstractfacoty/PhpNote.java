package com.chen.factory.abstractfacoty;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/25 下午4:12
 */
public class PhpNote implements INote {
    @Override
    public void edit() {
        System.out.println("edit Php note");
    }
}
