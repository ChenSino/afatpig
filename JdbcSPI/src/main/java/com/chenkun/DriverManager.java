package com.chenkun;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/25 下午4:03
 */
public class DriverManager {
    public void connect(){
        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = load.iterator();
        while (iterator.hasNext()) {
            Driver next = iterator.next();
            String driver = next.getDriver();
            //假装业务处理
            System.out.println("我拿到了用户实现的driver,可以进行连接数据库了，用户用的driver是：" + driver);
        }
    }
}
