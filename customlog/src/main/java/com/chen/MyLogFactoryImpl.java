package com.chen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/25 下午5:46
 */
public class MyLogFactoryImpl extends LogFactory {
    @Override
    public Object getAttribute(String name) {
        return null;
    }

    @Override
    public String[] getAttributeNames() {
        return new String[0];
    }

    @Override
    public Log getInstance(Class clazz) throws LogConfigurationException {
        return null;
    }

    @Override
    public Log getInstance(String name) throws LogConfigurationException {
        System.out.println(name);
        return new Log() {
            @Override
            public void debug(Object message) {

            }

            @Override
            public void debug(Object message, Throwable t) {

            }

            @Override
            public void error(Object message) {

            }

            @Override
            public void error(Object message, Throwable t) {

            }

            @Override
            public void fatal(Object message) {

            }

            @Override
            public void fatal(Object message, Throwable t) {

            }

            @Override
            public void info(Object message) {

            }

            @Override
            public void info(Object message, Throwable t) {

            }

            @Override
            public boolean isDebugEnabled() {
                return false;
            }

            @Override
            public boolean isErrorEnabled() {
                return false;
            }

            @Override
            public boolean isFatalEnabled() {
                return false;
            }

            @Override
            public boolean isInfoEnabled() {
                return false;
            }

            @Override
            public boolean isTraceEnabled() {
                return false;
            }

            @Override
            public boolean isWarnEnabled() {
                return false;
            }

            @Override
            public void trace(Object message) {

            }

            @Override
            public void trace(Object message, Throwable t) {

            }

            @Override
            public void warn(Object message) {

            }

            @Override
            public void warn(Object message, Throwable t) {

            }
        };
    }

    @Override
    public void release() {

    }

    @Override
    public void removeAttribute(String name) {

    }

    @Override
    public void setAttribute(String name, Object value) {

    }
}
