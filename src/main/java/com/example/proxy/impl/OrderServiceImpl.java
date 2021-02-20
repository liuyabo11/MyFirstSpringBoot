package com.example.proxy.impl;

import com.example.proxy.OrderInfo;
import com.example.proxy.OrderService;

/**
 * @author liuyabo
 * @title OrderServiceImpl
 * @create 2021/2/19 16:29
 */
public class OrderServiceImpl implements OrderService /*, OrderInfo*/ {
    @Override
    public String addOrder(String orderId, String orderName) {
        System.out.println("业务类日志orderId " + orderId);
        return orderId + "===>" + orderName;
    }

    /*@Override
    public String addOrder1(String orderId, String orderName) {
        System.out.println("业务类日志orderId1 " + orderId);
        return orderId + "===>" + orderName;
    }

    @Override
    public String addOrderInfo(String id, String name) {
        System.out.println("OrderInfo业务类日志orderId1 " + id);
        return id + "===>" + name;
    }*/
}
