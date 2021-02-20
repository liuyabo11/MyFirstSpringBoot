package com.example.proxy.jdk;

import com.example.proxy.OrderService;
import com.example.proxy.impl.OrderServiceImpl;

/**
 * @author liuyabo
 * @title Test
 * @create 2021/2/20 9:11
 */
public class Test {
    public static void main(String[] args) throws Exception {

        /**
         * 动态代理：通过程序动态生成代理类，不需要人工手写代理类
         * 动态代理实现方式：jdk动态代理（实现接口）和cjlib(继承模式)
         */
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //生成代理类
        OrderService proxy = jdkInvocationHandler.getProxy();
        System.out.println("test");
        //调用方法的时候去执行
        String s = proxy.addOrder("11", "22");
        System.out.println(s);
    }
}
