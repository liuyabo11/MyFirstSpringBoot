package com.example.proxy.staticproxy;

import com.example.proxy.impl.OrderServiceImpl;

/**
 * @author liuyabo
 * @title Test
 * @create 2021/2/19 16:34
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 静态代理模式：是需要人工的手写代理类
         * 实现方式：实现接口 和 继承模式
         */
        ProxyOrderService proxyOrderService = new ProxyOrderService(new OrderServiceImpl());
        String ceshi = proxyOrderService.addOrder("12", "ceshi");
        System.out.println(ceshi);


        ProxyOrderService2  proxyOrderService2 = new ProxyOrderService2();
        String xixi = proxyOrderService2.addOrder("22", "xixi");
        System.out.println(xixi);

    }
}
