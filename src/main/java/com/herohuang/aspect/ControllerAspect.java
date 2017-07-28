package com.herohuang.aspect;

import com.herohuang.framework.annotation.Aspect;
import com.herohuang.framework.annotation.Controller;
import com.herohuang.framework.proxy.AspectProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * 切面拦截
 *
 * @author Acheron
 * @date 28/07/2017
 * @since 1.0.0
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    private Long begin;

    @Override
    public void after(Class<?> targetClass, Method targetMethod, Object[] methodParams, Object result) {
        LOGGER.debug(String.format("time:%dms", System.currentTimeMillis() - begin));
        LOGGER.debug("-------------end--------------");
    }

    @Override
    public void before(Class<?> targetClass, Method targetMethod, Object[] methodParams) {
        LOGGER.debug("-------------begin--------------");
        LOGGER.debug(String.format("class:%s", targetClass.getName()));
        LOGGER.debug(String.format("method:%s", targetMethod.getName()));
        begin = System.currentTimeMillis();
    }
}
