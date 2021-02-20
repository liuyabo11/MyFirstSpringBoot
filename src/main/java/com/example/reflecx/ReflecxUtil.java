package com.example.reflecx;

import org.apache.http.conn.DnsResolver;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title ReflecxUtil
 * @create 2021/2/19 14:45
 */
public class ReflecxUtil  {
    public static Object getNewInstance(Class classInfo) throws Exception{
        //1.使用反射拼接java 代码
        StringBuffer sf = new StringBuffer();
        sf.append("package com.example.reflecx;");
        String className = classInfo.getSimpleName() + "Impl";
        sf.append("public class "  + className + " implements "  + classInfo.getSimpleName() + "{");

        Method[] declaredMethods = classInfo.getDeclaredMethods();
        for (Method method:
             declaredMethods) {

            sf.append("public " + method.getReturnType().getSimpleName() + " "+method.getName() + "(String id,String orderNo) {"
            + "return \"meite\"" + ";"+ "}");

        }

        sf.append("}");
        // 2. 将代理类源码文件写入硬盘中
        String filename = "d:/code/"+className + ".java";
        File f = new File(filename);
        FileWriter fw = new FileWriter(f);
        fw.write(sf.toString());
        fw.flush();
        fw.close();

        // 3.编译成class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileMgr.getJavaFileObjects(filename);
        JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
        t.call();
        fileMgr.close();

        JavaClassLoader javaClassLoader = new JavaClassLoader();
        // 4.将class文件加入到内存中
        Class proxy0Class = javaClassLoader.findClass(className);
        Object o = proxy0Class.newInstance();
        return o;
    }

    public static void main(String[] args) throws Exception{
        OrderService newInstance = (OrderService) getNewInstance(OrderService.class);
        System.out.println(newInstance.addOrder("1","2222"));
    }
}
