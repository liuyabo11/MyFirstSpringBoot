package com.example.proxy.jdk.youhua;


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
        System.out.println("使用Jdk动态代理打印日志开始" + args[0]);
        Object result = method.invoke(target, args);
        System.out.println("使用Jdk动态代理打印日志结束" + args[1]);
        return result;
    }

    public <T> T getProxy(){
        return (T) MyProxy.newProxyInstance(new JavaClassLoader(),target.getClass().getInterfaces()[0],this);
    }
}
