package com.example.proxy.cglib;

import java.lang.reflect.Method;

import com.example.proxy.impl.OrderServiceImpl;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class OrderServiceImpl$$EnhancerByCGLIB$$48644490
        extends OrderServiceImpl
{
    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static  ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static  Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static Object CGLIB$CALLBACK_FILTER;
    private static  Method CGLIB$addOrder$0$Method;
    private static  MethodProxy CGLIB$addOrder$0$Proxy;
    private static  Object[] CGLIB$emptyArgs;
    private static  Method CGLIB$equals$1$Method;
    private static  MethodProxy CGLIB$equals$1$Proxy;
    private static  Method CGLIB$toString$2$Method;
    private static  MethodProxy CGLIB$toString$2$Proxy;
    private static  Method CGLIB$hashCode$3$Method;
    private static  MethodProxy CGLIB$hashCode$3$Proxy;
    private static  Method CGLIB$clone$4$Method;
    private static  MethodProxy CGLIB$clone$4$Proxy;

    static {
        try {
            CGLIB$STATICHOOK1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class cls = Class.forName("com.example.proxy.cglib.OrderServiceImpl$$EnhancerByCGLIB$$48644490");
        String[] strArr = new String[]{"equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"};
        Class cls2 = Class.forName("java.lang.Object");
        Method[] findMethods = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods());
        CGLIB$equals$1$Method = findMethods[0];
        CGLIB$equals$1$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
        CGLIB$toString$2$Method = findMethods[1];
        CGLIB$toString$2$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
        CGLIB$hashCode$3$Method = findMethods[2];
        CGLIB$hashCode$3$Proxy = MethodProxy.create(cls2, cls, "()I", "hashCode", "CGLIB$hashCode$3");
        CGLIB$clone$4$Method = findMethods[3];
        CGLIB$clone$4$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
        strArr = new String[]{"addOrder", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"};
        cls2 = Class.forName("com.example.proxy.impl.OrderServiceImpl");
        CGLIB$addOrder$0$Method = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods())[0];
        /**
         * MethodProxy对象的
         * f1:为cls2，被代理类对象
         * f2:为cls，代理类对象
         */
        CGLIB$addOrder$0$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "addOrder", "CGLIB$addOrder$0");
    }



    final String CGLIB$addOrder$0(String paramString1, String paramString2)
    {
        return super.addOrder(paramString1, paramString2);
    }

    public final String addOrder(String paramString1, String paramString2)
    {
        MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
        if (tmp4_1 == null)
        {
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
        if (tmp17_14 != null) {
            try{
                return (String)tmp17_14.intercept(this, CGLIB$addOrder$0$Method, new Object[] { paramString1, paramString2 }, CGLIB$addOrder$0$Proxy);

            }catch (Throwable throwable) {
                throwable.printStackTrace();
            }

        }
        return super.addOrder(paramString1, paramString2);
    }

    private void CGLIB$BIND_CALLBACKS(OrderServiceImpl$$EnhancerByCGLIB$$48644490 orderServiceImpl$$EnhancerByCGLIB$$48644490) {
    }

    final boolean CGLIB$equals$1(Object paramObject)
    {
        return super.equals(paramObject);
    }



    public void setCallbacks(CglibMethodInterceptor paramArrayOfCallback)
    {
        this.CGLIB$CALLBACK_0 = ((MethodInterceptor)paramArrayOfCallback);
    }

}
