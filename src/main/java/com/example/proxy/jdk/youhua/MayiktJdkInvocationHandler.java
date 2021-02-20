package com.example.proxy.jdk.youhua;

import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title MayiktJdkInvocationHandler
 * @create 2021/2/20 13:51
 */
public interface MayiktJdkInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
