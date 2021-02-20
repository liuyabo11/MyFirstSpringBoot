package com.example.proxy.staticproxy;

import com.example.proxy.OrderService;
import com.example.proxy.impl.OrderServiceImpl;

/**
 * @author liuyabo
 * @title ProxyOrderService
 * @create 2021/2/19 16:30
 */
public class ProxyOrderService implements OrderService {
    private OrderServiceImpl orderServiceImpl;

    public ProxyOrderService(OrderServiceImpl orderServiceImpl){
        this.orderServiceImpl = orderServiceImpl;
    }

    @Override
    public String addOrder(String orderId, String orderName) {
        System.out.println("使用代理类打印日志");
        return orderServiceImpl.addOrder(orderId,orderName);
    }

//    @Override
//    public String addOrder1(String orderId, String orderName) {
//        return null;
//    }
}
