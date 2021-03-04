package com.example.proxy.jdk.youhua;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title MyProxy
 * @create 2021/2/20 13:44
 */
public class MyProxy {

    private static String rt = "\r\t";

    public static Object newProxyInstance(JavaClassLoader javaClassLoader, Class classInfo, MayiktJdkInvocationHandler h) {
        try {
            //1.使用反射根据接口信息拼接代理类java源代码

            Method[] methods = classInfo.getMethods();
            String proxyClass = "package com.example.proxy.jdk.youhua;" + rt
                    + "import java.lang.reflect.Method;" + rt
                    + "import com.example.proxy.jdk.youhua.MayiktJdkInvocationHandler;" + rt
                    + "import java.lang.reflect.UndeclaredThrowableException;" + rt
                    + "public class $Proxy0 implements " + classInfo.getName() + "{" + rt
                    + "MayiktJdkInvocationHandler h;" + rt
                    + "public $Proxy0(MayiktJdkInvocationHandler h)" + "{" + rt
                    + "this.h= h;" + rt + "}"
                    + getMethodString(methods, classInfo) + rt + "}";
            // 2. 将代理类源码文件写入硬盘中
            String filename = "d:/code/$Proxy0.java";
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            fw.write(proxyClass);
            fw.flush();
            fw.close();
            //3.将java源代码编译为class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileMgr.getJavaFileObjects(filename);
            JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
            t.call();
            fileMgr.close();
            //4.通过类加载器读取到代理类信息
            Class<?> proxy0Class = javaClassLoader.findClass("$Proxy0");
            //5.使用java反射机制给函数中赋值
            Constructor m = proxy0Class.getConstructor(MayiktJdkInvocationHandler.class);
            Object o = m.newInstance(h);
            return o;
        } catch (Exception e) {
        }
        return null;
    }

    public static String getMethodString(Method[] methods, Class intf) {
        String proxyMe = "";

        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < parameterTypes.length; i++) {
                sb.append(parameterTypes[i].getName() + " ver" + (i+1));
                if (i < parameterTypes.length - 1) {
                    sb.append(" ,");
                }

            }
            String parameterStr = sb.toString();
            proxyMe = "public " + method.getReturnType().getName() + " " + method.getName() + " ( " + parameterStr + " ) { " +
                    "try {   Method m3 = Class.forName(\"com.example.proxy.OrderService\").getMethod(\"addOrder\", Class.forName(\"java.lang.String\"), Class.forName(\"java.lang.String\"));" +
                    "return (String) h.invoke(this, m3, new Object[]{ver1, ver2}); } catch (RuntimeException | Error var4) {  throw var4;  } catch (Throwable var5) {   throw new UndeclaredThrowableException(var5); } " +
                    "" +
                    " } ";

        }
        return proxyMe;
//        Class<MyProxy> myProxyClass = MyProxy.class;
//        Class<?> aClass = Class.forName("");
//        MyProxy myProxy = new MyProxy();
//        Class<? extends MyProxy> aClass1 = myProxy.getClass();
    }

    ;
}
