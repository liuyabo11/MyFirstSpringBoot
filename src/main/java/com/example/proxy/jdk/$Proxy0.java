package com.example.proxy.jdk;

import com.example.proxy.OrderService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author liuyabo
 * @title $Proxy0
 * @create 2021/2/20 13:11
 */
public class $Proxy0 implements OrderService {
    private InvocationHandler h;

    public $Proxy0(InvocationHandler h){
        this.h = h;
    }


    public final String addOrder(String var1, String var2)  {
        try {

            Method m3 = Class.forName("com.example.proxy.OrderService").getMethod("addOrder", Class.forName("java.lang.String"), Class.forName("java.lang.String"));

            return (String) this.h.invoke(this, m3, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

}
