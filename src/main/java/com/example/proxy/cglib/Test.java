package com.example.proxy.cglib;

import com.example.proxy.impl.OrderServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author liuyabo
 * @title Test
 * @create 2021/3/1 15:05
 */
public class Test {
    public static void main(String[] args) {
        //将生成的代理类class文件保存到d盘code目录
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CglibMethodInterceptor());
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setSuperclass(OrderServiceImpl.class);

        OrderServiceImpl o = (OrderServiceImpl) enhancer.create();
        String s = o.addOrder("1", "1");
        System.out.println(s);


//        OrderServiceImpl$$EnhancerByCGLIB$$48644490 o =  new OrderServiceImpl$$EnhancerByCGLIB$$48644490();
//        o.setCallbacks(new CglibMethodInterceptor());
//
//        System.out.println(o.addOrder("1","2"));
    }
}
