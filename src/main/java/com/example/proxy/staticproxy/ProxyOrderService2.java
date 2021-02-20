package com.example.proxy.staticproxy;

import com.example.proxy.impl.OrderServiceImpl;

/**
 * @author liuyabo
 * @title ProxyOrderService2
 * @create 2021/2/19 16:35
 */
public class ProxyOrderService2 extends OrderServiceImpl {

    public String addOrder(String orderId, String orderName) {
        System.out.println("使用代理类打印日志");
        return super.addOrder(orderId,orderName);
    }
}
