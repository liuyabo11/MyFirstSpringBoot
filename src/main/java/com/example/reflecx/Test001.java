package com.example.reflecx;

import com.example.bean.PerSion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author liuyabo
 * @title Test001
 * @create 2021/2/19 9:13
 */
public class Test001 {

    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.example.bean.PerSion");
        //通过反射 执行无参构造 创建实例
        PerSion o = (PerSion) aClass.newInstance();
        o.setAge(1);
        System.out.println(o.getAge());

        //通过反射 执行带参构造 创建实例
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class,String.class);
        PerSion o1 = (PerSion) constructor.newInstance("11", 22,"22");
        System.out.println(o1.getAge());


        //通过反射给属性赋值
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"xiaoming");
        System.out.println(o.getName());

        //通过反射调用方法
        Method add = aClass.getDeclaredMethod("addUser", String.class);
        System.out.println(add.getReturnType());
        System.out.println(add.getReturnType().getSimpleName());
        System.out.println(add.getName());
        add.setAccessible(true);
        String xiaohong = (String) add.invoke(o, "xiaohong");
        System.out.println(xiaohong);

        //获取所有public的方法
        aClass.getMethods();
        //获取所有的方法
        aClass.getDeclaredMethods();
    }
}
