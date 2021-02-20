package com.example.proxy.jdk.youhua;

import com.example.reflecx.JavaClassLoader;

import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title MyJdkInvocationHandler
 * @create 2021/2/20 13:52
 */
public class MyJdkInvocationHandler implements MayiktJdkInvocationHandler{

    //目标对象 被代理类
    private Object target;


    public MyJdkInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }

    public <T> T getProxy(){
        return (T) MyProxy.newProxyInstance((JavaClassLoader) target.getClass().getClassLoader(),target.getClass().getInterfaces()[0],this);
    }
}
