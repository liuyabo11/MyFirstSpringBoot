package com.example.proxy.jdk.youhua;

import com.example.proxy.OrderService;
import com.example.proxy.impl.OrderServiceImpl;

/**
 * @author liuyabo
 * @title Test
 * @create 2021/2/20 13:52
 */
public class Test {
    public static void main(String[] args) throws Exception {
        MyJdkInvocationHandler myJdkInvocationHandler = new MyJdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = myJdkInvocationHandler.getProxy();
        String s = proxy.addOrder("11", "22");
        System.out.println(s);
    }
}
