package com.example.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title CglibMethodInterceptor
 * @create 2021/3/1 14:55
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param o : 代理类
     * @param method ：方法
     * @param objects ：方法参数
     * @param methodProxy ：代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行cglib动态代理开始");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("执行cglib动态代理结束");
        return o1;
    }
}
