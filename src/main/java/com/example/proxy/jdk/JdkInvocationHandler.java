package com.example.proxy.jdk;

import com.example.proxy.OrderInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyabo
 * @title JdkInvocationHandler
 * @create 2021/2/20 9:45
 */
public class JdkInvocationHandler implements InvocationHandler {
    //目标对象 被代理类
    private Object target;

    //通过构造方法获取目标对象
    public JdkInvocationHandler(Object taget){
        this.target = taget;
    }

    /**
     *
     * @param proxy:代理类
     * @param method：接口方法
     * @param args：接口方法参数
     * @return
     * @throws Throwable
     *
     * 使用生成的代理类 拦截回调
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理执行之前====》");
        //通过反射真正的去执行目标方法
        Object invoke = method.invoke(target, args);
        System.out.println("jdk动态代理执行之后====》");
        return invoke;
    }

    /**
     * 使用jdk动态代理 生成代理类
     * @param <T>
     * @return
     */
    public <T> T getProxy(){
        /**
         * ClassLoader : 读取代理类的class文件
         * Interfaces ：基于该接口拼接代理类的源代码
         * InvocationHandler ： this 回调
         */
//        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);


        return (T) new $Proxy0(this);
    }
}
